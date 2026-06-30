package f3;

/* loaded from: classes13.dex */
public abstract class b {
    public static void a(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean b(android.graphics.drawable.Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static android.graphics.ColorFilter c(android.graphics.drawable.Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void d(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void e(android.graphics.drawable.Drawable drawable, float f17, float f18) {
        drawable.setHotspot(f17, f18);
    }

    public static void f(android.graphics.drawable.Drawable drawable, int i17, int i18, int i19, int i27) {
        drawable.setHotspotBounds(i17, i18, i19, i27);
    }

    public static void g(android.graphics.drawable.Drawable drawable, int i17) {
        drawable.setTint(i17);
    }

    public static void h(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void i(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
