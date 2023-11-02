package com.example.viewbindinginactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewbindinginactivity.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private lateinit var binding:FragmentBlankBinding
   // private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentBlankBinding.inflate(inflater, container, false)
        binding.printBtn.setOnClickListener {
            val title=binding.edTitle.text.toString()
            val des=binding.edDes.text.toString()

            if(binding.edTitle.text.toString().isEmpty())
            {
                binding.edTitle.error="Required"
            }
            else if (binding.edDes.text.toString().isEmpty())
            {
                binding.edDes.error="Required"
            }
            else
            {
                binding.titleTxt.text="Title: $title"
                binding.desTxt.text="Description: $des"
            }
        }
        return  binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
      //  binding=null
    }
}