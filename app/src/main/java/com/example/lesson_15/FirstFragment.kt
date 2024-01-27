package com.example.lesson_15

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class FirstFragment: Fragment(R.layout.first_fragment) {
    private var btnDialog: Button? = null
    private var btnSecondFragment: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnDialog = requireActivity().findViewById(R.id.btnDialog)
        btnSecondFragment = requireActivity().findViewById(R.id.btnSecondFragment)
        setOnClickListeners()

    }

    private fun setOnClickListeners() {
        btnDialog?.setOnClickListener {
            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.dialog_main)
            dialog.show()
        }
        btnSecondFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, SecondFragment())
                .commit()
        }
    }

}