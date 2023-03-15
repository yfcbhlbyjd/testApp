package com.example.testapp.paperwork.form_address

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.selectsneakers.core.ui.BaseFragment
import com.example.selectsneakers.ui.paperwork.form_address.FormAddressViewModel
import com.example.selectsneakers.ui.paperwork.form_address.spinner.SpinnerViewModel
import com.example.testapp.paperwork.form_confir.FormConfirFragment

import com.example.testapp.databinding.FragmentFormAddressBinding

class FormAddressFragment : BaseFragment<FragmentFormAddressBinding, FormAddressViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater, container: ViewGroup?, ): FragmentFormAddressBinding {
        return FragmentFormAddressBinding.inflate(inflater, container, false)
    }

    private lateinit var spinnerViewModel: SpinnerViewModel


    override val viewModel: FormAddressViewModel by lazy {
        ViewModelProvider(this)[FormAddressViewModel::class.java]
    }

    override fun initView() {
        super.initView()
    }
//        spinnerViewModel = ViewModelProvider(requireActivity()).get(SpinnerViewModel::class.java)
//
//        val countryList = listOf("USA", "Canada", "Mexico")
//        val cityList = listOf("New York", "Toronto", "Mexico City")
//        val phoneCodeList = listOf("+1", "+1", "+52")
//        val dataList = listOf(countryList, cityList, phoneCodeList)
//
//        val adapter = SpinnerAdapter(requireContext(), dataList)
//
//        binding.countrySpinner.adapter = adapter
//        binding.citySpinner.adapter = adapter
//        binding.phoneCodeSpinner.adapter = adapter
//
//        binding.countrySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                spinnerViewModel.selectedCountry = dataList[0][position]
//            }
//            override fun onNothingSelected(parent: AdapterView<*>?) {}
//        }
//
//        binding.citySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                spinnerViewModel.selectedCity = dataList[1][position]
//            }
//            override fun onNothingSelected(parent: AdapterView<*>?) {}
//        }
//
//        binding.phoneCodeSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                spinnerViewModel.selectedPhoneCode = dataList[1][position]
//
//            }
//            override fun onNothingSelected(parent: AdapterView<*>?) {}
//        }
//
//    }

            override fun initObserver() {
                super.initObserver()
                binding.btnSave.setOnClickListener {
                    val street = binding.tvStreet.text.toString().trim()
                    val home = binding.tvHome.text.toString().trim()
                    val index = binding.tvIndex.text.toString().trim()
                    val name = binding.tvNameUser.text.toString().trim()
                    val surname = binding.tvSurname.text.toString().trim()
                    val phoneNumber = binding.tvPhoneNumber.text.toString().trim()
                    val email = binding.tvEmail1.text.toString().trim()

                    if (street.isEmpty() && home.isEmpty() && index.isEmpty() && name.isEmpty() &&
                        surname.isEmpty() && phoneNumber.isEmpty() && email.isEmpty()
                    ) {
//                        findNavController().navigate(R.id.resultFragment, Bundle().apply {
                        val bundle = Bundle()
                        bundle.putString("street", street)
                        bundle.putString("home", home)
                        bundle.putString("index", index)
                        bundle.putString("name", name)
                        bundle.putString("surname", surname)
                        bundle.putString("phoneNumber", phoneNumber)
                        bundle.putString("email", email)
                        val formConfirFragment = FormConfirFragment()
                        formConfirFragment.arguments = bundle

                    } else {
                        Toast.makeText(context, "Все поля должны быть заполнены!", Toast.LENGTH_SHORT).show()
                    }
                }

        }
    }
