package com.gsparvej.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gsparvej.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // এখানে Greeting এর জায়গায় AlgebraFormulasSimple কল করলাম
                    AlgebraFormulasSimple(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun AlgebraFormulasSimple(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text(
            text = "➤ বীজগণিতের সাধারণ সূত্রসমূহ:",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(buildAnnotatedString {
            append("a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("m") }
            append(" × a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(" = a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("m+n") }
        }, fontSize = 16.sp)

        Text(buildAnnotatedString {
            append("a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("m") }
            append(" ÷ a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(" = a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("m-n") }
            append(" (a ≠ 0)")
        }, fontSize = 16.sp, modifier = Modifier.padding(top = 4.dp))

        Text(buildAnnotatedString {
            append("(")
            append("a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("m") }
            append(")")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(" = a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("m×n") }
        }, fontSize = 16.sp, modifier = Modifier.padding(top = 4.dp))

        Text(buildAnnotatedString {
            append("(")
            append("a")
            append("b")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(") = a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(" b")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
        }, fontSize = 16.sp, modifier = Modifier.padding(top = 4.dp))

        Text(buildAnnotatedString {
            append("(")
            append("a")
            append("÷")
            append("b")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(") = a")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
            append(" ÷ b")
            withStyle(style = SpanStyle(fontSize = 12.sp)) { append("n") }
        }, fontSize = 16.sp, modifier = Modifier.padding(top = 4.dp))

        Text(
            text = "সুত্রসিদ্ধ সমীকরণ (Factorization):\n" +
                    "x² + (a+b)x + ab = (x+a)(x+b)\n" +
                    "x² - (a+b)x + ab = (x-a)(x-b)",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAlgebraFormulas() {
    MyApplicationTheme {
        AlgebraFormulasSimple()
    }
}
