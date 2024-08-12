package igorsantos.controlegado.view.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object HealthScreen : Screen("health_screen")
    object ManagementScreen : Screen("management_screen")
}