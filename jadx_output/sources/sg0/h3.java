package sg0;

@j95.b
/* loaded from: classes8.dex */
public final class h3 extends i95.w implements su4.f1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f407722d = new java.util.concurrent.ConcurrentHashMap();

    public void Ai(int i17, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        su4.h2 Ni = Ni(i17);
        if (Ni == null) {
            return;
        }
        if (!Ni.b(false) && i17 != 20) {
            if (com.tencent.mm.pluginsdk.model.g4.c()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "try preload wearch webView for scene: " + i17);
                if (i17 == 123) {
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    if (su4.r2.h(false) != 0) {
                        su4.r2.p(0L, false, true, 1);
                        return;
                    }
                }
                su4.r2.o();
                return;
            }
            return;
        }
        boolean z17 = Ni.f412910e;
        java.lang.String str = Ni.f412906a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "not preload liteApp for config, " + i17 + " appid: " + str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "try preload liteapp for scene " + i17 + " appid: " + str);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = str;
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var == null) {
            return;
        }
        Di(i17);
        if (((com.tencent.mm.feature.lite.i) g0Var).Cj((java.lang.String) h0Var.f310123d) != null) {
            Bi(context, (java.lang.String) h0Var.f310123d, Ni);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "checkLiteApp, liteAppId: " + ((java.lang.String) h0Var.f310123d));
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj((java.lang.String) h0Var.f310123d, new sg0.c3(this, context, h0Var, Ni));
    }

    public final void Bi(android.content.Context context, java.lang.String str, su4.h2 h2Var) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f407722d;
        wu5.c cVar = (wu5.c) concurrentHashMap.get(h2Var.a());
        if (cVar != null) {
            cVar.cancel(false);
        }
        concurrentHashMap.remove(h2Var.a());
        ku5.u0 u0Var = ku5.t0.f312615d;
        sg0.d3 d3Var = new sg0.d3(str, h2Var, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(d3Var, 500L, false);
    }

    public void Di(int i17) {
        su4.h2 Ni = Ni(i17);
        if (Ni == null) {
            return;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        boolean z17 = false;
        if (g0Var != null && ((com.tencent.mm.feature.lite.i) g0Var).tk(Ni.f412906a)) {
            z17 = true;
        }
        if (z17) {
            wi(Ni);
            return;
        }
        q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var2 != null) {
            ((com.tencent.mm.feature.lite.i) g0Var2).qj(Ni.f412906a, 300, true, 10L, new sg0.e3(Ni, this));
        }
    }

    public final su4.h2 Ni(int i17) {
        java.lang.String optString;
        if (((tg0.p1) i95.n0.c(tg0.p1.class)) != null) {
            java.util.HashMap hashMap = su4.o2.f413028a;
            ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
            org.json.JSONObject d17 = su4.o2.d("exptConfig");
            if (!d17.isNull("items") && (optString = d17.optString("items")) != null) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                    for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                        org.json.JSONObject jSONObject = jSONArray.getJSONObject(i18);
                        if (jSONObject != null && jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) == i17) {
                            java.lang.String string = jSONObject.getString("exptKey");
                            java.lang.String string2 = jSONObject.getString("appId");
                            java.lang.String string3 = jSONObject.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
                            if (string2 != null && string3 != null) {
                                su4.h2 h2Var = new su4.h2(i17, string2, string3);
                                h2Var.f412908c = string;
                                h2Var.f412910e = jSONObject.optInt("preloadLiteApp") > 0;
                                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                                h2Var.f412909d = jSONObject.optString("preloadParams");
                                kotlin.jvm.internal.o.g(jSONObject.optString("query"), "<set-?>");
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchConfigLogic", "get search route info scene: %d, appid: %s, exptKey: %s, page: %s, preloadLiteApp: %b", java.lang.Integer.valueOf(i17), string2, string, string3, java.lang.Boolean.valueOf(h2Var.f412910e));
                                return h2Var;
                            }
                            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchConfigLogic", "can not find route item for scene %d", java.lang.Integer.valueOf(i17));
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchConfigLogic", e17, "failed get search route item for params %s", optString);
                }
            }
            if (i17 == 20) {
                su4.h2 h2Var2 = new su4.h2(i17, "wxalite2fd372f050eecd471a4392786dfae78c", "pages/s1s-index/entry");
                h2Var2.f412908c = "clicfg_discover_search_use_liteapp";
                h2Var2.f412910e = true;
                return h2Var2;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WebSearchConfigLogic", "no config route item for scene %d", java.lang.Integer.valueOf(i17));
        }
        return null;
    }

    public final void wi(su4.h2 routeItem) {
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(routeItem, "routeItem");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("preloadParams", routeItem.f412909d);
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Search.Entrance");
        if (L0 != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            java.lang.String str = L0.field_tipsId;
            if (str == null) {
                str = "";
            }
            jSONObject2.putOpt("redPointMsgId", str);
            r45.ez2 D0 = L0.D0();
            java.lang.String i17 = (D0 == null || (byteString = D0.getByteString(4)) == null) ? null : byteString.i();
            jSONObject2.putOpt("byPassInfo", i17 != null ? i17 : "");
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            jSONObject.putOpt("reddotParams", jSONObject3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearchLiteAppJsApiFeatureService", "did dispatch page info: " + jSONObject);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.tencent.mm.feature.lite.i) g0Var).rj(routeItem.f412906a, "preloadSearchTeachData", jSONObject);
        }
    }
}
