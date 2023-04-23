package com.example.qr_scanner

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroFragment
import com.github.appintro.AppIntroPageTransformerType

class IntroApp : AppIntro2() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addSlide(
            AppIntroFragment.createInstance(
                title = "Hello",
                description = "This is the first of the example",
                backgroundColorRes = R.color.aqua,
            )
        )
        addSlide(
            AppIntroFragment.createInstance(
                title = "The title of your slide",
                description = "A description that will be shown on the bottom",
                imageDrawable = R.drawable.logo_qr_code,
                backgroundDrawable = R.drawable.ic_launcher_background,
                titleColorRes = R.color.yellow,
                descriptionColorRes = R.color.red,
                backgroundColorRes = R.color.blue,
//            titleTypefaceFontRes = R.font.opensans_regular,
//            descriptionTypefaceFontRes = R.font.opensans_regular,
            )
        )
        addSlide(
            AppIntroFragment.createInstance(
                title = "The title of your slide",
                description = "A description that will be shown on the bottom",
                imageDrawable = R.drawable.logo_qr_code,
//                backgroundDrawable = R.drawable.ic_launcher_background,
                titleColorRes = R.color.yellow,
                descriptionColorRes = R.color.red,
                backgroundColorRes = R.color.fuchsia,
//            titleTypefaceFontRes = R.font.opensans_regular,
//            descriptionTypefaceFontRes = R.font.opensans_regular,
            )
        )

        showStatusBar(true)

//        isVibrate = true
//        vibrateDuration = 50L

        //quay lại slide cũ
//        isWizardMode = true

//        setImmersiveMode()

        setTransformer(AppIntroPageTransformerType.Fade)
        // Toggle Indicator Visibility
        isIndicatorEnabled = true

    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        Toast.makeText(this, "Skip", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
//        finish()
    }


    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)
    }


}