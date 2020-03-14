//package com.example.vimeoapi.network
//
//import android.R
//import android.content.Context
//
//import android.view.LayoutInflater
//import android.view.View
//
//import android.view.ViewGroup
//import android.widget.ImageView
//
//import android.widget.TextView
//
//import androidx.recyclerview.widget.RecyclerView
//
//
//class CustomAdapter(context: Context, dataList: List<RetroPhoto>) :
//    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
//    private val dataList: List<RetroPhoto>
//    private val context: Context
//
//    internal inner class CustomViewHolder(itemView: View) :
//        RecyclerView.ViewHolder(itemView) {
//        val mView: View
//        var txtTitle: TextView
//        private val coverImage: ImageView
//
//        init {
//            mView = itemView
//            txtTitle = mView.findViewById(R.id.title)
//            coverImage = mView.findViewById(R.id.coverImage)
//        }
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): CustomViewHolder {
//        val layoutInflater = LayoutInflater.from(parent.context)
//        val view: View = layoutInflater.inflate(R.layout.custom_row, parent, false)
//        return CustomViewHolder(view)
//    }
//
//    override fun onBindViewHolder(
//        holder: CustomViewHolder,
//        position: Int
//    ) {
//        holder.txtTitle.setText(dataList[position].getTitle())
//        val builder: Picasso.Builder = Builder(context)
//        builder.downloader(OkHttp3Downloader(context))
//        builder.build().load(dataList[position].getThumbnailUrl())
//            .placeholder(R.drawable.ic_launcher_background)
//            .error(R.drawable.ic_launcher_background)
//            .into(holder.coverImage)
//    }
//
//    override fun getItemCount(): Int {
//        return dataList.size
//    }
//
//    init {
//        this.context = context
//        this.dataList = dataList
//    }
//}