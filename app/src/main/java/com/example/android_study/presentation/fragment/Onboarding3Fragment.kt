package com.example.android_study.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_study.R
import com.example.android_study.databinding.FragmentOnboarding1Binding
import com.example.android_study.databinding.FragmentOnboarding3Binding

class Onboarding3Fragment : Fragment() {
    private var _binding: FragmentOnboarding3Binding? = null
    private val binding get() = _binding ?: error("Binding이 초기화 되지 않았습니다")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboarding3Binding.inflate(layoutInflater, container, false)

        binding.btnNext.setOnClickListener{
            findNavController().navigate(R.id.action_onboarding3Fragment_to_mainActivity)
        }

        return binding.root
    }
}