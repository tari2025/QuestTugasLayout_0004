package com.example.prak4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// ============================================================
// FUNGSI UTAMA: 2 Teks + 4 Card (hanya memanggil fungsi card)
// ============================================================
@Composable
fun Tugas3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // --- Teks 1 ---
            Text(
                text = stringResource(id = R.string.header_title),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )

            // --- Teks 2 ---
            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black),
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // --- 4 Card: cuma manggil fungsi ---
            CardHokage()
            CardNaruto()
            CardSakura()
            CardSasuke()
        }

        Text(
            text = stringResource(id = R.string.copyright),
            fontSize = 12.sp,
            color = colorResource(id = R.color.black),
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
        )
    }
}

// ============================================================
// FUNGSI CARD 1:
@Composable
fun CardHokage() {
    ItemCard(
        imageRes = R.drawable.hokage,
        nama = stringResource(id = R.string.nama_1),
        role = stringResource(id = R.string.role_1),
        telepon = null,
        bgColor = colorResource(id = R.color.card_grey),
        isNameItalic = true,
        isNameCursive = true
    )
}

// ============================================================
// FUNGSI CARD 2: Naruto
// ============================================================
@Composable
fun CardNaruto() {
    ItemCard(
        imageRes = R.drawable.naruto,
        nama = stringResource(id = R.string.nama_2),
        role = stringResource(id = R.string.role_2),
        telepon = stringResource(id = R.string.telp_2),
        bgColor = colorResource(id = R.color.card_purple)
    )
}

// ============================================================
// FUNGSI CARD 3: Sakura
// ============================================================
@Composable
fun CardSakura() {
    ItemCard(
        imageRes = R.drawable.sakura,
        nama = stringResource(id = R.string.nama_3),
        role = stringResource(id = R.string.role_3),
        telepon = stringResource(id = R.string.telp_3),
        bgColor = colorResource(id = R.color.card_blue)
    )
}
}