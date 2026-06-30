package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class we extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsBrowseUI f170746a;

    public we(com.tencent.mm.plugin.sns.ui.SnsBrowseUI snsBrowseUI) {
        this.f170746a = snsBrowseUI;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$2");
        if (view == null || outline == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$2");
            return;
        }
        outline.setAlpha(0.35f);
        int f17 = i65.a.f(this.f170746a.getContext(), com.tencent.mm.R.dimen.f479644bj);
        int i17 = -f17;
        outline.setRoundRect(i17, i17, view.getWidth() + f17, view.getHeight() + f17, i65.a.f(r2.getContext(), com.tencent.mm.R.dimen.f479688cn));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$2");
    }
}
