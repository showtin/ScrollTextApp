package com.learn.scrolltextapp

import com.learn.scrolltextapp.data.data_source.TextDataSource
import com.learn.scrolltextapp.data.repository.TextRepository
import com.learn.scrolltextapp.data.repository.TextRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideTextDataSource(): TextDataSource {
        return TextDataSource()
    }

    @Provides
    fun provideTextRepository(dataSource: TextDataSource): TextRepository {
        return TextRepositoryImpl(dataSource)
    }


}