package ru.movchan.myapplication.ui.home

import MyFeel
import MyState
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import recadapters.FeelRecycler
import recadapters.StateRecycler
import ru.movchan.myapplication.R
import ru.movchan.myapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val feel_recycler: RecyclerView =root.findViewById(R.id.feel_rec)
        feel_recycler.adapter=FeelRecycler(requireContext(), MyFeel().list)

        val state_recycler: RecyclerView=root.findViewById(R.id.state_Rec)
        state_recycler.adapter=StateRecycler(requireContext(), MyState().state_list)
        return root
    }

}