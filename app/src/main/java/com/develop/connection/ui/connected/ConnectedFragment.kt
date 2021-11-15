package com.develop.connection.ui.connected

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.develop.connection.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConnectedFragment : Fragment() {

    private lateinit var viewModel: ConnectedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.connected_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConnectedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}