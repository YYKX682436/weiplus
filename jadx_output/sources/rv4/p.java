package rv4;

/* loaded from: classes12.dex */
public final class p implements mv4.d, mv4.c {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.w f400526a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f400527b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f400528c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f400529d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f400530e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f400531f;

    /* renamed from: g, reason: collision with root package name */
    public long f400532g;

    /* renamed from: h, reason: collision with root package name */
    public long f400533h;

    /* renamed from: i, reason: collision with root package name */
    public long f400534i;

    /* renamed from: j, reason: collision with root package name */
    public int f400535j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f400536k;

    /* renamed from: l, reason: collision with root package name */
    public int f400537l;

    /* renamed from: m, reason: collision with root package name */
    public int f400538m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f400539n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f400540o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f400541p;

    /* renamed from: q, reason: collision with root package name */
    public int f400542q;

    /* renamed from: r, reason: collision with root package name */
    public int f400543r;

    public p(rv4.w session, com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(context, "context");
        this.f400526a = session;
        this.f400527b = context;
        this.f400528c = kz5.p0.f313996d;
        this.f400529d = "";
        this.f400530e = "";
        this.f400531f = "";
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.o4i);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f400539n = string;
        this.f400540o = session.a().f400554a.optLong("hideHotSearch", 0L) == 0;
        this.f400543r = 3;
    }

    @Override // mv4.d
    public int a() {
        return this.f400537l;
    }

    @Override // mv4.d
    public void b(int i17) {
    }

    public final void c() {
        rv4.w wVar = this.f400526a;
        rv4.c cVar = rv4.c.f400446a;
        org.json.JSONObject a17 = cVar.a();
        if (a17 != null) {
            try {
                if (kotlin.jvm.internal.o.b(a17.optString("lastSessionId", ""), wVar.f331674a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] extendCacheTime: same sessionId, set ignoreExpose=true");
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject(a17.toString());
                jSONObject.put("lastSessionId", wVar.f331674a);
                jSONObject.put("lastUpdateTime", java.lang.System.currentTimeMillis());
                cVar.c(jSONObject);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] extendCacheTime: updated lastUpdateTime to extend cache validity");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] extendCacheTime error", e17);
            }
        }
    }

    @Override // mv4.c
    public void d() {
    }

    @Override // mv4.c
    public void e(int i17) {
        this.f400543r = i17;
    }

    @Override // mv4.d
    public void f(int i17) {
        this.f400538m = i17;
    }

    public final java.lang.String g(boolean z17, java.lang.String str, boolean z18) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_from_change", java.lang.Integer.valueOf(this.f400535j));
        if (z17) {
            if (str == null) {
                str = this.f400530e + java.lang.System.currentTimeMillis();
            }
            linkedHashMap.put("clickId", str);
        }
        if (z18) {
            int i17 = this.f400535j;
            if (i17 == 0) {
                try {
                    ((iv4.e) ((su4.s0) i95.n0.c(su4.s0.class))).getClass();
                    long j17 = iv4.e.f295135d.f412880a;
                    if (j17 > 0) {
                        linkedHashMap.put("clksearch_tsms", java.lang.Long.valueOf(j17));
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "Failed to get search entry statistics", e17);
                }
            } else if (i17 == 1) {
                long j18 = this.f400532g;
                if (j18 > 0) {
                    linkedHashMap.put("clkchange_tsms", java.lang.Long.valueOf(j18));
                }
            }
            long j19 = this.f400533h;
            if (j19 > 0) {
                linkedHashMap.put("clientreq_tsms", java.lang.Long.valueOf(j19));
            }
            long j27 = this.f400534i;
            if (j27 > 0) {
                linkedHashMap.put("clientreturn_tsms", java.lang.Long.valueOf(j27));
            }
        }
        java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @Override // mv4.d
    public int getMarginTop() {
        return this.f400538m;
    }

    @Override // mv4.d
    public java.lang.String getTitle() {
        return this.f400539n;
    }

    public boolean h() {
        return this.f400540o && (this.f400528c.isEmpty() ^ true);
    }

    public final void i(java.lang.String json, long j17, long j18) {
        kotlin.jvm.internal.o.g(json, "json");
        com.tencent.mm.ui.MMActivity mMActivity = this.f400527b;
        if (mMActivity.isFinishing() || mMActivity.isDestroyed()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] Activity is finishing/destroyed, skip callback");
        } else {
            mMActivity.runOnUiThread(new rv4.o(this, j17, j18, json));
        }
    }

    public final void j() {
        rv4.c cVar = rv4.c.f400446a;
        org.json.JSONObject a17 = cVar.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshCacheKey: no existing config found");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(a17.toString());
            java.lang.String str = this.f400526a.f331674a;
            jSONObject.put("cache_key", str);
            jSONObject.put("lastUpdateTime", java.lang.System.currentTimeMillis());
            cVar.c(jSONObject);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshCacheKey: updated cache_key from " + a17.optString("cache_key", "") + " to " + str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshCacheKey error", e17);
        }
    }

    public final void k(vu4.a actionId, vu4.b actionType, java.lang.String query, java.lang.String docInfo, java.lang.String extInfo) {
        kotlin.jvm.internal.o.g(actionId, "actionId");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        java.lang.String str = this.f400526a.f331674a;
        java.lang.String str2 = this.f400530e;
        java.lang.String str3 = this.f400529d;
        int i17 = this.f400543r;
        java.lang.String title = this.f400539n;
        kotlin.jvm.internal.o.g(title, "title");
        vu4.c cVar = new vu4.c(actionId, actionType, str, str2, str3, 0, query, docInfo, i17 + "|2|" + fp.s0.b(title, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), "100000410", this.f400536k);
        if (com.tencent.mm.sdk.platformtools.t8.K0(extInfo)) {
            cVar.f440291n = g(false, null, false);
        } else {
            cVar.f440291n = extInfo;
        }
        ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(cVar.a());
    }

    public final void l(ov4.f actionId, boolean z17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(actionId, "actionId");
        if (actionId == ov4.f.f349231f ? !z17 : z17) {
            ov4.g[] gVarArr = ov4.g.f349235d;
            str = "1205";
        } else {
            ov4.g[] gVarArr2 = ov4.g.f349235d;
            str = "1206";
        }
        rv4.w wVar = this.f400526a;
        ov4.e eVar = new ov4.e(wVar.f331674a, null, null, 0, 3, actionId, 0L, str, null, null, 0, null, 0, 8014, null);
        int ordinal = actionId.ordinal();
        nv4.k kVar = wVar.f331675b;
        if (ordinal == 0) {
            kVar.d("hot-search-switch-status-" + wVar.f331674a, eVar);
        } else if (ordinal == 1) {
            kVar.c(eVar);
        } else {
            if (ordinal != 2) {
                return;
            }
            kVar.getClass();
            eVar.toString();
            kVar.b(eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a A[EDGE_INSN: B:46:0x015a->B:47:0x015a BREAK  A[LOOP:1: B:29:0x0106->B:42:0x0144], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r18, rv4.w r19, yz5.a r20) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv4.p.m(int, rv4.w, yz5.a):void");
    }

    public final void n(rv4.r scene, int i17, yz5.a onDataReady) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onDataReady, "onDataReady");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] refreshData by " + scene + ", actionType:" + i17);
        try {
            int ordinal = scene.ordinal();
            rv4.w wVar = this.f400526a;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] REFRESH_BUTTON: requesting new data");
                m(i17, wVar, onDataReady);
                return;
            }
            this.f400535j = 0;
            java.util.List f17 = rv4.q.f400544a.f(i17);
            if (f17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] INIT_DATA: no cache, requesting CGI");
                j();
                m(i17, wVar, onDataReady);
                return;
            }
            this.f400528c = f17;
            l(ov4.f.f349232g, this.f400540o);
            java.util.Iterator it = f17.iterator();
            while (it.hasNext()) {
                ((rv4.i0) it.next()).f400494e = this;
            }
            o();
            this.f400536k = true;
            c();
            onDataReady.invoke();
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSGlobalTeachHotSearchData", "[ftshotsearch] INIT_DATA: using cached data, " + f17.size() + " items");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTSGlobalTeachHotSearchData", th6, "refreshData Error", new java.lang.Object[0]);
            this.f400528c = kz5.p0.f313996d;
            onDataReady.invoke();
        }
    }

    public final void o() {
        java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:hotsearch:config", "");
        com.tencent.mars.xlog.Log.i("[FTSNativeGlobalTeach] FTSGlobalTeachDataMgr", "getHotSearchConfig: " + u17);
        kotlin.jvm.internal.o.d(u17);
        org.json.JSONObject f17 = pv4.a.f(u17);
        if (f17 != null) {
            java.lang.String optString = f17.optString("searchID", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f400530e = optString;
            java.lang.String optString2 = f17.optString("requestId", "");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            this.f400529d = optString2;
            f17.optBoolean("refreshCanShow", false);
            kotlin.jvm.internal.o.f(f17.optString("refreshTitle", ""), "optString(...)");
            java.lang.String optString3 = f17.optString("refreshDocInfo", "");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            this.f400531f = optString3;
            kotlin.jvm.internal.o.f(f17.optString("guessTitle", ""), "optString(...)");
            kotlin.jvm.internal.o.f(f17.optString("ctx", ""), "optString(...)");
        }
    }
}
