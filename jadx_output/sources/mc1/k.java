package mc1;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1033;
    public static final java.lang.String NAME = "shareGameLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        int optInt = jSONObject.optInt("type", 0);
        if (optInt == 1) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            java.lang.String appId = c0Var.getAppId();
            int i18 = c0Var.t3().u0().f77281g;
            android.content.Context context = c0Var.getF147807d();
            mc1.j jVar = new mc1.j(this, c0Var, i17);
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(context, "context");
            v0Var.f279291m = jVar;
            if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i18).booleanValue()) {
                h63.v[] vVarArr = h63.v.f279284d;
                com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(appId, 0, 3, 0, null, null, 0, 0L, 250, null);
                h63.n0 n0Var = h63.n0.f279265a;
                java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest, n0Var, null);
                return;
            }
            return;
        }
        if (optInt != 2) {
            c0Var.a(i17, o("fail:unknown type,invalid input"));
            return;
        }
        h63.r1 r1Var2 = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId2 = c0Var.getAppId();
        int i19 = c0Var.t3().u0().f77281g;
        android.content.Context context2 = c0Var.getF147807d();
        ((h63.v0) r1Var2).getClass();
        kotlin.jvm.internal.o.g(appId2, "appId");
        kotlin.jvm.internal.o.g(context2, "context");
        if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId2, i19).booleanValue()) {
            h63.v[] vVarArr2 = h63.v.f279284d;
            com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest2 = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(appId2, 0, 2, 0, null, null, 0, 0L, 250, null);
            h63.o0 o0Var = h63.o0.f279266a;
            java.util.Map map2 = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context2, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest2, o0Var, null);
        }
        c0Var.a(i17, o("ok"));
    }
}
