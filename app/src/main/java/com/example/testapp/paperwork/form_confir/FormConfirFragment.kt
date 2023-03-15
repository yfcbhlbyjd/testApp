package com.example.testapp.paperwork.form_confir


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.selectsneakers.core.ui.BaseFragment
import com.example.selectsneakers.ui.paperwork.form_confir.FormConfirViewModel
import com.example.testapp.databinding.FragmentFormConfirBinding

class FormConfirFragment: BaseFragment<FragmentFormConfirBinding, FormConfirViewModel>() {
        override fun inflateViewBinding(
            inflater: LayoutInflater,
            container: ViewGroup?,
        ): FragmentFormConfirBinding {
            return FragmentFormConfirBinding.inflate(inflater, container, false)
        }

    override val viewModel: FormConfirViewModel by lazy {
        ViewModelProvider(this)[FormConfirViewModel::class.java]
    }


    @SuppressLint("SetTextI18n")
    override fun initListeners() {
        super.initListeners()
        val bundle = arguments
        val street = bundle?.getString("street")
        val home = bundle?.getString("home")
        val index = bundle?.getString("index")
        val name = bundle?.getString("name")
        val surname = bundle?.getString("surname")
        val phoneNumber = bundle?.getString("phoneNumber")
        val email = bundle?.getString("email")

        binding.tvConFullName.text = "$name $surname"
        binding.tvConPhoneNumber.text = phoneNumber
        binding.tvConUserEmail.text = email
        binding.tvConHome.text = "$street $home"
        binding.tvConIndex.text = index



    }
}