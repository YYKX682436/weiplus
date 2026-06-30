package v5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final s5.a f433283a;

    public h(s5.a bitmapPool) {
        kotlin.jvm.internal.o.g(bitmapPool, "bitmapPool");
        this.f433283a = bitmapPool;
    }

    public final android.graphics.Bitmap a(android.graphics.drawable.Drawable drawable, android.graphics.Bitmap.Config config, coil.size.Size size, d6.g scale, boolean z17) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        kotlin.jvm.internal.o.g(drawable, "drawable");
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(size, "size");
        kotlin.jvm.internal.o.g(scale, "scale");
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.Bitmap bitmap3 = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
            kotlin.jvm.internal.o.f(bitmap3, "bitmap");
            boolean z18 = true;
            if (bitmap3.getConfig() == (h6.a.b(config) ? android.graphics.Bitmap.Config.ARGB_8888 : config)) {
                if (!z17 && !(size instanceof coil.size.OriginalSize) && !kotlin.jvm.internal.o.b(size, v5.f.b(bitmap3.getWidth(), bitmap3.getHeight(), size, scale))) {
                    z18 = false;
                }
                if (z18) {
                    return bitmap3;
                }
            }
        }
        android.graphics.drawable.Drawable mutate = drawable.mutate();
        kotlin.jvm.internal.o.f(mutate, "drawable.mutate()");
        l36.i0 i0Var = h6.d.f279116a;
        boolean z19 = mutate instanceof android.graphics.drawable.BitmapDrawable;
        java.lang.Integer num = null;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = z19 ? (android.graphics.drawable.BitmapDrawable) mutate : null;
        java.lang.Integer valueOf = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? null : java.lang.Integer.valueOf(bitmap2.getWidth());
        int intrinsicWidth = valueOf == null ? mutate.getIntrinsicWidth() : valueOf.intValue();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable2 = z19 ? (android.graphics.drawable.BitmapDrawable) mutate : null;
        if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
            num = java.lang.Integer.valueOf(bitmap.getHeight());
        }
        int intrinsicHeight = num == null ? mutate.getIntrinsicHeight() : num.intValue();
        coil.size.PixelSize b17 = v5.f.b(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 512, size, scale);
        if (h6.a.b(config)) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        s5.a aVar = this.f433283a;
        int i17 = b17.f43912d;
        int i18 = b17.f43913e;
        android.graphics.Bitmap d17 = aVar.d(i17, i18, config);
        android.graphics.Rect bounds = mutate.getBounds();
        kotlin.jvm.internal.o.f(bounds, "bounds");
        int i19 = bounds.left;
        int i27 = bounds.top;
        int i28 = bounds.right;
        int i29 = bounds.bottom;
        mutate.setBounds(0, 0, i17, i18);
        mutate.draw(new android.graphics.Canvas(d17));
        mutate.setBounds(i19, i27, i28, i29);
        return d17;
    }
}
