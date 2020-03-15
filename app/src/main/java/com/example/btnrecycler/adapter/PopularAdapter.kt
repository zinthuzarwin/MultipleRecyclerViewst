package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.Camera
import com.example.btnrecycler.model.Popular

import kotlinx.android.synthetic.main.item_camera.view.*
import kotlinx.android.synthetic.main.item_latest.view.*
import kotlinx.android.synthetic.main.item_popular.view.*

class PopularAdapter(var popularProductList: ArrayList<Popular>) :   //insert object arrays as arguments
    RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    inner class PopularViewHolder(itemView: View) ://called with view
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Popular) {
            itemView.p_name.text = person.popularName
            itemView.p_brand.text = person.popularBrand
            itemView.p_price.text = person.popularPrice
            itemView.dis_value.text=person.disValue
            itemView.p_crossPrice.text=person.crossPrice
            itemView.p_image.setImageResource(person.popularImg)
            val aa=itemView.p_new
            aa.visibility = if (person.popularNew!==null && person.popularNew!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
            val bb=itemView.p_discount
            bb.visibility=if (person.popularDiscount!==null && person.popularDiscount!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
            val cc=itemView.cross_dis
            cc.visibility=if (person.crossDiscount!==null && person.crossDiscount!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_popular, parent, false)
        return PopularViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularProductList.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bindPerson(popularProductList[position]) //inserting array
    }


}