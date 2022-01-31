package com.example.recyclerviewforegroundandbackgroundcell_15_injava

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
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        Assert.assertEquals(4, (2 + 2).toLong())
    }
}