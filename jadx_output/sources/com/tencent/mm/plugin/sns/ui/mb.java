package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class mb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f169905d;

    public mb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f169905d = snsAdNativeLandingPagesUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$19");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f169905d;
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "hasCutOut, assistActivity, isHalfScreen=" + com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI));
        if (!com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            boolean z18 = snsAdNativeLandingPagesUI.U2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (!z18) {
                z17 = true;
                new com.tencent.mm.ui.r0(snsAdNativeLandingPagesUI, z17, com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI), snsAdNativeLandingPagesUI.f166719j3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$19");
            }
        }
        z17 = false;
        new com.tencent.mm.ui.r0(snsAdNativeLandingPagesUI, z17, com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI), snsAdNativeLandingPagesUI.f166719j3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$19");
    }
}
