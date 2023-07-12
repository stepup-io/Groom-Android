package io.groom.core.designsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.groom.core.designsystem.R

val pretendardFamily = FontFamily(
    Font(R.font.pretendard_bold, FontWeight.Bold),
    Font(R.font.pretendard_medium, FontWeight.Medium),
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold)
)

enum class GdsTextStyle {
    CAPTION10,
    CAPTION12,

    BODY_REGULAR16,
    BODY_SEMI_BOLD16,
    BODY_BOLD16,
    BODY_MEDIUM18,

    TITLE_MEDIUM20,
    TITLE_SEMI_BOLD20,
    TITLE_SEMI_BOLD24;

    @Composable
    fun getTextStyle() = when (this) {
        CAPTION10 -> GroomTheme.typography.caption10
        CAPTION12 -> GroomTheme.typography.caption12
        BODY_REGULAR16 -> GroomTheme.typography.bodyRegular16
        BODY_SEMI_BOLD16 -> GroomTheme.typography.bodySemiBold16
        BODY_BOLD16 -> GroomTheme.typography.bodyBold16
        BODY_MEDIUM18 -> GroomTheme.typography.bodyMedium18
        TITLE_MEDIUM20 -> GroomTheme.typography.titleMedium20
        TITLE_SEMI_BOLD20 -> GroomTheme.typography.titleSemiBold20
        TITLE_SEMI_BOLD24 -> GroomTheme.typography.titleSemiBold24
    }
}

data class GdsTypography(
    val caption10: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 18.sp,
    ),
    val caption12: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 18.sp,
    ),

    val bodyRegular16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
    ),
    val bodySemiBold16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    val bodyBold16: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    val bodyMedium18: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 27.sp
    ),

    val titleMedium20: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 30.sp
    ),
    val titleSemiBold20: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 30.sp
    ),
    val titleSemiBold24: TextStyle = TextStyle(
        fontFamily = pretendardFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 36.sp
    )
)