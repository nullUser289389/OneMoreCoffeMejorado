package com.example.onemorecoffecompleto

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.onemorecoffecompleto.databinding.ActivityMainBinding

import androidx.fragment.app.Fragment
import com.example.onemorecoffecompleto.databinding.FragmentSeleccionBinding
import java.util.zip.Inflater

class SeleccionFragment : Fragment() {
    private var _binding:FragmentSeleccionBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}