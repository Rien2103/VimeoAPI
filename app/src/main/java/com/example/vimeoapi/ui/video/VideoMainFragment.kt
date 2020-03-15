package com.example.vimeoapi.ui.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vimeoapi.R
import kotlinx.android.synthetic.main.fragment_video_main.*

class VideoMainFragment : Fragment() {

    private lateinit var recyclerView: androidx.recyclerview.widget.RecyclerView
//    private lateinit var adapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_video_main, container, false)
        bindView(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.video_play_btn.setOnClickListener {
            val action = VideoMainFragmentDirections.actionVideoMainFragmentToVideoPlayFragment()
            findNavController().navigate(action)
        }
    }




    private fun bindView(view: View) {
        recyclerView = view!!.findViewById(R.id.video_list) as androidx.recyclerview.widget.RecyclerView
        val manager = androidx.recyclerview.widget.LinearLayoutManager(context)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(false)
//        recyclerView.adapter = adapter

    }
}
