package eg1;

/* loaded from: classes13.dex */
public class c implements vc1.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252506b;

    public c(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252505a = i17;
        this.f252506b = lVar;
    }

    @Override // vc1.v2
    public void a(java.util.ArrayList arrayList) {
        uc1.e1 e1Var = new uc1.e1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        try {
            jSONObject.put("mapId", this.f252505a);
            jSONObject.put("show", jSONArray);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        e1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f252506b;
        lVar.i(e1Var, null);
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.page.v5)) {
            lVar.p(e1Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebMap", "onShow:%s", jSONObject.toString());
    }

    @Override // vc1.v2
    public void b(java.util.ArrayList arrayList) {
        uc1.e1 e1Var = new uc1.e1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) arrayList);
        try {
            jSONObject.put("mapId", this.f252505a);
            jSONObject.put("hide", jSONArray);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        e1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f252506b;
        lVar.i(e1Var, null);
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.page.v5)) {
            lVar.p(e1Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertXWebMap", "onHide:%s", jSONObject.toString());
    }
}
