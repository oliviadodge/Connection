package com.develop.connection.ui.chatsList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.develop.connection.databinding.FragmentChatsListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChatsListFragment : Fragment() {

    private lateinit var chatsListViewModel: ChatsListViewModel
    private var _binding: FragmentChatsListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        chatsListViewModel =
            ViewModelProvider(this).get(ChatsListViewModel::class.java)

        _binding = FragmentChatsListBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        chatsListViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}