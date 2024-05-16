package com.example.estateapp101.navigation

import com.example.estateapp101.ui.theme.screen.about.AboutScreen
import com.example.estateapp101.ui.theme.screen.home.HomeScreen
import com.example.estateapp101.ui.theme.screen.login.LoginScreen
import com.example.estateapp101.ui.theme.screen.payment.PaymentScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.estateapp101.ui.theme.screen.register.RegistrationScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUTES_HOME
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(ROUTES_LOGIN){
            LoginScreen()
        }
        composable(ROUTES_REGISTER){
            RegistrationScreen()
        }
        composable(ROUTES_HOME){
            HomeScreen(navController = navController)
        }
        composable(ROUTES_PAYMENT){
           PaymentScreen()
        }
        composable(ROUTES_ABOUT){
            AboutScreen()
        }
    }
}