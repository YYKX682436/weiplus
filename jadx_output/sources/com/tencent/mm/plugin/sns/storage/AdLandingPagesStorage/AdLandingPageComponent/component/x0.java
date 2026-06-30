package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f165794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 f165796f;

    public x0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, boolean z17, java.lang.String str) {
        this.f165796f = v0Var;
        this.f165794d = z17;
        this.f165795e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$11");
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            boolean z17 = this.f165794d;
            hashMap.put("ret", java.lang.Integer.valueOf(z17 ? 1 : 2));
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.U(this.f165796f, this.f165795e, z17 ? "ok" : "fail", hashMap);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingNewH5Comp", "callbackQRResultToJS exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$11");
    }
}
