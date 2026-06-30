package gb1;

/* loaded from: classes7.dex */
public abstract class h extends gb1.i {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        B(lVar, jSONObject, i17, lVar.getJsRuntime());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.t E = E(lVar, jSONObject);
        if (E != null) {
            lVar.m(new gb1.g(this, new java.lang.ref.WeakReference(E), c0Var, lVar, i17, jSONObject));
            return;
        }
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
        return this instanceof vb1.y;
    }

    public boolean J() {
        return this instanceof vb1.m;
    }

    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        return true;
    }

    public boolean L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        return true;
    }
}
