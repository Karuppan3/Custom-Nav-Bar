package io.bash_psk.customnavbar.domain.resource

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.Color

object ConstantNavigation {
    
    const val HOME_ROUTE = "HOME"
    const val PROFILE_ROUTE = "PROFILE"
    const val SETTINGS_ROUTE = "SETTINGS"

    const val HOME_NAME = "Home"
    const val PROFILE_NAME = "Profile"
    const val SETTINGS_NAME = "Settings"

    val HOME_SELECTED_ICON = Icons.Filled.Home
    val PROFILE_SELECTED_ICON = Icons.Filled.Person
    val SETTINGS_SELECTED_ICON = Icons.Filled.Settings

    val HOME_UNSELECTED_ICON = Icons.Outlined.Home
    val PROFILE_UNSELECTED_ICON = Icons.Outlined.Person
    val SETTINGS_UNSELECTED_ICON = Icons.Outlined.Settings

    val HOME_CONTAINER_COLOR = Color(red = 249, green = 222, blue = 255, alpha = 255)
    val PROFILE_CONTAINER_COLOR = Color(red = 88, green = 163, blue = 255, alpha = 255)
    val SETTINGS_CONTAINER_COLOR = Color(red = 240, green = 255, blue = 186, alpha = 255)

    val HOME_CONTENT_COLOR = Color(red = 14, green = 14, blue = 14, alpha = 255)
    val PROFILE_CONTENT_COLOR = Color(red = 14, green = 14, blue = 14, alpha = 255)
    val SETTINGS_CONTENT_COLOR = Color(red = 14, green = 14, blue = 14, alpha = 255)
}