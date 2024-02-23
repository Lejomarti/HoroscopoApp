package com.alejo.horoscopoapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.alejo.horoscopoapp.databinding.ItemHoroscopeBinding
import com.alejo.horoscopoapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener{
            starRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
//            onItemSelected(horoscopeInfo)
        }
    }

    fun starRotationAnimation(view: View,newLambda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotation(360f)
            withEndAction {  newLambda()  }
            start()
        }
    }
}

