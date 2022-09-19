import androidx.test.core.app.ApplicationProvider

class NavigationTests {
    val navController = TestNavHostController(
        ApplicationProvider.getApplicationContext()
    )
}