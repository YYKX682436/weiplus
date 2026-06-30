package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes14.dex */
public class ab implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView f167749d;

    public ab(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView) {
        this.f167749d = snsAdNativeLandingPagesScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView$1");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView snsAdNativeLandingPagesScrollView = this.f167749d;
        int scrollY = snsAdNativeLandingPagesScrollView.getScrollY();
        com.tencent.mars.xlog.Log.w("SnsAdNativeLandingPagesScrollView", "1 middlePos %d, newPos %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView.w(snsAdNativeLandingPagesScrollView)), java.lang.Integer.valueOf(scrollY));
        if (scrollY != com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView.w(snsAdNativeLandingPagesScrollView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        }
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView.w(snsAdNativeLandingPagesScrollView) - scrollY == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView.w(snsAdNativeLandingPagesScrollView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
            snsAdNativeLandingPagesScrollView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        }
        int scrollY2 = snsAdNativeLandingPagesScrollView.getScrollY();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        snsAdNativeLandingPagesScrollView.K = scrollY2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        com.tencent.mars.xlog.Log.w("SnsAdNativeLandingPagesScrollView", "2 middlePos %d, newPos %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView.w(snsAdNativeLandingPagesScrollView)), java.lang.Integer.valueOf(scrollY));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        java.lang.Runnable runnable = snsAdNativeLandingPagesScrollView.M;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView");
        snsAdNativeLandingPagesScrollView.postDelayed(runnable, snsAdNativeLandingPagesScrollView.L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView$1");
    }
}
