package io.bash_psk.customnavbar.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import io.bash_psk.customnavbar.presentation.navigation.BottomNavigation
import io.bash_psk.customnavbar.presentation.theme.CustomNavBarTheme

class MainActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            CustomNavBarTheme {

                val navHostController = rememberNavController()

                BottomNavigation(
                    mainViewModel = mainViewModel,
                    navHostController = navHostController
                )
            }
        }
    }
}