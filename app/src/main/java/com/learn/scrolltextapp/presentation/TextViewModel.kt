package com.learn.scrolltextapp.presentation

import androidx.compose.foundation.rememberScrollState
import androidx.lifecycle.ViewModel
import com.learn.scrolltextapp.data.repository.TextRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class TextViewModel @Inject constructor(val textRepository: TextRepository) : ViewModel() {



}