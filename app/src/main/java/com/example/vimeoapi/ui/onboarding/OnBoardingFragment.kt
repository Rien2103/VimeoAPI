package com.example.vimeoapi.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vimeoapi.R
import kotlinx.android.synthetic.main.fragment_onboarding.*

class OnBoardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.onboarding_photo_btn.setOnClickListener {
            val action = OnBoardingFragmentDirections.actionOnBoardingFragmentToPhotoMainFragment()
            findNavController().navigate(action)
        }

        this.onboarding_video_btn.setOnClickListener {
            val action =  OnBoardingFragmentDirections.actionOnBoardingFragmentToVideoMainFragment()
            findNavController().navigate(action)
        }
    }
}
