package zo1;

/* loaded from: classes5.dex */
public final class z3 extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f474842d = (int) ((zo1.k4.f474670n.getTextSize() - zo1.k4.f474668i.getTextSize()) / 2.0f);

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint tp6) {
        kotlin.jvm.internal.o.g(tp6, "tp");
        tp6.baselineShift += this.f474842d;
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint tp6) {
        kotlin.jvm.internal.o.g(tp6, "tp");
        tp6.baselineShift += this.f474842d;
    }
}
