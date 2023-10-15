package com.learn.scrolltextapp.domain

import com.learn.scrolltextapp.data.repository.TextRepository
import javax.inject.Inject

class TextInteractor @Inject constructor(private val textRepository: TextRepository) {
    fun getText(): String {
        return textRepository.getText()
    }
}