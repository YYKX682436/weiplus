package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ob implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f170092d;

    public ob(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f170092d = snsAdNativeLandingPagesUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$20");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170092d;
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "noCutOut, assistActivity, isHalfScreen=" + com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI));
        new com.tencent.mm.ui.r0(snsAdNativeLandingPagesUI, false, com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI), snsAdNativeLandingPagesUI.f166719j3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$20");
    }
}
