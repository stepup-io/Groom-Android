package io.groom.core.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalGroomColors = staticCompositionLocalOf {
    GdsColors()
}

object GroomTheme {

    val colors: GdsColors
        @Composable
        get() = LocalGroomColors.current

}