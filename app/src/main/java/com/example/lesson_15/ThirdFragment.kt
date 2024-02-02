package com.example.lesson_15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson_15.databinding.FragmentThirdBinding

class ThirdFragment : Fragment(R.layout.second_fragment){

    private  var bindings : FragmentThirdBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = FragmentThirdBinding.inflate(inflater, container, false)
        return  bindings?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setOnClickListeners()
    }

    private fun setOnClickListeners() {

        bindings?.btnFirstFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, FirstFragment())
                .commit()
        }
    }

}