package com.example.estateapp101.ui.theme.screen.register

//import android.os.Bundle
//import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
import com.example.estateapp101.ui.theme.screen.register.ui.theme.EstateApp101Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estateapp101.Greeting
import com.example.estateapp101.ui.theme.screen.login.LoginActivity


class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EstateApp101Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                        
                    )
                    RegistrationScreen()
                }
            }
        }
    }
}



@Composable
fun RegistrationScreen() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var conformpassword by remember { mutableStateOf("") }
    val context= LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top, modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Black)
    ) {
        Text(
            text = "Regitration Page",
            modifier = Modifier
//                .fillMaxSize()
//                .fillMaxSize()
                .padding(20.dp), color = Color.Magenta, fontSize = 20.sp,
            fontFamily = FontFamily.Cursive
        )
        Icon(imageVector = Icons.Default.Person, contentDescription ="")
//        Column (modifier = Modifier
////            .fillMaxSize()
//            .fillMaxWidth()
//            .background(Color.Black),
//            horizontalAlignment = Alignment.CenterHorizontally,){

        OutlinedTextField(
            value = name, onValueChange = { name = it },
            leadingIcon = {Icon(imageVector = Icons.Default.AccountCircle, contentDescription ="")},
            label = { Text(text = "Enter Name", color = Color.White) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
//    Column (modifier = Modifier
////        .fillMaxSize()
//        .fillMaxWidth()
//        .background(Color.Black),
//        horizontalAlignment = Alignment.CenterHorizontally,){
        OutlinedTextField(
            value = email, onValueChange = { email = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            label = { Text(text = "Enter Email", color = Color.White) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )


//    Column(horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
////            .fillMaxSize()
//            .padding(20.dp)) {

        OutlinedTextField(
            value = password, onValueChange = { password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            label = { Text(text = "Enter Password", color = Color.White) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )

//    Column(horizontalAlignment = Alignment.End,
//        verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier
////            .fillMaxSize()
//            .padding(20.dp)) {

        OutlinedTextField(
            value = conformpassword, onValueChange = { conformpassword = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            label = { Text(text = "Conform Password", color = Color.White) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )

        Button(onClick = {val intent= android.content.Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        }, modifier =Modifier.fillMaxWidth()) {
            Text(text = "Login")}

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent= android.content.Intent(context, RegistrationActivity::class.java)
            context.startActivity(intent)

        }) {
            Text(text = "Click to Register", fontSize = 22.sp)
        }

    }}



@Preview
@Composable
private fun Regitrationpre() {
    RegistrationScreen()
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    
}




