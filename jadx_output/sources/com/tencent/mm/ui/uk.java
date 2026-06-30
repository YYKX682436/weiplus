package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public abstract class uk {
    public static int a(int i17, int i18) {
        if (i18 >= 0 && i18 <= 100) {
            return (i17 & 16777215) | (((int) ((i18 * 0.01d) * 255.0d)) << 24);
        }
        com.tencent.mm.ui.yk.b("alphaColor", "alpha must be between 0 and 100", new java.lang.Object[0]);
        return i17;
    }

    public static int b(int i17, int i18) {
        int alpha = android.graphics.Color.alpha(i18);
        int alpha2 = android.graphics.Color.alpha(i17);
        int i19 = 255 - alpha2;
        int i27 = 255 - (((255 - alpha) * i19) / 255);
        return android.graphics.Color.argb(i27, i27 == 0 ? 0 : (((android.graphics.Color.red(i17) * 255) * alpha2) + ((android.graphics.Color.red(i18) * alpha) * i19)) / (i27 * 255), i27 == 0 ? 0 : (((android.graphics.Color.green(i17) * 255) * alpha2) + ((android.graphics.Color.green(i18) * alpha) * i19)) / (i27 * 255), i27 != 0 ? (((android.graphics.Color.blue(i17) * 255) * alpha2) + ((android.graphics.Color.blue(i18) * alpha) * i19)) / (i27 * 255) : 0);
    }

    public static android.graphics.drawable.Drawable c(android.content.Context context, int i17, int i18, int i19, int i27, float f17) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(i27, i27);
        gradientDrawable.setCornerRadius(f17);
        gradientDrawable.setColor(i19);
        android.graphics.drawable.Drawable mutate = context.getResources().getDrawable(i17).mutate();
        mutate.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawable, mutate});
        layerDrawable.setLayerSize(1, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        layerDrawable.setLayerGravity(1, 17);
        layerDrawable.setDrawable(0, gradientDrawable);
        return layerDrawable;
    }

    public static android.graphics.drawable.Drawable d(android.content.Context context, int i17, int i18, int i19, int i27, int i28, int i29, float f17) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(i29, i29);
        gradientDrawable.setCornerRadius(f17);
        gradientDrawable.setColor(i28);
        android.graphics.drawable.Drawable mutate = context.getResources().getDrawable(i17).mutate();
        mutate.setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawable, mutate});
        layerDrawable.setLayerSize(1, i19, i27);
        layerDrawable.setLayerGravity(1, 17);
        layerDrawable.setDrawable(0, gradientDrawable);
        return layerDrawable;
    }

    public static android.graphics.drawable.Drawable e(android.content.Context context, int i17, int i18) {
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(i17);
        if (drawable != null) {
            int i19 = i18 != 0 ? (16777215 & i18) | (-16777216) : i18;
            int alpha = android.graphics.Color.alpha(i18);
            drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i19, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (i18 != 0) {
                drawable.setAlpha(alpha);
            }
        }
        return drawable;
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable drawable, int i17) {
        if (drawable != null) {
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            drawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (i17 != 0) {
                drawable.setAlpha(alpha);
            }
        }
        return drawable;
    }

    public static boolean g(int i17) {
        return 1.0d - ((((((double) android.graphics.Color.red(i17)) * 0.299d) + (((double) android.graphics.Color.green(i17)) * 0.587d)) + (((double) android.graphics.Color.blue(i17)) * 0.114d)) / 255.0d) >= 0.3d;
    }
}
