package com.example.businesscard

import android.graphics.Color.rgb
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background ){
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
private fun BusinessCardUI(
    image: Painter,
    fullName: String,
    title: String,
    phone: String,
    phoneIcon: Painter,
    email: String,
    emailIcon: Painter,
    social: String,
    socialIcon: Painter,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
//       Upper part of UI
        Column(
            modifier = Modifier.weight(3f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(120.dp))
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 135.dp)
                    .background(Color(rgb(7, 48, 66)))
            )
            Text(
                text = fullName,
                fontSize = 44.sp,
                color = Color(0xFF0B361E),
                modifier = Modifier
                    .padding(bottom = 8.dp)
            )
            Text(
                text = title,
                color = Color(0xFF3A644D),
            )
        }

//        Lower part of UI
        Column(modifier = Modifier
            .weight(1f)
            .padding(bottom = 32.dp),
            verticalArrangement = Arrangement.Bottom) {

            ContactRow(icon = phoneIcon, contactInfo = phone)
            ContactRow(icon = socialIcon, contactInfo = social)
            ContactRow(icon = emailIcon, contactInfo = email)
        }
    }
}

@Composable
fun ContactRow(icon: Painter, contactInfo: String) {
    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(painter = icon, contentDescription = null, tint = Color(0xFF337E54))
        Spacer(modifier = Modifier.width(20.dp))
        Text(text = contactInfo, color = Color(0xFF0B361E))
    }
}

@Composable
fun BusinessCardApp(){
    val image = painterResource(id = R.drawable.android_logo)
    val phoneIcon = painterResource(id = R.drawable.phoneicon)
    val emailIcon = painterResource(id = R.drawable.emailicon)
    val socialIcon = painterResource(id = R.drawable.shareicon)

    BusinessCardUI(
        image = image,
        fullName = stringResource(id = R.string.fullName),
        title = stringResource(id = R.string.title),
        phone = stringResource(id = R.string.phone),
        email = stringResource(id = R.string.email),
        social = stringResource(id = R.string.social),
        emailIcon = emailIcon,
        socialIcon = socialIcon,
        phoneIcon = phoneIcon,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(rgb(210, 232, 212)))
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCardApp()

    }
}