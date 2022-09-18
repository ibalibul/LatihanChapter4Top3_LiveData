package com.iqbal.latihanchapter4top3_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.latihanchapter4top3_livedata.databinding.ActivityMainBinding
import com.iqbal.latihanchapter4top3_livedata.databinding.ItemProductBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var vmProduct : ViewModelProduct
    lateinit var adapterProduct: AdapterProduct
    lateinit var rvproduct : RecyclerView
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        vmProduct = ViewModelProvider(this).get(ViewModelProduct::class.java)
        adapterProduct = AdapterProduct(ArrayList())


//        Observer liveData
        vmProduct.getProduct()
        vmProduct.product.observe(this, Observer {
                adapterProduct.setDataProduct(it as ArrayList<Product>)
        })
        rvproduct = findViewById(R.id.rvProduct)
        binding.rvProduct.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvProduct.adapter = adapterProduct


    }
}