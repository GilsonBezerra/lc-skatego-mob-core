import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.lithiumcode.skategoapp.SkateGoDestinations
import br.com.lithiumcode.skategoapp.navigation.NavigationConstants
import br.com.lithiumcode.skategohome.navigation.homeNavigation

@Composable
fun SkateGoNavGraph(
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = SkateGoDestinations.Home.route
    ) {
        homeNavigation()
//        splashNavigation()
//        loginNavigation()
//        profileNavigation()
//        challengeNavigation()
    }
}