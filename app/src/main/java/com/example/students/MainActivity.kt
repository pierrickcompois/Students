package com.example.students

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), StudentsAdapter.OnItemClickListener {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.studentsList)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = StudentsAdapter()
    }

    override fun onItemClick(position: Int) {
        navigateUpTo(Intent())
    }
}