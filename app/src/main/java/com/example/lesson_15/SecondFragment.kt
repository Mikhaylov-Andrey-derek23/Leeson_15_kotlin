package com.example.lesson_15

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.lesson_15.databinding.SecondFragmentBinding

class SecondFragment : Fragment(R.layout.second_fragment){

    private  var bindings : SecondFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindings = SecondFragmentBinding.inflate(inflater, container, false)
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