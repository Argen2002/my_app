package com.example.my_app.ui.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.my_app.databinding.FragmentNotesBinding

class NotesFragment: Fragment() {

    private var binding:FragmentNotesBinding?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentNotesBinding.inflate(LayoutInflater.from(context),container,false)
        return binding!!.root
    }

}