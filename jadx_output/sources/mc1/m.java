package mc1;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1029;
    public static final java.lang.String NAME = "startGameLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        ce.g gVar = (ce.g) c0Var.V0().B1(ce.g.class);
        if (gVar != null) {
            ((ce.o) gVar).V(true, false, new de.c());
        }
        java.lang.String path = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        java.lang.String reportInfo = jSONObject.optString("reportInfo", "");
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId = c0Var.getAppId();
        int i18 = c0Var.t3().u0().f77281g;
        android.content.Context f147807d = c0Var.getF147807d();
        int i19 = ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f279292n;
        long j17 = ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f279293o;
        ((h63.v0) r1Var).getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        h63.v[] vVarArr = h63.v.f279284d;
        com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(appId, i18, 0, 0, path, reportInfo, i19, j17, 8, null);
        h63.p0 p0Var = new h63.p0(f147807d);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest, p0Var, null);
        c0Var.a(i17, o("ok"));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
