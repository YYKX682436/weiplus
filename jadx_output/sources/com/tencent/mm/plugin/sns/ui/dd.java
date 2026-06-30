package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class dd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI f168180d;

    public dd(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f168180d = snsAdNativeLandingTestUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$6");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = this.f168180d;
        if (snsAdNativeLandingTestUI.getContext() instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) snsAdNativeLandingTestUI.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).setDrawableWidth(displayMetrics.widthPixels);
        }
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).requestLayout();
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI.T6(snsAdNativeLandingTestUI).postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$6");
    }
}
