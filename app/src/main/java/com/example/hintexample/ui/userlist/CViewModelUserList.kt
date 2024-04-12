package com.example.hintexample.ui.userlist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hintexample.repositories.CRepositoryUsers
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class CViewModelUserList
@Inject constructor(
    repositoryUsers: CRepositoryUsers
): ViewModel()
{
    //https://dev.to/vtsen/convert-flow-to-sharedflow-and-stateflow-on4
    val users = repositoryUsers.getAll().stateIn(
        scope = viewModelScope,
        started = SharingStarted.Eagerly,
        initialValue = listOf()
    )

//    private val _users = MutableStateFlow<List<CUser>>(listOf())
//    private val users
//    init {
//
//        viewModelScope.launch {
//            flow.collect { value ->
//                stateFlow.value = value
//            }
//        }
//    }
//
//        users = repositoryUsers.getAll().stateIn(
//            scope = viewModelScope,
//            started = SharingStarted.Eagerly,
//            initialValue = null
//        )
//    }
}