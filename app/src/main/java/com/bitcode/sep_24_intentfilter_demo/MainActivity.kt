package com.bitcode.sep_24_intentfilter_demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.StrictMode
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.sep_24_intentfilter_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder().build());

        activityMainBinding.btnViewImage.setOnClickListener{
            var intent = Intent("com.bitcode.action.VIEW")
            intent.action = "android.intent.action.VIEW"
            intent.action = "android.intent.action.SEND"

            intent.addCategory("android.intent.category.BROWSABLE")
            intent.addCategory("android.intent.category.APP_MUSIC")
            intent.setDataAndType(Uri.parse("file://${activityMainBinding.edtFilePath.text.toString()}"),
                "image/jpeg")

//            /storage/emulated/0/Pictures/test_image_3.jpeg
            startActivity(intent)
        }
    }
}