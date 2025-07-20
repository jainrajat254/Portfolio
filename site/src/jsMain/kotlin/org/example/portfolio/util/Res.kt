package org.example.portfolio.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.png"
        const val EMAIL_DARK = "mail.png"
        const val GITHUB = "github.png"
        const val GITHUB_LIGHT = "github.png"
        const val INSTAGRAM = "instagram.png"
        const val INSTAGRAM_LIGHT = "instagram.png"
        const val LINKED_IN = "linkedin.png"
        const val LINKED_IN_LIGHT = "linkedin.png"
        const val SUN = "sun.png"
        const val MOON = "moon.png"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.jpg"
    }

    object String {
        const val NAME = "Rajat Jain"
        const val PROFESSION = "Mobile App Developer"
        const val ABOUT_ME =
            "Hi, I'm Rajat Jain — a passionate developer driven by curiosity and a love for clean, efficient code. I specialize in Android development and backend systems, always eager to build seamless, user-focused digital experiences. I actively mentor others as part of a tech community, sharing my knowledge in DSA and Android development. Beyond coding, I enjoy exploring new tools, learning cutting-edge tech, and contributing to meaningful projects."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:254jainrajat@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}