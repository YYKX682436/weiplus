package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class a extends android.text.style.ImageSpan {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f131609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        java.lang.ref.WeakReference weakReference = this.f131609d;
        android.graphics.drawable.Drawable drawable = weakReference != null ? (android.graphics.drawable.Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.f131609d = new java.lang.ref.WeakReference(drawable);
        }
        if (drawable == null) {
            super.draw(canvas, charSequence, i17, i18, f17, i19, i27, i28, paint);
            return;
        }
        canvas.save();
        canvas.translate(f17, (i28 + paint.getFontMetricsInt().ascent) - paint.getFontMetricsInt().descent);
        drawable.draw(canvas);
        canvas.restore();
    }
}
