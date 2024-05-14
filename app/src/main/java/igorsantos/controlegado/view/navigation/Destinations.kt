package igorsantos.controlegado.view.navigation

sealed class Destinations(val route: String) {
    object MainScreen : Destinations("main_screen")
    object HealthScreen : Destinations("health_screen")
    object ManagementScreen : Destinations("Management_screen")
}