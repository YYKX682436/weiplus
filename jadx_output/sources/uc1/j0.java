package uc1;

/* loaded from: classes13.dex */
public class j0 implements vc1.k2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426316b;

    public j0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426315a = i17;
        this.f426316b = tVar;
    }

    @Override // vc1.k2
    public void onAuthFail(int i17, java.lang.String str) {
        uc1.x0 x0Var = new uc1.x0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426315a);
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", str);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        x0Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f426316b;
        tVar.i(x0Var, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "OnMapAuthFailJsEvent:%s", jSONObject.toString());
        tVar.p(x0Var);
    }

    @Override // vc1.k2
    public void onAuthSuccess() {
        uc1.v0 v0Var = new uc1.v0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426315a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        v0Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f426316b;
        tVar.i(v0Var, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "OnAuthSuccessJsEvent:%s", jSONObject.toString());
        tVar.p(v0Var);
    }
}
