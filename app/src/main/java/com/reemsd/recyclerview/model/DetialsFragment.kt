package com.reemsd.recyclerview.model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.reemsd.recyclerview.databinding.FragmentDetilsBinding

class DetialsFragment : Fragment() {
    private var _binding: FragmentDetilsBinding? = null
    private val binding get() = _binding !!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetilsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments.let {
            if (it != null) {
                binding.phoneImageSmartPhoneActivity.setImageResource(it.getInt("image"))
            }
            if (it != null) {
                binding.phoneNameSmartphoneActivity.setText(it.getInt("name"))
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

