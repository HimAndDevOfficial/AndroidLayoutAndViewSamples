package com.example.layoutexamples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layoutexamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.relativeLayout.setOnClickListener {

            val i =Intent(this,RelativeLayout::class.java)
            startActivity(i)
        }

        binding.frameLayout.setOnClickListener {
            val i =Intent(this,FrameLayout::class.java)
            startActivity(i)
        }


        binding.contstrainLayout.setOnClickListener {
            val i =Intent(this,ConstraintLayout::class.java)
            startActivity(i)
        }

        binding.gridView.setOnClickListener {

        }

        binding.listView.setOnClickListener {

        }

    }
}