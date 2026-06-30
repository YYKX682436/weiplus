package uc1;

/* loaded from: classes13.dex */
public class l0 implements vc1.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426331b;

    public l0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426330a = i17;
        this.f426331b = tVar;
    }

    @Override // vc1.v2
    public void a(java.util.ArrayList arrayList) {
        uc1.e1 e1Var = new uc1.e1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        try {
            jSONObject.put("mapId", this.f426330a);
            jSONObject.put("show", jSONArray);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        e1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f426331b;
        tVar.i(e1Var, null);
        tVar.p(e1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "onShow:%s", jSONObject.toString());
    }

    @Override // vc1.v2
    public void b(java.util.ArrayList arrayList) {
        uc1.e1 e1Var = new uc1.e1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        try {
            jSONObject.put("mapId", this.f426330a);
            jSONObject.put("hide", jSONArray);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        e1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f426331b;
        tVar.i(e1Var, null);
        tVar.p(e1Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertMap", "onHide:%s", jSONObject.toString());
    }
}
