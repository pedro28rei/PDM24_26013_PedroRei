package com.example.shoppingapp.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Composable function that creates a clickable text. Receives text, color, size and action as arguments
@Composable
fun CustomText(
    text: String,
    fontSize: Int,
    color: androidx.compose.ui.graphics.Color,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null
) {
    Text(
        text = text,
        fontSize = fontSize.sp,
        fontWeight = FontWeight.Bold,
        color = color,
        modifier = modifier
            .clickable(enabled = onClick != null) { onClick?.invoke() }
            .padding(vertical = 8.dp)
    )
}