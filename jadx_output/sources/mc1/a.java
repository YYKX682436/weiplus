package mc1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1031;
    public static final java.lang.String NAME = "enterGameLiveRoom";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId = c0Var.getAppId();
        int i18 = c0Var.t3().u0().f77281g;
        android.content.Context context = c0Var.getF147807d();
        ((h63.v0) r1Var).getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(context, "context");
        h63.v[] vVarArr = h63.v.f279284d;
        com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(appId, 0, 5, 0, null, null, 0, 0L, 250, null);
        h63.x xVar = h63.x.f279297a;
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest, xVar, null);
        c0Var.a(i17, o("ok"));
    }
}
