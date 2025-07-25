package com.example.position

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material.icons.sharp.ArrowBack
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Position(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        // Toolbar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            Icon(
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp),
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = ""
            )

            // Center text + trailing icons
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                // Leaderboard in center
                Text(
                    text = "Leaderboard",
                    modifier = Modifier.align(Alignment.Center),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                // Trailing icons at the end
                Row(
                    modifier = Modifier
                        .align(Alignment.CenterEnd),
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Sharp.Search,
                        contentDescription = ""
                    )

                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                    )

                    Icon(
                        modifier = Modifier.size(24.dp),
                        imageVector = Icons.Sharp.Add,
                        contentDescription = ""
                    )
                }
            }
        }

        // Top Section

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, bottom = 24.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            val names = listOf("Aarav", "Isha", "Rohan")
            val scores = listOf(1921, 8544, 7822)

            UserTopComposable(
                name = names[0],
                score = scores[0]
            )

            UserTopComposable(
                name = names[1],
                score = scores[1],
                paddingTop = 16.dp
            )

            UserTopComposable(
                name = names[2],
                score = scores[2]
            )
        }


        val leaderboardData = listOf(
            LeaderboardItem(4, "Dan Levy", 1860),
            LeaderboardItem(6, "Moira Rose", 1750),
            LeaderboardItem(5, "Eugene Levy", 1701),
            LeaderboardItem(7, "David Brewer", 1400),
            LeaderboardItem(8, "Karen Andreasen", 1060),
            LeaderboardItem(9, "Karen Andreasen", 1060),
            LeaderboardItem(33, "Karen Andreasen", 1060)
        )

        //List of users

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(leaderboardData.size) { index: Int ->
                UserItemComposable(leaderboardItem = leaderboardData[index])
            }
        }

        //Bottom Section

    }
}

@Composable
fun UserItemComposable(
    leaderboardItem: LeaderboardItem
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardColors(
            containerColor = Color.White,
            contentColor = Color.Black,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.White
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = leaderboardItem.rank.toString()
            )

            Image(
                modifier = Modifier
                    .height(48.dp)
                    .width(48.dp)
                    .clip(CircleShape)
                    .padding(start = 8.dp),
                imageVector = Icons.Filled.AccountCircle,
                contentDescription = ""
            )

            Text(
                modifier = Modifier
                    .padding(start = 8.dp),
                text = leaderboardItem.name,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )


            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = leaderboardItem.points.toString(),
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                )

                Text(
                    text = "Points"
                )
            }
        }
    }

    Spacer(
        modifier = Modifier
            .padding(top = 16.dp)
    )


}

@Composable
fun UserTopComposable(
    imageVector: ImageVector = Icons.Filled.AccountCircle,
    name : String,
    score : Int,
    paddingTop : Dp = 48.dp
) {
    Column(
        modifier = Modifier
            .padding(top = paddingTop)
    ) {
        Image(
            modifier = Modifier
                .height(96.dp)
                .width(96.dp)
                .clip(CircleShape),
            imageVector = imageVector,
            contentDescription = "",
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = name,
            fontSize = 16.sp
        )

        Text(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            text = score.toString(),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
    }
}