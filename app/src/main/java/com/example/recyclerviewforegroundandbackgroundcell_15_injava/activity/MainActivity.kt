package com.example.recyclerviewforegroundandbackgroundcell_15_injava.activity

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
import android.util.Log
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.helper.RecyclerItemTouchHelper
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private var context: Context? = null
    private var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val members = prepareMemerList()
        refreshAdapter(members)
    }

    private fun prepareMemerList(): ArrayList<Member> {
        val members = ArrayList<Member>()
        for (i in 0..29) {
            members.add(Member("Ilhombek$i", "Ubaydullayev$i"))
        }
        return members
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = CustomAdapter(members)
        recyclerView!!.adapter = adapter
    }

    private fun initView() {
        context = this
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView!!.layoutManager = GridLayoutManager(this, 1)
        recyclerView!!.itemAnimator = DefaultItemAnimator()
        recyclerView!!.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        val itemTouchHelperCallback = RecyclerItemTouchHelper(0,ItemTouchHelper.LEFT,object : RecyclerItemTouchHelper.RecyclerItemTouchHelperListener{

            override fun onSwiped(
                viewHolder: RecyclerView.ViewHolder,
                direction: Int,
                position: Int
            ) {
                Log.d("@@@", "@@@position $position")
            }
        })

        ItemTouchHelper(itemTouchHelperCallback).attachToRecyclerView(recyclerView)
    }
}