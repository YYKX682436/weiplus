package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class a extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f170972a;

    public a(int i17) {
        this.f170972a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$RoundCornerOutlineProvider");
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, view != null ? view.getMeasuredWidth() : 0, view != null ? view.getMeasuredHeight() : 0);
        if (outline != null) {
            outline.setRoundRect(rect, this.f170972a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$RoundCornerOutlineProvider");
    }
}
