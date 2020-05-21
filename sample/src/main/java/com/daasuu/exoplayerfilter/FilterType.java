package com.daasuu.exoplayerfilter;

import android.content.Context;

import com.daasuu.epf.filter.GlFilter;
import com.daasuu.epf.filter.GlRGBFilter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sudamasayuki on 2017/05/18.
 */

public enum FilterType {
    DEFAULT,
    BITMAP_OVERLAY_SAMPLE,
    BILATERAL_BLUR,
    BOX_BLUR,
    BRIGHTNESS,
    BULGE_DISTORTION,
    CGA_COLORSPACE,
    CONTRAST,
    CROSSHATCH,
    EXPOSURE,
    FILTER_GROUP_SAMPLE,
    GAMMA,
    GAUSSIAN_FILTER,
    GRAY_SCALE,
    HAZE,
    HALFTONE,
    HIGHLIGHT_SHADOW,
    HUE,
    INVERT,
    LUMINANCE,
    LUMINANCE_THRESHOLD,
    MONOCHROME,
    OPACITY,
    OVERLAY,
    PIXELATION,
    POSTERIZE,
    RGB,
    SATURATION,
    SEPIA,
    SHARP,
    SOLARIZE,
    SPHERE_REFRACTION,
    SWIRL,
    TONE_CURVE_SAMPLE,
    TONE,
    VIBRANCE,
    VIGNETTE,
    LOOK_UP_TABLE_SAMPLE,
    WATERMARK,
    WEAK_PIXEL,
    WHITE_BALANCE,
    ZOOM_BLUR,
    ;


    public static List<FilterType> createFilterList() {
        return Arrays.asList(FilterType.values());
    }



    public static GlFilter createGlFilter( float red, float green, float blue,
                float saturation, float brightness, float contrast, Context context) {
            GlRGBFilter glRGBFilter = new GlRGBFilter();

            glRGBFilter.setRed(red);
            glRGBFilter.setGreen(green);
            glRGBFilter.setBlue(blue);
            glRGBFilter.setBrightness(brightness);
            glRGBFilter.setSaturation(saturation);
            glRGBFilter.setContrast(contrast);
            return glRGBFilter;

    }


}
