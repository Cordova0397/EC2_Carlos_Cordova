package proyectos.moviles.ec2_carlos_cordova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class AddAddressActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var map: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_address)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.fragment_map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0
        val MachuPicchu = LatLng(-13.1631,-72.5450)
        val Nazca = LatLng(-14.7391,-75.1309)
        val Kuelap = LatLng(-6.4250,-77.9183)
        map.addMarker(MarkerOptions().position(MachuPicchu).title("MachuPicchu"))
        map.addMarker(MarkerOptions().position(Nazca).title("Lineas de Nazca"))
        map.addMarker(MarkerOptions().position(Kuelap).title("Kuelap - Amazonas"))
        val boundBuilder = LatLngBounds.builder()
            .include(MachuPicchu)
            .include(Nazca)
            .include(Kuelap)
        map.animateCamera(CameraUpdateFactory.newLatLngBounds(boundBuilder.build(), 200))
        //map.moveCamera(CameraUpdateFactory.newLatLngZoom(Lima,16f))
    }
}