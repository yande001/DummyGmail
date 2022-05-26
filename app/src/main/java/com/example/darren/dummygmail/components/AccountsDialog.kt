package com.example.darren.dummygmail.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.darren.dummygmail.R

@Composable
fun AccountsDialog(openDialog: MutableState<Boolean>) {
    Dialog(
        onDismissRequest = {
            openDialog.value = false
        },
        properties = DialogProperties(dismissOnClickOutside = false)
    ) {
        AccountsDialogUI(openDialog = openDialog)
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>){
    Card() {
        Column(
            modifier = modifier
                .background(Color.White)
                .padding(bottom = 16.dp)
        ) {
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { openDialog.value = false}) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "")
                }
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "",
                    modifier
                        .size(30.dp)
                        .weight(2.0f)
                )
            }
            Row(
                modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp))
            {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                    )
                Column(
                    modifier
                        .weight(2.0f)
                        .padding(bottom = 16.dp, start = 16.dp)) {
                    Text(text = "Darren", fontWeight = FontWeight.Bold)
                    Text(text = "darren@mail.com")
                }
                Text(text = "99+", modifier.padding(end = 16.dp))

            }
            Row(modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Card(
                    modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, Color.Gray)
                    ) {
                    Text(
                        text = "Google Account",
                        modifier.padding(8.dp),
                        textAlign = TextAlign.Center
                    )

                }
                Spacer(modifier.width(10.dp))
            }
            Divider(modifier.padding(top = 16.dp))

            Row(modifier.padding(top = 16.dp, start = 16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                    )
                Column(
                    modifier
                        .padding(start = 16.dp, bottom = 16.dp)
                        .weight(2.0f)
                    ) {
                    Text(text = "Lenka", fontWeight = FontWeight.Bold)
                    Text(text = "Lenka@gmail.com")
                }
                Text(
                    text = "99+",
                    modifier.padding(end = 16.dp),
                    textAlign = TextAlign.Center
                    )
            }
            Row(modifier.padding(top = 16.dp, start = 16.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "",
                    modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(color = Color.Gray)
                )
                Column(
                    modifier
                        .padding(start = 16.dp, bottom = 16.dp)
                        .weight(2.0f)
                ) {
                    Text(text = "Plum", fontWeight = FontWeight.Bold)
                    Text(text = "Plum@gmail.com")
                }
                Text(
                    text = "99+",
                    modifier.padding(end = 16.dp),
                    textAlign = TextAlign.Center
                )
            }
            Row(modifier.padding(top = 16.dp, start = 16.dp)
            ){
                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "")
                Text(
                    text = "Add Another Account",
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                )
            }
            Row(modifier.padding(top = 16.dp, start = 16.dp)
            ){
                Icon(imageVector = Icons.Outlined.AccountCircle, contentDescription = "")
                Text(
                    text = "Manage Account On This Device",
                    modifier
                        .weight(2.0f)
                        .padding(start = 16.dp),
                    fontWeight = FontWeight.Bold
                )

            }
            Divider(modifier.padding(top = 16.dp))
            
            Row(modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)) {
                Text(
                    text = "Privacy Policy",
                    modifier.weight(1.0f),
                    textAlign = TextAlign.Center
                )
                Text(text = "Terms of Services",
                    modifier.weight(1.0f),
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun AccountsDialogUIPreview(){
    AccountsDialogUI(openDialog = mutableStateOf(false))
}