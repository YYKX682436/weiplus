package eg1;

/* loaded from: classes13.dex */
public class f implements vc1.e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252512b;

    public f(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252511a = i17;
        this.f252512b = lVar;
    }

    @Override // vc1.e2
    public void a(double d17, double d18) {
        uc1.z0 z0Var = new uc1.z0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252511a);
            jSONObject.put("longitude", d17);
            jSONObject.put("latitude", d18);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        z0Var.f82374f = jSONObject.toString();
        this.f252512b.i(z0Var, null);
    }
}
