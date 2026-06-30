package y54;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459547d;

    public j(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        this.f459547d = adHalfScreenPageUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int h17;
        java.util.ArrayList i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$doPlayExitAnimation$1");
        int i18 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459547d;
        adHalfScreenPageUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        if (adHalfScreenPageUI.f163177y == null) {
            n44.m0 m0Var = adHalfScreenPageUI.f163169q;
            android.view.ViewGroup k17 = m0Var.k();
            if (k17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            } else {
                android.view.View j17 = m0Var.j();
                if (j17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                } else {
                    y54.c i19 = m0Var.i();
                    if (i19 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                        i64.z zVar = m0Var.f334983a;
                        com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize viewPositionAndSize = null;
                        if ((zVar != null ? zVar.g() : null) == n44.h1.f334945e) {
                            n44.z g17 = m0Var.g();
                            g17.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
                            h17 = g17.f335077f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                        } else {
                            i64.z zVar2 = m0Var.f334983a;
                            if ((zVar2 != null ? zVar2.g() : null) != n44.h1.f334944d) {
                                i64.z zVar3 = m0Var.f334983a;
                                if ((zVar3 != null ? zVar3.g() : null) != n44.h1.f334946f) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                                    h17 = 0;
                                }
                            }
                            i64.z zVar4 = m0Var.f334983a;
                            h17 = zVar4 != null ? zVar4.h() : 0;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenPageHelper");
                        }
                        i64.z zVar5 = adHalfScreenPageUI.f163170r;
                        if (!a84.b0.a(h17, zVar5.i()) && (i17 = zVar5.i()) != null) {
                            viewPositionAndSize = (com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize) i17.get(h17);
                        }
                        com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize viewPositionAndSize2 = viewPositionAndSize;
                        if (viewPositionAndSize2 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                        } else {
                            z54.g gVar = new z54.g(adHalfScreenPageUI, j17, false, 4, null);
                            adHalfScreenPageUI.f163177y = gVar;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewLeft", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewLeft", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            int i27 = viewPositionAndSize2.f162692d;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewTop", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewTop", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            int i28 = viewPositionAndSize2.f162693e;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewWidth", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            int i29 = viewPositionAndSize2.f162694f;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHeight", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.ViewPositionAndSize");
                            gVar.b(i27, i28, i29, viewPositionAndSize2.f162695g, i19.b(), i19.c(), i19.d(), i19.a());
                            z54.g gVar2 = adHalfScreenPageUI.f163177y;
                            if (gVar2 != null) {
                                gVar2.c(new y54.s(k17, adHalfScreenPageUI, j17));
                            }
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$doPlayExitAnimation$1");
        }
        z54.g gVar3 = adHalfScreenPageUI.f163177y;
        if (gVar3 != null) {
            gVar3.d(0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$tryPlayExitAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$doPlayExitAnimation$1");
    }
}
