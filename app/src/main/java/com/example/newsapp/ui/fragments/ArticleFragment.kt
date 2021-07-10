package com.example.newsapp.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.newsapp.R
import com.example.newsapp.db.ArticleDatabase
import com.example.newsapp.repository.NewsRepository
import com.example.newsapp.ui.NewsActivity
import com.example.newsapp.ui.NewsViewModel
import com.example.newsapp.ui.NewsViewModelProviderFactory

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var appContext: Context

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsRepository = NewsRepository(ArticleDatabase(appContext))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)

        val viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        appContext = context
    }
}