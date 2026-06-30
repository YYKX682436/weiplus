package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class gc implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f168428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f168429b;

    public gc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, boolean z17) {
        this.f168429b = snsAdNativeLandingPagesUI;
        this.f168428a = z17;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f168429b;
        snsAdNativeLandingPagesUI.s8(false);
        if (this.f168428a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 k2Var = snsAdNativeLandingPagesUI.f166724l3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (k2Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 k2Var2 = snsAdNativeLandingPagesUI.f166724l3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6900", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                k2Var2.a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = snsAdNativeLandingPagesUI.f166727m3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (u3Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = snsAdNativeLandingPagesUI.f166727m3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                u3Var2.dismiss();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$7002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                snsAdNativeLandingPagesUI.f166727m3 = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$7002", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$33");
    }
}
