package kr.mastre.parkingbird.feature_map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kr.mastre.parkingbird.databinding.FragmentMapBinding

class MapFragment : Fragment() {

    private var _binding: FragmentMapBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return FragmentMapBinding.inflate(inflater, container, false).apply { _binding = this }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnParkingLot.setOnClickListener {
            findNavController().navigate("parking_lot")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}