package eg1;

/* loaded from: classes13.dex */
public class d implements vc1.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252508b;

    public d(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252507a = i17;
        this.f252508b = lVar;
    }

    @Override // vc1.d2
    public void a(vc1.n2 n2Var) {
        uc1.y0 y0Var = new uc1.y0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252507a);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, n2Var.f435024a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        y0Var.f82374f = jSONObject.toString();
        this.f252508b.i(y0Var, null);
    }
}
