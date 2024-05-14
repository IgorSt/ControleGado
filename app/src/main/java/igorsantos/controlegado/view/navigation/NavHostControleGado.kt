package igorsantos.controlegado.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import igorsantos.controlegado.view.MainActivity

@Composable
fun NavHostControleGado(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Destinations.MainScreen.route) {
            MainActivity(navController)
        }
        composable(route = Destinations.HealthScreen.route) {

        }
        composable(route = Destinations.ManagementScreen.route) {

        }
    }
}