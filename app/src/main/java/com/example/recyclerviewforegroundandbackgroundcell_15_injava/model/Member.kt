package com.example.recyclerviewforegroundandbackgroundcell_15_injava.model

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
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.adapter.CustomAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.helper.RecyclerItemTouchHelper

data class Member(var firstName: String?, var lastName: String?)