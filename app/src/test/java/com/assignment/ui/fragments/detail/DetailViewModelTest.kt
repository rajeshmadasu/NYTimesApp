package com.assignment.ui.fragments.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.assignment.base.BaseUnitTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner

/**
 * Unit test for Main View Model
 */
@ExperimentalCoroutinesApi
@RunWith(PowerMockRunner::class)
class DetailViewModelTest : BaseUnitTest() {

    private lateinit var viewModel: DetailViewModel

    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @Before
    override fun setUp() {
        super.setUp()
        viewModel = DetailViewModel()
    }

    @Test
    fun assertObjects() {
        Assert.assertNotNull(viewModel)
    }

    @Test
    fun testUrl() {
        Assert.assertNull(viewModel.getUrl().value)
        viewModel.setUrl("arc")
        Assert.assertEquals("arc", viewModel.getUrl().value)
    }

    @Test
    fun testGetWebViewClient() {
        Assert.assertNotNull(viewModel.getWebViewClient())
    }
}