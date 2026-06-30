package mc1;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1034;
    public static final java.lang.String NAME = "minimizeGameLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
        java.lang.String appId = c0Var.getAppId();
        int i18 = c0Var.t3().u0().f77281g;
        h63.v0 v0Var = (h63.v0) r1Var;
        v0Var.getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        v0Var.f279287f = true;
        c0Var.t3().S();
        c0Var.a(i17, o("ok"));
    }
}
