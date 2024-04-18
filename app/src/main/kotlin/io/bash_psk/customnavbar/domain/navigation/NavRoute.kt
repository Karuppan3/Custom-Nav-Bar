package io.bash_psk.customnavbar.domain.navigation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import io.bash_psk.customnavbar.domain.resource.ConstantNavigation

sealed class NavRoute(
    val route: String,
    val name: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val containerColor: Color,
    val contentColor: Color
) {
    
    data object Home : NavRoute(
        route = ConstantNavigation.HOME_ROUTE,
        name = ConstantNavigation.HOME_NAME,
        selectedIcon = ConstantNavigation.HOME_SELECTED_ICON,
        unSelectedIcon = ConstantNavigation.HOME_UNSELECTED_ICON,
        containerColor = ConstantNavigation.HOME_CONTAINER_COLOR,
        contentColor = ConstantNavigation.HOME_CONTENT_COLOR
    )

    data object Profile : NavRoute(
        route = ConstantNavigation.PROFILE_ROUTE,
        name = ConstantNavigation.PROFILE_NAME,
        selectedIcon = ConstantNavigation.PROFILE_SELECTED_ICON,
        unSelectedIcon = ConstantNavigation.PROFILE_UNSELECTED_ICON,
        containerColor = ConstantNavigation.PROFILE_CONTAINER_COLOR,
        contentColor = ConstantNavigation.PROFILE_CONTENT_COLOR
    )

    data object Settings : NavRoute(
        route = ConstantNavigation.SETTINGS_ROUTE,
        name = ConstantNavigation.SETTINGS_NAME,
        selectedIcon = ConstantNavigation.SETTINGS_SELECTED_ICON,
        unSelectedIcon = ConstantNavigation.SETTINGS_UNSELECTED_ICON,
        containerColor = ConstantNavigation.SETTINGS_CONTAINER_COLOR,
        contentColor = ConstantNavigation.SETTINGS_CONTENT_COLOR
    )
}