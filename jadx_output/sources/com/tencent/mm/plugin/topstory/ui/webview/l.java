package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class l extends aw4.l {

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.HashSet f175216l;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f175217m;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.topstory.ui.webview.j f175218e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.webview.WebSearchWebView f175219f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.in6 f175220g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f175221h;

    /* renamed from: i, reason: collision with root package name */
    public final mf0.b0 f175222i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f175223j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.k0 f175224k;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f175216l = hashSet;
        f175217m = new java.util.HashSet();
        hashSet.add("launchApplication");
        hashSet.add("openFinderView");
        hashSet.add("openWeApp");
    }

    public l(com.tencent.mm.plugin.websearch.webview.WebSearchWebView webSearchWebView, r45.in6 in6Var, com.tencent.mm.plugin.topstory.ui.webview.j jVar, java.util.LinkedList linkedList, mf0.b0 b0Var) {
        super(null);
        this.f175221h = new java.util.LinkedList();
        this.f175223j = true;
        this.f175224k = ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).bj(new com.tencent.mm.plugin.topstory.ui.webview.e0(this));
        this.f175219f = webSearchWebView;
        this.f175220g = in6Var;
        this.f175218e = jVar;
        this.f175221h = linkedList;
        this.f175222i = b0Var;
    }

    @android.webkit.JavascriptInterface
    public void checkHaoKanCommentPermission(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, params = %s.", str);
        try {
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            android.content.Context context = k17.get() != null ? (android.content.Context) k17.get() : null;
            if (context == null) {
                q("notifyHaoKanCommentPermission", false, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, context = null.");
            } else if (!com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("tophitory_show_comment_dialog", false)) {
                aw4.n0.f14901a.d(context, new com.tencent.mm.plugin.topstory.ui.webview.b0(this), false);
            } else {
                q("notifyHaoKanCommentPermission", true, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanCommentPermission, isgrant no dilaog.");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    public void checkHaoKanPermission(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, params = %s.", str);
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        android.content.Context context = k17.get() != null ? (android.content.Context) k17.get() : null;
        if (context == null) {
            q("notifyHaoKanPermission", false, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission context = null.");
            return;
        }
        try {
            if (com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("tophitory_show_init_dialog", false)) {
                q("notifyHaoKanPermission", true, false);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "checkHaoKanPermission, is grant no dilaog.");
            } else {
                com.tencent.mm.plugin.topstory.ui.webview.a0 a0Var = new com.tencent.mm.plugin.topstory.ui.webview.a0(this);
                boolean Ai = ((lf0.h0) ((mf0.g0) i95.n0.c(mf0.g0.class))).Ai();
                aw4.m0 m0Var = aw4.n0.f14901a;
                if (Ai) {
                    java.lang.String string = context.getString(com.tencent.mm.R.string.f493404on4);
                    java.lang.String string2 = context.getString(com.tencent.mm.R.string.f493402on2);
                    ((sg0.w3) ((tg0.x1) i95.n0.c(tg0.x1.class))).getClass();
                    m0Var.b(context, a0Var, string2, string, true, "tophitory_show_init_dialog");
                } else {
                    tg0.x1 x1Var = (tg0.x1) i95.n0.c(tg0.x1.class);
                    java.lang.String string3 = context.getString(com.tencent.mm.R.string.k1c);
                    ((sg0.w3) x1Var).getClass();
                    m0Var.e(context, a0Var, string3);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    public void createWebViewForFastLoad(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("itemShowTypes");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    int optInt2 = optJSONArray.optInt(i17, -1);
                    if (optInt2 != -1) {
                        arrayList.add(java.lang.Integer.valueOf(optInt2));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", java.lang.Integer.valueOf(optInt), arrayList);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).w(optInt, arrayList);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "createWebViewForFastLoad exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String disposeUniformReddot(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "disposeUniformReddot() called with: params = [" + str + "]");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("paths");
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "disposeUniformReddot: path:%s,paths:%s", optString, optJSONArray);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(optString);
            }
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    java.lang.String string = optJSONArray.getString(i17);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N(string);
                    }
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "disposeUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String doGoToRecVideoList(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doGoToRecVideoList %s", str);
        try {
            r45.un6 p17 = pm4.w.p(new org.json.JSONObject(str));
            if (o() != null) {
                su4.r2.q(((com.tencent.mm.plugin.topstory.ui.home.j) o()).f174986d, p17, 1);
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "doGoToRecVideoList", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public void doNegFeedback(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doNegFeedback %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("filterDocid") && jSONObject.has("category")) {
                java.lang.String string = jSONObject.getString("filterDocid");
                ((wm4.p) ((wm4.o) i95.n0.c(wm4.o.class))).wi().a(jSONObject.getInt("category"), string);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "doNegFeedback", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public void downloadPageDataForFastLoad(java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad params: %s", str);
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("itemList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString("url", "");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                            int optInt = optJSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(optInt)) {
                                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                                java.lang.String optString2 = optJSONObject.optString("brand_user_name", "");
                                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad itemShowType: %d, openScene: %d, url: %s, brandUserName: %s", java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt), optString, optString2);
                                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                            } else {
                                com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad can not preload openScene: %d", java.lang.Integer.valueOf(optInt));
                            }
                        }
                    }
                }
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "downloadPageDataForFastLoad item list is empty");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "createWebViewForFastLoad exception", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @android.webkit.JavascriptInterface
    public void extTransfer(java.lang.String str) {
        java.lang.Exception e17;
        java.lang.String str2;
        com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo;
        org.json.JSONObject jSONObject;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "TopStoryTransfer extTransfer, paramsStr = %s", str);
        java.lang.String str3 = null;
        try {
            jSONObject = new org.json.JSONObject(str);
            str2 = jSONObject.optString("objectid", "");
            try {
                transferRequestInfo = new com.tencent.mm.plugin.brandservice.api.TransferRequestInfo();
            } catch (java.lang.Exception e18) {
                e17 = e18;
            }
        } catch (java.lang.Exception e19) {
            e17 = e19;
            str2 = "";
        }
        try {
            transferRequestInfo.f93913d = 1;
            transferRequestInfo.f93915f = jSONObject.optString("scope", "");
            r45.y24 y24Var = new r45.y24();
            transferRequestInfo.f93917h = y24Var;
            y24Var.f390725d = jSONObject.optString("reqUrl", "");
            transferRequestInfo.f93917h.f390726e = jSONObject.optString("reqBody", "");
            transferRequestInfo.f93917h.f390727f = com.tencent.mm.sdk.platformtools.t8.D1(jSONObject.optString("cgiCmdId", ""), 0);
            transferRequestInfo.f93917h.f390729h = com.tencent.mm.sdk.platformtools.t8.D1(jSONObject.optString(ya.b.METHOD, ""), 0);
            transferRequestInfo.f93918i = jSONObject.optBoolean("is_security_check", false);
            java.lang.String optString = jSONObject.optString("debug_env", "");
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (com.tencent.mm.sdk.platformtools.s9.f192975c && (iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193054b, new com.tencent.mm.ipcinvoker.type.IPCString(optString), com.tencent.mm.plugin.topstory.ui.webview.n0.class)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getTransferDebugIPSync key: %s, result: %s", optString, iPCString.f68406d);
                str3 = iPCString.f68406d;
            }
            if (str3 == null) {
                str3 = "";
            }
            transferRequestInfo.f93924r = str3;
            transferRequestInfo.f93914e = "weixin://resourceid/TopStories/";
            try {
                java.lang.String optString2 = jSONObject.optString("header", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                    java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.String optString3 = jSONObject2.optString(next, "");
                        r45.cw3 cw3Var = new r45.cw3();
                        cw3Var.f371860d = next;
                        cw3Var.f371861e = optString3;
                        transferRequestInfo.f93917h.f390728g.push(cw3Var);
                    }
                }
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e27, "TopStoryTransfer extTransfer parseTransferRequestInfo exception", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e28) {
            e17 = e28;
            str3 = transferRequestInfo;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "TopStoryTransfer extTransfer", new java.lang.Object[0]);
            transferRequestInfo = str3;
            ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(transferRequestInfo, new com.tencent.mm.plugin.topstory.ui.webview.o0(this, str2));
        }
        ((js1.m) ((zq1.f0) gm0.j1.s(zq1.f0.class))).c(transferRequestInfo, new com.tencent.mm.plugin.topstory.ui.webview.o0(this, str2));
    }

    @android.webkit.JavascriptInterface
    public java.lang.String fetchNumReddot(java.lang.String str) {
        r45.qn6 qn6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchNumReddot %s", str);
        try {
            int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
            r45.qn6 r17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r();
            om4.p wi6 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi();
            synchronized (wi6.f346436d) {
                qn6Var = com.tencent.mm.sdk.platformtools.t8.L0(wi6.f346436d) ? null : (r45.qn6) wi6.f346436d.getFirst();
            }
            r(qn6Var.f384113d, r17.f384113d, qn6Var.f384126t, r17.f384126t, s17, r17.f384127u);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String fetchReddot(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl fetchReddot %s", str);
        try {
            r45.qn6 qn6Var = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().f346434b;
            if (qn6Var != null) {
                s(qn6Var.f384113d, qn6Var.f384121o, qn6Var.f384118i);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public void fetchSearchConfig(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "FetchSearchConfig invoked");
        su4.o2.f(null, yc1.p.CTRL_INDEX, 0L, null, true);
    }

    @android.webkit.JavascriptInterface
    public java.lang.String fetchUniformReddot(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "fetchUniformReddot() called with: params = [" + str + "]");
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                w(new org.json.JSONObject(str).optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, ""));
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "fetchUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String fetchUniformReddotList(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "fetchUniformReddot() called with: params = [" + str + "]");
        try {
            tm4.a aVar = new tm4.a();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("pathList");
                new java.util.ArrayList();
                if (optJSONArray != null) {
                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                        aVar.j().add(cn4.a.f43677a.a(optJSONArray.getJSONObject(i17).getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)));
                    }
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.d0(this, aVar));
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "fetchUniformReddotList  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getSearchData(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "getSearchData %s", str);
        if (o() != null) {
            ((com.tencent.mm.plugin.topstory.ui.home.j) o()).W = true;
        }
        long c17 = c01.id.c();
        r45.in6 in6Var = this.f175220g;
        wm4.u.b(in6Var, "getSearchData", c17);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            r45.in6 in6Var2 = new r45.in6();
            java.util.LinkedList linkedList = in6Var2.f377190o;
            in6Var2.f377191p = in6Var.f377191p;
            in6Var2.f377186h = jSONObject.optString("query", "");
            in6Var2.f377185g = jSONObject.optInt("offset", 0);
            in6Var2.f377187i = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 21);
            in6Var2.f377183e = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
            in6Var2.f377184f = jSONObject.optString("subSessionId", "");
            in6Var2.f377182d = jSONObject.optString("searchId", "");
            in6Var2.f377189n = jSONObject.optString("requestId", "");
            in6Var2.f377194s = jSONObject.optInt("tagId", 0);
            in6Var2.f377195t = jSONObject.optString("navigationId", "");
            in6Var2.f377198w = com.tencent.mm.plugin.websearch.l2.b();
            in6Var2.D = jSONObject.optBoolean("directRequest", false);
            in6Var2.B = jSONObject.optString("homeMsgId", "");
            in6Var2.C = jSONObject.optString("redPointMsgId", "");
            java.lang.String optString = jSONObject.optString("extReqParams", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                org.json.JSONArray jSONArray = new org.json.JSONArray(optString);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                    r45.x50 x50Var = new r45.x50();
                    x50Var.f389788d = jSONObject2.optString("key", "");
                    x50Var.f389789e = jSONObject2.optInt("uintValue", 0);
                    x50Var.f389790f = jSONObject2.optString("textValue", "");
                    linkedList.add(x50Var);
                }
            }
            java.util.LinkedList linkedList2 = this.f175221h;
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                linkedList.addAll(linkedList2);
            }
            if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0().size() > 0) {
                in6Var2.A = new r45.o33();
                for (com.tencent.mm.plugin.ball.model.BallInfo ballInfo : ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().p0()) {
                    int i18 = ballInfo.f93046d;
                    if (i18 == 2 || i18 == 50) {
                        java.lang.String g17 = ballInfo.g("rawUrl", "");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                            if (!g17.startsWith("https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s")) {
                                if (g17.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s")) {
                                }
                            }
                            r45.p33 p33Var = new r45.p33();
                            p33Var.f382695d = g17;
                            in6Var2.A.f381866d.add(p33Var);
                            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "add float ball url %s", g17);
                        }
                    }
                }
            }
            int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.search.RepairerConfigTopStoryPreRequest());
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "channelId = %s directRequest = %s preRequestMode = %s", java.lang.Integer.valueOf(in6Var2.f377194s), java.lang.Boolean.valueOf(in6Var2.D), java.lang.Integer.valueOf(h17));
            com.tencent.mm.plugin.topstory.ui.webview.j jVar = this.f175218e;
            if (h17 == 1) {
                jVar.d(in6Var2, true, in6Var2.D, o() == null ? 0 : ((com.tencent.mm.plugin.topstory.ui.home.j) o()).K);
            } else {
                if (h17 == 2) {
                    in6Var2.D = false;
                }
                java.lang.String c18 = jVar.c(in6Var2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(c18) || in6Var2.D) {
                    jVar.d(in6Var2, true, in6Var2.D, o() == null ? 0 : ((com.tencent.mm.plugin.topstory.ui.home.j) o()).K);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "use cache callback");
                    u(c18);
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "getSearchData", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @Override // aw4.l
    @android.webkit.JavascriptInterface
    public java.lang.String getSearchDisplayNameList(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(new org.json.JSONObject(str).optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                java.lang.String str2 = "";
                java.lang.String string = jSONObject.has(dm.i4.COL_ID) ? jSONObject.getString(dm.i4.COL_ID) : "";
                if (jSONObject.has("userName")) {
                    str2 = jSONObject.getString("userName");
                }
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(str2);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(dm.i4.COL_ID, string);
                jSONObject2.put("userName", str2);
                jSONObject2.put("displayName", e17);
                jSONArray2.put(jSONObject2);
            }
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("ret", 0);
            jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray2.toString());
            return jSONObject3.toString();
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e18, "getSearchDisplayNameList", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTopStoryTabConfig(java.lang.String str) {
        return su4.o2.d("topstoryTopTabParam").toString();
    }

    @android.webkit.JavascriptInterface
    public java.lang.String hideNavBarShadow(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl hideNavBarShadow %s", str);
        try {
            com.tencent.mm.plugin.topstory.ui.home.j jVar = (com.tencent.mm.plugin.topstory.ui.home.j) o();
            jVar.getClass();
            jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.s(jVar));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @Override // aw4.l
    public int k() {
        return 2;
    }

    public final void n(java.lang.String str, java.util.HashMap hashMap) {
        final java.lang.String a17 = nw4.x2.a(str, hashMap, false, "");
        this.f175219f.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.topstory.ui.webview.l$$d
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.topstory.ui.webview.l lVar = com.tencent.mm.plugin.topstory.ui.webview.l.this;
                lVar.getClass();
                com.tencent.mm.plugin.topstory.ui.webview.b.a(lVar, "wxadInvoke", a17);
            }
        });
    }

    public final com.tencent.mm.plugin.topstory.ui.home.a o() {
        av4.j jVar = this.f14326a;
        if (jVar != null) {
            return (com.tencent.mm.plugin.topstory.ui.home.a) jVar;
        }
        return null;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String observeUniformReddot(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "observeUniformReddot() called with: params = [" + str + "]");
        try {
            org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("paths");
            java.util.Set set = f175217m;
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    ((java.util.HashSet) set).add(optJSONArray.getString(i17));
                }
            } else {
                ((java.util.HashSet) set).clear();
            }
            ((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).ij(((com.tencent.mm.plugin.topstory.ui.home.j) o()).f174986d, this.f175224k);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "observeUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public void onWebPageUrlExposed(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("urlList");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int optInt = jSONObject.optInt("bizType", 0);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        java.lang.String optString = optJSONObject.optString("url", "");
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                            zq1.i0 i0Var = new zq1.i0();
                            i0Var.f474983a = optString;
                            i0Var.f474991i = optJSONObject.optString("extInfo", "");
                            i0Var.f474985c = 213;
                            i0Var.f474992j = optJSONObject.optInt("bizScene", 0);
                            i0Var.f474984b = optJSONObject.optString("prefetchId", "");
                            arrayList.add(i0Var);
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed bizType: %s, preAuthInfoList size: %s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(arrayList.size()));
                if (arrayList.isEmpty()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed preAuthList is empty");
                    return;
                } else if (optInt == 1) {
                    ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).i(arrayList);
                    return;
                } else {
                    ((yq1.x0) ((zq1.m0) gm0.j1.s(zq1.m0.class))).h(arrayList);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "onWebPageUrlExposed url list is empty");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "onWebPageUrlExposed exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String openProfileWithOpenId(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openProfileWithOpenId %s", str);
        try {
            java.lang.String string = new org.json.JSONObject(str).getString("openId");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                android.content.Context p17 = p();
                o11.g gVar = wm4.u.f447309a;
                sm4.d dVar = new sm4.d(string);
                gm0.j1.d().a(2830, new wm4.w(dVar, p17));
                gm0.j1.d().g(dVar);
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015e A[Catch: Exception -> 0x01f2, TryCatch #2 {Exception -> 0x01f2, blocks: (B:3:0x001f, B:11:0x0047, B:12:0x01e9, B:16:0x005e, B:20:0x0088, B:32:0x00ae, B:34:0x00b9, B:23:0x00c6, B:25:0x015e, B:26:0x0164, B:28:0x016a, B:30:0x0196, B:38:0x00c0, B:41:0x01a3), top: B:2:0x001f, inners: #1 }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String openSearchWebView(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.webview.l.openSearchWebView(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public java.lang.String openWeAppPage(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWeAppPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            appBrandStatObject.f87790f = 1115;
            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), jSONObject.getString("userName"), jSONObject.getString("appid"), jSONObject.optInt("debugMode", 0), 0, jSONObject.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH), appBrandStatObject);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "openWeAppPage", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String openWowColikeSetting(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openWowColikeSetting %s", str);
        try {
            wm4.u.t(((lf0.f0) ((pm4.u) i95.n0.c(pm4.u.class))).wi(), "normal");
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "openWowColikeSetting", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public final android.content.Context p() {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity;
        return (o() == null || (baseMvvmActivity = ((com.tencent.mm.plugin.topstory.ui.home.j) o()).f174986d) == null) ? com.tencent.mm.sdk.platformtools.x2.f193071a : baseMvvmActivity;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String postComments(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl postComments %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f175218e.getClass();
            gm0.j1.d().g(new sm4.f(jSONObject));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String preloadLiteApp(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp() called with: params = [" + str + "]");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("appId");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp fail. appId is null");
                return f().toString();
            }
            if (jSONObject.optBoolean("onlyUpdate", false)) {
                if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(optString) == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp update success.");
                    return g().toString();
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp update success.");
                return g().toString();
            }
            if (jSONObject.optBoolean("onlyDownload", false)) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(optString, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "preloadLiteApp download success.");
                return g().toString();
            }
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(p(), optString, jSONObject.has(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) ? jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) : "", jSONObject.optBoolean("onlyPreLoadBaseLib", false) ? "updateBaseLibPath" : "preloadLiteApp");
            return g().toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "observeUniformReddot  exception", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public final void q(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyJsEvent, fun = %s, granted = %s, dialogShowed = %s.", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.c0(this, z17, z18, str));
    }

    @android.webkit.JavascriptInterface
    public java.lang.String queryWebCommCgi(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl queryWebCommCgi %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("requestId", "");
            java.lang.String optString2 = jSONObject.optString("commReq", "");
            this.f175218e.getClass();
            gm0.j1.d().g(new sm4.a(optString, optString2));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    public void r(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.String str3) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("beginMsgId", str);
            jSONObject.put("endMsgId", str2);
            jSONObject.put("beginSeq", i17);
            jSONObject.put("endSeq", i18);
            jSONObject.put("reddotNum", i19);
            jSONObject.put("extInfo", str3);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.h0(this, jSONObject));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyNumReddotChange " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String renderFinish(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "renderFinish %s", str);
        try {
            ((com.tencent.mm.plugin.topstory.ui.home.j) o()).u();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "renderFinish error", new java.lang.Object[0]);
        }
        return g().toString();
    }

    public void s(java.lang.String str, long j17, int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("msgId", str);
            jSONObject.put("latestTimeStamp", j17);
            jSONObject.put("reddotType", i17);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.i0(this, jSONObject));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "notifyReddot " + e17.getMessage());
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String searchDataHasResult(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "searchDataHasResult %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int optInt = jSONObject.optInt("tagId", 0);
            int optInt2 = jSONObject.optInt("resultCount", 0);
            if (pm4.w.l(optInt)) {
                if (optInt2 > 0) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 1);
                } else {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_HAS_HAOKAN_RESULT_INT, 0);
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "searchDataHasResult", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String setComments(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl setComments %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f175218e.getClass();
            gm0.j1.d().g(new sm4.j(jSONObject));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String shareImage(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl shareImage %s", str);
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("imagePath");
            if (android.text.TextUtils.isEmpty(optString)) {
                return f().toString();
            }
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = ((com.tencent.mm.plugin.topstory.ui.home.j) o()).f174986d;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) baseMvvmActivity, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.topstory.ui.webview.q(this);
            k0Var.f211881s = new com.tencent.mm.plugin.topstory.ui.webview.r(this, baseMvvmActivity, optString);
            k0Var.f211854d = new com.tencent.mm.plugin.topstory.ui.webview.s(this);
            k0Var.v();
            return g().toString();
        } catch (java.lang.Throwable unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String showNavBarShadow(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl showNavBarShadow %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = jSONObject.getString("color");
            java.lang.String substring = string.substring(1, string.length());
            int i17 = (int) (jSONObject.getDouble("alpha") * 255.0d);
            int parseInt = java.lang.Integer.parseInt(substring, 16);
            com.tencent.mm.plugin.topstory.ui.home.j jVar = (com.tencent.mm.plugin.topstory.ui.home.j) o();
            jVar.getClass();
            jVar.f174986d.runOnUiThread(new com.tencent.mm.plugin.topstory.ui.home.r(jVar, parseInt, i17));
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String stage(java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "stage %s", str);
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.keys() != null) {
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    long optLong = jSONObject.optLong(next);
                    r45.in6 in6Var = this.f175220g;
                    if (optLong < 0) {
                        wm4.u.b(in6Var, next, c01.id.c());
                    } else {
                        wm4.u.b(in6Var, next, optLong);
                    }
                }
            }
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "stage", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String startSearchItemDetailPage(java.lang.String str) {
        boolean z17;
        android.content.Intent intent;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("jumpUrl", "");
            java.lang.String optString2 = jSONObject.optString("publishId", "");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KPublisherId", optString2);
            intent2.putExtra("srcUsername", jSONObject.optString("srcUserName"));
            intent2.putExtra("geta8key_scene", 64);
            int optInt = jSONObject.optInt("openScene", 10000);
            int optInt2 = jSONObject.optInt("subScene", -1);
            int optInt3 = jSONObject.optInt("itemType", -1);
            intent2.putExtra(com.tencent.mm.ui.w2.f211197j, optInt3);
            intent2.putExtra("KWebPrefetcherId", jSONObject.optString("prefetchId", ""));
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) / 1000;
            ((yq1.z) a0Var).getClass();
            java.lang.String a17 = ot0.g0.a(optString, optInt, optInt2, currentTimeMillis);
            intent2.putExtra("rawUrl", a17);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "jump url = %s, publishId = %s", a17, optString2);
            if (optInt3 == 5) {
                android.os.Bundle bundle = new android.os.Bundle();
                ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
                ot0.l1 l1Var = new ot0.l1();
                l1Var.f348602m = jSONObject.optString("srcUserName");
                l1Var.f348603n = jSONObject.optString("srcDisplayName");
                ot0.s0 s0Var = l1Var.f348606q;
                s0Var.f348762e = a17;
                s0Var.f348761d = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                l1Var.f348606q.f348769n = jSONObject.optString("digest");
                l1Var.f348606q.f348766i = jSONObject.optString("cover");
                ot0.s0 s0Var2 = l1Var.f348606q;
                s0Var2.f348770o = optInt3;
                s0Var2.f348765h = jSONObject.optInt("pubTime");
                l1Var.f348606q.f348774q = jSONObject.optInt("duration");
                l1Var.f348606q.E = jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
                l1Var.f348606q.F = jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
                l1Var.f348606q.G = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID);
                l1Var.b(bundle);
                intent2.putExtras(bundle);
                z17 = true;
            } else {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "openScene:%s, subScene:%s, itemType:%s", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt3));
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(7)) {
                intent = intent2;
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(((com.tencent.mm.plugin.topstory.ui.home.j) o()).f174986d, a17, optInt3, z17, optInt, optInt2, intent2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to TmplWebview");
                    return g().toString();
                }
            } else {
                intent = intent2;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "startSearchItemDetailPage jump to WebViewUI");
            j45.l.j(((com.tencent.mm.plugin.topstory.ui.home.j) o()).f174986d, "webview", ".ui.tools.WebViewUI", intent, null);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "reportSearchRealTimeReport", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public void t(java.lang.String str) {
        r45.in6 in6Var = this.f175220g;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("state", str);
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, in6Var.f377183e);
            jSONObject.put("subSessionId", in6Var.f377184f);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, in6Var.f377187i);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.x(this, jSONObject));
        } catch (java.lang.Exception unused) {
        }
    }

    public void u(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("json", str);
            jSONObject.put("newQuery", this.f175223j);
            jSONObject.put("isCache", false);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.g0(this, jSONObject));
        } catch (java.lang.Exception unused) {
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String updateNumReddot(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "lxl updateNumReddot %s", str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().k("", jSONObject.getLong("latestTimeStamp"), false, jSONObject.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ), true);
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "lxl updateNumReddot", new java.lang.Object[0]);
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String updateReddotTimeStamps(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "updateReddotTimeStamps %s", str);
        try {
            ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().J(new org.json.JSONObject(str).optLong("reddotTimeStamps", 0L));
            return g().toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "updateReddotTimeStamps", new java.lang.Object[0]);
            return f().toString();
        }
    }

    public void v(java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected: %s, %s, %s, %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("tabInfo", str);
            jSONObject.put("contentReddot", i17);
            jSONObject.put("numberReddot", i18);
            jSONObject.put("msgId", str2);
            jSONObject.put("isByScroll", z17);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TopStory.TopStoryWebViewJSApi", "onTabSelected json exception: " + e17.getMessage());
        }
        com.tencent.mm.plugin.topstory.ui.webview.b.a(this, "onTabSelected", jSONObject.toString());
    }

    public void w(java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "onUniformReddotDataChanged() called with: path = [" + str + "]");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.webview.f0(this, cn4.a.f43677a.a(str)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewJSApi", e17, "onUniformReddotDataChanged  exception", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String webViewUIReady(java.lang.String str) {
        r45.in6 in6Var = this.f175220g;
        try {
            if (this.f175223j) {
                this.f175223j = false;
                if (o() != null) {
                    com.tencent.mm.plugin.topstory.ui.home.j jVar = (com.tencent.mm.plugin.topstory.ui.home.j) o();
                    jVar.X = true;
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.topstory.ui.home.p(jVar));
                }
                wm4.u.b(in6Var, "webViewUIReady", c01.id.c());
                if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.search.RepairerConfigTopStoryLogTrace()) == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", wm4.u.x(in6Var));
                }
            }
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public void wxadInvoke(java.lang.String func, java.lang.String msg, final java.lang.String callbackId) {
        char c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "invoke: func:%s, msg:%s, callbackId:%s", func, msg, callbackId);
        if (!f175216l.contains(func)) {
            android.content.Context p17 = p();
            mf0.b0 b0Var = this.f175222i;
            ((aa5.a) b0Var).f2690a.f340889c = p17;
            com.tencent.mm.plugin.topstory.ui.webview.y yVar = new com.tencent.mm.plugin.topstory.ui.webview.y(this);
            aa5.a aVar = (aa5.a) b0Var;
            aVar.getClass();
            kotlin.jvm.internal.o.g(func, "func");
            kotlin.jvm.internal.o.g(msg, "msg");
            kotlin.jvm.internal.o.g(callbackId, "callbackId");
            aVar.f2690a.c(nw4.z2.c(func, msg, callbackId), yVar);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "doFunc,func:%s,msg:%s,callbackId:%s", func, msg, callbackId);
        func.getClass();
        int hashCode = func.hashCode();
        if (hashCode == -1150858339) {
            if (func.equals("launchApplication")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != -411577899) {
            if (hashCode == 1538465865 && func.equals("openWeApp")) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (func.equals("openFinderView")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        if (c17 == 0) {
            ((uz.e2) ((vz.p1) i95.n0.c(vz.p1.class))).wi(p(), new org.json.JSONObject(msg), new vz.o1() { // from class: com.tencent.mm.plugin.topstory.ui.webview.l$$a
                @Override // vz.o1
                public final void d(int i17, java.lang.String str) {
                    com.tencent.mm.plugin.topstory.ui.webview.l lVar = com.tencent.mm.plugin.topstory.ui.webview.l.this;
                    lVar.getClass();
                    java.util.HashMap hashMap = new java.util.HashMap(1);
                    if (i17 == 0) {
                        hashMap.put("err_msg", "launchApplication:ok");
                    } else {
                        hashMap.put("err_msg", "launchApplication:fail." + str);
                    }
                    lVar.n(callbackId, hashMap);
                }
            });
            return;
        }
        if (c17 == 1) {
            final java.util.HashMap hashMap = new java.util.HashMap(2);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.F(p(), msg, new zy2.i5() { // from class: com.tencent.mm.plugin.topstory.ui.webview.l$$b
                @Override // zy2.i5
                public final void a(java.lang.Object obj) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryWebViewJSApi", "retMsg:%s", obj.toString());
                    if (obj.getClass() == android.util.Pair.class) {
                        android.util.Pair pair = (android.util.Pair) obj;
                        int intValue = ((java.lang.Integer) pair.first).intValue();
                        java.lang.String str = (java.lang.String) pair.second;
                        java.util.HashMap hashMap2 = hashMap;
                        if (intValue == 0) {
                            hashMap2.put("err_msg", "openFinderView:ok");
                            hashMap2.put("feed_read_info", str);
                        } else {
                            hashMap2.put("err_msg", "openFinderViewfail,retCode:" + intValue);
                        }
                    }
                }
            }, null);
            if (hashMap.size() < 1) {
                hashMap.put("err_msg", "openFinderView:ok");
            }
            n(callbackId, hashMap);
            return;
        }
        if (c17 != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "func:%s not found", func);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(msg);
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        android.content.Context p18 = p();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7471f = p18;
        nxVar.f7466a = jSONObject.optString("userName");
        nxVar.f7473h = jSONObject.optString("appId");
        nxVar.f7467b = jSONObject.optString("relativeURL");
        nxVar.f7474i = jSONObject.optInt("appVersion", 0);
        nxVar.f7469d = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1238);
        nxVar.f7470e = jSONObject.optString("sceneNote");
        nxVar.f7476k = jSONObject.optString("downloadURL");
        nxVar.f7468c = jSONObject.optInt("openType", 0);
        nxVar.f7477l = jSONObject.optString("checkSumMd5");
        nxVar.f7479n = false;
        nxVar.f7480o.f70417f = jSONObject.optString("extJsonInfo");
        nxVar.A = jSONObject.optString("privateExtraData");
        nxVar.E = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String optString = jSONObject.optString("adUxInfo");
        nxVar.B = optString;
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryWebViewJSApi", "doOpenWeApp param lose adUxInfo");
        } else {
            qp3.a.c("WebViewUI", "openWeApp", nxVar.B, "topStory");
        }
        startAppBrandUIFromOuterEvent.e();
        java.util.HashMap hashMap2 = new java.util.HashMap(1);
        am.ox oxVar = startAppBrandUIFromOuterEvent.f54858h;
        if (oxVar.f7581a) {
            hashMap2.put("err_msg", "openWeApp:ok");
        } else {
            java.lang.String str = oxVar.f7582b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            hashMap2.put("err_msg", "openWeApp:fail:".concat(str));
        }
        n(callbackId, hashMap2);
    }
}
