package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class z1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f171661a;

    public z1(int i17) {
        this.f171661a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView$RoundCornerOutlineProvider");
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, view != null ? view.getMeasuredHeight() : 0.0f);
        int i17 = android.os.Build.VERSION.SDK_INT;
        int i18 = this.f171661a;
        if (i17 >= 32) {
            if (outline != null) {
                outline.setPath(com.tencent.mm.ui.dl.c(rectF, i18, i18, i18, i18, 0.6f));
            }
        } else if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setRoundRect(rect, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.CornerMaskImageView$RoundCornerOutlineProvider");
    }
}
