package com.dzaki_aryavega.wisata_app.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dzaki_aryavega.wisata_app.DetailWisataActivity
import com.dzaki_aryavega.wisata_app.MapsActivity
import com.dzaki_aryavega.wisata_app.model.ModelWisata
import com.dzaki_aryavega.wisata_app.R

class AdapterWisata (
    val itemListWisata: List<ModelWisata>
): RecyclerView.Adapter<AdapterWisata.MyviewHolder>() {
    class MyviewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)  {

        var imgwisata : ImageView = itemView.findViewById(R.id.imgWisata)
        var txtnama: TextView = itemView.findViewById(R.id.txtnama)
        var txtdaerah : TextView = itemView.findViewById(R.id.txtdaerah)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_wisata,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemListWisata.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = itemListWisata[position]
        holder.imgwisata.setImageResource(currentItem.image)
        holder.txtnama.setText(currentItem.nama)
        holder.txtdaerah.setText(currentItem.daerah)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailWisataActivity::class.java).apply {
                // Mengirim data melalui intent
                putExtra("deskripsi", currentItem.deskripsi)
                putExtra("namaWisata",currentItem.nama)
                putExtra("imagewisata", currentItem.image)
                putExtra("latitude", currentItem.latitude)
                putExtra("longitude", currentItem.longitude)
            }
            context.startActivity(intent)
        }


    }


}