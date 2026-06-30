package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public class k extends android.text.style.ImageSpan {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f157791d;

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        java.lang.ref.WeakReference weakReference = this.f157791d;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f157791d = new java.lang.ref.WeakReference(drawable);
        }
        canvas.save();
        canvas.translate(f17, (i28 - drawable.getBounds().bottom) - (paint.getFontMetricsInt().descent / 2));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        java.lang.ref.WeakReference weakReference = this.f157791d;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f157791d = new java.lang.ref.WeakReference(drawable);
        }
        android.graphics.Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
