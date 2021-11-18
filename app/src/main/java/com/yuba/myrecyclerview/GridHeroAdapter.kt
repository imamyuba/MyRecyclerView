package com.yuba.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridHeroAdapter (val listHero :ArrayList<Hero>) : RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view :View = LayoutInflater.from(parent.context).
                    inflate(R.layout.item_grid_hero ,parent,false)

        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val hero =listHero[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imagePhoto)
    }

    override fun getItemCount(): Int {
        return listHero.size
    }


    inner class GridViewHolder (itemView : View) :RecyclerView.ViewHolder(itemView){
        val imagePhoto : ImageView = itemView.findViewById(R.id.img_item_photo)

    }
}