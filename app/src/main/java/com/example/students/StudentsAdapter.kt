package com.example.students

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.student_layout.view.*

class StudentsAdapter(private val listener: OnItemClickListener): RecyclerView.Adapter<StudentsAdapter.ViewHolder>() {

    var students: List<Student> = StudentContent.ITEMS

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentsAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.student_layout, parent, false))
    }

    override fun onBindViewHolder(holder: StudentsAdapter.ViewHolder, position: Int) {
        val student = students[position]
        holder.bind(student) {
            listener.onItemClick(position)
        }
    }

    override fun getItemCount(): Int {
        return students.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        fun bind(student: Student, onClick: () -> Unit) = with(itemView) {
            studentName.text = student.firstName
            studentLastname.text = student.lastName
        }
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
}