package com.example.zaptwo.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.zaptwo.SuperHero
import com.example.zaptwo.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(
        superHeroModel: SuperHero,
        onClickListener: (SuperHero) -> Unit,
    ) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realName
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
        binding.ivSuperHero.setOnClickListener { onClickListener(superHeroModel) }
        itemView.setOnClickListener { Toast.makeText(itemView.context, "Aun en proceso...", Toast.LENGTH_SHORT).show()}
    }
}