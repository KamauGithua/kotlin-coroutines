package com.kamau.kotlincoroutines

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kamau.kotlincoroutines.ui.theme.KotlinCoroutinesTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.launch {
            getApiData()
            getApiData2()
        }

    }

    private suspend fun getApiData() {

        Log.d("tag_coroutine", "start getting data 1")
        delay(5000)
        Log.d("tag_coroutine", "got data 1")

    }
    private suspend fun getApiData2() {

        Log.d("tag_coroutine", "start getting data 2")
        delay(5000)
        Log.d("tag_coroutine", "got data 2")

    }
}

