package com.example.focusforge.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.focusforge.domain.repository.AppRepository
import com.example.focusforge.data.database.AppLogEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val repository: AppRepository
) : ViewModel() {
    val logs: Flow<List<AppLogEntity>> = repository.getLogs()

    fun addLog(title: String, content: String) {
        viewModelScope.launch {
            repository.addLog(title, content)
        }
    }
}
