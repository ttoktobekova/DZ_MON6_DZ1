package com.example.dz_mon6_dz1

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.dz_mon6_dz1.databinding.ActivityMainBinding


class CounterActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val viewModel: CounterViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.counter.observe(this) { count ->
            binding.tvCount.text = count.toString()
        }
        initClickers()
    }

    private fun initClickers() {
        binding.btnInc.setOnClickListener {
            viewModel.dec()
        }

        binding.btnDec.setOnClickListener {
            viewModel.inc()
        }
    }
}
