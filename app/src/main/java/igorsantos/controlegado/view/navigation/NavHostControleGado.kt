package igorsantos.controlegado.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import igorsantos.controlegado.view.HomeScreen
import igorsantos.controlegado.view.ui.cows.CowsScreen
import igorsantos.controlegado.view.ui.healthmanagement.HealthManagementScreen

@Composable
fun NavHostControleGado() {
    val navController = rememberNavController()
    NavHost(
        navController,
        startDestination = Screen.MainScreen.route
    ) {
        composable(route = Screen.MainScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.HealthManagementScreen.route) {
            HealthManagementScreen()
        }
        composable(route = Screen.CowsScreen.route) {
            CowsScreen()
        }
    }
}