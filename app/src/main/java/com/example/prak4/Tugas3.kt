package com.example.prak4



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

}