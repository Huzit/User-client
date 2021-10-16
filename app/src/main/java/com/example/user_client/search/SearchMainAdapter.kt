package com.example.user_client.search

import android.provider.ContactsContract
import android.service.autofill.Dataset
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.user_client.R
import com.example.user_client.databinding.SearchViewgroupBinding


class SearchMainAdapter(private val dataset: ArrayList<SearchMain>) : RecyclerView.Adapter<SearchMainAdapter.SearchMainViewHolder>() {

    inner class SearchMainViewHolder(view: RecyclerView) : RecyclerView.ViewHolder(view){
        val dateTime = view.findViewById<TextView>(R.id.search_datetime)
        val product = view.findViewById<TextView>(R.id.search_product)
        val textArea = view.findViewById<TextView>(R.id.search_textarea)
        val process = view.findViewById<TextView>(R.id.search_process)
        val imageButton = view.findViewById<TextView>(R.id.search_imageButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchMainViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SearchMainViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = dataset.size
}