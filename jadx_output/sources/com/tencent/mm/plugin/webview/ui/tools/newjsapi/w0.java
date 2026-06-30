package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class w0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.w0 f186593d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.w0();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f340790a.get("itemList");
        boolean z17 = str == null || str.length() == 0;
        nw4.g gVar = env.f340863d;
        if (z17) {
            gVar.e(msg.f341013c, "downloadPageDataForFastLoad:fail invalid itemList", null);
            return true;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray(str);
        int length = jSONArray.length();
        boolean z18 = false;
        for (int i17 = 0; i17 < length; i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad invalid item index: " + i17);
            } else {
                java.lang.String optString = optJSONObject.optString("url");
                int optInt = optJSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                java.lang.String optString2 = optJSONObject.optString("brand_user_name");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: %s", optString);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(optInt)) {
                    kotlin.jvm.internal.o.d(optString);
                    if (optString.length() > 0) {
                        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                        z18 = true;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad can not preload openScene: %d", java.lang.Integer.valueOf(optInt));
                }
            }
        }
        if (z18) {
            gVar.e(msg.f341013c, "downloadPageDataForFastLoad:ok", null);
        } else {
            gVar.e(msg.f341013c, "downloadPageDataForFastLoad:fail not valid url", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.coverview.n.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "downloadPageDataForFastLoad";
    }
}
