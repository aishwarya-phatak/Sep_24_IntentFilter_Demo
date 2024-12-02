package com.bitcode.sep_24_intentfilter_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitcode.sep_24_intentfilter_demo.databinding.MyImageActivityBinding

class MyImageActivity : AppCompatActivity() {
    private lateinit var myImageActivityBinding: MyImageActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myImageActivityBinding = MyImageActivityBinding.inflate(layoutInflater)
        setContentView(myImageActivityBinding.root)

        myImageActivityBinding.imgView1.setImageURI(intent.data)
    }
}