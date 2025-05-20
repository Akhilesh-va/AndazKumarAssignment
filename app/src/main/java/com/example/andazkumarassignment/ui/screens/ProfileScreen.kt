package com.example.andazkumarassignment.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.CarCrash
import androidx.compose.material.icons.filled.CurrencyRupee
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.andazkumarassignment.R
import com.example.andazkumarassignment.ui.screens.comps.ProfileTopbar
import com.example.andazkumarassignment.ui.screens.comps.options.OptionItem
import com.example.andazkumarassignment.ui.screens.comps.options.OptionItem2
import com.example.andazkumarassignment.ui.screens.comps.rewards.RewardItem


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.matte_gray))
    ) {
        Column(
            Modifier.padding(16.dp)

        ) {
            ProfileTopbar()
            Spacer(modifier = Modifier.height(44.dp))
            //section2
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.profile),
                        "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(66.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column() {
                        Text(
                            text = "andaz Kumar",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Text(text = "member since Dec, 2020", fontSize = 16.sp, color = Color.Gray)
                    }
                }

                Icon(
                    Icons.Outlined.Edit,
                    "",
                    modifier = Modifier
                        .border(.5.dp, Color.LightGray, CircleShape)
                        .size(50.dp)
                        .padding(12.dp),
                    tint = Color.Gray
                )

            }
            //section3
            Spacer(modifier = Modifier.height(20.dp))
            Column(

                modifier = Modifier
                    .background(colorResource(R.color.dark_gray))
                    .fillMaxWidth()
                    .border(1.dp, Color.LightGray, shape = RectangleShape)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(28.dp)
                ) {
                    Icon(
                        Icons.Default.CarCrash, "", tint = Color.White,
                        modifier = Modifier
                            .size(34.dp)
                            .border(2.dp, Color.White, CircleShape)
                            .padding(8.dp)
                    )
                    Spacer(Modifier.width(12.dp))
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Text("get to know your vehicles, inside out", color = Color.White)
                        Spacer(modifier = Modifier.height(6.dp))
                        Row(verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {
                            Text("CRED garage", fontWeight = FontWeight.Bold, color = Color.White)
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(Icons.Default.ArrowForward, "" , tint = Color.White)
                        }
                    }
                }


            }
            //section 4
            Spacer(modifier = Modifier.height(54.dp))
            OptionItem()
            Spacer(modifier = Modifier.height(8.dp))
            Divider(Modifier
                .height(.5.dp)
                .background(Color.LightGray))
            Spacer(modifier = Modifier.height(12.dp))
            OptionItem2(Icons.Default.CurrencyRupee, "lifetime cashback", "₹3")
            Spacer(modifier = Modifier.height(8.dp))
            Divider(Modifier
                .height(.5.dp)
                .background(Color.LightGray))
            Spacer(modifier = Modifier.height(12.dp))
            OptionItem2(Icons.Default.AccountBalanceWallet, "bank balance", "check")
            Spacer(modifier = Modifier.height(20.dp))



        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(16.dp)
        ) {
            Column(){
                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "YOUR REWARDS & BENEFITS",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium, letterSpacing = 0.2.em
                )
                Spacer(modifier = Modifier.height(16.dp))

                RewardItem("cashback balance", "₹0")
                Spacer(modifier = Modifier.height(16.dp))
                Divider(
                    Modifier
                        .height(.5.dp)
                        .background(Color.LightGray)
                )
                Spacer(modifier = Modifier.height(16.dp))
                RewardItem("coins", "26,46,583")
                Spacer(modifier = Modifier.height(16.dp))
                Divider(
                    Modifier
                        .height(.5.dp)
                        .background(Color.LightGray)
                )
                Spacer(modifier = Modifier.height(16.dp))
                RewardItem("win upto rs 1000", "refer and earn")

            }
            Spacer(modifier = Modifier.height(24.dp))
            Column(Modifier.padding()) {

                Text(
                    text = "TRANSACTIONS & SUPPORT",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium, letterSpacing = 0.2.em
                )
                Spacer(modifier = Modifier.height(20.dp))
                RewardItem("all transactions", "")
            }
        }
    }


}