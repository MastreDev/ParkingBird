package kr.mastre.parkingbird.feature_parking_lot

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kr.mastre.parkingbird.databinding.FragmentParkinglotBinding

class ParkingLotFragment : Fragment() {

    private var _binding: FragmentParkinglotBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return FragmentParkinglotBinding.inflate(inflater, container, false).apply { _binding = this }.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}