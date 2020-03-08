package com.example.a4daysassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a4daysassignment.adapter.ItemAdapter
import com.example.a4daysassignment.model.Item
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemArray = ArrayList<Item>()
        itemArray.add(Item("Fine Grain Sugar", 20.00, 10, R.drawable.sugar))
        itemArray.add(Item("Peanuts", 20.00, 10, R.drawable.peanuts))
        itemArray.add(Item("Dawat Rice", 80.00, 10, R.drawable.rice))

        var itemAdapter = ItemAdapter(itemArray)

        cart.layoutManager = LinearLayoutManager(this)
        cart.adapter = itemAdapter
    }
}
