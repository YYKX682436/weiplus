package uc1;

/* loaded from: classes13.dex */
public class l implements vc1.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f426328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f426329b;

    public l(uc1.m mVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f426328a = jSONObject;
        this.f426329b = lVar;
    }

    @Override // vc1.i2
    public void a(org.json.JSONArray jSONArray) {
        com.tencent.mm.plugin.appbrand.jsapi.n5 f0Var = new uc1.f0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("clusters", jSONArray);
        org.json.JSONObject jSONObject = this.f426328a;
        hashMap.put("mapId", java.lang.Integer.valueOf(vc1.e3.c(jSONObject)));
        f0Var.t(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "create clusterInfo:%s", jSONArray);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f426329b;
        com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
        if (Q != null) {
            Q.i(f0Var, null);
        } else {
            lVar.p(f0Var);
        }
    }

    @Override // vc1.i2
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.n5 e0Var = new uc1.e0();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cluster", jSONObject);
        org.json.JSONObject jSONObject2 = this.f426328a;
        hashMap.put("mapId", java.lang.Integer.valueOf(vc1.e3.c(jSONObject2)));
        e0Var.t(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.JsApiAddMapMarkers", "click clusterInfo:%s", jSONObject);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f426329b;
        com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject2);
        if (Q != null) {
            Q.i(e0Var, null);
        } else {
            lVar.p(e0Var);
        }
    }
}
