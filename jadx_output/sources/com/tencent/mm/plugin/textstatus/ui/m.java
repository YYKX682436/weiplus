package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class m implements android.text.style.LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f174062d;

    public m(int i17) {
        this.f174062d = i17;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(java.lang.CharSequence text, int i17, int i18, int i19, int i27, android.graphics.Paint.FontMetricsInt fm6) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(fm6, "fm");
        int i28 = fm6.descent;
        int i29 = i28 - fm6.ascent;
        if (i29 <= 0) {
            return;
        }
        int i37 = this.f174062d;
        int round = java.lang.Math.round(i28 * ((i37 * 1.0f) / i29));
        fm6.descent = round;
        fm6.ascent = round - i37;
    }
}
