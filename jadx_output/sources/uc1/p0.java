package uc1;

/* loaded from: classes13.dex */
public class p0 implements vc1.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426344b;

    public p0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426343a = i17;
        this.f426344b = tVar;
    }

    @Override // vc1.d2
    public void a(vc1.n2 n2Var) {
        uc1.y0 y0Var = new uc1.y0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426343a);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, n2Var.f435024a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        y0Var.f82374f = jSONObject.toString();
        this.f426344b.i(y0Var, null);
    }
}
