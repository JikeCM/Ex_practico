package es.etg.pmpm.rap.grados_educativos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import es.etg.pmpm.rap.grados_educativos.databinding.ActivityAplicacionBinding

class Aplicacion : AppCompatActivity() {

    companion object{
        const val USUARIO = "usuario"
    }
    private lateinit var binding: ActivityAplicacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityAplicacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var n = intent.getCharSequenceExtra(USUARIO)
        binding.txtBienvenidoU.text = n.toString()
    }

}