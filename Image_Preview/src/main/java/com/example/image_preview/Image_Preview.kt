package com.example.image_preview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

@Composable
fun ImagePreview(
    painter: Painter,
    modifier: Modifier = Modifier,
    description: String = "",
    onClickImage: () -> Unit = {}
) {

    Image(
        painter = painter,
        contentDescription = description,
        modifier = modifier
    )


}

/*
@Composable
fun DownloadImage(
    uri: String,
    modifier: Modifier = Modifier,
    description: String,
    onClickImage: () -> Unit
) {

    val imagePainter = rememberAsyncImagePainter(
        model = "$uri"
    )
    Image(
        painter = imagePainter,
        contentDescription = "",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxSize()
    )

}*/
