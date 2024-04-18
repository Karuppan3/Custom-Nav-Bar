package io.bash_psk.customnavbar.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.bash_psk.customnavbar.domain.navigation.NavRoute
import io.bash_psk.customnavbar.presentation.activities.MainViewModel
import io.bash_psk.customnavbar.presentation.screen.HomeScreen
import io.bash_psk.customnavbar.presentation.screen.ProfileScreen
import io.bash_psk.customnavbar.presentation.screen.SettingsScreen

@Composable
fun MainNavigation(
    modifier: Modifier,
    mainViewModel: MainViewModel,
    navHostController: NavHostController
) {

    NavHost(
        navController = navHostController,
        startDestination = NavRoute.Home.route
    ) {

        composable(
            route = NavRoute.Home.route
        ) { navBackStackEntry: NavBackStackEntry ->

            HomeScreen(mainViewModel = mainViewModel)
        }

        composable(
            route = NavRoute.Profile.route
        ) { navBackStackEntry: NavBackStackEntry ->

            ProfileScreen()
        }

        composable(
            route = NavRoute.Settings.route
        ) { navBackStackEntry: NavBackStackEntry ->

            SettingsScreen()
        }
    }
}