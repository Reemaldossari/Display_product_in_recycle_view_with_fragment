package com.reemsd.recyclerview.adapter

import android.provider.ContactsContract
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.reemsd.recyclerview.R
import com.reemsd.recyclerview.model.DetialsFragmentDirections
import com.reemsd.recyclerview.model.ListFragmentDirections
import com.reemsd.recyclerview.model.SmartPhone
import javax.sql.DataSource

class SmartPhoneAdapter(private val dataSource: List<SmartPhone>) :
    RecyclerView.Adapter<SmartPhoneAdapter.SmartPhoneViewHolder>() {

    class SmartPhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val productimage: ImageView = itemView.findViewById(R.id.product1_image)
        val productname: TextView = itemView.findViewById(R.id.product1_name)
        val productprice: TextView = itemView.findViewById(R.id.product_price)
        val productisVip: ImageView = itemView.findViewById(R.id.isVip_icon)
        val addtoCart: ImageButton = itemView.findViewById(R.id.add_to_cart)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmartPhoneViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return SmartPhoneViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SmartPhoneAdapter.SmartPhoneViewHolder, position: Int) {
        val items = dataSource[position]

        holder.productimage.setImageResource(items.productImage)
        holder.productname.setText(items.phoneName)
        holder.productprice.text = items.phonePrice

        if (items.phoneVip) {
            holder.productisVip.visibility = View.VISIBLE
        }
        holder.addtoCart.setOnClickListener {
            if (items.phoneQuantity > 0) {
                Toast.makeText(holder.itemView.context, "Add to Cart", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(holder.itemView.context, " Out of Stock", Toast.LENGTH_SHORT).show()
            }

            holder.productimage.setOnClickListener {
                val action = DetialsFragmentDirections.actionDetilsFragmentToListFragment(
                     name = items.phoneName,
                    image = items.productImage
                )
                holder.itemView.findNavController().navigate(action)
            }

        }

        


    }

    override fun getItemCount(): Int = dataSource.size


}
