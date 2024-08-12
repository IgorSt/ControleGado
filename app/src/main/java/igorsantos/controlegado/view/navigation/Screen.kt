package igorsantos.controlegado.view.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object HealthManagementScreen : Screen("health_management_screen")
    object CowsScreen : Screen("cows_screen")
}