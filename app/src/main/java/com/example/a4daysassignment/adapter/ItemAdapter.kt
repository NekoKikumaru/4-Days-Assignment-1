package com.example.a4daysassignment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a4daysassignment.R
import com.example.a4daysassignment.model.Item
import kotlinx.android.synthetic.main.item_layout.view.*

class ItemAdapter(var itemList: ArrayList<Item>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindPerson(item: Item) {
            itemView.item_name.text = item.name
            itemView.item_price.text = item.price.toString()
            itemView.item_discount.text = "$"+item.discount.toString()+" Discount"
            itemView.item_icon.setImageResource(item.icon)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        return holder.bindPerson(itemList[position])
    }

}