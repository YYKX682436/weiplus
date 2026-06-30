package sc1;

/* loaded from: classes7.dex */
public class z0 extends gb1.h {
    private static final int CTRL_INDEX = 367;
    public static final java.lang.String NAME = "operateLivePlayer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("livePlayerId");
    }

    @Override // gb1.h
    public boolean J() {
        return true;
    }

    @Override // gb1.h
    public boolean L(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        int i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePlayer", "onOperateView : livePlayerId=%d", java.lang.Integer.valueOf(i17));
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", java.lang.Integer.valueOf(i17));
            return false;
        }
        android.view.View view2 = (android.view.View) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (!(view2 instanceof sc1.f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOperateLivePlayer", "targetView not AppBrandLivePlayerView");
            return false;
        }
        sc1.f fVar = (sc1.f) view2;
        java.lang.String optString = jSONObject.optString("type");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLivePlayer", "onOperateView operateType=%s", optString);
        if (optString.equalsIgnoreCase(com.tencent.mm.plugin.appbrand.j0.f78445f)) {
            fVar.setSnapshotListener(new sc1.y0(this, nVar, tVar));
            if (!fVar.c(com.tencent.mm.plugin.appbrand.j0.f78445f, jSONObject)) {
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                nVar.a(u(str, jSONObject2));
            }
        } else {
            boolean equalsIgnoreCase = optString.equalsIgnoreCase("requestFullScreen");
            jc1.d dVar = jc1.f.f298912a;
            jc1.d dVar2 = jc1.f.f298915d;
            if (equalsIgnoreCase) {
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateLivePlayer", "onOperateView directionArr nil");
                    i18 = 0;
                } else {
                    i18 = optJSONArray.optInt(0, 0);
                }
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen direction:%s", java.lang.Integer.valueOf(i18));
                sc1.c cVar = fVar.f405661f;
                if (cVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLivePlayerView", "enterFullScreen mFullScreenDelegate null");
                } else {
                    sc1.q qVar = (sc1.q) cVar;
                    com.tencent.mm.plugin.appbrand.page.ia iaVar = (com.tencent.mm.plugin.appbrand.page.ia) qVar.f405718a.M(qVar.f405719b);
                    int i19 = iaVar.f86765i;
                    int i27 = qVar.f405720c;
                    if (i19 == i27 || iaVar.f86760d == i27) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen already full screen");
                    } else {
                        sc1.q qVar2 = (sc1.q) fVar.f405661f;
                        ((com.tencent.mm.plugin.appbrand.page.ia) qVar2.f405718a.M(qVar2.f405719b)).i(qVar2.f405720c, qVar2.f405721d, i18);
                        fVar.f405663h = i18;
                        fVar.b(true);
                    }
                    r1 = true;
                }
                if (!r1) {
                    dVar = dVar2;
                }
                nVar.a(r(null, dVar, null));
            } else if (optString.equalsIgnoreCase("exitFullScreen")) {
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen");
                sc1.c cVar2 = fVar.f405661f;
                if (cVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandLivePlayerView", "quitFullScreen mFullScreenDelegate null");
                } else {
                    sc1.q qVar3 = (sc1.q) cVar2;
                    com.tencent.mm.plugin.appbrand.page.ia iaVar2 = (com.tencent.mm.plugin.appbrand.page.ia) qVar3.f405718a.M(qVar3.f405719b);
                    int i28 = iaVar2.f86765i;
                    int i29 = qVar3.f405720c;
                    if (i28 == i29 || iaVar2.f86760d == i29) {
                        sc1.q qVar4 = (sc1.q) fVar.f405661f;
                        ((com.tencent.mm.plugin.appbrand.page.ia) qVar4.f405718a.M(qVar4.f405719b)).j(qVar4.f405720c);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen already quit full screen");
                    }
                    r1 = true;
                }
                if (!r1) {
                    dVar = dVar2;
                }
                nVar.a(r(null, dVar, null));
            } else {
                if (!fVar.c(optString, jSONObject)) {
                    dVar = dVar2;
                }
                nVar.a(r(null, dVar, null));
            }
        }
        return true;
    }
}
