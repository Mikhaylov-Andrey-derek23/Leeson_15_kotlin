package com.example.lesson_15

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.lesson_15.databinding.FirstFragmentBinding


class FirstFragment: Fragment(R.layout.first_fragment) {

    private  var bindings : FirstFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = FirstFragmentBinding.inflate(inflater, container, false)
        return  bindings?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setOnClickListeners()

    }

    private fun setOnClickListeners() {

        bindings?.btnSecondFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, SecondFragment())
                .commit()
        }
        bindings?.btnThirdFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, ThirdFragment())
                .commit()
        }
        bindings?.bthFourthFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FourthFragment())
                .commit()
        }

    }

}