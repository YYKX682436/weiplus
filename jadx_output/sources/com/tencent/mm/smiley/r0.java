package com.tencent.mm.smiley;

/* loaded from: classes13.dex */
public final class r0 extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f193352f;

    /* renamed from: g, reason: collision with root package name */
    public final int f193353g;

    /* renamed from: h, reason: collision with root package name */
    public final int f193354h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f193355i;

    /* renamed from: m, reason: collision with root package name */
    public int f193356m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f193357n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.graphics.drawable.Drawable drawable, boolean z17, int i17, int i18) {
        super(drawable, 0);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f193352f = z17;
        this.f193353g = i17;
        this.f193354h = i18;
        this.f193355i = new android.graphics.RectF();
        this.f193356m = 255;
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int abs = java.lang.Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent);
        if (abs != drawable.getBounds().width()) {
            drawable.setBounds(0, 0, abs, abs);
        }
        float f18 = ((i27 + fontMetricsInt.descent) - (r4 / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2.0f);
        canvas.translate(f17, f18);
        this.f193355i.set(f17, f18, drawable.getBounds().width() + f17, drawable.getBounds().height() + f18);
        int alpha = drawable.getAlpha();
        int alpha2 = this.f193357n ? this.f193356m : paint.getAlpha();
        if (alpha2 == 0 && alpha != alpha2) {
            drawable.setAlpha(alpha2);
        }
        drawable.draw(canvas);
        drawable.setAlpha(alpha);
        canvas.restore();
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.Rect bounds = drawable.getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int width = bounds.width();
        if (fontMetricsInt2 != null) {
            int abs = java.lang.Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent);
            drawable.setBounds(0, 0, abs, abs);
            width = drawable.getBounds().width();
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
            }
        }
        return width;
    }
}
