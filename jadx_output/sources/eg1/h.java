package eg1;

/* loaded from: classes13.dex */
public class h implements vc1.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252516b;

    public h(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252515a = i17;
        this.f252516b = lVar;
    }

    @Override // vc1.u2
    public void a(vc1.m2 m2Var) {
        uc1.f1 f1Var = new uc1.f1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252515a);
            jSONObject.put("latitude", m2Var.f435012a);
            jSONObject.put("longitude", m2Var.f435013b);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, m2Var.f435014c);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(m2Var.f435015d)) {
                jSONObject.put("buildingId", m2Var.f435015d);
                jSONObject.put("floorName", m2Var.f435016e);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        f1Var.f82374f = jSONObject.toString();
        this.f252516b.i(f1Var, null);
        jSONObject.toString();
    }
}
