import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "org.example.portfolio"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")

            head.add {
                link(rel = "stylesheet", href = "/fonts/faces.css")
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("portfolio")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.foundation)      // ✅ For ComponentStyle
            implementation(libs.silk.icons.fa)
            // implementation(libs.kobwebx.markdown)

        }
    }
}
