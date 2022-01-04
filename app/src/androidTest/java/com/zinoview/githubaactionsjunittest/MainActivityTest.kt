package com.zinoview.githubaactionsjunittest

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test() {
        onView(withId(R.id.first_tv)).perform(click()).check(matches(withText("First text")))
        onView(withId(R.id.second_tv)).check(matches(withText("Second new text")))
    }

    @Test
    fun second_test() {
        onView(withId(R.id.second_tv)).perform(click())
        onView(withId(R.id.first_tv)).check(matches(withText("First new text2")))
    }
}