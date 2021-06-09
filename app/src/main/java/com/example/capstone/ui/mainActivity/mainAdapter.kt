package com.example.capstone.ui.mainActivity

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.capstone.databinding.ListItemBinding
import com.example.capstone.ui.DetailActivity
import com.example.capstone.model.Destination

class mainAdapter(private val list: ArrayList<Destination>): RecyclerView.Adapter<mainAdapter.ListViewHolder>() {

    private var onClickCallBack:OnClickCallBack?=null

    fun setInClick (onClickCallBack: OnClickCallBack){
        this.onClickCallBack = onClickCallBack
    }

    fun setList(data: ArrayList<Destination>){
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val listBinding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListViewHolder(listBinding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(list[position])


    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ListViewHolder(private val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {
       fun bind(data: Destination){
           with(binding){
               destination.text = data.name
               itemView.setOnClickListener {
                   /*val intent = Intent(itemView.context,DetailActivity::class.java)
                   itemView.context.startActivity(intent)*/
                   onClickCallBack?.onItemClicked(data)
               }

               Glide.with(itemView.context)
                   .load(data.image)
                   .into(imageView)
           }
       }
    }

    interface OnClickCallBack{
        fun onItemClicked(data: Destination)
    }
}