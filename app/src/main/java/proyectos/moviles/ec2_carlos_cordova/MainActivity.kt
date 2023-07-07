package proyectos.moviles.ec2_carlos_cordova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import proyectos.moviles.ec2_carlos_cordova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}