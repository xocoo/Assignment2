package com.miu.assignment2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var foodList: ArrayList<String> =
        arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun decideFood(view: View) {
        result_txtv.text = foodList.asSequence().shuffled().find { true }
    }

    fun addFood(view: View) {
        foodList.add(add_food_txt.text.toString())
        add_food_txt.text = null
    }
}