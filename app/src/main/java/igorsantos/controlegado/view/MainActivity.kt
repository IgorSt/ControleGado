package igorsantos.controlegado.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import igorsantos.controlegado.R
import igorsantos.controlegado.view.navigation.NavHostControleGado
import igorsantos.controlegado.view.navigation.Screen
import igorsantos.controlegado.view.theme.ControleGadoTheme

class MainActivity() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavHostControleGado()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CenterAlignToolbar() {
    TopAppBar(
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary
        ),
        title = {
            Text(
                text = stringResource(id = R.string.main_top_bar),
                maxLines = 1
            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
            }
        }
    )
}

@Composable
fun ContainerButtons(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(12.dp)
        ) {
            Text(text = stringResource(id = R.string.health_management))
        }
        Button(
            onClick = { navController.navigate(Screen.ManagementScreen.route) },
            modifier = Modifier.padding(12.dp)
        ) {
            Text(text = stringResource(id = R.string.cattle))
        }
    }
}

@Composable
fun HomeScreen(navController: NavController) {
    ControleGadoTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column {
                CenterAlignToolbar()
                ContainerButtons(navController)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ControleGadoTheme {
        HomeScreen(rememberNavController())
    }
}