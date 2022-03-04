package recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.movchan.myapplication.R
import ru.movchan.myapplication.quotes
import state

class StateRecycler(val context: Context, val quotes: quotes):RecyclerView.Adapter<StateRecycler.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter, parent, false)
        return MyVH(root)
    }

    class MyVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.img_state)
        val title: TextView = itemView.findViewById(R.id.title_state)
        val text_state: TextView = itemView.findViewById(R.id.subtitle_state)

    }

    override fun onBindViewHolder(holder: StateRecycler.MyVH, position: Int) {
        Glide.with(context).load(quotes.data[position].image).into(holder.image)
        holder.title.setText(quotes.data[position].title)
        holder.text_state.setText(quotes.data[position].description)
    }

    override fun getItemCount(): Int {
        return quotes.data.size
    }
}