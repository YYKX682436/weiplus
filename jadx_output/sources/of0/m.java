package of0;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        wm4.n nVar;
        com.tencent.mm.autogen.events.HaoKanActionEvent haoKanActionEvent = (com.tencent.mm.autogen.events.HaoKanActionEvent) iEvent;
        am.gh ghVar = haoKanActionEvent.f54431g;
        if (ghVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HaoKanActionEventIListener", "recv HaoKanActionEvent, serverData:%s, clientData:%s", ghVar.f6762a, ghVar.f6763b);
        am.gh ghVar2 = haoKanActionEvent.f54431g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ghVar2.f6762a) && (nVar = ((wm4.p) i95.n0.c(wm4.p.class)).f447300g) != null) {
            java.lang.String str = ghVar2.f6762a;
            com.tencent.mm.plugin.topstory.ui.home.j jVar = ((com.tencent.mm.plugin.topstory.ui.home.u) nVar).f175084a;
            if (jVar.E) {
                if (pm4.w.n(jVar.h() != null ? jVar.h().f447318b : 0)) {
                    long j17 = jVar.F;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("params", str);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onWebRecommendInfoUpdate json exception: " + e17.getMessage());
                    }
                    ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ri(j17, "onWebRecommendInfoUpdate", jSONObject);
                }
            }
            com.tencent.mm.plugin.topstory.ui.webview.l lVar = jVar.f174993m;
            if (lVar != null) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("params", str);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebRecommendInfoUpdate json exception: " + e18.getMessage());
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.n(lVar, jSONObject2.toString()));
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ghVar2.f6763b)) {
            try {
                cl0.g gVar = new cl0.g(ghVar2.f6763b);
                java.lang.String string = gVar.getString("action");
                cl0.g a17 = gVar.a("params");
                if (string.equals("updateNumReddot")) {
                    ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().k(a17.optString("msgId"), a17.getInt("latestTimeStamp"), true, a17.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), true);
                } else if (string.equals("openProfile")) {
                    java.lang.String string2 = a17.getString("openId");
                    android.content.Context wi6 = ((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi();
                    o11.g gVar2 = wm4.u.f447309a;
                    sm4.d dVar = new sm4.d(string2);
                    gm0.j1.d().a(2830, new wm4.w(dVar, wi6));
                    gm0.j1.d().g(dVar);
                } else if (string.equals("openWowColikeSetting")) {
                    wm4.u.t(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), "normal");
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HaoKanActionEventIListener", "HaoKanActionEvent error");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HaoKanActionEventIListener", e19, "", new java.lang.Object[0]);
            }
        }
        return true;
    }
}
