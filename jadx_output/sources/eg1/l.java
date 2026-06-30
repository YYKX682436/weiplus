package eg1;

/* loaded from: classes13.dex */
public class l implements vc1.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252529b;

    public l(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252528a = i17;
        this.f252529b = lVar;
    }

    @Override // vc1.k2
    public void onAuthFail(int i17, java.lang.String str) {
        uc1.x0 x0Var = new uc1.x0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252528a);
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        x0Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f252529b;
        lVar.i(x0Var, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebMap", "OnMapAuthFailJsEvent:%s", jSONObject.toString());
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            return;
        }
        lVar.p(x0Var);
    }

    @Override // vc1.k2
    public void onAuthSuccess() {
        uc1.v0 v0Var = new uc1.v0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252528a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        v0Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f252529b;
        lVar.i(v0Var, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebMap", "OnAuthSuccessJsEvent:%s", jSONObject.toString());
        if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            return;
        }
        lVar.p(v0Var);
    }
}
