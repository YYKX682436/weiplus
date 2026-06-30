package uc1;

/* loaded from: classes13.dex */
public class k0 implements vc1.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426322b;

    public k0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426321a = i17;
        this.f426322b = tVar;
    }

    @Override // vc1.w2
    public void a(java.lang.String str, vc1.y1 y1Var) {
        uc1.g1 g1Var = new uc1.g1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426321a);
            jSONObject.put("polylineId", str);
            jSONObject.put("longitude", y1Var.f435224b);
            jSONObject.put("latitude", y1Var.f435223a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        g1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f426322b;
        tVar.i(g1Var, null);
        tVar.p(g1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "OnMapPolylineClickJsEvent:%s", jSONObject.toString());
    }
}
