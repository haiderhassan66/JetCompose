 package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcompose.ui.theme.JetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationScreen()
        }
    }
}

 @Preview(showBackground = true, showSystemUi = true)
 @Composable
 private fun PreviewFunction(){
//     Column(
//         verticalArrangement = Arrangement.Center,
//         horizontalAlignment = Alignment.CenterHorizontally
//     ) {
//         Text(text = "A", fontSize = 24 .sp)
//         Text(text = "B", fontSize = 24 .sp)
//     }

//     Row (
//         horizontalArrangement = Arrangement.Center,
//         verticalAlignment = Alignment.CenterVertically
//     ){
//         Text(text = "A", fontSize = 24 .sp)
//         Text(text = "B", fontSize = 24 .sp)
//     }

//     Box(contentAlignment = Alignment.Center) {
//         Image(painter = painterResource(id = R.drawable.baseline_heart_broken_24) , contentDescription = "")
//         Image(painter = painterResource(id = R.drawable.baseline_arrow_back_24) , contentDescription = "", colorFilter = ColorFilter.tint(Color.Red))
//     }
     Column {
         ListViewItem(R.drawable.baseline_heart_broken_24,"John Doe","Software Engineer")
         ListViewItem(R.drawable.baseline_heart_broken_24,"John Doe","Software Engineer")
         ListViewItem(R.drawable.baseline_heart_broken_24,"John Doe","Software Engineer")
         ListViewItem(R.drawable.baseline_heart_broken_24,"John Doe","Software Engineer")
     }


 }

 @Composable
 private fun ListViewItem(imageId:Int, name:String, occupation:String){
     Row (Modifier.padding(8 .dp)){
         Image(painter = painterResource(
             id = imageId),
             contentDescription = "",
             Modifier.size(40 .dp))
         Column {
             Text(text = name, fontWeight = FontWeight.Bold)
             Text(text = occupation, fontWeight = FontWeight.Thin, fontSize = 12 .sp)
         }
     }
 }

// @OptIn(ExperimentalMaterial3Api::class)
// @Preview(showBackground = true, showSystemUi = true)
// @Composable
// private fun image(){
//     TextField(
//         value = "Hello",
//         onValueChange = {},
//         label = { Text(text = "Enter Message")},
//         )
// }

 @OptIn(ExperimentalMaterial3Api::class)
 @Composable
 fun textField(){
     val state = remember {
         mutableStateOf("")
     }
     TextField(
         value = state.value,
         onValueChange = {
             state.value = it
         },
         label = { Text(text = "Enter Message")},
     )
 }

// @Preview(showBackground = true, showSystemUi = true)
// @Composable
// private fun image(){
//     Button(onClick = { }, colors = ButtonDefaults.buttonColors(
//         contentColor = Color.White, containerColor = Color.Blue
//     ), enabled = true
//     ) {
//         Text(text = "Hello")
//         Image(painter = painterResource(
//             id = R.drawable.baseline_arrow_back_24),
//             contentDescription = "Image",
//             colorFilter = ColorFilter.tint(Color.Red))
//     }
// }

// @Preview(showBackground = true, showSystemUi = true)
// @Composable
// private fun image(){
//     Image(
//         painter = painterResource(
//             id = R.drawable.baseline_arrow_back_24),
//         contentDescription = "Image",
//         colorFilter = ColorFilter.tint(Color.Red))
// }


// @Composable
// fun showText(name:String){
//    Text(text = "Hello $name",
//        fontStyle = FontStyle.Italic
//    )
// }

// @Preview(showBackground = true, showSystemUi = true)
// @Composable
// private fun previewFun(){
//    showText(name = "Test")
// }