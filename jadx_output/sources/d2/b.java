package d2;

/* loaded from: classes14.dex */
public final class b extends android.text.style.MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f225749d;

    public b(java.lang.String fontFeatureSettings) {
        kotlin.jvm.internal.o.g(fontFeatureSettings, "fontFeatureSettings");
        this.f225749d = fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f225749d);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        kotlin.jvm.internal.o.g(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f225749d);
    }
}
