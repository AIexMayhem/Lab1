package com.example.messager.ui.messages

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.messager.databinding.FragmentMessagesBinding

class MessagesFragment : Fragment() {

    private var _binding: FragmentMessagesBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val messagesViewModel =
            ViewModelProvider(this).get(MessagesViewModel::class.java)
        Log.d("Messages", "onCreateView")

        _binding = FragmentMessagesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMessages
        messagesViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Messages", "onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Messages", "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Messages", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Messages", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Messages", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Messages", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("Messages", "onDestroyView")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Messages", "onDestroy")
    }
}