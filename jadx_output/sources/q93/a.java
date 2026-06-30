package q93;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        q93.g gVar;
        com.tencent.mars.xlog.Log.i("LiteAppBridgeWebViewJsApi", "invoke " + this.f299023d);
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        synchronized (q93.g.class) {
            if (q93.g.f360918d == null) {
                q93.g.f360918d = new q93.g();
            }
            gVar = q93.g.f360918d;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        gVar.getClass();
        gVar.f360921c.put(java.lang.Integer.valueOf((int) this.f143442e.f299028e), this.f143442e);
        q80.j0 j0Var = gVar.f360920b;
        q93.f fVar = new q93.f(gVar);
        q93.d dVar = (q93.d) j0Var;
        dVar.getClass();
        try {
            if (dVar.f360913a == null) {
                try {
                    dVar.f360913a = dVar.a(dVar, "liteapp", "wxaliteapp", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                } catch (java.lang.ClassNotFoundException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            }
            nw4.y2 c17 = nw4.z2.c(this.f299023d, jSONObject2, java.lang.String.valueOf(this.f143442e.f299028e));
            ((java.util.HashMap) c17.f340790a).put("liteAppId", this.f143442e.f299025b);
            ((java.util.HashMap) c17.f340790a).put("liteAppUuid", java.lang.Long.valueOf(this.f143442e.f299024a));
            ((java.util.HashMap) c17.f340790a).put("liteAppPageId", java.lang.Long.valueOf(this.f143442e.f299026c));
            com.tencent.mm.plugin.lite.LiteAppCenter.PageInfo pageInfo = this.f143442e.f299031h;
            if (pageInfo != null) {
                ((java.util.HashMap) c17.f340790a).put("liteAppCurrentPage", pageInfo.pageUrl);
            }
            java.util.Map map = c17.f340790a;
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            java.lang.String str2 = this.f143442e.f299025b;
            ((com.tencent.mm.feature.lite.i) g0Var).getClass();
            d85.f0 b17 = com.tencent.mm.plugin.lite.w.b(str2);
            ((java.util.HashMap) map).put("liteAppBusinessScene", b17 != null ? b17.f227176d : "");
            dVar.b(this, c17);
            jd.c cVar = this.f143442e;
            dVar.f360914b = cVar.f299024a;
            dVar.f360915c = cVar.f299026c;
            android.content.Context c18 = c();
            if (!(c18 instanceof android.app.Activity)) {
                android.app.Activity activity = com.tencent.mm.app.w.k() != null ? (android.app.Activity) com.tencent.mm.app.w.k().get() : null;
                if (activity != null) {
                    c18 = activity;
                }
            }
            nw4.n nVar = dVar.f360913a;
            nVar.f340889c = c18;
            nVar.c(c17, fVar);
            dVar.f360913a.f340889c = null;
        } catch (org.json.JSONException e18) {
            this.f143442e.b("params error");
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiBridgeWebViewHandler", e18, "", new java.lang.Object[0]);
        }
    }
}
