package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class q0 implements com.tencent.mm.modelbase.u0, su4.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f181591d;

    /* renamed from: f, reason: collision with root package name */
    public long f181593f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f181594g;

    /* renamed from: h, reason: collision with root package name */
    public volatile su4.z1 f181595h;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f181599o;

    /* renamed from: p, reason: collision with root package name */
    public final rk4.o5 f181600p;

    /* renamed from: q, reason: collision with root package name */
    public dv4.k f181601q;

    /* renamed from: r, reason: collision with root package name */
    public dv4.l f181602r;

    /* renamed from: s, reason: collision with root package name */
    public su4.q1 f181603s;

    /* renamed from: e, reason: collision with root package name */
    public final o13.x f181592e = new com.tencent.mm.plugin.websearch.f0(this);

    /* renamed from: i, reason: collision with root package name */
    public final su4.j1 f181596i = new com.tencent.mm.plugin.websearch.h0(this);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f181597m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final su4.q0 f181598n = new su4.q0();

    public q0() {
        com.tencent.mm.plugin.websearch.j0 j0Var = new com.tencent.mm.plugin.websearch.j0(this);
        this.f181600p = j0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "create FTSWebViewLogic");
        this.f181594g = new java.util.HashMap();
        this.f181591d = java.util.Collections.synchronizedSet(new java.util.HashSet());
        ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(j0Var);
        gm0.j1.d().a(2975, this);
    }

    public boolean a(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "doSearchWebQuery %s", map.toString());
        gm0.j1.d().g(new su4.s1(com.tencent.mm.plugin.websearch.l2.f(map, "requestId"), com.tencent.mm.plugin.websearch.l2.f(map, "commReq"), com.tencent.mm.plugin.websearch.l2.e(map, "webview_instance_id", -1)));
        return false;
    }

    public su4.c b(int i17, int i18, boolean z17) {
        java.lang.String a17 = su4.c.a(ys3.l.a(), i17, i18, true);
        java.util.HashMap hashMap = this.f181594g;
        if (hashMap.get(a17) == null) {
            su4.c cVar = new su4.c();
            cVar.d(ys3.l.a(), i17, i18);
            hashMap.put(a17, cVar);
        }
        return (su4.c) hashMap.get(a17);
    }

    public java.lang.String c(int i17, int i18, boolean z17) {
        java.lang.String a17 = su4.c.a(ys3.l.a(), i17, i18, z17);
        java.util.HashMap hashMap = this.f181594g;
        if (hashMap.get(a17) == null) {
            su4.c cVar = new su4.c();
            cVar.d(ys3.l.a(), i17, i18);
            hashMap.put(a17, cVar);
        }
        su4.c cVar2 = (su4.c) hashMap.get(a17);
        java.lang.String str = cVar2.c() ? cVar2.f412826c : "";
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str;
    }

    public final void d(dv4.l lVar, int i17, int i18, int i19) {
        java.lang.String str;
        lVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (lVar.f244016e && i17 >= 0 && i18 > 0) {
            int i27 = (i18 + i17) - 1;
            if (i27 > lVar.f244014c.size() - 1) {
                i27 = lVar.f244014c.size() - 1;
            }
            if (i27 >= i17) {
                try {
                    jSONObject.put("continueFlag", i27 == lVar.f244014c.size() - 1 ? 0 : 1);
                    jSONObject.put("offset", i27 + 1);
                    jSONObject.put("query", lVar.f243997a);
                    jSONObject.put("ret", 0);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("count", (i27 - i17) + 1);
                    jSONObject2.put("totalCount", c01.e2.p());
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    while (i17 <= i27) {
                        p13.y yVar = (p13.y) lVar.f244014c.get(i17);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true);
                        jSONObject3.put("userName", n17.d1());
                        jSONObject3.put("nickName", n17.P0());
                        lVar.b(yVar, n17, jSONObject3);
                        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(n17.d1());
                        if (n07 != null) {
                            str = n07.d();
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                str = n07.c();
                            }
                        } else {
                            str = "";
                        }
                        jSONObject3.put("thumbUrl", str);
                        jSONArray.put(jSONObject3);
                        i17++;
                    }
                    jSONObject2.put("items", jSONArray);
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    jSONArray2.put(jSONObject2);
                    jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray2);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("JsapiFtsMatchContact", e17, "", new java.lang.Object[0]);
                }
            }
        }
        ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i19);
        a17.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fts_key_json_data", jSONObject.toString());
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
            if (z0Var != null) {
                z0Var.callback(137, bundle);
            }
        } catch (android.os.RemoteException e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + e18.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap] */
    public java.lang.String e(java.lang.String str) {
        ?? emptyMap;
        if (android.text.TextUtils.isEmpty(str)) {
            emptyMap = java.util.Collections.emptyMap();
        } else {
            emptyMap = new java.util.HashMap();
            android.net.Uri parse = android.net.Uri.parse(str);
            new java.util.HashSet();
            for (java.lang.String str2 : parse.getQueryParameterNames()) {
                emptyMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        if (emptyMap == 0) {
            return null;
        }
        java.lang.Object obj = emptyMap.get("search_click_id");
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public boolean f(java.util.Map map) {
        int i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData: %s", map);
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        int e18 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
        int e19 = com.tencent.mm.plugin.websearch.l2.e(map, "requestType", 0);
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(map.get("webview_instance_id"), -1);
        java.lang.String str = (java.lang.String) map.get("requestId");
        java.lang.String str2 = (java.lang.String) map.get("guideInfo");
        java.lang.String str3 = (java.lang.String) map.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        int e27 = com.tencent.mm.plugin.websearch.l2.e(map, "nativeReqType", 0);
        boolean c17 = com.tencent.mm.plugin.websearch.l2.c(map, "ignoreCache", false);
        if (e19 == 0) {
            su4.c b17 = b(e17, e18, true);
            if (!b17.c() || c17) {
                ((com.tencent.mm.plugin.websearch.d2) ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).Zi()).f181432o).d(2, str, java.lang.Integer.valueOf(o17), new com.tencent.mm.plugin.websearch.g0(this, o17, map, e17, e18, str, str3, str2, e27), this.f181596i);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getTeachSearchData hit the cache: webviewID = %d %d %d %d %d, data %s", java.lang.Integer.valueOf(o17), java.lang.Integer.valueOf(b17.f412824a), java.lang.Long.valueOf(b17.f412827d), java.lang.Long.valueOf(b17.f412828e), java.lang.Integer.valueOf(b17.f412825b), b17.f412826c);
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(o17, e19, b17.f412826c, 1, str);
                int i18 = b17.f412824a;
                if (i18 == 20 && (i17 = b17.f412825b) == 0) {
                    su4.k3.b(i18, 0, b17.f412829f, i17, 2, b17.b(), 1);
                } else {
                    su4.k3.b(i18, 0, b17.f412829f, b17.f412825b, 1, "", 0);
                }
            }
        } else {
            r45.hq4 c18 = su4.t2.c();
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                for (int size = c18.f376386d.size() - 1; size >= 0; size--) {
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    r45.gq4 gq4Var = (r45.gq4) c18.f376386d.get(size);
                    if (c01.e2.J(gq4Var.f375483d)) {
                        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                        java.lang.String str4 = gq4Var.f375483d;
                        ((qv.o) u2Var).getClass();
                        java.lang.String str5 = r01.z.b(str4).field_brandIconURL;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                            jSONObject3.put("avatarUrl", str5);
                            jSONObject3.put("userName", gq4Var.f375483d);
                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                            java.lang.String str6 = gq4Var.f375483d;
                            ((sg3.a) v0Var).getClass();
                            jSONObject3.put("nickName", c01.a2.e(str6));
                            jSONArray2.put(jSONObject3);
                        }
                    }
                }
                jSONObject2.put("items", jSONArray2);
                jSONObject2.put("type", 5);
                jSONObject2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
                jSONArray.put(jSONObject2);
                jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray);
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Zi(o17, 1, jSONObject.toString(), 1, str);
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e28, "gen mostSearchBizContactList error", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public java.lang.String g(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            jSONObject.put("searchClickId", str);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final org.json.JSONObject h(r45.e64 e64Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("latitude", e64Var.f373047e);
            jSONObject.put("longitude", e64Var.f373046d);
            jSONObject.put("precision", e64Var.f373048f);
            jSONObject.put("macAddr", e64Var.f373047e);
            jSONObject.put("cellId", e64Var.f373047e);
            jSONObject.put("gpsSource", e64Var.f373047e);
            jSONObject.put("address", e64Var.f373047e);
            return jSONObject;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e17, "", new java.lang.Object[0]);
            return new org.json.JSONObject();
        }
    }

    public final su4.e i(java.util.Map map) {
        su4.e eVar = new su4.e();
        eVar.f412863a = com.tencent.mm.plugin.websearch.l2.f(map, "userName");
        eVar.f412864b = com.tencent.mm.plugin.websearch.l2.f(map, "nickName");
        eVar.f412865c = com.tencent.mm.plugin.websearch.l2.f(map, "alias");
        eVar.f412867e = com.tencent.mm.plugin.websearch.l2.f(map, "signature");
        eVar.f412866d = com.tencent.mm.plugin.websearch.l2.e(map, "sex", 0);
        eVar.f412868f = com.tencent.mm.plugin.websearch.l2.f(map, "country");
        eVar.f412870h = com.tencent.mm.plugin.websearch.l2.f(map, "city");
        eVar.f412869g = com.tencent.mm.plugin.websearch.l2.f(map, "province");
        eVar.f412871i = com.tencent.mm.plugin.websearch.l2.e(map, "snsFlag", 0);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "query");
        if (com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            eVar.f412873k = 3;
        } else {
            int i17 = java.lang.Character.isDigit(f17.charAt(0)) ? 15 : 3;
            eVar.f412873k = i17;
            if (i17 == 15) {
                if ("mobile".equals(com.tencent.mm.plugin.websearch.l2.f(map, "matchType"))) {
                    eVar.f412872j = f17;
                } else {
                    eVar.f412873k = 1;
                }
            }
        }
        return eVar;
    }

    public final su4.d j(java.util.Map map) {
        su4.d dVar = new su4.d();
        dVar.f412834a = com.tencent.mm.plugin.websearch.l2.f(map, "userName");
        dVar.f412835b = com.tencent.mm.plugin.websearch.l2.f(map, "nickName");
        dVar.f412836c = com.tencent.mm.plugin.websearch.l2.f(map, "headHDImgUrl");
        dVar.f412838e = com.tencent.mm.plugin.websearch.l2.e(map, "verifyFlag", 0);
        dVar.f412837d = com.tencent.mm.plugin.websearch.l2.f(map, "signature");
        dVar.f412839f = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        dVar.f412840g = com.tencent.mm.plugin.websearch.l2.e(map, "sceneActionType", 1);
        r45.va0 va0Var = new r45.va0();
        dVar.f412841h = va0Var;
        va0Var.f388021d = com.tencent.mm.plugin.websearch.l2.e(map, "brandFlag", 0);
        dVar.f412841h.f388024g = com.tencent.mm.plugin.websearch.l2.f(map, "iconUrl");
        dVar.f412841h.f388023f = com.tencent.mm.plugin.websearch.l2.f(map, "brandInfo");
        dVar.f412841h.f388022e = com.tencent.mm.plugin.websearch.l2.f(map, "externalInfo");
        dVar.f412842i = com.tencent.mm.plugin.websearch.l2.f(map, "searchId");
        dVar.f412843j = com.tencent.mm.plugin.websearch.l2.f(map, "searchClickId");
        dVar.f412844k = com.tencent.mm.plugin.websearch.l2.f(map, "query");
        dVar.f412845l = com.tencent.mm.plugin.websearch.l2.e(map, "position", 0);
        dVar.f412846m = com.tencent.mm.plugin.websearch.l2.c(map, "isCurrentDetailPage", false);
        dVar.f412847n = com.tencent.mm.plugin.websearch.l2.f(map, "extraParams");
        dVar.f412848o = com.tencent.mm.plugin.websearch.l2.e(map, "friendScene", 0);
        dVar.f412850q = com.tencent.mm.plugin.websearch.l2.e(map, "bizType", 0);
        dVar.f412851r = java.lang.Boolean.valueOf(com.tencent.mm.plugin.websearch.l2.c(map, "isFromWebSearch", false));
        if (com.tencent.mm.plugin.websearch.l2.e(map, "bizTabType", 0) == 2) {
            dVar.f412849p = 1;
        } else {
            dVar.f412849p = 0;
        }
        return dVar;
    }

    public void k(vu4.k kVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(kVar);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("requestId", java.util.UUID.randomUUID().toString());
        linkedHashMap.put("commReq", new org.json.JSONObject(kz5.c1.k(new jz5.l("cgiName", "MMDataReport"), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, kz5.c1.k(new jz5.l("clientversion", java.lang.Integer.valueOf(o45.wf.f343029g)), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME, java.lang.Integer.valueOf(o45.wf.f343023a)), new jz5.l(ya.b.ITEM_LIST, arrayList.toString())))).toString()));
        a(linkedHashMap);
    }

    public boolean l(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchRealTimeReport: %s", map.toString());
        r45.lq5 lq5Var = new r45.lq5();
        lq5Var.f379756t = com.tencent.mm.plugin.websearch.l2.f(map, "logString");
        gm0.j1.d().a(1134, this);
        gm0.j1.d().g(new su4.a2(lq5Var));
        return false;
    }

    public boolean m(java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchStatistics: %s", map.toString());
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "logId", 0);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "logString");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(com.tencent.mm.plugin.websearch.l2.c(map, "isReportNow", false));
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(com.tencent.mm.plugin.websearch.l2.c(map, "isImportant", false));
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(com.tencent.mm.plugin.websearch.l2.c(map, "isIgnoreFreq", false));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "reportSearchStatistics reporting %d, logString %s, isReportNow %s, isImportant %s, isIgnoreFreq %s", java.lang.Integer.valueOf(e17), f17, valueOf, valueOf2, valueOf3);
        jx3.f.INSTANCE.p(e17, f17, valueOf.booleanValue(), valueOf2.booleanValue(), valueOf3.booleanValue());
        return false;
    }

    public boolean n(java.util.Map map, int i17) {
        int parseColor;
        boolean z17;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPage %s", map.toString());
        this.f181598n.f413043d = true;
        boolean c17 = com.tencent.mm.plugin.websearch.l2.c(map, "isTeachPage", false);
        boolean c18 = com.tencent.mm.plugin.websearch.l2.c(map, "isMoreButton", false);
        boolean z18 = com.tencent.mm.plugin.websearch.l2.e(map, "isFeedBack", 0) == 1;
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "srcUserName");
        java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(map, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.String str = (java.lang.String) map.get("navBarColor");
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "subType", 0);
        com.tencent.mm.plugin.websearch.l2.f(map, "searchPlaceHolder");
        java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(map, "jumpUrl");
        java.lang.String f27 = com.tencent.mm.plugin.websearch.l2.f(map, "searchClickId");
        int i18 = (com.tencent.mm.sdk.platformtools.t8.K0(f19) || !(f19.contains("http://mp.weixin.qq.com/imgretrieval") || f19.contains("https://mp.weixin.qq.com/imgretrieval"))) ? -1 : 3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            parseColor = 0;
        } else {
            try {
                parseColor = android.graphics.Color.parseColor(str);
            } catch (java.lang.IllegalArgumentException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPage: " + e18.getMessage());
                return true;
            }
        }
        java.lang.String str2 = (java.lang.String) map.get("statusBarStyle");
        if (z18) {
            java.lang.String f28 = com.tencent.mm.plugin.websearch.l2.f(map, "jumpUrl");
            if (i17 != -1) {
                ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
                bundle3 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17).z6();
            } else {
                bundle3 = null;
            }
            r(f28, bundle3, 0, "", "", 0, "", 0, 0, "");
        } else {
            int e19 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
            int i19 = i18;
            int e27 = com.tencent.mm.plugin.websearch.l2.e(map, "opType", 0);
            if (e27 > 0) {
                if (e27 == 2) {
                    o(j(map), c17);
                } else if (e27 == 3) {
                    su4.d j17 = j(map);
                    if (c01.e2.J(j17.f412834a)) {
                        java.lang.String f29 = com.tencent.mm.plugin.websearch.l2.f(map, "url");
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPageBizChatting: " + j17.f412834a);
                        su4.t2.a(j17.f412834a);
                        if (!av4.r0.g(com.tencent.mm.sdk.platformtools.x2.f193071a, j17.f412834a)) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("Chat_User", j17.f412834a);
                            intent.putExtra("finish_direct", true);
                            intent.putExtra("key_temp_session_show_type", 0);
                            intent.putExtra("preChatTYPE", 9);
                            int i27 = 7;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(f29) && !com.tencent.mm.sdk.platformtools.t8.K0(f29)) {
                                try {
                                    i27 = com.tencent.mm.sdk.platformtools.t8.P(android.net.Uri.parse(f29).getQueryParameter("openArticleScene"), 7);
                                } catch (java.lang.Exception e28) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "getOpenArticleSceneFromUrl exp:%s", e28);
                                }
                            }
                            intent.putExtra("KOpenArticleSceneFromScene", i27);
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPageBizChatting openArticleScene:%d", java.lang.Integer.valueOf(i27));
                            intent.putExtra("specific_chat_from_scene", 3);
                            if (java.util.Objects.equals(j17.f412834a, "gh_25d9ac85a4bc") && ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Ui()) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "startSearchItemDetailPageBizChatting with GamePlugin and LiteApp!");
                                intent.putExtra("game_plugun_click_time", java.lang.System.currentTimeMillis());
                                ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).hj(com.tencent.mm.sdk.platformtools.x2.f193071a, intent);
                            } else {
                                j45.l.u(com.tencent.mm.sdk.platformtools.x2.f193071a, ".ui.chatting.ChattingUI", intent, null);
                            }
                        }
                    } else {
                        o(j17, c17);
                    }
                } else if (e27 == 4) {
                    java.lang.String f37 = com.tencent.mm.plugin.websearch.l2.f(map, "jumpUrl");
                    if (i17 != -1) {
                        ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
                        bundle2 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17).z6();
                    } else {
                        bundle2 = null;
                    }
                    r(f37, bundle2, 0, "", "", 0, "", 0, 0, "");
                }
            } else {
                if (!c18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "doStartSearchItemDetailPage: type=%d link=%s", java.lang.Integer.valueOf(e19), (java.lang.String) map.get("url"));
                    if (e19 == 1) {
                        z17 = false;
                        o(j(map), false);
                    } else if (e19 == 8) {
                        z17 = false;
                        q(com.tencent.mm.plugin.websearch.l2.f(map, "snsid"), com.tencent.mm.plugin.websearch.l2.f(map, "objectXmlDesc"), com.tencent.mm.plugin.websearch.l2.f(map, "userName"), com.tencent.mm.plugin.websearch.l2.c(map, "fromMusicItem", false));
                    } else if (e19 != 32) {
                        java.lang.String f38 = com.tencent.mm.plugin.websearch.l2.f(map, "jumpUrl");
                        java.lang.String f39 = com.tencent.mm.plugin.websearch.l2.f(map, "publishId");
                        int e29 = com.tencent.mm.plugin.websearch.l2.e(map, "payScene", 0);
                        int e37 = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWebViewLogic", "jump url = %s, publishId = %s, payScene = %d", f38, f39, java.lang.Integer.valueOf(e29));
                        java.lang.String f47 = com.tencent.mm.plugin.websearch.l2.f(map, "cookie");
                        if (i17 != -1) {
                            ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).getClass();
                            bundle = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17).z6();
                        } else {
                            bundle = null;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(f38)) {
                            s(f38, bundle, parseColor, str2, f39, e29, f17, e37, e17, f47, i19, f27);
                        }
                    } else {
                        p(i(map));
                    }
                    return z17;
                }
                java.lang.String f48 = com.tencent.mm.plugin.websearch.l2.f(map, "query");
                int e38 = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
                java.lang.String f49 = com.tencent.mm.plugin.websearch.l2.f(map, "searchId");
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent2.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                intent2.putExtra("neverGetA8Key", true);
                intent2.putExtra("key_load_js_without_delay", true);
                intent2.putExtra("ftsQuery", f48);
                intent2.putExtra("ftsType", e19);
                intent2.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f18);
                java.util.Map c19 = su4.r2.c(e38, false, e19, "");
                if (tg0.r2.a(e38)) {
                    ((java.util.HashMap) c19).put("query", f48);
                } else {
                    try {
                        ((java.util.HashMap) c19).put("query", fp.s0.b(f48, com.tencent.mapsdk.internal.rv.f51270c));
                    } catch (java.lang.Exception unused) {
                        ((java.util.HashMap) c19).put("query", f48);
                    }
                }
                java.util.HashMap hashMap = (java.util.HashMap) c19;
                hashMap.put("searchId", f49);
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f18);
                java.lang.String f57 = su4.r2.f(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0));
                hashMap.put("subSessionId", f57);
                intent2.putExtra("subSessionId", f57);
                intent2.putExtra("rawUrl", su4.r2.e(c19, 0));
                intent2.putExtra("key_session_id", f18);
                intent2.putExtra("searchId", f49);
                if (e38 == 20 || e38 == 22 || e38 == 24 || e38 == 33) {
                    j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.fts.MMFTSSOSMoreWebViewUI", intent2, null);
                } else {
                    j45.l.z(com.tencent.mm.sdk.platformtools.x2.f193071a, intent2, null);
                }
            }
        }
        z17 = false;
        return z17;
    }

    public final void o(su4.d dVar, boolean z17) {
        int i17 = dVar.f412848o;
        if (i17 == 0) {
            if (dVar.f412840g == 2) {
                i17 = 89;
            } else if (z17) {
                i17 = 85;
            } else {
                int i18 = dVar.f412839f;
                i17 = (i18 == 3 || i18 == 16) ? dVar.f412846m ? 88 : 87 : 39;
            }
        }
        su4.t2.a(dVar.f412834a);
        if (av4.r0.g(com.tencent.mm.sdk.platformtools.x2.f193071a, dVar.f412834a)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", dVar.f412834a);
        intent.putExtra("Contact_Nick", dVar.f412835b);
        intent.putExtra("Contact_BrandIconURL", dVar.f412836c);
        intent.putExtra("Contact_Signature", dVar.f412837d);
        intent.putExtra("Contact_VUser_Info_Flag", dVar.f412838e);
        intent.putExtra("Contact_Scene", i17);
        intent.putExtra("is_from_web_search", dVar.f412851r);
        r45.va0 va0Var = dVar.f412841h;
        if (va0Var != null) {
            try {
                intent.putExtra("Contact_customInfo", va0Var.toByteArray());
            } catch (java.io.IOException unused) {
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("Contact_Ext_Args_Search_Id", dVar.f412842i);
        bundle.putString("Contact_Ext_Args_Search_Click_Id", dVar.f412843j);
        bundle.putString("Contact_Ext_Args_Query_String", dVar.f412844k);
        intent.putExtra("KOpenArticleSceneFromScene", 7);
        bundle.putInt("Contact_Scene", i17);
        bundle.putInt("Contact_Ext_Args_Index", dVar.f412845l);
        bundle.putString("Contact_Ext_Extra_Params", dVar.f412847n);
        intent.putExtra("preChatTYPE", 10);
        intent.putExtra("Contact_Ext_Args", bundle);
        intent.putExtra("biz_profile_tab_type", dVar.f412849p);
        intent.putExtra("biz_type", dVar.f412850q);
        intent.putExtra("force_get_contact", true);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof su4.z1) {
            if (m1Var == this.f181595h) {
                gm0.j1.d().q(1048, this);
                this.f181595h = null;
            } else {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(m1Var.hashCode());
                objArr[1] = this.f181595h != null ? java.lang.String.valueOf(this.f181595h.hashCode()) : "null";
                com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.FTSWebViewLogic", "onSceneEnd NetSceneWebSearchGuide mismatch, scene=%d, current=%s, skip removeListener", objArr);
            }
            su4.z1 z1Var = (su4.z1) m1Var;
            ((com.tencent.mm.plugin.websearch.d2) ((com.tencent.mm.plugin.websearch.a0) ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).Zi()).f181432o).b(2, z1Var.f413153m, new com.tencent.mm.plugin.websearch.p0(i17, i18, z1Var), this.f181596i);
            return;
        }
        if (m1Var instanceof su4.a2) {
            gm0.j1.d().q(1134, this);
            return;
        }
        if (m1Var instanceof su4.v1) {
            gm0.j1.d().q(1866, this);
            if (i17 == 0 && i18 == 0) {
                su4.v1 v1Var = (su4.v1) m1Var;
                if (v1Var.f413117h != -1) {
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Ri(v1Var.f413117h, ((r45.o77) v1Var.f413113d.f70711b.f70700a).f382013d, 0, 0, 0);
                }
                su4.g2 g2Var = v1Var.f413118i;
                if (g2Var != null) {
                    ((java.util.HashMap) this.f181597m).put(java.lang.Integer.valueOf(g2Var.f412897a), v1Var.f413118i);
                    return;
                }
                return;
            }
            return;
        }
        try {
            if (m1Var instanceof su4.q1) {
                gm0.j1.d().q(2999, this);
                su4.q1 q1Var = (su4.q1) m1Var;
                java.lang.String str2 = q1Var.f413049o.f374929d;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str3 = str2 != null ? str2 : "";
                if (q1Var.f413048n == -1) {
                    return;
                }
                zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
                int i19 = q1Var.f413048n;
                ((jw4.e) l3Var).getClass();
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i19);
                a17.getClass();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("fts_key_json_data", str3);
                bundle.putString("fts_key_err_msg", str);
                bundle.putInt("fts_key_ret_code", i18);
                com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
                if (z0Var != null) {
                    z0Var.callback(152, bundle);
                }
            } else {
                if (!(m1Var instanceof su4.s1)) {
                    return;
                }
                su4.s1 s1Var = (su4.s1) m1Var;
                java.lang.String str4 = ((r45.e97) s1Var.f413089e.f70711b.f70700a).f373181d;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str4 == null) {
                    str4 = "";
                }
                if (s1Var.f413092h == -1) {
                    return;
                }
                zg0.l3 l3Var2 = (zg0.l3) i95.n0.c(zg0.l3.class);
                int i27 = s1Var.f413092h;
                java.lang.String str5 = s1Var.f413091g;
                ((jw4.e) l3Var2).getClass();
                qx4.d0 a18 = qx4.d0.f367392m.a(i27);
                if (a18 != null) {
                    pm0.v.X(new qx4.v(str4, a18, str5, i18, str));
                    return;
                }
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a19 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i27);
                a19.getClass();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("fts_key_id", str5);
                bundle2.putString("fts_key_json_data", str4);
                bundle2.putString("fts_key_err_msg", str);
                bundle2.putInt("fts_key_ret_code", i18);
                com.tencent.mm.plugin.webview.stub.z0 z0Var2 = a19.f184998y;
                if (z0Var2 != null) {
                    z0Var2.callback(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, bundle2);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void p(su4.e eVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", eVar.f412863a);
        intent.putExtra("Contact_Nick", eVar.f412864b);
        intent.putExtra("Contact_Alias", eVar.f412865c);
        intent.putExtra("Contact_Sex", eVar.f412866d);
        intent.putExtra("Contact_Scene", eVar.f412873k);
        intent.putExtra("Contact_KHideExpose", true);
        intent.putExtra("Contact_RegionCode", com.tencent.mm.storage.ha.q(eVar.f412868f, eVar.f412869g, eVar.f412870h));
        intent.putExtra("Contact_Signature", eVar.f412867e);
        intent.putExtra("Contact_KSnsIFlag", eVar.f412871i);
        intent.putExtra("Contact_full_Mobile_MD5", eVar.f412872j);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public final void q(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.protocal.protobuf.TimeLineObject Ai = ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Ai(str2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("INTENT_TALKER", str3);
        intent.putExtra("INTENT_SNSID", new java.math.BigInteger(Ai.Id).longValue());
        intent.putExtra("SNS_FROM_MUSIC_ITEM", z17);
        try {
            intent.putExtra("INTENT_SNS_TIMELINEOBJECT", Ai.toByteArray());
        } catch (java.io.IOException unused) {
        }
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "sns", ".ui.SnsCommentDetailUI", intent, null);
    }

    public final void r(java.lang.String str, android.os.Bundle bundle, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, int i27, java.lang.String str5) {
        s(str, bundle, i17, str2, str3, i18, str4, i19, i27, str5, -1, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r17, android.os.Bundle r18, int r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, int r24, int r25, java.lang.String r26, int r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.q0.s(java.lang.String, android.os.Bundle, int, java.lang.String, java.lang.String, int, java.lang.String, int, int, java.lang.String, int, java.lang.String):void");
    }

    public void t() {
        if (this.f181595h != null) {
            gm0.j1.d().q(1048, this);
            gm0.j1.d().d(this.f181595h);
            this.f181595h = null;
        }
    }
}
