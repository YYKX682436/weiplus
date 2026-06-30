package y54;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459545d;

    public i(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        this.f459545d = adHalfScreenPageUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$doPlayEnterAnimation$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459545d;
        int i18 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        adHalfScreenPageUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (adHalfScreenPageUI.f163176x == null) {
            android.view.ViewGroup k17 = adHalfScreenPageUI.f163169q.k();
            if (k17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            } else {
                android.view.View j17 = adHalfScreenPageUI.f163169q.j();
                if (j17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                } else {
                    y54.c i19 = adHalfScreenPageUI.f163169q.i();
                    if (i19 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                    } else {
                        com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize viewPositionAndSize = (a84.b0.a(adHalfScreenPageUI.f163170r.h(), adHalfScreenPageUI.f163170r.i()) || (i17 = adHalfScreenPageUI.f163170r.i()) == null) ? null : (com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize) i17.get(adHalfScreenPageUI.f163170r.h());
                        if (viewPositionAndSize == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                        } else {
                            z54.d dVar = new z54.d(adHalfScreenPageUI, j17, false, 4, null);
                            adHalfScreenPageUI.f163176x = dVar;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewLeft", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewLeft", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            int i27 = viewPositionAndSize.f162692d;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewTop", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewTop", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            int i28 = viewPositionAndSize.f162693e;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            int i29 = viewPositionAndSize.f162694f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            dVar.b(i27, i28, i29, viewPositionAndSize.f162695g, i19.b(), i19.c(), i19.d(), i19.a());
                            z54.d dVar2 = adHalfScreenPageUI.f163176x;
                            if (dVar2 != null) {
                                dVar2.c(new y54.q(k17, adHalfScreenPageUI, j17, i19));
                            }
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$doPlayEnterAnimation$1");
        }
        z54.d dVar3 = adHalfScreenPageUI.f163176x;
        if (dVar3 != null) {
            dVar3.d(0L);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        y54.r rVar = new y54.r(adHalfScreenPageUI);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(rVar, 200L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$doPlayEnterAnimation$1");
    }
}
