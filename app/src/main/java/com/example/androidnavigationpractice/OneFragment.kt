package com.example.androidnavigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.androidnavigationpractice.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        val animOptions = navOptions {
            anim {
                enter = R.anim.slide_in_right
                exit = R.anim.slide_out_left
                popEnter = R.anim.slide_in_left
                popExit = R.anim.slide_out_right
            }
        }
        binding.nextButton.setOnClickListener {
            findNavController().navigate(R.id.twoFragment, null, animOptions)
        }
        binding.nextFlowButton.setOnClickListener {
            findNavController().navigate(R.id.flowFragmentHello, null, animOptions)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

}