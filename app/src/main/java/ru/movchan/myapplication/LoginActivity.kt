package ru.movchan.myapplication

import MyRetrofit
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Response


class LoginActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email = findViewById(R.id.eTEmail)
        password = findViewById(R.id.eTPass)


    }

    fun btnSignIn(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
        {
            val log = MyRetrofit().getRetrofit()
            val getApi = log.create(Request::class.java)
            var haspMap: HashMap<String, String> = HashMap<String, String>()
            haspMap.put("email", email.text.toString())
            haspMap.put("password",password.text.toString())
            val log_call:retrofit2.Call<login> = getApi.getAuth(haspMap)
            log_call.enqueue(object : retrofit2.Callback<login> {
                override fun onResponse(call: Call<login>, response: Response<login>) {
                    if (response.isSuccessful) {

                        val intent = Intent(this@LoginActivity, MenuActivity::class.java)
                        startActivity(intent)
                    }
                    else
                    {
                        val error = "Пользователь не найден"
                        Toast.makeText(this@LoginActivity, error, Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<login>, t: Throwable) {
                    Toast.makeText(this@LoginActivity, t.message, Toast.LENGTH_SHORT).show()
                }
            })
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }


    }


}