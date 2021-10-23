package com.example.simple_recyclerview.model



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simple_recyclerview.R
import com.example.simple_recyclerview.data.ItemsViewModel

class CustomAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design, parent, false)

        val a = ViewHolder(view)
        return a

    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        val a : ItemsViewModel = mList[position]
        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(a.image)
        // sets the text to the textview from our itemHolder class
        holder.textView.text = a.text


    }

    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView:View) : RecyclerView.ViewHolder(ItemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)


    }


}