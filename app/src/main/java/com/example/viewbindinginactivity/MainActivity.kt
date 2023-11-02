package com.example.viewbindinginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbindinginactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainBinding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

     //   setContentView(R.layout.activity_main)

        setContentView(mainBinding.root)

        mainBinding.printBtn.setOnClickListener {
            val title=mainBinding.edTitle.text.toString()
            val des=mainBinding.edDes.text.toString()

            if(mainBinding.edTitle.text.toString().isEmpty())
            {
                mainBinding.edTitle.error="Required"
            }
            else if (mainBinding.edDes.text.toString().isEmpty())
            {
                mainBinding.edDes.error="Required"
            }
            else
            {
                mainBinding.titleTxt.text="Title: $title"
                mainBinding.desTxt.text="Description: $des"
            }
        }
        mainBinding.viewBindingBtn.setOnClickListener {
            startActivity(Intent(this,LoadBlankActivity::class.java))
        }
    }
}