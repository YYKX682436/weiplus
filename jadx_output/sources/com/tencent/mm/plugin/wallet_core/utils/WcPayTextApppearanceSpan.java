package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class WcPayTextApppearanceSpan extends android.text.style.TextAppearanceSpan {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Typeface f180847d;

    /* renamed from: e, reason: collision with root package name */
    public int f180848e;

    public WcPayTextApppearanceSpan(java.lang.String str, int i17, int i18, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2) {
        super(str, i17, i18, colorStateList, colorStateList2);
        this.f180847d = android.graphics.Typeface.DEFAULT;
        this.f180848e = 0;
    }

    @Override // android.text.style.TextAppearanceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(android.text.TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        int i17 = this.f180848e;
        if (i17 == 1) {
            com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
        } else if (i17 != 3) {
            this.f180848e = 0;
        } else {
            this.f180848e = 1;
        }
        textPaint.setTypeface(android.graphics.Typeface.create(this.f180847d, this.f180848e));
    }
}
