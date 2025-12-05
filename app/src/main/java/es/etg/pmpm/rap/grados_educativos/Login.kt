package es.etg.pmpm.rap.grados_educativos

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewbinding.ViewBinding
import es.etg.pmpm.rap.grados_educativos.databinding.ActivityMainBinding


class Login : AppCompatActivity() {

    companion object{
        const val USUARIO="usuario"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState!=null){
            val usuario = savedInstanceState.getCharSequence(USUARIO,"nulo")
            val contrasenia = savedInstanceState.getInt(USUARIO,0)
            binding.etUsuario.text = usuario as Editable?
            binding.etContrasenia.text = contrasenia as Editable?
        }

        binding.btEntrar.setOnClickListener {
            val intent = Intent(this, Aplicacion::class.java)
            intent.putExtra(USUARIO, binding.etUsuario.text.toString())
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState.putCharSequence(USUARIO,binding.etUsuario.text.toString())
        outState.putInt(USUARIO,binding.etContrasenia.text.toString().toInt())
    }

}