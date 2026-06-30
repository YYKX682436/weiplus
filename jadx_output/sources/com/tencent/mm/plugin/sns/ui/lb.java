package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class lb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.g f169736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f169737e;

    public lb(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI, ab4.g gVar) {
        this.f169737e = snsAdNativeLandingPagesUI;
        this.f169736d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$18");
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        boolean z17 = this.f169737e.f166760y2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (z17) {
            s54.c a17 = s54.c.a();
            java.lang.String str = this.f169736d.f2817d;
            a17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
            a17.f403183e = str;
            di3.d dVar = a17.f403184f;
            if (dVar != null) {
                dVar.enable();
                a17.f403184f.f232689g = a17;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.landingpage.helper.orientation.ScreenSwitchManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$18");
    }
}
