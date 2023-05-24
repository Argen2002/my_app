package com.example.my_app.ui.notes.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.my_app.databinding.FragmentCreateNoteBinding
import com.example.my_app.domain.TaskModel

class CreateNoteFragment: Fragment() {

    private var binging: FragmentCreateNoteBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binging=FragmentCreateNoteBinding.inflate(
            LayoutInflater.from(requireContext()),
            container,
            false
        )
        return binging!!.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun initListeners(){
        binging?.btnCreate?.setOnClickListener {
            val title = binging?.etTitle?.text?.toString()
            val desc = binging?.etTitle?.text?.toString()
            if(title.isNullOrEmpty()){
                Toast.makeText(requireContext(), "Write here\"Title\"", Toast.LENGTH_SHORT).show()
            }else{
                val model = TaskModel(
                    title = title,
                    description = desc ?: "",
                )
            }


        }
    }
}