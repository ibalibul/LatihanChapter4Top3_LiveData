package com.iqbal.latihanchapter4top3_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listProductbarang = arrayListOf(
            Product("Apple Iphone 13 pro",R.drawable.hanpone,5000000,R.string.Product_9handpone),
            Product("Tv Digital ",R.drawable.tv_digital,3500000,R.string.Product_1tv),
            Product("AC 2 PK Dingin menyejukan kamar",R.drawable.ac,4500000,R.string.Product_2ac),
            Product("Dispenser 2 Tingkat",R.drawable.dispenser,2000000,R.string.Product_3dispenser),
            Product("Komputer Spek Tinggi",R.drawable.komputer,4000000,R.string.Product_4komputer),
            Product("Mesin Cuci 2 Tabung ",R.drawable.mesin_cuci,5000000,R.string.Product_5mesincuci),
            Product("Leptop Gaming untuk kamu yang sedang games",R.drawable.leptop,4000000,R.string.Product_6leptop),
            Product("Lemari kulkas 2 Pintu",R.drawable.kulkas,5500000,R.string.Product_7kulkas),
            Product("Dispenser anak Kos-kosan",R.drawable.dispenser_2,2000000,R.string.Product_8dispenser2),
            Product("Antena Tv Digital ",R.drawable.antena_tv_digital,1000000,R.string.Product_10antena,)
        )
        val Productbarang = AdapterProduct(listProductbarang)
        val lmproduct1 = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvProduct.layoutManager = lmproduct1
        rvProduct.adapter = Productbarang
    }
}