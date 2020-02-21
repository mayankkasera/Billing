package com.mayankkasera.billing.ui.saledetails


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mayankkasera.billing.R

/**
 * A simple [Fragment] subclass.
 */
class SaleDetailsFragment : Fragment() {

    lateinit var mView : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_sale_details, container, false)



        return mView
    }


}
