package t00;

/* loaded from: classes9.dex */
public final class k0 implements t00.r0 {

    /* renamed from: a, reason: collision with root package name */
    public j20.e f414305a;

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.B;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        int optInt = data.optInt("type");
        int optInt2 = data.optInt("poiValidTime");
        boolean z17 = data.optInt("waitingPoiUpdateResult") == 1;
        int optInt3 = data.optInt("waitingPoiUpdateTimeout");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetEcsWeShopPoiDataActionHandler", "context:" + context + ",type:" + optInt + ",poiValidTime:" + optInt2 + ",waitingPoiUpdateResult:" + z17 + ",waitingPoiUpdateTimeout:" + optInt3);
        if (optInt == 1) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest(optInt2, false, 0), t00.f0.class, new t00.g0(callback));
            return;
        }
        if (optInt == 2) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.ecs.jsapi.GetEcsWeShopPoiDataActionHandler$IPCPoiRequest(optInt2, z17, optInt3), t00.c0.class, new t00.h0(callback));
            return;
        }
        if (optInt != 3) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "invalid type");
            callback.d(jSONObject2);
            return;
        }
        if (this.f414305a != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "requesting");
            callback.d(jSONObject3);
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "context err");
            callback.d(jSONObject4);
            return;
        }
        j20.e eVar = new j20.e();
        android.app.Activity activity = (android.app.Activity) context;
        t00.j0 j0Var = new t00.j0(optInt2, z17, optInt3, callback, this);
        kotlin.jvm.internal.o.g(activity, "activity");
        j20.b bVar = new j20.b(j0Var, eVar);
        boolean Ni = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ni(activity, new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 157, "", "", null, new j20.c(bVar));
        com.tencent.mars.xlog.Log.i("EcsPoiPermission", "hasPermission " + Ni);
        if (Ni) {
            bVar.invoke(java.lang.Boolean.TRUE);
        }
        this.f414305a = eVar;
    }
}
