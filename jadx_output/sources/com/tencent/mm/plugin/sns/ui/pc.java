package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class pc implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f170211a;

    public pc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f170211a = snsAdNativeLandingPagesUI;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f170211a;
        com.tencent.mm.sdk.platformtools.n3 n3Var = snsAdNativeLandingPagesUI.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        n3Var.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.sdk.platformtools.n3 n3Var2 = snsAdNativeLandingPagesUI.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        n3Var2.post(new com.tencent.mm.plugin.sns.ui.oc(this, obj));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$5");
    }
}
