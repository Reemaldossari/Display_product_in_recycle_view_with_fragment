package com.reemsd.recyclerview.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.reemsd.recyclerview.adapter.SmartPhoneAdapter
import com.reemsd.recyclerview.data.DataSource
import com.reemsd.recyclerview.databinding.FragmentListBinding

class ListFragment :Fragment() {

    private var _binding :FragmentListBinding? = null
    private val binding get() =_binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var adapter = SmartPhoneAdapter(DataSource.smartPhone)
        binding?.recyclerView?.adapter=adapter
        binding?.recyclerView?.setHasFixedSize(true)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}