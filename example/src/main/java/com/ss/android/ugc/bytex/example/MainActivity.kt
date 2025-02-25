package com.ss.android.ugc.bytex.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ss.android.ugc.bytex.example.coverage.CoverageReportTask

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Handle coverage log info, send to the server
        CoverageReportTask.init()
    }
}
