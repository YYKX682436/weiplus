package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes9.dex */
public class vc implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.xc f170629d;

    public vc(com.tencent.mm.plugin.sns.ui.xc xcVar) {
        this.f170629d = xcVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.SnsAdNativieLandingTestUI", "mmOnActivityResult fail, toUser is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
                return;
            }
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI = this.f170629d.f171505d;
            r35.u3 u3Var = r35.t3.f369263a;
            com.tencent.mm.ui.ga controller = snsAdNativeLandingTestUI.getController();
            java.lang.String string = snsAdNativeLandingTestUI.getResources().getString(com.tencent.mm.R.string.f490551ya);
            com.tencent.mm.plugin.sns.ui.uc ucVar = new com.tencent.mm.plugin.sns.ui.uc(this, stringExtra, snsAdNativeLandingTestUI);
            ((ez.z0) u3Var).getClass();
            r35.j1.j(controller, "test title", "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150", "test desc", null, true, string, ucVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$1$1");
    }
}
