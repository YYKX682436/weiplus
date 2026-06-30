package d2;

/* loaded from: classes14.dex */
public final class k extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Typeface f225779d;

    public k(android.graphics.Typeface typeface) {
        kotlin.jvm.internal.o.g(typeface, "typeface");
        this.f225779d = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setTypeface(this.f225779d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        paint.setTypeface(this.f225779d);
    }
}
