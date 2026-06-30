package df5;

/* loaded from: classes11.dex */
public final class v0 extends android.text.style.MetricAffectingSpan implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f232242d;

    /* renamed from: e, reason: collision with root package name */
    public final int f232243e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f232244f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint.FontMetricsInt f232245g;

    public v0(boolean z17, int i17, boolean z18, android.graphics.Paint.FontMetricsInt bodyFontMetrics) {
        kotlin.jvm.internal.o.g(bodyFontMetrics, "bodyFontMetrics");
        this.f232242d = z17;
        this.f232243e = i17;
        this.f232244f = z18;
        this.f232245g = bodyFontMetrics;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fm6) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(fm6, "fm");
        int i28 = fm6.ascent;
        android.graphics.Paint.FontMetricsInt fontMetricsInt = this.f232245g;
        fm6.ascent = java.lang.Math.min(i28, fontMetricsInt.ascent);
        fm6.descent = java.lang.Math.max(fm6.descent, fontMetricsInt.descent);
        fm6.top = java.lang.Math.min(fm6.top, fontMetricsInt.top);
        fm6.bottom = java.lang.Math.max(fm6.bottom, fontMetricsInt.bottom);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        float ascent = (paint.ascent() + paint.descent()) / 2.0f;
        if (this.f232242d) {
            paint.setTypeface(android.graphics.Typeface.MONOSPACE);
        }
        int i17 = this.f232243e;
        if (i17 > 0) {
            paint.setTextSize(i17);
        }
        if (this.f232244f) {
            com.tencent.mm.ui.bk.s0(paint);
        }
        paint.baselineShift += (int) (ascent - ((paint.ascent() + paint.descent()) / 2.0f));
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        if (this.f232242d) {
            paint.setTypeface(android.graphics.Typeface.MONOSPACE);
        }
        int i17 = this.f232243e;
        if (i17 > 0) {
            paint.setTextSize(i17);
        }
        if (this.f232244f) {
            com.tencent.mm.ui.bk.s0(paint);
        }
    }
}
