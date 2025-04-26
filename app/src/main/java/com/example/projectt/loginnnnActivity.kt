//package com.example.projectt
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.projectt.ui.theme.ProjecttTheme
//
//class LoginActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//
//        setContent {
//            Scaffold { innerPadding ->
//                InstaClone(innerPadding)
//            }
//        }
//    }
//}
//
//@Composable
//fun InstaClone(innerPadding : PaddingValues){
//    Column(
//        modifier =
//            Modifier
//                .padding(innerPadding)
//                .fillMaxSize()
//                .background(color = Color.White)
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier
//                .fillMaxWidth()
//                .background(color = Color.White)
//                .padding(horizontal = 20.dp, vertical = 20.dp)
//
//        ){
//            Icon(imageVector = Icons.Default.KeyboardArrowLeft,
//                contentDescription = null, modifier = Modifier.height(30.dp).width(30.dp)
//            )
//
//            Text(text = "Andrew")
//            TextStyle(
//                fontSize = 25.sp,
//                fontWeight = FontWeight.Bold,
//
//                )
//
//            Icon(
//                painterResource(R.drawable.baseline_more_horiz_24),
//                contentDescription = null,
//                modifier = Modifier.height(30.dp).width(30.dp)
//            )
//
//        }
//        Row {
//            Image(
//                painter = painterResource(R.drawable.),
//                contentDescription = null,
//                modifier = Modifier.height(120.dp).width(120.dp)
//                    .clip(shape = RoundedCornerShape(100.dp))
//            )
//            Column {
//                Text("174")
//                Text("Posts")
//            }
//            Column {
//                Text("174")
//                Text("Followers")
//            }
//            Column {
//                Text("174")
//                Text("Following")
//            }
//        }
//    }
//}
//
//
//
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewInsta(){
//    InstaClone(innerPadding = PaddingValues(0.dp))
//}
