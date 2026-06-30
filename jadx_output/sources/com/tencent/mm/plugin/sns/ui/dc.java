package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dc implements com.tencent.mm.ui.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI f168179a;

    public dc(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI) {
        this.f168179a = snsAdNativeLandingPagesUI;
    }

    public void a(boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$30");
        java.util.List list = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f166692q3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$6702", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = this.f168179a;
        snsAdNativeLandingPagesUI.f166701d2 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$6702", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        java.lang.String str = snsAdNativeLandingPagesUI.f166700d;
        com.tencent.mars.xlog.Log.i(str, "onKeyboardStateChanged, visiable=" + z17);
        snsAdNativeLandingPagesUI.t8();
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.e7(snsAdNativeLandingPagesUI) && z17) {
            if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f7(snsAdNativeLandingPagesUI) != null) {
                n54.f f76 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f7(snsAdNativeLandingPagesUI);
                f76.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("slideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
                f76.f335129b.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("slideToTop", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper");
            } else {
                com.tencent.mars.xlog.Log.e(str, "AdHalfScreenLandingPageHelper==null");
            }
        }
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI) != null && com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).X()) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y Z6 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI);
            Z6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            boolean z18 = Z6.F;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            if (!z18) {
                if (z17 && com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).Z()) {
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y Z62 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI);
                    Z62.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                    try {
                        Z62.W();
                        Z62.M();
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", th6.toString());
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                } else if (!z17) {
                    if (!snsAdNativeLandingPagesUI.T7()) {
                        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).c0();
                    } else if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f7(snsAdNativeLandingPagesUI) != null && com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f7(snsAdNativeLandingPagesUI).b()) {
                        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).c0();
                    }
                }
            }
        }
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI) != null) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y Z63 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI);
            Z63.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForJs134", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            boolean z19 = Z63.H && !Z63.E;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForJs134", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            if (z19) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y Z64 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI);
                Z64.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                boolean z27 = Z64.F;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinishing", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                if (!z27) {
                    if (z17 && com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).Z()) {
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y Z65 = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI);
                        Z65.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                        try {
                            Z65.W();
                            Z65.M();
                        } catch (java.lang.Throwable th7) {
                            com.tencent.mars.xlog.Log.e("AdLandingFloatBarCompWrapper", th7.toString());
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideAnimationFloatBar", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
                    } else if (!z17) {
                        if (!snsAdNativeLandingPagesUI.T7()) {
                            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).c0();
                        } else if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f7(snsAdNativeLandingPagesUI) != null && com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.f7(snsAdNativeLandingPagesUI).b()) {
                            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Z6(snsAdNativeLandingPagesUI).c0();
                        }
                    }
                }
            }
        }
        if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI) != null && (layoutParams = com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(snsAdNativeLandingPagesUI).getLayoutParams()) != null) {
            int i17 = layoutParams.height;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            androidx.lifecycle.j0 j0Var = snsAdNativeLandingPagesUI.H2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            j0Var.setValue(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$30");
    }
}
