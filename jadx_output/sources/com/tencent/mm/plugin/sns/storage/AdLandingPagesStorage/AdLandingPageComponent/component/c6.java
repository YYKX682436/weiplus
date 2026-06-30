package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class c6 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public c6(android.content.Context context, ab4.u uVar, android.view.ViewGroup viewGroup) {
        super(context, uVar, viewGroup);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = uVar.H;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        this.f165386t.b("pkg", h17 == null ? "" : h17.field_packageName);
        this.f165386t.b("appid", uVar.H);
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
        ab4.u X = X();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = X.H;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f165049d;
        if (com.tencent.mm.pluginsdk.model.app.w.r(context, str)) {
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str2 = X.H;
            ((kt.c) i0Var2).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str2);
            if (h17 != null && !android.text.TextUtils.isEmpty(h17.field_packageName)) {
                java.lang.String str3 = h17.field_packageName;
                java.lang.String Ui = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Ui(context, h17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                boolean z17 = false;
                if (context == null || android.text.TextUtils.isEmpty(str3)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                } else {
                    try {
                        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str3);
                        if (launchIntentForPackage != null) {
                            boolean z18 = context instanceof android.app.Activity;
                            p95.a.a(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.b6(this, context, launchIntentForPackage, Ui));
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                            z17 = true;
                        }
                    } catch (java.lang.Exception e17) {
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("AdLandingPageOpenAppBtnComp", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
                }
                if (z17) {
                    P();
                }
            }
            super.Y();
        } else {
            super.Y();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageOpenAppBtnComp");
    }
}
