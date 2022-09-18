package com.iqbal.latihanchapter4top3_livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {

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

    val product : MutableLiveData<List<Product>> = MutableLiveData()

    fun getProduct() {
        product.value = listProductbarang
    }

}