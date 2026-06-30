package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes8.dex */
public abstract class u {
    public static final void a(int i17, r45.n23 n23Var) {
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper();
        webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper.f186983d = n23Var;
        if (i17 == 1) {
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper, new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.d(), com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.n.f186988d);
        } else {
            if (i17 != 2) {
                return;
            }
            java.lang.String PROCESS_MAIN2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN2, "PROCESS_MAIN");
            com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN2, webViewVideoFinderActionHandler$FinderVideoInfoForMpWrapper, new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.c(), com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.m.f186987d);
        }
    }

    public static final void b(sf.f invokeContext, r45.n23 finderVideoInfoForMp) {
        org.json.JSONObject optJSONObject;
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        kotlin.jvm.internal.o.g(finderVideoInfoForMp, "finderVideoInfoForMp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterFinderFullScreen localFeedId: ");
        sb6.append(finderVideoInfoForMp.getString(20));
        sb6.append(", extInfo: ");
        org.json.JSONObject c17 = invokeContext.c();
        java.lang.String str = null;
        sb6.append(c17 != null ? c17.optJSONObject("extInfo") : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", sb6.toString());
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo webViewVideoFinderActionHandler$EnterFinderFullScreenInfo = new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler$EnterFinderFullScreenInfo();
        webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186981d = finderVideoInfoForMp;
        org.json.JSONObject c18 = invokeContext.c();
        if (c18 != null && (optJSONObject = c18.optJSONObject("extInfo")) != null) {
            str = optJSONObject.toString();
        }
        if (str == null) {
            str = "";
        }
        webViewVideoFinderActionHandler$EnterFinderFullScreenInfo.f186982e = str;
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, webViewVideoFinderActionHandler$EnterFinderFullScreenInfo, new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.f(), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.o(invokeContext));
    }

    public static final void c(java.lang.String localFeedId, yz5.l callback) {
        kotlin.jvm.internal.o.g(localFeedId, "localFeedId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderVideoInfo localFeedId: ".concat(localFeedId));
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCString(localFeedId), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.j(), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.r(localFeedId, callback));
    }

    public static final void d(java.lang.String action, nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "handlerFinderAction action: ".concat(action));
        str = "";
        switch (action.hashCode()) {
            case -1741233496:
                if (action.equals("getFinderFeedInfo")) {
                    java.lang.Object obj2 = msg.f340790a.get("localFeedId");
                    str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    str = str2 != null ? str2 : "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo localFeedId: %s", str);
                    java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
                    com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, new com.tencent.mm.ipcinvoker.type.IPCString(str), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.h(), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.p(env, msg, str));
                    return;
                }
                return;
            case -327096186:
                if (action.equals("getSearchFinderPlayInfo")) {
                    java.lang.Object obj3 = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    if (obj3 != null && (obj = obj3.toString()) != null) {
                        str = obj;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data: %s", str);
                    java.lang.String PROCESS_MAIN2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.f(PROCESS_MAIN2, "PROCESS_MAIN");
                    com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN2, new com.tencent.mm.ipcinvoker.type.IPCString(str), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.k(), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.s(env, msg));
                    return;
                }
                return;
            case 295901137:
                if (action.equals("operateFinderVideo")) {
                    java.lang.Object obj4 = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    java.lang.String str3 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    str = str3 != null ? str3 : "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo data: ".concat(str));
                    if (str.length() == 0) {
                        env.f340863d.e(msg.f341013c, msg.f341019i + ":fail", null);
                        return;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
                    if (msg.f340790a.containsKey("isLike")) {
                        java.lang.Object obj5 = msg.f340790a.get("isLike");
                        java.lang.String str4 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
                        jSONObject.put("isLike", str4 != null ? java.lang.Boolean.parseBoolean(str4) : false);
                    }
                    if (msg.f340790a.containsKey("isFav")) {
                        java.lang.Object obj6 = msg.f340790a.get("isFav");
                        str2 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
                        jSONObject.put("isFav", str2 != null ? java.lang.Boolean.parseBoolean(str2) : false);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo operateData: " + jSONObject);
                    java.lang.String PROCESS_MAIN3 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.f(PROCESS_MAIN3, "PROCESS_MAIN");
                    com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN3, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.l(), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.t(env, msg));
                    return;
                }
                return;
            case 329436478:
                if (action.equals("getFinderPlayInfo")) {
                    java.lang.Object obj7 = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                    str2 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                    str = str2 != null ? str2 : "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo data: %s", str);
                    java.lang.String PROCESS_MAIN4 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.f(PROCESS_MAIN4, "PROCESS_MAIN");
                    com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN4, new com.tencent.mm.ipcinvoker.type.IPCString(str), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.i(), new com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.q(env, msg));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
