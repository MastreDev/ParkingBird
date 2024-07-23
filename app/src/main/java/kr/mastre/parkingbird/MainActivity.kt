package kr.mastre.parkingbird

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.createGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.fragment
import kr.mastre.parkingbird.databinding.ActivityMainBinding
import kr.mastre.parkingbird.feature_map.MapFragment
import kr.mastre.parkingbird.feature_parking_lot.ParkingLotFragment
import kr.mastre.parkingbird.feature_search.SearchFragment

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = binding.navHost.getFragment<NavHostFragment>().navController
        navController.graph = navController.createGraph(startDestination = "search") {
            fragment<SearchFragment>("search") {
                label = "Search Title"
            }
            fragment<MapFragment>("map") {
                label = "map"
            }
            fragment<ParkingLotFragment>("parking_lot") {
                label = "parking_lot"
            }
        }
    }

}