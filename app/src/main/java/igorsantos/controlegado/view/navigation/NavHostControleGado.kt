package igorsantos.controlegado.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import igorsantos.controlegado.view.HomeScreen
import igorsantos.controlegado.view.MainActivity
import igorsantos.controlegado.view.ui.managementcows.ManagementActivity

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
        composable(route = Screen.HealthScreen.route) {

        }
        composable(route = Screen.ManagementScreen.route) {
            ManagementActivity()
        }
    }
}