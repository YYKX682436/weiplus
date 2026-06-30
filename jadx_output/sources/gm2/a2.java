package gm2;

/* loaded from: classes3.dex */
public final class a2 extends android.text.style.ImageSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f273313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.graphics.drawable.Drawable drawable, int i17) {
        super(drawable);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        this.f273313d = i17;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(paint, "paint");
        super.draw(canvas, text, i17, i18, f17 + this.f273313d, i19, i27, i28, paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        return getDrawable().getBounds().width() + this.f273313d;
    }
}
