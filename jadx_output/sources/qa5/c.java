package qa5;

/* loaded from: classes4.dex */
public final class c implements android.text.style.LineHeightSpan.WithDensity {
    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public void chooseHeight(java.lang.CharSequence charSequence, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fontMetricsInt, android.text.TextPaint textPaint) {
        int i28 = (fontMetricsInt != null ? fontMetricsInt.descent : 0) - (fontMetricsInt != null ? fontMetricsInt.ascent : 0);
        int b17 = textPaint == null ? -1 : a06.d.b(textPaint.getTextSize() * 1.2f);
        if (b17 != i28) {
            float f17 = (b17 * 1.0f) / i28;
            if (fontMetricsInt != null) {
                int round = java.lang.Math.round(fontMetricsInt.descent * f17);
                fontMetricsInt.descent = round;
                fontMetricsInt.ascent = round - b17;
            }
        }
    }
}
