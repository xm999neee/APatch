package me.bmax.apatch.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

private val md_theme_light_primary = Color(0xFF00668A)
private val md_theme_light_onPrimary = Color(0xFFFFFFFF)
private val md_theme_light_primaryContainer = Color(0xFFC4E7FF)
private val md_theme_light_onPrimaryContainer = Color(0xFF001E2C)
private val md_theme_light_secondary = Color(0xFF4E616D)
private val md_theme_light_onSecondary = Color(0xFFFFFFFF)
private val md_theme_light_secondaryContainer = Color(0xFFD1E5F4)
private val md_theme_light_onSecondaryContainer = Color(0xFF0A1E28)
private val md_theme_light_tertiary = Color(0xFF605A7D)
private val md_theme_light_onTertiary = Color(0xFFFFFFFF)
private val md_theme_light_tertiaryContainer = Color(0xFFE6DEFF)
private val md_theme_light_onTertiaryContainer = Color(0xFF1D1736)
private val md_theme_light_error = Color(0xFFBA1A1A)
private val md_theme_light_errorContainer = Color(0xFFFFDAD6)
private val md_theme_light_onError = Color(0xFFFFFFFF)
private val md_theme_light_onErrorContainer = Color(0xFF410002)
private val md_theme_light_background = Color(0xFFFBFCFF)
private val md_theme_light_onBackground = Color(0xFF191C1E)
private val md_theme_light_surface = Color(0xFFFBFCFF)
private val md_theme_light_onSurface = Color(0xFF191C1E)
private val md_theme_light_surfaceVariant = Color(0xFFDCE3E9)
private val md_theme_light_onSurfaceVariant = Color(0xFF41484D)
private val md_theme_light_outline = Color(0xFF71787D)
private val md_theme_light_inverseOnSurface = Color(0xFFF0F1F3)
private val md_theme_light_inverseSurface = Color(0xFF2E3133)
private val md_theme_light_inversePrimary = Color(0xFF7BD0FF)
private val md_theme_light_shadow = Color(0xFF000000)
private val md_theme_light_surfaceTint = Color(0xFF00668A)
private val md_theme_light_outlineVariant = Color(0xFFC0C7CD)
private val md_theme_light_scrim = Color(0xFF000000)

// AMOLED 黑色主题颜色 - 蓝灰色版本
private val md_theme_amoled_primary = Color(0xFF7BD0FF)
private val md_theme_amoled_onPrimary = Color(0xFF003549)
private val md_theme_amoled_primaryContainer = Color(0xFF004C69)
private val md_theme_amoled_onPrimaryContainer = Color(0xFFC4E7FF)
private val md_theme_amoled_secondary = Color(0xFFB5C9D7)
private val md_theme_amoled_onSecondary = Color(0xFF20333E)
private val md_theme_amoled_secondaryContainer = Color(0xFF374955)
private val md_theme_amoled_onSecondaryContainer = Color(0xFFD1E5F4)
private val md_theme_amoled_tertiary = Color(0xFFCAC1E9)
private val md_theme_amoled_onTertiary = Color(0xFF322C4C)
private val md_theme_amoled_tertiaryContainer = Color(0xFF484264)
private val md_theme_amoled_onTertiaryContainer = Color(0xFFE6DEFF)
private val md_theme_amoled_error = Color(0xFFFFB4AB)
private val md_theme_amoled_errorContainer = Color(0xFF93000A)
private val md_theme_amoled_onError = Color(0xFF690005)
private val md_theme_amoled_onErrorContainer = Color(0xFFFFDAD6)
// AMOLED 纯黑色背景
private val md_theme_amoled_background = Color(0xFF000000)
private val md_theme_amoled_onBackground = Color(0xFFE1E2E5)
// AMOLED 纯黑色表面
private val md_theme_amoled_surface = Color(0xFF000000)
private val md_theme_amoled_onSurface = Color(0xFFE1E2E5)
// 稍微亮一点的表面变体以保持层次感
private val md_theme_amoled_surfaceVariant = Color(0xFF1A1A1A)
private val md_theme_amoled_onSurfaceVariant = Color(0xFFC0C7CD)
private val md_theme_amoled_outline = Color(0xFF8B9297)
private val md_theme_amoled_inverseOnSurface = Color(0xFF000000)
private val md_theme_amoled_inverseSurface = Color(0xFFE1E2E5)
private val md_theme_amoled_inversePrimary = Color(0xFF00668A)
private val md_theme_amoled_shadow = Color(0xFF000000)
private val md_theme_amoled_surfaceTint = Color(0xFF7BD0FF)
private val md_theme_amoled_outlineVariant = Color(0xFF1A1A1A)
private val md_theme_amoled_scrim = Color(0xFF000000)

val LightBlueGreyTheme = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)

val DarkBlueGreyTheme = darkColorScheme(
    primary = md_theme_amoled_primary,
    onPrimary = md_theme_amoled_onPrimary,
    primaryContainer = md_theme_amoled_primaryContainer,
    onPrimaryContainer = md_theme_amoled_onPrimaryContainer,
    secondary = md_theme_amoled_secondary,
    onSecondary = md_theme_amoled_onSecondary,
    secondaryContainer = md_theme_amoled_secondaryContainer,
    onSecondaryContainer = md_theme_amoled_onSecondaryContainer,
    tertiary = md_theme_amoled_tertiary,
    onTertiary = md_theme_amoled_onTertiary,
    tertiaryContainer = md_theme_amoled_tertiaryContainer,
    onTertiaryContainer = md_theme_amoled_onTertiaryContainer,
    error = md_theme_amoled_error,
    errorContainer = md_theme_amoled_errorContainer,
    onError = md_theme_amoled_onError,
    onErrorContainer = md_theme_amoled_onErrorContainer,
    background = md_theme_amoled_background,
    onBackground = md_theme_amoled_onBackground,
    surface = md_theme_amoled_surface,
    onSurface = md_theme_amoled_onSurface,
    surfaceVariant = md_theme_amoled_surfaceVariant,
    onSurfaceVariant = md_theme_amoled_onSurfaceVariant,
    outline = md_theme_amoled_outline,
    inverseOnSurface = md_theme_amoled_inverseOnSurface,
    inverseSurface = md_theme_amoled_inverseSurface,
    inversePrimary = md_theme_amoled_inversePrimary,
    surfaceTint = md_theme_amoled_surfaceTint,
    outlineVariant = md_theme_amoled_outlineVariant,
    scrim = md_theme_amoled_scrim,
)