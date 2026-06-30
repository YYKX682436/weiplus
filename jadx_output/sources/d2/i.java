package d2;

/* loaded from: classes14.dex */
public class i extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f225776d;

    public i(float f17) {
        this.f225776d = f17;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f225776d + textPaint.getTextSkewX());
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        textPaint.setTextSkewX(this.f225776d + textPaint.getTextSkewX());
    }
}
