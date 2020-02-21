package com.mayankkasera.billing.ui.saledetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mayankkasera.billing.R
import com.mayankkasera.billing.ui.saledetails.adapter.SaleDetailsAdapter
import kotlinx.android.synthetic.main.activity_sale_details.*

class SaleDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale_details)

        viewPager.offscreenPageLimit = 2
        viewPager.adapter = SaleDetailsAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)



    }
}
