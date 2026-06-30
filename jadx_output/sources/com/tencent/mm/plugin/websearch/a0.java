package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class a0 implements com.tencent.mm.modelbase.u0, su4.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static final long f181422u = com.tencent.mm.ui.b2.f197206c + 500;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f181423v = 0;

    /* renamed from: e, reason: collision with root package name */
    public r45.v97 f181425e;

    /* renamed from: f, reason: collision with root package name */
    public r45.v97 f181426f;

    /* renamed from: h, reason: collision with root package name */
    public volatile su4.r1 f181428h;

    /* renamed from: i, reason: collision with root package name */
    public long f181429i;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f181431n;

    /* renamed from: o, reason: collision with root package name */
    public final su4.y0 f181432o;

    /* renamed from: s, reason: collision with root package name */
    public p13.c f181436s;

    /* renamed from: d, reason: collision with root package name */
    public int f181424d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f181427g = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final dv4.k f181430m = new dv4.f();

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.y f181433p = new com.tencent.mm.plugin.websearch.y(this, null);

    /* renamed from: q, reason: collision with root package name */
    public final su4.j1 f181434q = new com.tencent.mm.plugin.websearch.u(this);

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.websearch.z f181435r = new com.tencent.mm.plugin.websearch.z(this, null);

    /* renamed from: t, reason: collision with root package name */
    public final o13.x f181437t = new com.tencent.mm.plugin.websearch.v(this);

    public a0() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3("WebSearchLogic_worker");
        this.f181431n = n3Var;
        this.f181432o = new com.tencent.mm.plugin.websearch.d2(n3Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(11:3|4|7|(1:9)|(1:11)|12|13|14|(1:16)|(1:18)|20)(6:53|(4:55|(4:58|(3:60|61|62)(1:64)|63|56)|65|66)|67|68|(1:70)(1:72)|71)|24|25|7|(0)|(0)|12|13|14|(0)|(0)|20) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019f A[Catch: JSONException -> 0x01ab, TryCatch #0 {JSONException -> 0x01ab, blocks: (B:14:0x018a, B:16:0x019f, B:18:0x01a6), top: B:13:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a6 A[Catch: JSONException -> 0x01ab, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01ab, blocks: (B:14:0x018a, B:16:0x019f, B:18:0x01a6), top: B:13:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(p13.y r17, p13.r r18) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.a0.a(p13.y, p13.r):org.json.JSONObject");
    }

    public final su4.r1 b(java.util.Map map) {
        r45.v97 v97Var;
        int e17 = com.tencent.mm.plugin.websearch.l2.e(map, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        su4.r1 r1Var = new su4.r1();
        java.util.LinkedList linkedList = r1Var.f413075o;
        r1Var.f413062b = com.tencent.mm.plugin.websearch.l2.f(map, "query");
        r1Var.f413063c = com.tencent.mm.plugin.websearch.l2.e(map, "offset", 0);
        r1Var.f413064d = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
        r1Var.f413066f = e17;
        r1Var.f413069i = com.tencent.mm.plugin.websearch.l2.f(map, "sugId");
        r1Var.f413071k = com.tencent.mm.plugin.websearch.l2.e(map, "sugType", 0);
        r1Var.f413070j = com.tencent.mm.plugin.websearch.l2.f(map, "prefixSug");
        r1Var.f413084x = com.tencent.mm.plugin.websearch.l2.f(map, "poiInfo");
        r1Var.f413061a = com.tencent.mm.plugin.websearch.l2.c(map, "isHomePage", false) ? 1 : 0;
        r1Var.f413067g = com.tencent.mm.plugin.websearch.l2.f(map, "searchId");
        if (map.containsKey(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID)) {
            r1Var.f413082v = com.tencent.mm.plugin.websearch.l2.f(map, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        }
        r1Var.f413068h = com.tencent.mm.plugin.websearch.l2.e(map, "sceneActionType", 1);
        com.tencent.mm.plugin.websearch.l2.e(map, "displayPattern", 2);
        r1Var.f413073m = com.tencent.mm.plugin.websearch.l2.e(map, "sugPosition", 0);
        com.tencent.mm.plugin.websearch.l2.f(map, "sugBuffer");
        r1Var.f413085y = com.tencent.mm.plugin.websearch.l2.f(map, "requestId");
        r1Var.f413082v = com.tencent.mm.plugin.websearch.l2.f(map, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        r1Var.f413083w = com.tencent.mm.plugin.websearch.l2.f(map, "subSessionId");
        com.tencent.mm.plugin.websearch.l2.f(map, "tagId");
        r1Var.D = com.tencent.mm.plugin.websearch.l2.c(map, "fromTagSearch", false);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(java.net.URLDecoder.decode(com.tencent.mm.plugin.websearch.l2.f(map, "extClientParams"), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            r1Var.F = jSONObject.optString("ShareSceneId");
            r1Var.G = jSONObject.optInt("SnsContentType");
            java.lang.String optString = jSONObject.optString("exposedFingerWord");
            java.lang.String optString2 = jSONObject.optString("matchedFingerWord");
            if (!android.text.TextUtils.isEmpty(optString) && !android.text.TextUtils.isEmpty(optString2)) {
                r45.x50 x50Var = new r45.x50();
                x50Var.f389788d = "exposedFingerWord";
                x50Var.f389790f = optString;
                r45.x50 x50Var2 = new r45.x50();
                x50Var2.f389788d = "matchedFingerWord";
                x50Var2.f389790f = optString2;
                linkedList.add(x50Var);
                linkedList.add(x50Var2);
            }
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "extReqParams");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(f17);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i17);
                    r45.x50 x50Var3 = new r45.x50();
                    x50Var3.f389788d = jSONObject2.optString("key", "");
                    x50Var3.f389789e = jSONObject2.optInt("uintValue", 0);
                    x50Var3.f389790f = jSONObject2.optString("textValue", "");
                    linkedList.add(x50Var3);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e18, "commKvJSONArray", new java.lang.Object[0]);
            }
        }
        java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(map, "matchUser");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f18)) {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(f18);
                r45.fw6 fw6Var = new r45.fw6();
                fw6Var.f374659d = jSONObject3.optString("userName");
                fw6Var.f374660e = jSONObject3.optString("matchWord");
                if (!android.text.TextUtils.isEmpty(fw6Var.f374659d)) {
                    r1Var.f413065e.add(fw6Var);
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e19, "matchUserJSONArray", new java.lang.Object[0]);
            }
        }
        java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(map, "prefixQuery");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f19)) {
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray(f19);
                for (int i18 = 0; i18 < jSONArray2.length(); i18++) {
                    r1Var.f413072l.add(jSONArray2.getString(i18));
                }
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e27, "prefixQueryJSONArray", new java.lang.Object[0]);
            }
        }
        java.lang.String f27 = com.tencent.mm.plugin.websearch.l2.f(map, "tagInfo");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f27)) {
            try {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject(f27);
                r45.dk6 dk6Var = new r45.dk6();
                r1Var.f413074n = dk6Var;
                dk6Var.f372544e = jSONObject4.optString("tagText");
                r1Var.f413074n.f372543d = jSONObject4.optInt("tagType");
                r1Var.f413074n.f372545f = jSONObject4.optString("tagExtValue");
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e28, "tagInfoObj", new java.lang.Object[0]);
            }
        }
        java.lang.String f28 = com.tencent.mm.plugin.websearch.l2.f(map, "numConditions");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f28)) {
            try {
                org.json.JSONArray jSONArray3 = new org.json.JSONArray(f28);
                for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                    org.json.JSONObject optJSONObject = jSONArray3.optJSONObject(i19);
                    r45.hx4 hx4Var = new r45.hx4();
                    hx4Var.f376539e = optJSONObject.optLong("from");
                    hx4Var.f376540f = optJSONObject.optLong("to");
                    hx4Var.f376538d = optJSONObject.optInt("field");
                    r1Var.f413076p.add(hx4Var);
                }
            } catch (java.lang.Exception e29) {
                com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", e29, "numConditionsArray", new java.lang.Object[0]);
            }
        }
        r1Var.f413077q = com.tencent.mm.sdk.platformtools.t8.o1(map.get("webview_instance_id"), -1);
        r1Var.f413078r = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.websearch.l2.e(map, "subType", 0);
        int e37 = com.tencent.mm.plugin.websearch.l2.e(map, "isWeAppMore", 0);
        r1Var.f413079s = e37;
        if (e37 == 1) {
            r45.bf7 bf7Var = new r45.bf7();
            r1Var.f413080t = bf7Var;
            bf7Var.f370731d = com.tencent.mm.plugin.websearch.l2.a(3);
            r45.bf7 bf7Var2 = r1Var.f413080t;
            bf7Var2.f370734g = k01.n.f303048a;
            bf7Var2.f370732e = com.tencent.mm.plugin.websearch.l2.e(map, "subType", 0);
            r45.bf7 bf7Var3 = r1Var.f413080t;
            bf7Var3.f370733f = null;
            bf7Var3.f370736i = r1Var.f413073m;
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_ID_STRING_SYNC, null);
            if (m17 != null && (m17 instanceof java.lang.String)) {
                r1Var.f413080t.f370735h = (java.lang.String) m17;
            }
        }
        if (this.f181424d == 1) {
            r1Var.f413081u = this.f181425e;
        } else {
            r1Var.f413081u = null;
        }
        if (r1Var.f413066f == 33 && this.f181426f != null) {
            if (r1Var.f413081u == null) {
                r1Var.f413081u = new r45.v97();
            }
            r45.v97 v97Var2 = r1Var.f413081u;
            if (v97Var2.f388015e == null) {
                v97Var2.f388015e = new r45.yn();
            }
            r45.yn ynVar = this.f181426f.f388015e;
            if (ynVar != null) {
                r1Var.f413081u.f388015e.f391231p = ynVar.f391231p;
                com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "websearch from url [%s]", ynVar.f391231p);
            }
            this.f181426f = null;
        }
        if (r1Var.f413064d == 262144 && (v97Var = this.f181426f) != null && v97Var.f388015e.f391228m == 1) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("isRefresh", 1);
            bundle.putString("widgetId", com.tencent.mm.plugin.websearch.l2.f(map, "widgetId"));
            r1Var.f413086z = bundle;
            r1Var.f413081u = this.f181426f;
            this.f181426f = null;
        }
        java.lang.String f29 = com.tencent.mm.plugin.websearch.l2.f(map, "specialSearch");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f29)) {
            try {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject(f29);
                r1Var.A = jSONObject5.optInt("type", 0);
                r1Var.B = jSONObject5.optJSONObject("params").optString("reqKey");
            } catch (java.lang.Exception unused2) {
            }
        }
        r1Var.H = com.tencent.mm.plugin.websearch.l2.e(map, "version", 0);
        return r1Var;
    }

    public java.lang.String c() {
        com.tencent.mm.plugin.websearch.w1 w1Var = (com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class));
        if (w1Var.f181702q == null) {
            w1Var.f181702q = com.tencent.mm.sdk.platformtools.o4.N("WebSearchLogic", 2, null);
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = w1Var.f181702q;
        java.lang.String u17 = o4Var.u("websearch_preget_extReqParams", "");
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "getPreGetExtReqParams_:%s,set %s, cur %s", u17, java.lang.Integer.valueOf(o4Var.o("websearch_preget_version", 0)), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)));
        return u17;
    }

    public boolean d(java.util.Map map) {
        int o17 = com.tencent.mm.sdk.platformtools.t8.o1(map.get("webview_instance_id"), -1);
        java.lang.String f17 = com.tencent.mm.plugin.websearch.l2.f(map, "requestId");
        if (com.tencent.mm.plugin.websearch.l2.c(map, "isBackButtonClick", false)) {
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            int e17 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
            java.lang.String f18 = com.tencent.mm.plugin.websearch.l2.f(map, "query");
            ((jw4.e) l3Var).getClass();
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(o17).K6(e17, f18, map, true);
        } else {
            zg0.l3 l3Var2 = (zg0.l3) i95.n0.c(zg0.l3.class);
            int e18 = com.tencent.mm.plugin.websearch.l2.e(map, "type", 0);
            java.lang.String f19 = com.tencent.mm.plugin.websearch.l2.f(map, "query");
            ((jw4.e) l3Var2).getClass();
            com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(o17).K6(e18, f19, map, false);
        }
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "getSearchData: %s,wid: %s,rid: %s", map.toString(), java.lang.Integer.valueOf(o17), f17);
        ((com.tencent.mm.plugin.websearch.d2) this.f181432o).d(1, f17, java.lang.Integer.valueOf(o17), new com.tencent.mm.plugin.websearch.s(this, map), this.f181434q);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.websearch.t(this, map));
        return false;
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, int i18, int i19, int i27, java.lang.String str7, java.util.Map map) {
        if (i17 == 20) {
            g(str, str2, null, 20, 0);
        }
        if (android.text.TextUtils.isEmpty(str4) && android.text.TextUtils.isEmpty(str7)) {
            com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "do not pre get data query:%s,reqKey:%s", str4, str7);
            return;
        }
        java.lang.String c17 = c();
        if (!(!android.text.TextUtils.isEmpty(c17))) {
            com.tencent.mars.xlog.Log.w("FTSWebSearchLogic", "do no support pre get data, h5.ver %d, seq %s, sessionId %s, subSessionId %s", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)), str, str2, str3);
        } else {
            if (java.lang.System.currentTimeMillis() - this.f181429i <= f181422u) {
                com.tencent.mars.xlog.Log.w("FTSWebSearchLogic", "pre get data fail for time interval limit");
                return;
            }
            com.tencent.mars.xlog.Log.w("FTSWebSearchLogic", "pre get data, h5.ver %d, seq %s, sessionId %s, subSessionId %s", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)), str, str2, str3);
            f(str, str2, str3, str4, i17, str5, str6, i18, i19, i27, str7, c17, map);
            this.f181429i = java.lang.System.currentTimeMillis();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(1:3)(1:109)|4|(1:108)(1:7)|8|(19:104|105|(1:12)|13|14|(4:16|(4:24|25|(4:28|(2:30|31)(1:33)|32|26)|34)|18|(2:20|21))|37|(1:100)(3:41|(11:70|71|(4:74|(2:76|77)(1:79)|78|72)|80|81|(4:84|(2:86|87)(1:89)|88|82)|90|91|(2:94|92)|95|96)|43)|44|(1:46)|47|(1:69)|50|(7:64|65|66|53|(3:56|57|58)|61|62)|52|53|(3:56|57|58)|61|62)|10|(0)|13|14|(0)|37|(1:39)|100|44|(0)|47|(0)|69|50|(0)|52|53|(0)|61|62) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d1, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("FTSWebSearchLogic", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, java.lang.String r23, int r24, int r25, int r26, java.lang.String r27, java.lang.String r28, java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.a0.f(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, int, int, java.lang.String, java.lang.String, java.util.Map):boolean");
    }

    public void g(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "preGetTeachSearchData requestId:%s, sessionId:%s scene:%d", str, str2, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.websearch.q0 aj6 = ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).aj();
        if (aj6.b(i17, i18, true).c() && i17 != 123) {
            com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "preGetTeachSearchData cache available");
            return;
        }
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "do real preGetTeachSearchData");
        ((com.tencent.mm.plugin.websearch.d2) this.f181432o).c(2, str);
        gm0.j1.d().a(1048, aj6);
        gm0.j1.d().g(new su4.z1(i17, i18, com.tencent.mm.plugin.websearch.l2.a(0), -1, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), su4.o2.d("discoverSearchEntry").optLong("guideParam"), str, str2, str3, null, 0));
    }

    public java.lang.String h(su4.t0 t0Var, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.util.Map a17 = com.tencent.mm.plugin.websearch.q.f181590a.a(t0Var, i17, str3, str4, str5);
        if (a17 == null) {
            return "";
        }
        java.lang.String str6 = (java.lang.String) a17.get("reqId");
        f(str6, str, str2, str3, i17, (java.lang.String) a17.get("parentSearchID"), "", 1, i18, 0, "", (java.lang.String) a17.get("extReqParamsStr"), new java.util.HashMap());
        return str6;
    }

    public java.util.Map i(java.lang.String str) {
        su4.d2 d2Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.websearch.d2 d2Var2 = (com.tencent.mm.plugin.websearch.d2) this.f181432o;
        d2Var2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PGetController", "tryGet type:%s, reqTag:%s", 1, str);
        java.lang.Object obj = null;
        if (str != null && (d2Var = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var2.f181494b).get(1)).get(str)) != null && d2Var.f412854c) {
            obj = d2Var.f412856e;
        }
        com.tencent.mm.plugin.websearch.w wVar = (com.tencent.mm.plugin.websearch.w) obj;
        if (wVar != null) {
            java.lang.String str2 = wVar.f181691b;
            if (!android.text.TextUtils.isEmpty(str2)) {
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
            }
        }
        return hashMap;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null) {
            m1Var.getType();
        }
        if (!(m1Var instanceof su4.a)) {
            if (m1Var instanceof su4.b) {
                gm0.j1.d().q(m1Var.getType(), this);
                su4.b bVar = (su4.b) m1Var;
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "net scene fail %s", bVar.f412814d);
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(bVar.f412815e, "{}");
                    return;
                } else {
                    r45.aa7 aa7Var = ((su4.b2) bVar).f412820h;
                    java.lang.String str2 = aa7Var != null ? aa7Var.f369877f : "";
                    ((jw4.e) ((zg0.l3) i95.n0.c(zg0.l3.class))).Vi(bVar.f412815e, com.tencent.mm.sdk.platformtools.t8.K0(str2) ? "{}" : str2);
                    return;
                }
            }
            return;
        }
        gm0.j1.d().q(m1Var.getType(), this);
        su4.a aVar = (su4.a) m1Var;
        su4.j1 j1Var = this.f181434q;
        su4.y0 y0Var = this.f181432o;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "net scene fail %s", aVar.f412803e);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("ret", -1);
            } catch (org.json.JSONException unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            int i19 = aVar.f412802d;
            boolean z17 = aVar.f412804f == 0;
            java.lang.String str3 = aVar.f412805g;
            ((com.tencent.mm.plugin.websearch.d2) y0Var).b(1, str3, new com.tencent.mm.plugin.websearch.w(i19, jSONObject2, z17, str3, null, null), j1Var);
            return;
        }
        java.lang.String H = aVar.H();
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.t8.K0(H) ? "{}" : H;
        int J2 = aVar.J();
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "callback %s", aVar.f412803e);
        int i27 = aVar.f412802d;
        boolean z18 = aVar.f412804f == 0;
        java.lang.String str5 = aVar.f412805g;
        ((com.tencent.mm.plugin.websearch.d2) y0Var).b(1, str5, new com.tencent.mm.plugin.websearch.w(i27, str4, z18, str5, aVar.f412806h, aVar.I()), j1Var);
        if (J2 > 0) {
            com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "updateCode %d, need update", java.lang.Integer.valueOf(J2));
            ((yy.a) ((zy.r) i95.n0.c(zy.r.class))).wi(27);
        }
    }
}
