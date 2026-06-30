package gb5;

/* loaded from: classes5.dex */
public final class b extends android.text.style.MetricAffectingSpan {
    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.tencent.mm.ui.bk.s0(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint paint) {
        kotlin.jvm.internal.o.g(paint, "paint");
        com.tencent.mm.ui.bk.s0(paint);
    }
}
