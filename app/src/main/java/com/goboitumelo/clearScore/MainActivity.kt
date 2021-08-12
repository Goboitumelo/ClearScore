package com.goboitumelo.clearScore

import android.os.Bundle
import android.os.Handler
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.goboitumelo.clearScore.databinding.ActivityMainBinding
import com.goboitumelo.clearScore.viewmodel.CreditScoreViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: CreditScoreViewModel by viewModels()
    var mHandler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.clearscoreResponse.observe(this, { creditSore ->

            binding.apply {
                mHandler = Handler()
                Thread {
                progress_bar.max = creditSore.creditReportInfo.maxScoreValue
                var status = creditSore.creditReportInfo.score
                var count = 0
                while (count < status) {
                    count += 1
                    mHandler!!.post {
                    progress_bar.progress = count
                    text_view_progress.text = String.format("%d", count)
                    text_view_header_max.text = "out of " + creditSore.creditReportInfo.maxScoreValue.toString()

                    }
                    try {
                        Thread.sleep(7)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                }.start()

            }

        })
    }
}