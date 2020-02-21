package com.mayankkasera.billing.ui.saledetails.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.mayankkasera.billing.ui.saledetails.SaleDetailsFragment

class SaleDetailsAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return SaleDetailsFragment()


    }

    override fun getCount(): Int {
       return 2
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 ->  "Partially"
            1 ->  "Paid"
            else -> ""
        }
    }

}