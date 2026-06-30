package uc1;

/* loaded from: classes13.dex */
public class s0 implements vc1.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426350b;

    public s0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426349a = i17;
        this.f426350b = tVar;
    }

    @Override // vc1.g2
    public boolean a(vc1.n2 n2Var) {
        uc1.c1 c1Var = new uc1.c1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426349a);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, n2Var.f435024a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        c1Var.f82374f = jSONObject.toString();
        this.f426350b.i(c1Var, null);
        return true;
    }
}
