package com.example.androidnavigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FlowFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Argument
        val safeArgs: FlowFragmentArgs by navArgs()
        val flowStep = safeArgs.flowStep
        // Inflate the layout for this fragment
        return when (flowStep) {
            1 -> inflater.inflate(R.layout.fragment_flow_hello, container, false)
            else -> inflater.inflate(R.layout.fragment_flow_hi, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next_fragment).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_flow)
        )
    }
}