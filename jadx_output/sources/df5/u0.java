package df5;

/* loaded from: classes11.dex */
public final class u0 extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f232219d;

    public u0(float f17) {
        this.f232219d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        com.tencent.mm.ui.bk.r0(paint, this.f232219d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        com.tencent.mm.ui.bk.r0(paint, this.f232219d);
    }
}
