package com.example.btnrecycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.btnrecycler.R
import com.example.btnrecycler.model.Camera

import kotlinx.android.synthetic.main.item_camera.view.*

class CameraAdapter(var cameraList: ArrayList<Camera>) :
    RecyclerView.Adapter<CameraAdapter.CameraViewHolder>() {

    inner class CameraViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        fun bindPerson(person: Camera) {
            itemView.txt_camera.text = person.camera
            itemView.txt_made_in.text = person.madein
            itemView.con_camera.setBackgroundResource(person.imgCamera)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CameraViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_camera, parent, false)
        return CameraViewHolder(view)
    }


    override fun getItemCount(): Int {
        return cameraList.size
    }

    override fun onBindViewHolder(holder: CameraViewHolder, position: Int) {
        holder.bindPerson(cameraList[position])
    }


}