package com.kjprojects.finance.ViewModel
import androidx.lifecycle.ViewModel
import com.kjprojects.finance.Repository.MainRepository

class MainViewModel(val repository: MainRepository): ViewModel() {
    constructor():this(MainRepository())

    fun loadData() = repository.items
    fun loadBudget() = repository.budget
}