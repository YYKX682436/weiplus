package uc1;

/* loaded from: classes13.dex */
public class q0 implements vc1.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f426345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f426346b;

    public q0(uc1.i1 i1Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f426345a = i17;
        this.f426346b = tVar;
    }

    @Override // vc1.h2
    public boolean a(vc1.n2 n2Var) {
        uc1.d1 d1Var = new uc1.d1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f426345a);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, n2Var.f435024a);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
        }
        d1Var.f82374f = jSONObject.toString();
        this.f426346b.i(d1Var, null);
        return true;
    }
}
