package p93;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        p93.d dVar;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mars.xlog.Log.i("LiteAppBridgeLuggageJsApi", "invoke " + this.f299023d);
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        synchronized (p93.d.class) {
            if (p93.d.f352891d == null) {
                p93.d.f352891d = new p93.d();
            }
            dVar = p93.d.f352891d;
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        dVar.getClass();
        dVar.f352894c.put(java.lang.Integer.valueOf((int) this.f143442e.f299028e), this.f143442e);
        q80.h0 h0Var = dVar.f352893b;
        p93.c cVar = new p93.c(dVar);
        com.tencent.mm.plugin.game.luggage.liteapp.a aVar = (com.tencent.mm.plugin.game.luggage.liteapp.a) h0Var;
        aVar.getClass();
        try {
            com.tencent.mm.plugin.game.luggage.liteapp.c cVar2 = aVar.f139809a;
            if (cVar2 == null || cVar2.f139812d != c()) {
                aVar.f139809a = new com.tencent.mm.plugin.game.luggage.liteapp.c(c(), com.tencent.mm.plugin.game.luggage.liteapp.LiteLuggageGameJsRuntimeImpl.class, cVar);
            }
            sd.l0 l0Var = aVar.f139809a.f139813e;
            synchronized (com.tencent.mm.plugin.webview.luggage.jsapi.t5.class) {
                com.tencent.mm.plugin.webview.luggage.jsapi.t5.f182467a = new java.util.LinkedList();
                com.tencent.mm.plugin.webview.luggage.jsapi.t5.b();
                linkedList = com.tencent.mm.plugin.webview.luggage.jsapi.t5.f182467a;
            }
            l0Var.g(linkedList, aVar.f139809a);
            sd.l0 l0Var2 = aVar.f139809a.f139813e;
            synchronized (com.tencent.mm.plugin.game.luggage.jsapi.a.class) {
                com.tencent.mm.plugin.game.luggage.jsapi.a.f139583a = new java.util.LinkedList();
                com.tencent.mm.plugin.game.luggage.jsapi.a.b();
                linkedList2 = com.tencent.mm.plugin.game.luggage.jsapi.a.f139583a;
            }
            l0Var2.g(linkedList2, aVar.f139809a);
            java.lang.String str2 = this.f299023d;
            org.json.JSONObject put = new org.json.JSONObject(jSONObject2).put("liteCallbackId", this.f143442e.f299028e);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(ya.b.METHOD, str2);
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, put);
            jSONObject3.put("liteCallbackId", this.f143442e.f299028e);
            jSONObject3.put("liteAppId", this.f143442e.f299025b);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("type", "INVOKE");
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject3);
            ((com.tencent.mm.plugin.game.luggage.liteapp.b) aVar.f139809a.f139813e).f139811g.f344517b.a(new org.json.JSONObject(hashMap).toString(), false);
        } catch (org.json.JSONException e17) {
            this.f143442e.b("params error");
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiBridgeLuggageHandler", e17, "liteApp params error", new java.lang.Object[0]);
        }
    }
}
