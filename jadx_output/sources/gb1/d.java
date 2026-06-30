package gb1;

/* loaded from: classes7.dex */
public abstract class d extends gb1.i {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.t E = E(lVar, jSONObject);
        if (E != null) {
            gb1.n nVar = new gb1.n(lVar, i17);
            C(E, jSONObject);
            E.m(new gb1.b(this, E, c0Var, nVar, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BaseInsertViewJsApi", "invoke JsApi(%s) failed, component view is null", k());
        java.lang.String str = android.text.TextUtils.isEmpty("fail:ComponentView is null.") ? "fail:internal error" : "fail:ComponentView is null.";
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }

    public boolean I() {
        return this instanceof vb1.p;
    }

    public boolean J() {
        return this instanceof vb1.p;
    }

    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        throw new java.lang.IllegalStateException("inflateView must be inflated." + this);
    }

    public android.view.View L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject, int i17) {
        return K(tVar, jSONObject);
    }

    public boolean M() {
        return this instanceof vb1.u;
    }

    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
    }

    public void O(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
    }
}
