package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public final class n9 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f165381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f165382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        super(3);
        this.f165381d = c0Var;
        this.f165382e = qVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        java.util.Map map = (java.util.Map) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        kotlinx.coroutines.q qVar = this.f165382e;
        kotlin.jvm.internal.c0 c0Var = this.f165381d;
        if (map == null || !kotlin.jvm.internal.o.b(map.get("ret"), 0)) {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.f165823e.a();
            com.tencent.mars.xlog.Log.i("AdLandingQRCodeBtnCompDelegate", "requestGeoLocation failed");
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k9(false, null)));
            }
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", map.get("latitude"));
            jSONObject.put("longitude", map.get("longitude"));
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9.f165823e.a();
            com.tencent.mars.xlog.Log.i("AdLandingQRCodeBtnCompDelegate", "requestGeoLocation res = " + jSONObject);
            if (!c0Var.f310112d) {
                c0Var.f310112d = true;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k9(true, jSONObject.toString())));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
        return f0Var;
    }
}
