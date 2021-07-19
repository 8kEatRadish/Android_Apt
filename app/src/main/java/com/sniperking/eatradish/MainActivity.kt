package com.sniperking.eatradish

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sniperking.eatradish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.goToDetailsActivity.setOnClickListener {
//            startDetailsActivity("小王很美丽", "小王", url = "www.google.com", imageView = R.id.main_image)
            DetailsActivityBuilder.start(this, "小王很美丽", "小王", R.id.main_image, 0, "www.google.com")
        }
        binding.goToUserActivity.setOnClickListener {
//            startUserActivity("7岁", "小王", "黄色", "神族", "www.baidu.com", imageView = R.id.main_image)
            UserActivityBuilder.start(this, "7岁", "小王", R.id.main_image, "黄色", "神族", "www.baidu.com")
        }
        overridePendingTransition(0,0)
    }
}