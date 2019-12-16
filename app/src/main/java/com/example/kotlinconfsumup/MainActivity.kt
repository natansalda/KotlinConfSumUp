package com.example.kotlinconfsumup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startDate: Date = Date(2019,12,4)
        val endDate: Date = Date(2019,12,6)
        val location: String = "Kopenhagen"

        loadMainConclusions()
        loadChangesInNewVersionOfKotlin()
        loadTalkGoldenHammer()
        loadTalkWillWeStillUseKotlin()
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
        val speaker = "Andrey Breslav"
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
        val speaker = "Huyen Tue Dao"
        val mainPoints: List<String> = listOf(
            "When we learn new language - like Kotlin - all new amazing features seem to be a golden hammer," +
                    "something we feel the need to use all the time." +
                    "However, sometimes we may overuse and even abuse the use of those features. \n",
            "1. Type inference: Always think if this is safe to hide type \n",
            "2. It keyword: similar as above - think if this is safe to use all the time. \n",
            "3. Scope functions: try to not nest them, it may become unreadable quickly \n",
            "4. Extension functions: don't overuse them," +
                    "they are meant to extent API without subclassing them\n",
            "Sum up: focus not only on readability but also on maintainability of your code"
        )
        val result = mainPoints.joinToString()
        golden_hammer_main_points.text = result
    }

    private fun loadTalkWillWeStillUseKotlin() {
        val speaker = "Jake Wharton"
        val mainPoints: List<String> = listOf(
            "1.  Java 19 will most probably release around September 2022, and it will bring a lot of interesting features," +
                    "as well as some earlier Java versions will.",
            "2.  Multiline String formatting will be possible- very useful for SQL queries etc. " +
                    "Partially already available in Java 13 \n",
            "3. Java will introduce 'record' keyword, which is almost the same as data class." +
                    "Will provide getter, setter, toString(), hashCode(), equals() \n",
            "4. Type matching: in Kotlin 'i is Int', in Java 'i instanceOf Integer' \n",
            "5. SO will we still need Kotlin? " +
                    "YES! Kotlin itself will evolve too, it will take some time to Java to introduce all this" +
                    "and as Kotlin runs on JVM, new API and VM will only help Kotlin. " +
                    "ALSO - there is no plans to tackle nullability in Java as for now"
        )
        val result = mainPoints.joinToString()
        java_19_main_points.text = result
    }
}
