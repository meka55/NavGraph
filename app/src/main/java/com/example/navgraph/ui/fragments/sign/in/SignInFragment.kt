package com.example.navgraph.ui.fragments.sign.`in`
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.navgraph.R
import com.example.navgraph.data.locale.preferences.userdata.UserDataPreferences
import com.example.navgraph.databinding.FragmentSignInBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SignInFragment : Fragment(R.layout.fragment_sign_in) {

    @Inject
    lateinit var userPreferencesData: UserDataPreferences
    private val binding by viewBinding(FragmentSignInBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        clickSignIn()
        clickSingUp()

    }


    private fun clickSignIn() {
        binding.emailSignInButton.setOnClickListener {
            userPreferencesData.isAuthorized = true
            requireActivity()
                .findNavController(R.id.nav_host_fragment)
                .navigate(R.id.action_global_mainFlowFragment)
        }
    }
    private fun clickSingUp() {
        binding.createAcc.setOnClickListener {
            findNavController().navigate(
                R.id.action_signInFragment_to_signUpFragment)
        }
    }
}