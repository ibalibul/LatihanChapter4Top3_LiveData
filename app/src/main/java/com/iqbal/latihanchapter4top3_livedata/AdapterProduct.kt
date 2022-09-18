package com.iqbal.latihanchapter4top3_livedata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterProduct (val listproduct : ArrayList<Product>) : RecyclerView.Adapter<AdapterProduct.ViewHolder>() {

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var namaProduct = view.findViewById<TextView>(R.id.tvnamaProduct)
        var gambarProduct = view.findViewById<ImageView>(R.id.imgProduct)
        var hargaProduct =  view.findViewById<TextView>(R.id.tvhargaProduct)
        var detailProduct = view.findViewById<TextView>(R.id.isiProductDetail)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaProduct.text = listproduct[position].namaProduct
        holder.gambarProduct.setImageResource(listproduct[position].gambarProduct)

    }

    override fun getItemCount(): Int {
        return listproduct.size
    }
}