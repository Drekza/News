package com.example.newsapp.di

import com.example.newsapp.db.ArticleDatabase
import com.example.newsapp.repository.NewsRepository
import com.example.newsapp.ui.NewsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
//
//val appModule = module {
//    single { ArticleDatabase }
//    factory { NewsRepository(get()) }
//    viewModel { NewsViewModel(get()) }
//}