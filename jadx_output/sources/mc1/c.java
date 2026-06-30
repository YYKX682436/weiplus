package mc1;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1030;
    public static final java.lang.String NAME = "exitGameLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId = c0Var.getAppId();
        int i18 = c0Var.t3().u0().f77281g;
        android.content.Context f147807d = c0Var.getF147807d();
        com.tencent.mm.plugin.appbrand.menu.t[] tVarArr = com.tencent.mm.plugin.appbrand.menu.t.f85989d;
        ((h63.v0) r1Var).Ai(appId, i18, f147807d, 3, new mc1.b(this, c0Var, i17));
    }
}
