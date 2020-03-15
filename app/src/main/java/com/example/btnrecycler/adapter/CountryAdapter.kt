package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.Camera
import com.example.btnrecycler.model.Country

import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(var countryList: ArrayList<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    inner class CountryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Country) {
            itemView.country_name.text = person.country
            itemView.countryImg.setBackgroundResource(person.countryImg)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view)
    }


    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bindPerson(countryList[position])
    }


}