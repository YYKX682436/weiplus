package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/widget/TextVerticalAlignSpan;", "Landroid/text/style/AbsoluteSizeSpan;", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TextVerticalAlignSpan extends android.text.style.AbsoluteSizeSpan {
    public final void a(android.text.TextPaint textPaint, boolean z17) {
        android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        if (fontMetrics != null) {
            float f17 = fontMetrics.descent - fontMetrics.ascent;
            if (z17) {
                super.updateMeasureState(textPaint);
            } else {
                super.updateDrawState(textPaint);
            }
            textPaint.setColor(0);
            android.graphics.Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (fontMetrics2 != null) {
                textPaint.baselineShift = (int) ((((fontMetrics2.descent - fontMetrics2.ascent) - f17) / 2) / 0.0f);
            }
        }
    }

    @Override // android.text.style.AbsoluteSizeSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        a(ds6, false);
    }

    @Override // android.text.style.AbsoluteSizeSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        a(ds6, true);
    }
}
