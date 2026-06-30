package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes15.dex */
public final class d5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "showAtSomeoneView";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        if (bVar == null) {
            return;
        }
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        android.content.Context context = ((sd.a) bVar.f406596a).getContext();
        if (jSONObject == null || context == null) {
            bVar.c("invalid_params", null);
            return;
        }
        java.lang.String optString = jSONObject.optString("gamecenterIdentifier");
        java.lang.String optString2 = jSONObject.optString("configDict");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2) || com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            bVar.c("invalid_params", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
            com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig = new com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig();
            gameAtSomeoneConfig.f139509d = jSONObject2.optString("searchContentText", "");
            gameAtSomeoneConfig.f139510e = jSONObject2.optBoolean("showAtSomeoneView", false);
            gameAtSomeoneConfig.f139511f = jSONObject2.optBoolean("enableAtSomeoneService", false);
            gameAtSomeoneConfig.f139513h = jSONObject2.optString("AtList", "");
            gameAtSomeoneConfig.f139512g = com.tencent.mm.sdk.platformtools.x2.s();
            gameAtSomeoneConfig.f139515m = jSONObject2.optString("atContentId", "");
            gameAtSomeoneConfig.f139516n = jSONObject2.optString("atContext", "");
            gameAtSomeoneConfig.f139517o = jSONObject2.optInt("atLimit", 50);
            gameAtSomeoneConfig.f139518p = jSONObject2.optInt("bottomHeight", 0);
            gameAtSomeoneConfig.f139514i = optString;
            java.lang.Object obj = bVar.f406596a;
            if (obj instanceof sd.k) {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.luggage.container.LuggagePage");
                android.content.Context context2 = ((sd.k) obj).f406610d;
                if (context2 instanceof com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI) {
                    cl0.e eVar = f53.f.f259644a;
                    com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI ctx = (com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI) context2;
                    kotlin.jvm.internal.o.g(ctx, "ctx");
                    f53.f.f259648e = gameAtSomeoneConfig;
                    f53.f.f259647d = gameAtSomeoneConfig.f139512g;
                    ((ku5.t0) ku5.t0.f312615d).B(new f53.e(ctx, gameAtSomeoneConfig));
                }
            }
            s43.j jVar = s43.i.f402956a;
            jVar.f402957a.put(optString, new com.tencent.mm.plugin.game.luggage.jsapi.c5(this, bVar, optString));
        } catch (org.json.JSONException unused) {
            bVar.c("configDict is not json obj", null);
        }
    }
}
