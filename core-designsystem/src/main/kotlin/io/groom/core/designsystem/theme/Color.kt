package io.groom.core.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val White = Color(0xFFFFFFFF)

val Gray01 = Color(0xFFF2F4F8)
val Gray02 = Color(0xFFDDE1E6)
val Gray03 = Color(0xFFA2A9B0)
val Gray04 = Color(0xFF697077)
val Gray05 = Color(0xFF343A3F)
val Gray06 = Color(0xFF121619)
val Gray = Color(0xFFCCCCE4)
val GrayLight = Color(0xFFE7E7EE)

val Purple = Color(0xFFAE71FF)
val PurpleLight = Color(0xFFDABDFF)
val Navy = Color(0xFF50539F)
val NavyLight = Color(0xFF8689C7)

val AlertRed = Color(0xFFFF655C)
val Dim = Color(0x99343A3F)

val RedText = Color(0xFFD9484E)
val Red = Color(0xFFF7C8CB)
val RedLight = Color(0xFFFCEEEF)

val OrangeText = Color(0xFFFF8452)
val Orange = Color(0xFFFCCEBC)
val OrangeLight = Color(0xFFFCF2EE)

val GreenText = Color(0xFF56AE6F)
val Green = Color(0xFFB4E2C2)
val GreenLight = Color(0xFFECF9F0)

enum class GdsColor {
    WHITE,
    GRAY01,
    GRAY02,
    GRAY03,
    GRAY04,
    GRAY05,
    GRAY06,
    GRAY,
    GRAY_LIGHT,
    PURPLE,
    PURPLE_LIGHT,
    NAVY,
    NAVY_LIGHT,
    ALERT_RED,
    DIM,
    RED_TEXT,
    RED,
    RED_LIGHT,
    ORANGE_TEXT,
    ORANGE,
    ORANGE_LIGHT,
    GREEN_TEXT,
    GREEN,
    GREEN_LIGHT;

    @Composable
    fun getColor() = when (this) {
        WHITE -> GroomTheme.colors.white
        GRAY01 -> GroomTheme.colors.gray01
        GRAY02 -> GroomTheme.colors.gray02
        GRAY03 -> GroomTheme.colors.gray03
        GRAY04 -> GroomTheme.colors.gray04
        GRAY05 -> GroomTheme.colors.gray05
        GRAY06 -> GroomTheme.colors.gray06
        GRAY -> GroomTheme.colors.gray
        GRAY_LIGHT -> GroomTheme.colors.grayLight
        PURPLE -> GroomTheme.colors.purple
        PURPLE_LIGHT -> GroomTheme.colors.purpleLight
        NAVY -> GroomTheme.colors.navy
        NAVY_LIGHT -> GroomTheme.colors.navyLight
        ALERT_RED -> GroomTheme.colors.alertRed
        DIM -> GroomTheme.colors.dim
        RED_TEXT -> GroomTheme.colors.redText
        RED -> GroomTheme.colors.red
        RED_LIGHT -> GroomTheme.colors.redLight
        ORANGE_TEXT -> GroomTheme.colors.orangeText
        ORANGE -> GroomTheme.colors.orange
        ORANGE_LIGHT -> GroomTheme.colors.orangeLight
        GREEN_TEXT -> GroomTheme.colors.greenText
        GREEN -> GroomTheme.colors.green
        GREEN_LIGHT -> GroomTheme.colors.greenLight
    }
}

data class GdsColors(
    val white: Color = White,
    val gray01: Color = Gray01,
    val gray02: Color = Gray02,
    val gray03: Color = Gray03,
    val gray04: Color = Gray04,
    val gray05: Color = Gray05,
    val gray06: Color = Gray06,
    val gray: Color = Gray,
    val grayLight: Color = GrayLight,
    val purple: Color = Purple,
    val purpleLight: Color = PurpleLight,
    val navy: Color = Navy,
    val navyLight: Color = NavyLight,
    val alertRed: Color = AlertRed,
    val dim: Color = Dim,
    val redText: Color = RedText,
    val red: Color = Red,
    val redLight: Color = RedLight,
    val orangeText: Color = OrangeText,
    val orange: Color = Orange,
    val orangeLight: Color = OrangeLight,
    val greenText: Color = GreenText,
    val green: Color = Green,
    val greenLight: Color = GreenLight,
)