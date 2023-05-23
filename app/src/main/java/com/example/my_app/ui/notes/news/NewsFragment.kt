package com.example.my_app.ui.notes.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.my_app.databinding.FragmentNewsBinding
import com.example.my_app.databinding.FragmentNotesBinding

class NewsFragment: Fragment() {

    private var binding:FragmentNewsBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentNewsBinding.inflate(LayoutInflater.from(context),container,false)
        return binding!!.root
    }

}