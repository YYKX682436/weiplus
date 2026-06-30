package eg1;

/* loaded from: classes13.dex */
public class k implements vc1.l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252527b;

    public k(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252526a = i17;
        this.f252527b = lVar;
    }

    @Override // vc1.l2
    public void a(double d17, double d18) {
        uc1.w0 w0Var = new uc1.w0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252526a);
            jSONObject.put("longitude", d18);
            jSONObject.put("latitude", d17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        w0Var.f82374f = jSONObject.toString();
        this.f252527b.i(w0Var, null);
        jSONObject.toString();
    }
}
