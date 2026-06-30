package d2;

/* loaded from: classes4.dex */
public final class e implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f225752d;

    public e(float f17) {
        this.f225752d = f17;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(fontMetricsInt, "fontMetricsInt");
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) java.lang.Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) java.lang.Math.ceil(this.f225752d));
    }
}
