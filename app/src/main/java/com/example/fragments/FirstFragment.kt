package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FirstFragment:Fragment(R.layout.fragment_first){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_first,container,false)
        val btn:Button=view.findViewById(R.id.btnFragment1)
        btn.setOnClickListener {
            val editText=view.findViewById<EditText>(R.id.etFragment1)
            val input=editText.text.toString()
            val bundle=Bundle()
            bundle.putString("data",input)

            val fragment=SecondFragment()
            fragment.arguments=bundle
            fragmentManager?.beginTransaction()?.add(R.id.fragment,fragment)?.commit()
        }
        return view
    }
}


