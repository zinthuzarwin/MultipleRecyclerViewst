package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.Camera
import com.example.btnrecycler.model.Latest

import kotlinx.android.synthetic.main.item_latest.view.*

class LatestAdapter(var latestProductList: ArrayList<Latest>) :
    RecyclerView.Adapter<LatestAdapter.LatestViewHolder>() {

    inner class LatestViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Latest) {
            itemView.lst_name.text = person.latestName
            itemView.lst_type.text = person.latestType
            itemView.lst_image.setImageResource(person.latestImg)
            itemView.lst_price.text=person.latestPrice
            itemView.lst_discount.text=person.latestTxt

            val a=itemView.lst_linear
            a.visibility = if (person.latestDis!==null && person.latestDis!!){
                View.VISIBLE
            } else{
                View.INVISIBLE

            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_latest, parent, false)
        return LatestViewHolder(view)
    }


    override fun getItemCount(): Int {
        return latestProductList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.bindPerson(latestProductList[position])
    }


}