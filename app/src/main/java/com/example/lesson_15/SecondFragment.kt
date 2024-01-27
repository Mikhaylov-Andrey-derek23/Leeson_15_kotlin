package com.example.lesson_15

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment :  Fragment(R.layout.second_fragment) {
    private var btnFirstFragment: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnFirstFragment = requireActivity().findViewById(R.id.btnFirstFragment)
        setOnClickListeners()

    }

    private fun setOnClickListeners() {

        btnFirstFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FirstFragment())
                .commit()
        }
    }

}