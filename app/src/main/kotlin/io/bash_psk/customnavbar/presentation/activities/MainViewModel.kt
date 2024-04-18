package io.bash_psk.customnavbar.presentation.activities

import androidx.lifecycle.ViewModel
import io.bash_psk.customnavbar.data.navigation.NavigationUtils
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _screenList = MutableStateFlow(
        value = NavigationUtils.SCREEN_LIST
    )

    val screenList = _screenList.asStateFlow()
}