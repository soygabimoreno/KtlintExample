import org.gradle.kotlin.dsl.ktlint
import org.gradle.kotlin.dsl.libs
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ktlint)
}

ktlint {
    android = true
    reporters {
        reporter(ReporterType.CHECKSTYLE)
    }
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}
