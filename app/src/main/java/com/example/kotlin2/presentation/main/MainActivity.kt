package com.example.kotlin2.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin2.R
import com.example.kotlin2.databinding.ActivityMainBinding
import com.example.kotlin2.domain.model.Note
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this,)[MainViewModel::class.java]

                binding.apply {
        btnAdd.setOnClickListener {
            var i = 0
            i++
            viewModel.addNote(Note("$i","text$i"))
        }
                    btnDelete.setOnClickListener {
viewModel.deleteLastNote()
                    }
        }
        viewModel.liveData.observe(this){
            binding.text.text = it.toString()

        }
    }
}

