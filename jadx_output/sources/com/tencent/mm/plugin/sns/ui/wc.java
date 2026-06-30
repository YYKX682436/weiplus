package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class wc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI f170744d;

    public wc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        this.f170744d = snsAdNativeLandingTestUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$10");
        this.f170744d.f166768e.setIsPlay(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$10");
    }
}
