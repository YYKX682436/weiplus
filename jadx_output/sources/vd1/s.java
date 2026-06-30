package vd1;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 108;
    public static final java.lang.String NAME = "reportRealtimeAction";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        try {
            C((ze.n) d0Var.t3(), d0Var instanceof com.tencent.luggage.sdk.jsapi.component.b ? (com.tencent.luggage.sdk.jsapi.component.b) d0Var : (com.tencent.luggage.sdk.jsapi.component.b) ((com.tencent.mm.plugin.appbrand.e9) d0Var).W0(com.tencent.luggage.sdk.jsapi.component.b.class), jSONObject);
            d0Var.a(i17, o("ok"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportRealtimeAction", "report by service(%s), e = %s", d0Var.getAppId(), e17);
            d0Var.a(i17, o("fail:internal error"));
        }
    }

    public final void C(ze.n nVar, com.tencent.luggage.sdk.jsapi.component.b bVar, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("actionData");
        r45.uc7 uc7Var = new r45.uc7();
        uc7Var.f387231d = 2;
        uc7Var.f387232e = nVar.f74803n;
        uc7Var.f387234g = 0;
        uc7Var.f387235h = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        uc7Var.f387236i = 0;
        uc7Var.f387237m = optString;
        uc7Var.f387238n = nVar.E0().f305852r.f75399d + 1;
        uc7Var.f387240p = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        uc7Var.f387239o = nVar.u0().f47276v;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = nVar.l2();
        uc7Var.f387241q = l27.f87790f;
        uc7Var.f387243s = l27.f87791g;
        uc7Var.f387245u = l27.f87788d;
        uc7Var.f387246v = l27.f87789e;
        uc7Var.f387242r = l27.f87792h;
        com.tencent.mm.plugin.appbrand.report.model.y g17 = nVar.x0().getReporter().g();
        com.tencent.mm.plugin.appbrand.report.model.v o17 = bVar != null ? g17.o(bVar) : g17.peek();
        java.lang.String str = o17.f88114b;
        uc7Var.f387233f = str;
        com.tencent.mm.plugin.appbrand.report.model.w wVar = o17.f88116d;
        uc7Var.f387244t = wVar == null ? null : wVar.f88117a;
        uc7Var.f387247w = g17.c(str) ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportRealtimeAction", "report(%s), path %s, appState %d, sessionId %s, scene %d, sceneNote %s, preScene %d, preSceneNote %s, usedState %d, referPath %s, isEntrance %d", nVar.f74803n, uc7Var.f387233f, java.lang.Integer.valueOf(uc7Var.f387238n), uc7Var.f387239o, java.lang.Integer.valueOf(uc7Var.f387241q), uc7Var.f387243s, java.lang.Integer.valueOf(uc7Var.f387245u), uc7Var.f387246v, java.lang.Integer.valueOf(uc7Var.f387242r), uc7Var.f387244t, java.lang.Integer.valueOf(uc7Var.f387247w));
        ((com.tencent.mm.plugin.appbrand.report.d3) com.tencent.mm.plugin.appbrand.report.c3.f87823a.invoke()).b(uc7Var);
    }
}
