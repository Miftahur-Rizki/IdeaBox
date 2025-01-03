package com.codingWithUcup.app.notify

import android.app.Application
import com.codingWithUcup.app.notify.data.AppContainer
import com.codingWithUcup.app.notify.data.DefaultAppContainer

class NotifyApplication: Application(){
	lateinit var container: AppContainer

	override fun onCreate() {
		super.onCreate()
		container = DefaultAppContainer(this)
	}
}