package com.example.kotlinconfsumup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadMainConclusions()
        loadChangesInNewVersionOfKotlin()
        loadTalkGoldenHammer()
        loadTalkWillWeStillUseKotlin()
        loadTalkJetpackCompose()
    }

    private fun loadMainConclusions() {
        val listOfConclusions: List<String> = listOf(
            "1. Kotlin everywhere! \n" +
                    "Kotlin is doing great and the future is bright - " +
                    "lot of buzz around multiplatform, server side, kotlin in science. \n",
            "2. Jetpack Compose may be a revolution." +
                    "It's created in open, so anyone can check and maybe contribute. \n",
            "3. Kotlin 1.4 to arrive in spring 2020" +
                    "I will speak about this more in the next section \n"
        )
        val result = listOfConclusions.joinToString()
        list_of_conclusions.text = result
    }

    private fun loadChangesInNewVersionOfKotlin() {
        val listOfKotlinImprovements: List<String> = listOf(
            "1. Focus on quality and performance: " +
                    "* Boosting IDE performance - Faster code completion" +
                    "* Gradle scripts faster - Gradle Import in Android Studio is about 2.5 " +
                    "times as fast and takes about 75% less memory than it did in Kotlin 1.3.10 \n",
            "2. New compiler" +
                    "* Gradual implementation to make it efficient for all platforms" +
                    "* Improvement will be ongoing through the year" +
                    "* both versions will be available for some time, " +
                    "the old one and the new one in an experimental mode \n",
            "3. KLib: Kotlin Library Format" +
                    "* library format for Kotlin multiplatform" +
                    "* Kotlin/Native has been using the KLibs format to distribute Kotlin native libraries already, " +
                    "and now it will be extended to support other back-ends and multiplatform libraries \n",
            "4. Other improvements" +
                    "* Running iOS code in Android Studio - " +
                    "plugin for AS that will be able to run, test, and debug Kotlin code on iOS devices and simulators" +
                    "* Introduction to Flow: " +
                    "coroutine-based implementation of Reactive Streams" +
                    "* SAM (single abstract method) conversions for Kotlin classes" +
                    "* Mixing named and positional arguments \n"
        )

        val result = listOfKotlinImprovements.joinToString()
        list_of_kotlin_improvements.text = result
    }

    private fun loadTalkGoldenHammer() {
        // TODO change body of created functions use File | Settings | File Templates.
    }

    private fun loadTalkWillWeStillUseKotlin() {
        // TODO change body of created functions use File | Settings | File Templates.
    }

    private fun loadTalkJetpackCompose() {
        // TODO change body of created functions use File | Settings | File Templates.
    }
}
