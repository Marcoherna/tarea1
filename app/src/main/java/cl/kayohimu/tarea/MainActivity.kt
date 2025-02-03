package cl.kayohimu.tarea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cl.kayohimu.tarea.ui.theme.TareaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TareaTheme {
                Surface {
                    TareaBody()
                }
            }
        }
    }
}

@Composable
fun TareaBody() {
    Column {
        TareaImage()
        TareaTexts()
    }
}


@Composable
fun TareaImage() {
    Box {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            modifier = Modifier.padding(0.dp, 40.dp, 0.dp, 0.dp),
            contentDescription = null,
        )
    }
}

@Composable
fun TareaTexts() {
    val  titulo = stringResource(R.string.titulo)
    val parrafo1 = stringResource(R.string.parrafo1)
    val parrafo2 = stringResource(R.string.parrafo2)
    Column {
        Text(
            text = titulo,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = parrafo1,
            modifier = Modifier.padding(16.dp, 0.dp),
        )
        Text(
            text = parrafo2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify

        )
    }
}

@Preview
@Composable
fun TareaImagePreview() {
    TareaTheme {
        TareaImage()
    }
}

@Preview(showBackground = true)
@Composable
fun TareaTextsPreview() {
    TareaTheme {
        TareaTexts()
    }
}