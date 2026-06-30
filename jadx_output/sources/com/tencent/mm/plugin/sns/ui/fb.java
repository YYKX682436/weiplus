package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fb implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f168337a;

    public fb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f168337a = snsAdNativeLandingPagesUI;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f168337a;
        com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI.f166700d, "doAdNativeAntiAbuseScene end, errType = " + i17 + ", errNo = " + i18 + ", canvasAuthFailed = " + obj);
        if (i17 == 0 && i18 == 0 && obj != null) {
            try {
                r45.l2 l2Var = new r45.l2();
                l2Var.parseFrom((byte[]) obj);
                com.tencent.mars.xlog.Log.e(snsAdNativeLandingPagesUI.f166700d, "checkNativeLandingPageAbuse, canvasAuthFailed=" + l2Var.f379083d);
                if (l2Var.f379083d != 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    snsAdNativeLandingPagesUI.O2 = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3502", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.eb(this), 500L);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 113);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(snsAdNativeLandingPagesUI.f166700d, th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$12");
    }
}
