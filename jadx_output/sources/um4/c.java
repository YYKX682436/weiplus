package um4;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lum4/c;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "plugin-topstory_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class c extends com.tencent.mm.plugin.lite.api.p implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f429118g = new java.util.HashMap();

    public final void A(r45.in6 in6Var, boolean z17, int i17) {
        int i18 = in6Var.f377194s;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "loadDataFromServer, preTabChannelId = %s，homeContext channelId = %s, hashcode = %s, needCallback = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        sm4.b bVar = new sm4.b(in6Var, i17);
        gm0.j1.d().a(1943, this);
        gm0.j1.d().g(bVar);
        this.f429118g.put(java.lang.Integer.valueOf(i18), bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "Start new net scene");
    }

    public final void B(int i17, r45.in6 in6Var, int i18) {
        com.tencent.mm.autogen.mmdata.rpt.RecommendActionFlowStruct recommendActionFlowStruct = new com.tencent.mm.autogen.mmdata.rpt.RecommendActionFlowStruct();
        recommendActionFlowStruct.f59878d = i17;
        recommendActionFlowStruct.f59879e = java.lang.System.currentTimeMillis();
        recommendActionFlowStruct.f59880f = recommendActionFlowStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, in6Var.f377183e, true);
        recommendActionFlowStruct.f59881g = in6Var.f377194s;
        recommendActionFlowStruct.f59882h = recommendActionFlowStruct.b("searchId", in6Var.f377182d, true);
        recommendActionFlowStruct.f59884j = recommendActionFlowStruct.b("requestId", in6Var.f377189n, true);
        recommendActionFlowStruct.f59883i = in6Var.f377185g;
        recommendActionFlowStruct.f59885k = recommendActionFlowStruct.b(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.mm.plugin.websearch.l2.b(), true);
        recommendActionFlowStruct.f59888n = i18;
        recommendActionFlowStruct.k();
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", jSONObject != null ? jSONObject.toString() : null);
        if (jSONObject != null) {
            try {
                r45.in6 in6Var = new r45.in6();
                ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).getClass();
                in6Var.f377191p = wm4.u.i();
                in6Var.f377186h = jSONObject.optString("query", "");
                in6Var.f377185g = jSONObject.optInt("offset", 0);
                in6Var.f377187i = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
                in6Var.f377183e = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
                in6Var.f377184f = jSONObject.optString("subSessionId", "");
                in6Var.f377182d = jSONObject.optString("searchId", "");
                in6Var.f377189n = jSONObject.optString("requestId", "");
                in6Var.f377194s = jSONObject.optInt("tagId", 0);
                in6Var.f377195t = jSONObject.optString("navigationId", "");
                in6Var.f377198w = com.tencent.mm.plugin.websearch.l2.b();
                in6Var.D = jSONObject.optBoolean("directRequest", false);
                in6Var.B = jSONObject.optString("homeMsgId", "");
                in6Var.C = jSONObject.optString("redPointMsgId", "");
                java.lang.String optString = jSONObject.optString("extReqParams", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                        r45.x50 x50Var = new r45.x50();
                        x50Var.f389788d = jSONObject2.optString("key", "");
                        x50Var.f389789e = jSONObject2.optLong("uintValue", 0L);
                        x50Var.f389790f = jSONObject2.optString("textValue", "");
                        in6Var.f377190o.add(x50Var);
                    }
                }
                if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0().size() > 0) {
                    in6Var.A = new r45.o33();
                    for (com.tencent.mm.plugin.ball.model.BallInfo ballInfo : ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0()) {
                        int i18 = ballInfo.f93046d;
                        if (i18 == 2 || i18 == 50) {
                            java.lang.String g17 = ballInfo.g("rawUrl", "");
                            kotlin.jvm.internal.o.f(g17, "getStringExtra(...)");
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                                if (!r26.i0.y(g17, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s", false)) {
                                    if (r26.i0.y(g17, "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s", false)) {
                                    }
                                }
                                r45.p33 p33Var = new r45.p33();
                                p33Var.f382695d = g17;
                                r45.o33 o33Var = in6Var.A;
                                if (o33Var != null && (linkedList = o33Var.f381866d) != null) {
                                    linkedList.add(p33Var);
                                }
                                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "add float ball url %s", g17);
                            }
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "channelId = %s directRequest = %s preRequestMode = %s", java.lang.Integer.valueOf(in6Var.f377194s), java.lang.Boolean.valueOf(in6Var.D), java.lang.Integer.valueOf(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.search.RepairerConfigTopStoryPreRequest())));
                int optInt = jSONObject.optInt("preTabChannelId", 0);
                B(5, in6Var, 0);
                A(in6Var, true, optInt);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiGetK1KData", e17, "getSearchData", new java.lang.Object[0]);
                this.f143443f.a("Error");
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.HashMap hashMap = this.f429118g;
        if (hashMap.values() != null) {
            java.util.Collection values = hashMap.values();
            kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            if (kz5.n0.O(values, m1Var) && (m1Var instanceof sm4.b)) {
                sm4.b bVar = (sm4.b) m1Var;
                hashMap.remove(java.lang.Integer.valueOf(bVar.f409928f.f377194s));
                if (hashMap.isEmpty()) {
                    gm0.j1.d().q(1943, this);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "cacheCgi.isEmpty() = " + hashMap.isEmpty());
                }
                r45.in6 in6Var = bVar.f409928f;
                kotlin.jvm.internal.o.f(in6Var, "getHomeContext(...)");
                B(6, in6Var, i18);
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "netscene topstory error");
                    this.f143443f.a(str);
                    return;
                }
                java.lang.String str2 = ((r45.s97) bVar.f409927e.f70711b.f70700a).f385587f;
                if (in6Var != null && pm4.w.l(in6Var.f377194s)) {
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(r6.f385590i);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "try to clear haokan red dot");
                }
                if (in6Var != null && pm4.w.m(in6Var.f377194s)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "clear home red dot");
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().l();
                    om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
                    mf0.c0 c0Var = wi6.f346437e;
                    if (c0Var != null) {
                        ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var).d(wi6.x());
                    }
                }
                if (in6Var != null && pm4.w.n(in6Var.f377194s)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "clear home red dot");
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().m();
                    om4.p wi7 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
                    mf0.c0 c0Var2 = wi7.f346437e;
                    if (c0Var2 != null) {
                        ((com.tencent.mm.plugin.topstory.ui.home.l0) c0Var2).e(wi7.x());
                    }
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("json", str2);
                jSONObject.put("isCache", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiGetK1KData", "search data: " + str2);
                this.f143443f.c(jSONObject, false);
            }
        }
    }
}
