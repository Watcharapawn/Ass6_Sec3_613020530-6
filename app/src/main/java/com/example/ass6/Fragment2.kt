package com.example.ass6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_2.view.*

class TwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_2, container, false)
        view.male.setOnClickListener(){
            var fragment = OneFragment()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(male: Fragment){
        var transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fragmentLayout, male)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}