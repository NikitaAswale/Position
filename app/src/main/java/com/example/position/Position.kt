package com.example.position

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Position(){
    Column (modifier = Modifier.fillMaxSize()){
        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center){
            Text("My Position")
        }
        Row(modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){
            Card (modifier = Modifier.fillMaxWidth().padding(8.dp),
                elevation = CardDefaults.cardElevation(20.dp), colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray),
                    shape = RoundedCornerShape(12.dp)

                ){
                Column (modifier = Modifier.padding(16.dp))  {
                    Row (
                        modifier = Modifier.fillMaxWidth().padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        //horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                                contentDescription = "",
                            modifier = Modifier.size(40.dp).clip(CircleShape)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column  {
                            Text("Debbie K")
                            Text("Product Designer")
                        }
                    }
                    Text("Leaderboard Position")
                    Text("48")
                    Text("Points")
                    Text("102451")
                    Text("Skills")
                    Text("Infographics, Banner, Motion Design")
                }
            }
        }
Spacer(modifier = Modifier.height(12.dp))
        Column (
            modifier = Modifier.fillMaxSize(),
            //horizontalAlignment = Alignment.Start
        ) {
            Column (modifier = Modifier.background(Color.Yellow),
                horizontalAlignment = Alignment.Start) {
                Text("1311 points away from the top")
                Text("Your can earn ponts by completing content and by earning badges")
            }

            Spacer(modifier = Modifier.height(6.dp))

            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center){
                Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color.Red)) {
                    Text("Goto My Learning Plan")
                }
            }
        }
    }
}