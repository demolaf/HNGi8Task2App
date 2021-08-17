package com.example.hngi8task2app.views.inputFragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.hngi8task2app.R
import com.example.hngi8task2app.databinding.InputFragmentBinding

class InputFragment : Fragment() {

    private lateinit var binding: InputFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.input_fragment, container, false)

        binding.button.setOnClickListener{
            binding.textView.text = binding.editTextTextPersonName.text
            binding.editTextTextPersonName.text.clear()
        }

        return binding.root
    }

}