package gm2;

/* loaded from: classes3.dex */
public final class m extends android.text.style.ImageSpan {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f273429e = 0;

    /* renamed from: d, reason: collision with root package name */
    public gm2.l f273430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.graphics.drawable.Drawable d17) {
        super(d17);
        kotlin.jvm.internal.o.g(d17, "d");
        this.f273430d = new gm2.l(null, 0, 0, 7, null);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        canvas.save();
        int i29 = paint.getFontMetricsInt().descent;
        canvas.translate(f17 + this.f273430d.f273425b, ((i27 + i29) - ((i29 - r2.ascent) / 2)) - ((getDrawable().getBounds().bottom - getDrawable().getBounds().top) / 2));
        int alpha = paint.getAlpha();
        int alpha2 = getDrawable().getAlpha();
        if (alpha == 0 && alpha2 != alpha) {
            getDrawable().setAlpha(alpha);
        }
        getDrawable().draw(canvas);
        getDrawable().setAlpha(alpha2);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        android.graphics.Rect bounds = getDrawable().getBounds();
        kotlin.jvm.internal.o.f(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i19 = fontMetricsInt2.descent;
            int i27 = fontMetricsInt2.ascent;
            int i28 = i27 + ((i19 - i27) / 2);
            int i29 = (bounds.bottom - bounds.top) / 2;
            int i37 = i28 - i29;
            fontMetricsInt.ascent = i37;
            fontMetricsInt.top = i37;
            int i38 = i28 + i29;
            fontMetricsInt.bottom = i38;
            fontMetricsInt.descent = i38;
        }
        int i39 = bounds.right;
        gm2.l lVar = this.f273430d;
        return i39 + lVar.f273425b + lVar.f273426c;
    }
}
