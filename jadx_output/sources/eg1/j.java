package eg1;

/* loaded from: classes13.dex */
public class j implements vc1.t2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f252525b;

    public j(eg1.m mVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f252524a = i17;
        this.f252525b = lVar;
    }

    @Override // vc1.t2
    public void a(vc1.v1 v1Var) {
        uc1.a1 a1Var = new uc1.a1();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("mapId", this.f252524a);
            if (v1Var != null) {
                jSONObject.put("buildingId", v1Var.f435186a);
                jSONObject.put("buildingName", v1Var.f435187b);
                java.util.List list = v1Var.f435188c;
                if (list != null && list.size() > 0) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    for (vc1.w1 w1Var : v1Var.f435188c) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, w1Var.f435192a);
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("floorList", jSONArray);
                }
                jSONObject.put("floorIndex", v1Var.f435189d);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertXWebMap", "put JSON data error : %s", e17);
        }
        a1Var.f82374f = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f252525b;
        lVar.i(a1Var, null);
        if (!(lVar instanceof com.tencent.mm.plugin.appbrand.page.v5)) {
            lVar.p(a1Var);
        }
        jSONObject.toString();
    }
}
