package fe1;

/* loaded from: classes15.dex */
public abstract class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.AbsJsApi", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TransitCard.AbsJsApi", "invoke, data is null");
            lVar.a(i17, de1.b.a(this, 10011, "fail:missing parameters", null));
            return;
        }
        java.util.Map map = fe1.v.f261501b;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fe1.v.f261501b;
        fe1.v vVar = (fe1.v) concurrentHashMap.get(lVar.getAppId());
        if (vVar == null) {
            java.lang.String appId = lVar.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            vVar = new fe1.v(appId);
            java.lang.String appId2 = lVar.getAppId();
            kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
            concurrentHashMap.put(appId2, vVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.Manager", "get, created new manager for appId=" + lVar.getAppId());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.AbsJsApi", "invoke, appId=" + lVar.getAppId() + ", api=" + kotlin.jvm.internal.i0.a(getClass()).g());
        C(lVar, jSONObject, i17, vVar);
    }

    public abstract void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, fe1.v vVar);

    public final void D(com.tencent.mm.plugin.appbrand.jsapi.l env, int i17, he1.k result, yz5.l lVar) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(result, "result");
        if (result instanceof he1.j) {
            env.a(i17, de1.b.a(this, 0, "ok", lVar != null ? (java.util.Map) lVar.invoke(((he1.j) result).f280884a) : null));
            return;
        }
        if (result instanceof he1.i) {
            he1.i iVar = (he1.i) result;
            java.lang.String str = "fail:" + iVar.f280883b;
            int i18 = iVar.f280882a;
            env.a(i17, de1.b.a(this, i18, str, kz5.c1.i(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(i18)))));
        }
    }
}
