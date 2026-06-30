package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f168205d;

    public dq(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        this.f168205d = snsSightPlayerUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$9");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f168205d;
        snsSightPlayerUI.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.e7(snsSightPlayerUI) instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView) {
            ((com.tencent.mm.pluginsdk.ui.tools.VideoSightView) com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.e7(snsSightPlayerUI)).setDrawableWidth(displayMetrics.widthPixels);
        }
        ((android.view.View) com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.e7(snsSightPlayerUI)).requestLayout();
        ((android.view.View) com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.e7(snsSightPlayerUI)).postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$9");
    }
}
