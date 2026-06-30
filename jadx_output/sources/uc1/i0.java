package uc1;

/* loaded from: classes13.dex */
public class i0 implements vc1.l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426314b;

    public i0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426313a = i17;
        this.f426314b = tVar;
    }

    @Override // vc1.l2
    public void a(double d17, double d18) {
        uc1.w0 w0Var = new uc1.w0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426313a);
            jSONObject.put("longitude", d18);
            jSONObject.put("latitude", d17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        w0Var.f82374f = jSONObject.toString();
        this.f426314b.i(w0Var, null);
        jSONObject.toString();
    }
}
