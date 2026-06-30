package eg1;

/* loaded from: classes13.dex */
public class b implements vc1.w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252504b;

    public b(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252503a = i17;
        this.f252504b = lVar;
    }

    @Override // vc1.w2
    public void a(java.lang.String str, vc1.y1 y1Var) {
        uc1.g1 g1Var = new uc1.g1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252503a);
            jSONObject.put("polylineId", str);
            jSONObject.put("longitude", y1Var.f435224b);
            jSONObject.put("latitude", y1Var.f435223a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        g1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f252504b;
        lVar.i(g1Var, null);
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.page.v5)) {
            lVar.p(g1Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebMap", "OnMapPolylineClickJsEvent:%s", jSONObject.toString());
    }
}
