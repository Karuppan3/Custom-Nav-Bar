package io.bash_psk.customnavbar.data.navigation

import androidx.navigation.NavDestination
import io.bash_psk.customnavbar.domain.navigation.NavRoute

object NavigationUtils {

    val SCREEN_LIST = listOf(
        NavRoute.Home,
        NavRoute.Profile,
        NavRoute.Settings
    )

    fun isCheckedNavRoute(
        navDestination: NavDestination?,
        navRoute: NavRoute
    ) : Boolean {

        return navDestination?.route.toString() == navRoute.route
    }
}