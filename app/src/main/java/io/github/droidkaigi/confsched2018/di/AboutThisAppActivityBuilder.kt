package io.github.droidkaigi.confsched2018.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.droidkaigi.confsched2018.presentation.about.AboutThisAppActivity

@Module interface AboutThisAppActivityBuilder {
    @ContributesAndroidInjector(modules = [
        FragmentBuildersModule::class,
        AboutThisAppActivityModule::class]
    )
    fun contributeAboutThisAppActivity(): AboutThisAppActivity
}
