package proyectos.moviles.ec2_carlos_cordova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.core.widget.addTextChangedListener
import proyectos.moviles.ec2_carlos_cordova.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tilEmail.editText?.addTextChangedListener { editable ->
            val email = editable.toString()
            val password = binding.tilPassword.editText?.text.toString()
            val isValid = validateEmailPassword(email, password)

            binding.btnlogin.isEnabled = isValid
        }

        binding.tilPassword.editText?.addTextChangedListener { editable ->
            val email = binding.tilEmail.editText?.text.toString()
            val password = editable.toString()
            val isValid = validateEmailPassword(email, password)

            binding.btnlogin.isEnabled = isValid
        }

        binding.btnlogin.setOnClickListener{
            val intent = Intent(this,AddButttonsActivity::class.java)
            startActivity(intent)
            finish()

        }
    }


    private fun validateEmailPassword(email: String, pass: String): Boolean {
        val validateEmail = "ejemplo@idat.edu.pe"
        val validatePass = "123456"
        return email == validateEmail && pass == validatePass
    }
}