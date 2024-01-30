package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            changeFragment(FirstFragment())
        }
        binding.btn2.setOnClickListener {
            changeFragment(SecondFragment())
        }
    }

    private fun changeFragment(fragment: Fragment) {
        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment,fragment)
        fragmentTransaction.commit()
    }

}