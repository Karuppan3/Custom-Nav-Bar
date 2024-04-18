package io.bash_psk.customnavbar.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import io.bash_psk.customnavbar.data.navigation.NavigationUtils
import io.bash_psk.customnavbar.domain.navigation.NavRoute
import io.bash_psk.customnavbar.presentation.activities.MainViewModel

@Composable
fun BottomNavigation(
    mainViewModel: MainViewModel,
    navHostController: NavHostController
) {

    val context = LocalContext.current

    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val screenList by mainViewModel.screenList.collectAsStateWithLifecycle()

    val navDestination = navBackStackEntry?.destination

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {

            EmptyBottomBar(
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                tonalElevation = 4.dp
            ) {

                screenList.forEach { navItem: NavRoute ->

                    val isSelected = NavigationUtils.isCheckedNavRoute(
                        navDestination = navDestination,
                        navRoute = navItem
                    )

                    BottomNavItem(
                        isSelected = isSelected,
                        label = navItem.name,
                        icon = when (isSelected) {

                            true -> {

                                navItem.selectedIcon
                            }

                            false -> {

                                navItem.unSelectedIcon
                            }
                        },
                        shape = MaterialTheme.shapes.extraLarge,
                        containerColor = navItem.containerColor,
                        contentColor = navItem.contentColor,
                        enabled = true,
                        onItemClick = {

                            navHostController.navigate(
                                route = navItem.route
                            ) {

                                popUpTo(
                                    route = navHostController.graph.startDestinationRoute.toString()
                                ) {

                                    saveState = true
                                }

                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { paddingValues: PaddingValues ->

        MainNavigation(
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues = paddingValues),
            mainViewModel = mainViewModel,
            navHostController = navHostController
        )
    }
}