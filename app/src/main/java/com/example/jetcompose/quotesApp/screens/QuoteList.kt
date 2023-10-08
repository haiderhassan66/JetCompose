package com.example.jetcompose.quotesApp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.jetcompose.quotesApp.models.Quote

@Composable
fun QuoteList(data: Array<Quote>,onClick: (quote:Quote)->Unit) {
    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it, onClick)
        }
    })
}