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
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.recyclerviewforegroundandbackgroundcell_15_injava.helper.RecyclerItemTouchHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals(
            "com.example.recyclerviewforegroundandbackgroundcell_15_injava",
            appContext.packageName
        )
    }
}