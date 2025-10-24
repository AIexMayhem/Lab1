package com.example.messager.ui.profile

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.messager.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Profile", "onCreateView")
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Profile", "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Profile", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Profile", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Profile", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Profile", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Profile", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("Profile", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Profile", "onDestroy")
    }
}