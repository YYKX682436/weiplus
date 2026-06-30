package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class ea implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.fa f165176a;

    public ea(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.fa faVar) {
        this.f165176a = faVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1$1");
        com.tencent.mars.xlog.Log.i("LandingPageUtil", "onLaunchApp, launchSuccess=" + z17 + ", launchCancel=" + z18);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.fa faVar = this.f165176a;
        if (!z17) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.e(faVar.f165190d);
        }
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = faVar.f165194h;
        if (a5Var != null) {
            a5Var.a(z17, z18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1$1");
    }
}
