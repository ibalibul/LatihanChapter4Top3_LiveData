package com.iqbal.latihanchapter4top3_livedata

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iqbal.latihanchapter4top3_livedata.databinding.ItemProductBinding

class AdapterProduct (var listproduct : ArrayList<Product>) : RecyclerView.Adapter<AdapterProduct.ViewHolder>() {

    var onclick : ((Product)->Unit)? = null

    class ViewHolder(var binding : ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindproduct(itemProduct : Product){
            binding.product = itemProduct
            binding.LinearLayout.setOnClickListener(object : View.OnClickListener{


                override fun onClick(view: View?) {
                    var bundle =  Bundle()
                    bundle.putString("namaProduct",itemProduct.namaProduct)
                    bundle.putInt("gambarProduct",itemProduct.gambarProduct)
//                    bundle.putInt("hargaProduct",itemProduct.hargaProduct)
                    bundle.putInt("detailProduct",itemProduct.DetailProduct)
                    val intent = Intent(view!!.context,DetailActivity::class.java)
                    intent.putExtras(bundle)
                    view.context.startActivity(intent)

                }
            })
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindproduct(listproduct[position])

    }

    override fun getItemCount(): Int {
        return listproduct.size
    }
    fun setDataProduct(itemData : ArrayList<Product>){
            this.listproduct = itemData
    }
}