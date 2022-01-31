package com.example.recyclerviewforegroundandbackgroundcell_15_injava.adapter

import android.content.Context
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.helper.RecyclerItemTouchHelper.RecyclerItemTouchHelperListener
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.adapter.CustomAdapter.CustomViewHolder
import android.view.ViewGroup
import android.view.LayoutInflater
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.R
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.helper.RecyclerItemTouchHelper
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.model.Member

class CustomAdapter(private val members: ArrayList<Member>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_custom_layout, viewGroup, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val member = members[position]
        if (holder is CustomViewHolder) {
        }
    }

    override fun getItemCount(): Int {
        return members.size
    }

    fun removeItem(position: Int) {
        members.removeAt(position)
        notifyItemRemoved(position)
    }

    fun restoreItem(member: Member, position: Int) {
        members.add(position, member)
        notifyItemInserted(position)
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val view_background = view.findViewById<RelativeLayout>(R.id.view_background)
        val view_foreground = view.findViewById<RelativeLayout>(R.id.view_foreground)
    }

}