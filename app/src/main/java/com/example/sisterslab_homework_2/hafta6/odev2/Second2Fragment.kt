package com.example.sisterslab_homework_2.hafta6.odev2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sisterslab_homework_2.R
import com.example.sisterslab_homework_2.databinding.FragmentSecond2Binding
import com.example.sisterslab_homework_2.databinding.FragmentSecondBinding


class Second2Fragment : Fragment() {

    private lateinit var binding: FragmentSecond2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecond2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.secondBtn.setOnClickListener {
            findNavController().navigate(Second2FragmentDirections.actionSecond2FragmentToThirdFragment())
        }

    }

}