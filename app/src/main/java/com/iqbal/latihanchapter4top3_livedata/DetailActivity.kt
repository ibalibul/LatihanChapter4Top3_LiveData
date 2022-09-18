package com.iqbal.latihanchapter4top3_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.iqbal.latihanchapter4top3_livedata.databinding.ActivityDetailBinding
import com.iqbal.latihanchapter4top3_livedata.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        binding.btnOrder.setOnClickListener {

        }
        getDataBundle()

    }

    fun getDataBundle() {
        var bund = intent.extras
        binding.namaProductDetail.text = bund!!.getString("namaProduct")
//        binding.hargaProductDetail.text = bund!!.getString("hargaProduct")
        binding.imgProductDetail.setImageResource(bund!!.getInt("gambarProduct"))
        binding.isiProductDetail.setText(bund.getInt("detailProduct"))
    }

    fun orderProduct() {
        var
    }
}