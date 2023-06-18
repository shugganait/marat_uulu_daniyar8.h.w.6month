package lib.kg.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lib.kg.jetpackcompose.ui.theme.JetpackComposeTheme

val list = listOf(
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Emotional Well-being & Healing Practices for Children",
        video = "32 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Self Care Before Child Care",
        video = "18 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Make a Life Changing Difference in a Child’s Life",
        video = "12 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Prevent & Respond to Sexual Abuse",
        video = "8 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Child Protection 101",
        video = "15 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Meet Nutritional Needs ",
        video = "11 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "Meet Nutritional Needs ",
        video = "11 video series"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "HOW DISPLACEMENT INSTABILITY & UNCERTAINTY AFFECT ...",
        video = "04:14"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = "03:28"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "HOW TO HELP CHILDREN MAKE SENSE OF THEIR EMOTIONS",
        video = "Downloaded"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "UNDERSTANDING SADNESS & DEPRESSION IN CHILDREN",
        video = "Downloaded"
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
    YoutubePlaylistsModel(
        image = R.drawable.ic_launcher_background,
        title = "SIGNS OF EMOTIONAL DISTRESS OR TRAUMA",
        video = ""
    ),
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    YoutubeFirstScreen(list)
                }
            }
        }
    }
}

data class YoutubePlaylistsModel(
    val image: Int,
    val title: String,
    val video: String
)

@Composable
fun YoutubeFirstScreen(playlistsList: List<YoutubePlaylistsModel>) {

    LazyColumn(content = {
        itemsIndexed(playlistsList) { _, item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 6.dp)
            ) {
                Card(
                    shape = RoundedCornerShape(4),
                    modifier = Modifier
                        .width(120.dp)
                        .height(80.dp)
                ) {
                    Box(modifier = Modifier.width(120.dp)) {
                        Image(
                            modifier = Modifier.fillMaxWidth(),
                            painter = painterResource(id = item.image),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                        Box(
                            modifier = Modifier
                                .background(Color.Black.copy(alpha = 0.8f))
                                .height(24.dp)
                                .fillMaxWidth()
                                .align(alignment = Alignment.BottomCenter)
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 24.dp),
                                text = "playlist",
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                )
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically)
                        .padding(start = 8.dp)
                ) {
                    Text(
                        text = item.title,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500)
                    )
                    Text(
                        modifier = Modifier.padding(top = 4.dp),
                        text = item.video,
                        fontSize = 12.sp
                    )
                }
            }
        }
    })
}

@Preview(showBackground = true)
@Composable
fun YoutubePreview() {
    YoutubeFirstScreen(
        playlistsList = list
    )
}