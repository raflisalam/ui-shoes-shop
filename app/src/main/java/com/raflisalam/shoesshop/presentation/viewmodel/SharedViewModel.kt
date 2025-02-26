package com.raflisalam.shoesshop.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raflisalam.shoesshop.data.ProductUiModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SharedViewModel: ViewModel() {

    private val _selectedProduct = MutableStateFlow<ProductUiModel?>(null)
    val selectedProduct = _selectedProduct.asStateFlow()

    fun selectProduct(product: ProductUiModel) {
        viewModelScope.launch {
            _selectedProduct.value = product
        }
    }

}