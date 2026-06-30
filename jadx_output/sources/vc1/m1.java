package vc1;

/* loaded from: classes13.dex */
public class m1 implements com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435011a;

    public m1(vc1.p1 p1Var, java.lang.String str) {
        this.f435011a = p1Var;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener
    public boolean onEvent(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onEvent eventType:%s, eventInfo:%s ", str, str2);
        vc1.u1 u1Var = this.f435011a.f435105w0;
        if (u1Var == null) {
            return false;
        }
        java.lang.String id6 = visualLayer.getId();
        uc1.p pVar = (uc1.p) u1Var;
        pVar.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.n5 sVar = new uc1.s();
        java.util.HashMap hashMap = new java.util.HashMap();
        org.json.JSONObject jSONObject = pVar.f426341a;
        hashMap.put("mapId", java.lang.Integer.valueOf(vc1.e3.c(jSONObject)));
        hashMap.put("layerId", id6);
        hashMap.put("eventType", str);
        hashMap.put("eventInfo", str2);
        sVar.t(hashMap);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddMapVisualLayer", "onEvent eventType:%s, eventInfo:%s", str, str2);
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = pVar.f426342b;
        com.tencent.mm.plugin.appbrand.jsapi.t Q = ((gb1.k) lVar.q(gb1.k.class)).Q(lVar, jSONObject);
        if (Q != null) {
            Q.i(sVar, null);
            return false;
        }
        lVar.p(sVar);
        return false;
    }

    @Override // com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener
    public void onLayerLoadFinish(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "onLayerLoadFinish status:%d", java.lang.Integer.valueOf(i17));
    }
}
