package com.example.jetcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun previewItem() {
    //make recyclerview
    LazyColumn(content = {
        items(getCategoryList()){item->
            BlogCategory(
                img = item.img,
                title = item.title,
                subtitle = item.subtitle
            )
        }
    })
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map {item->
//            BlogCategory(
//                img = item.img,
//                title = item.title,
//                subtitle = item.subtitle
//            )
//        }
//    }
}


@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(elevation = CardDefaults.cardElevation(8.dp), modifier = Modifier.padding(8.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
        )
    }
}

data class Category(
    val img: Int,
    val title: String,
    val subtitle: String
)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()

    list.apply {
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
        add(Category(R.drawable.baseline_heart_broken_24,"Programming","Learn Different Languages"))
    }

    return list
}