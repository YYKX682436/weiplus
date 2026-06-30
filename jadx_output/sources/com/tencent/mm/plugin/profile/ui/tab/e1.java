package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes4.dex */
public final class e1 extends android.text.style.ImageSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f154297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f154297d = new android.graphics.Paint.FontMetricsInt();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        paint.getFontMetricsInt(this.f154297d);
        canvas.save();
        canvas.translate(f17, (i27 + ((r3.descent + r3.ascent) / 2.0f)) - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Rect bounds = getDrawable().getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = this.f154297d;
            paint.getFontMetricsInt(fontMetricsInt2);
            int i19 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
            int height = bounds.height();
            if (height > i19) {
                int i27 = (height - i19) / 2;
                fontMetricsInt.ascent = fontMetricsInt2.ascent - i27;
                fontMetricsInt.top = fontMetricsInt2.top - i27;
                fontMetricsInt.descent = fontMetricsInt2.descent + i27;
                fontMetricsInt.bottom = fontMetricsInt2.bottom + i27;
            } else {
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
            }
        }
        return bounds.width();
    }
}
