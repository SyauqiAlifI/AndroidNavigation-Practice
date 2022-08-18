package com.example.androidnavigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidnavigationpractice.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        binding.nextButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.to_three_action)
        )
        return binding.root
    }
}