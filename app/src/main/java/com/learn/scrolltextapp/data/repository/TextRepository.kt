package com.learn.scrolltextapp.data.repository

import com.learn.scrolltextapp.data.data_source.TextDataSource

interface TextRepository {
    fun getText(): String
}

class TextRepositoryImpl(private val textDataSource: TextDataSource) : TextRepository {

    override fun getText(): String {
        return textDataSource.text
    }

}