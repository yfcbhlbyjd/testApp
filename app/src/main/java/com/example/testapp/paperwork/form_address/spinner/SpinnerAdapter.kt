package com.example.selectsneakers.ui.paperwork.form_address.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SpinnerAdapter(context: Context, dataList: List<List<String>>) : ArrayAdapter<String>(context, android.R.layout.simple_spinner_item, dataList[0]) {
        private val data = dataList

        override fun getCount(): Int = data[0].size

        override fun getItem(position: Int): String? = data[0][position]

        override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = convertView ?: LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_dropdown_item, parent, false)
            view.findViewById<TextView>(android.R.id.text1).text = data[0][position]
            return view
        }
    }
