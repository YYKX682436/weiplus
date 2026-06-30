package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class d implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f162780d;

    public d(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f fVar) {
        this.f162780d = new java.lang.ref.WeakReference(fVar);
    }

    @Override // p64.a
    @o64.b
    public void onCallbackFromServer(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponClientCall");
        try {
            java.lang.ref.WeakReference weakReference = this.f162780d;
            if (weakReference != null && (fVar = (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f) weakReference.get()) != null) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f.h0(fVar, bundle);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingCouponCardBtnComp$CouponClientCall");
    }
}
