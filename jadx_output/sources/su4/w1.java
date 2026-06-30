package su4;

/* loaded from: classes.dex */
public class w1 extends su4.a implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413122i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413123m;

    /* renamed from: n, reason: collision with root package name */
    public final int f413124n;

    /* renamed from: o, reason: collision with root package name */
    public final int f413125o;

    /* renamed from: p, reason: collision with root package name */
    public r45.aa7 f413126p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.z97 f413127q;

    /* renamed from: r, reason: collision with root package name */
    public final su4.r1 f413128r;

    /* renamed from: s, reason: collision with root package name */
    public long f413129s = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(su4.r1 r1Var) {
        java.lang.String str;
        float f17;
        float f18;
        long j17;
        java.lang.String str2;
        c01.l2 e17;
        this.f413128r = r1Var;
        java.lang.String str3 = r1Var.f413062b;
        this.f412803e = str3;
        this.f412805g = r1Var.f413085y;
        this.f412804f = r1Var.f413063c;
        int i17 = r1Var.f413066f;
        this.f412802d = r1Var.f413077q;
        this.f413124n = r1Var.f413061a;
        this.f412806h = r1Var.f413086z;
        java.lang.Object[] objArr = i17 >= 4001 && i17 <= 4500;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && objArr != true) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.NetSceneWebSearch", "keyword is unavailable");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "Constructors: keyword=%s", r1Var.f413062b);
        int i18 = r1Var.f413066f;
        this.f413125o = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        if ((r1Var.f413079s == 1) == true) {
            lVar.f70667d = 2676;
            str = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_weappsearch";
        } else {
            int i19 = r1Var.A;
            if (i19 == 1) {
                lVar.f70667d = 1011;
                str = "/cgi-bin/mmsearch-bin/chatsearch";
            } else if (i19 == 3) {
                lVar.f70667d = 1532;
                str = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
            } else if (r1Var.D) {
                lVar.f70667d = 4858;
                str = "/cgi-bin/mmsearch-bin/mmtagsearch";
            } else if (i18 == 123 || i18 == 125 || (1000 <= i18 && i18 <= 1500)) {
                lVar.f70667d = 11451;
                str = "/cgi-bin/mmsearch-bin/mmwebfindersearch";
            } else if (i18 >= 4001 && i18 <= 4500) {
                lVar.f70667d = 8704;
                str = "/cgi-bin/mmsearch-bin/circlesearch_retrieval";
            } else if (i18 >= 4501 && i18 <= 4600) {
                lVar.f70667d = 7775;
                str = "/cgi-bin/mmsearch-bin/mmwebpresentsearch";
            } else if (i18 == 3147 || i18 == 3205 || (i18 >= 8100 && i18 <= 8500)) {
                lVar.f70667d = 16651;
                str = "/cgi-bin/mmsearch-bin/mmwebecsearchv2";
            } else {
                lVar.f70667d = 719;
                str = "/cgi-bin/micromsg-bin/mmwebsearch";
            }
        }
        lVar.f70666c = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "NetSceneWebSearch cgi is:%s", str);
        if (r1Var.A == 3) {
            lVar.f70664a = new r45.t97();
            lVar.f70665b = new r45.u97();
        } else {
            lVar.f70664a = new r45.z97();
            lVar.f70665b = new r45.aa7();
        }
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413123m = a17;
        if (r1Var.A == 3) {
            this.f413127q = new r45.z97();
        } else {
            this.f413127q = (r45.z97) a17.f70710a.f70684a;
        }
        r45.z97 z97Var = this.f413127q;
        z97Var.f391822e = r1Var.f413062b;
        z97Var.f391821d = r1Var.f413061a;
        z97Var.f391824g = r1Var.f413064d;
        z97Var.f391826i = su4.r2.i();
        r45.z97 z97Var2 = this.f413127q;
        z97Var2.f391823f = r1Var.f413063c;
        int i27 = r1Var.H;
        z97Var2.f391825h = i27 == 0 ? com.tencent.mm.plugin.websearch.l2.a(0) : i27;
        r45.z97 z97Var3 = this.f413127q;
        java.util.LinkedList linkedList = r1Var.f413065e;
        z97Var3.f391827m = linkedList;
        z97Var3.f391828n = r1Var.f413066f;
        z97Var3.f391829o = r1Var.f413067g;
        z97Var3.f391830p = r1Var.f413068h;
        z97Var3.f391831q = r1Var.f413069i;
        z97Var3.f391833s = r1Var.f413071k;
        z97Var3.f391832r = r1Var.f413070j;
        z97Var3.f391834t = r1Var.f413072l;
        java.util.LinkedList linkedList2 = r1Var.f413075o;
        z97Var3.f391837w = linkedList2;
        r45.zj6 zj6Var = null;
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                r45.x50 x50Var = (r45.x50) it.next();
                if (x50Var != null && "parentSearchID".equals(x50Var.f389788d)) {
                    str2 = x50Var.f389790f;
                    break;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "parentSearchID=%s", str2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (e17 = c01.n2.d().e(str2)) != null) {
                java.lang.String f19 = e17.f("extQueryInfo", "");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f19)) {
                    r45.x50 x50Var2 = new r45.x50();
                    x50Var2.f389788d = "extQueryInfo";
                    x50Var2.f389790f = f19;
                    linkedList2.add(x50Var2);
                }
            }
        }
        r45.z97 z97Var4 = this.f413127q;
        z97Var4.f391836v = r1Var.f413074n;
        z97Var4.f391838x = r1Var.f413076p;
        z97Var4.f391839y = r1Var.f413078r;
        z97Var4.A = r1Var.f413082v;
        z97Var4.F = com.tencent.mm.ui.bk.C() ? 1 : 0;
        this.f413127q.G = su4.r2.g();
        r45.z97 z97Var5 = this.f413127q;
        int i28 = this.f413125o;
        if (i28 == 79 || i28 == 80) {
            r45.zj6 zj6Var2 = new r45.zj6();
            zj6Var2.f392151f = 1;
            java.lang.String str4 = r1Var.F;
            if (!android.text.TextUtils.isEmpty(str4)) {
                java.lang.String[] split = str4.split("#");
                if (i28 == 79) {
                    if (split.length >= 2) {
                        zj6Var2.f392149d = split[0];
                        zj6Var2.f392153h = split[1];
                    }
                } else if (i28 == 80 && split.length >= 3) {
                    zj6Var2.f392149d = split[0];
                    zj6Var2.f392153h = split[1];
                    zj6Var2.f392150e = split[2];
                }
                zj6Var2.f392152g = r1Var.G;
                zj6Var = zj6Var2;
            }
        }
        z97Var5.H = zj6Var;
        if (r1Var.f413081u == null) {
            r1Var.f413081u = new r45.v97();
        }
        r45.v97 v97Var = r1Var.f413081u;
        if (v97Var.f388015e == null) {
            v97Var.f388015e = new r45.yn();
        }
        r45.yn ynVar = r1Var.f413081u.f388015e;
        int i29 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().widthPixels;
        zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
        ynVar.f391232q = (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() == com.tencent.xweb.f1.WV_KIND_PINUS && org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST)) != false ? org.xwalk.core.XWalkEnvironment.f347975h : false ? java.lang.Math.round(i29 / i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a)) : java.lang.Math.round(i29 / j65.f.f());
        int i37 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().widthPixels;
        int i38 = r1Var.f413081u.f388015e.f391232q;
        float f27 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density;
        if (this.f413127q.f391826i != null) {
            r45.yn ynVar2 = r1Var.f413081u.f388015e;
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            ynVar2.f391230o = !i11.h.e().h() ? 1 : 0;
            r45.e64 e64Var = this.f413127q.f391826i;
            f17 = e64Var.f373046d;
            f18 = e64Var.f373047e;
        } else {
            r1Var.f413081u.f388015e.f391230o = 1;
            f17 = 0.0f;
            f18 = 0.0f;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "websearch location: longitude[%f], latitude[%f], isUsingCached[%d]", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(r1Var.f413081u.f388015e.f391230o));
        if (!android.text.TextUtils.isEmpty(r1Var.f413084x)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(java.net.URLDecoder.decode(r1Var.f413084x));
                r45.j95 j95Var = new r45.j95();
                j95Var.f377669f = jSONObject.optString("city");
                j95Var.f377668e = jSONObject.optString("country");
                j95Var.f377671h = (float) jSONObject.optDouble("latitude");
                j95Var.f377672i = (float) jSONObject.optDouble("longitude");
                j95Var.f377667d = jSONObject.optString("poiId");
                j95Var.f377670g = jSONObject.optString("poiName");
                java.lang.String optString = jSONObject.optString("snsId");
                if (android.text.TextUtils.isEmpty(optString)) {
                    j17 = 0;
                } else {
                    long longValue = new java.math.BigInteger(optString).longValue();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchApiLogic", "seq %s to snsId %d ", optString, java.lang.Long.valueOf(longValue));
                    j17 = longValue;
                }
                j95Var.f377674n = j17;
                if (!android.text.TextUtils.isEmpty(j95Var.f377667d)) {
                    this.f413127q.E = j95Var;
                }
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.NetSceneWebSearch", e18, "", new java.lang.Object[0]);
            }
        }
        r45.v97 v97Var2 = r1Var.f413081u;
        if (v97Var2 != null) {
            try {
                v97Var2.f388016f = ((com.tencent.mm.plugin.appbrand.app.l8) ((com.tencent.mm.plugin.appbrand.service.r5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.r5.class))).Ai();
                this.f413127q.B = new com.tencent.mm.protobuf.g(r1Var.f413081u.toByteArray());
                r45.v97 v97Var3 = r1Var.f413081u;
                long j18 = v97Var3.f388014d;
                java.lang.String str5 = v97Var3.f388015e.f391222d;
            } catch (java.lang.Exception unused) {
            }
        }
        if (r1Var.f413080t != null) {
            try {
                this.f413127q.f391840z = new com.tencent.mm.protobuf.g(r1Var.f413080t.toByteArray());
            } catch (java.lang.Exception unused2) {
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[7];
        objArr2[0] = java.lang.Boolean.valueOf(this.f413127q.f391826i != null);
        objArr2[1] = java.lang.Integer.valueOf(linkedList.size());
        objArr2[2] = java.lang.Integer.valueOf(r1Var.f413066f);
        objArr2[3] = java.lang.Integer.valueOf(r1Var.f413064d);
        objArr2[4] = java.lang.Integer.valueOf(this.f413124n);
        objArr2[5] = java.lang.Integer.valueOf(r1Var.f413068h);
        objArr2[6] = java.lang.Integer.valueOf(r1Var.f413077q);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "contains location = %b | matchUserSize=%d | scene=%d | businessType=%d | isHomePage=%b | sceneActionType=%d | webViewId=%d", objArr2);
        if (this.f413127q.f391826i != null) {
            v90.x xVar = (v90.x) i95.n0.c(v90.x.class);
            r45.e64 e64Var2 = this.f413127q.f391826i;
            ((u90.v) xVar).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS, e64Var2.f373046d, e64Var2.f373047e, e64Var2.f373048f);
        }
        if (r1Var.A == 3) {
            r45.t97 t97Var = (r45.t97) this.f413123m.f70710a.f70684a;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", "retrieval_by_req_key_circle_search");
            hashMap.put("req_key", r1Var.B);
            hashMap.put("req_business_buffer", android.util.Base64.encodeToString(this.f413127q.toByteArrayOrNull(), 2));
            t97Var.f386222d = new org.json.JSONObject(hashMap).toString();
        }
        su4.k2.d(r1Var.f413066f, r1Var.f413082v, r1Var.f413083w, r1Var.f413067g, r1Var.f413063c, r1Var.f413061a == 1, r1Var.f413085y, r1Var.f413062b, r1Var.f413064d);
    }

    @Override // su4.a
    public java.lang.String H() {
        r45.aa7 aa7Var = this.f413126p;
        return aa7Var != null ? aa7Var.f369877f : "";
    }

    @Override // su4.a
    public java.lang.String I() {
        r45.aa7 aa7Var = this.f413126p;
        if (aa7Var == null) {
            return null;
        }
        try {
            return new java.lang.String(android.util.Base64.encode(aa7Var.toByteArray(), 2));
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.NetSceneWebSearch", "encode resp base64 fail");
            return null;
        }
    }

    @Override // su4.a
    public int J() {
        r45.aa7 aa7Var = this.f413126p;
        if (aa7Var != null) {
            return aa7Var.f369875d;
        }
        return 0;
    }

    @Override // su4.a
    public void K(java.util.LinkedList linkedList) {
        r45.z97 z97Var = this.f413127q;
        z97Var.f391827m = linkedList;
        r45.h86 h86Var = new r45.h86();
        h86Var.f375942d = linkedList.size();
        z97Var.C = h86Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413129s = c01.id.c();
        su4.k3.g(this.f413125o, 2, 0, 0, "");
        this.f413122i = u0Var;
        return dispatch(sVar, this.f413123m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        su4.r1 r1Var = this.f413128r;
        int i17 = r1Var.A;
        if (i17 == 1) {
            return 1011;
        }
        if (i17 == 3) {
            return 1532;
        }
        return r1Var.D ? 4858 : 719;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        java.lang.String str2;
        int i28;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearch", "onGYNetEnd netId %d | errType %d | errCode %d | errMsg %s useTime: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(c01.id.a() - this.f413129s));
        boolean z17 = i18 == 0 && i19 == 0;
        int i29 = this.f413125o;
        su4.r1 r1Var = this.f413128r;
        if (i18 != 0 || i19 != 0) {
            this.f413122i.onSceneEnd(i18, i19, str, this);
            su4.k2.e(r1Var.f413066f, r1Var.f413082v, r1Var.f413083w, r1Var.f413067g, r1Var.f413063c, r1Var.f413061a == 1, r1Var.f413085y, z17, r1Var.f413062b, r1Var.f413064d);
            su4.k3.g(i29, 3, i18, i19, "");
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f413123m.f70711b.f70700a;
        if (fVar instanceof r45.u97) {
            r45.u97 u97Var = (r45.u97) fVar;
            r45.aa7 aa7Var = new r45.aa7();
            this.f413126p = aa7Var;
            aa7Var.setBaseResponse(u97Var.getBaseResponse());
            this.f413126p.f369877f = u97Var.f387163d;
        } else if (fVar instanceof r45.aa7) {
            this.f413126p = (r45.aa7) fVar;
        }
        if (this.f413126p != null) {
            int i37 = r1Var.f413066f;
            java.lang.String str3 = r1Var.f413082v;
            java.lang.String str4 = r1Var.f413083w;
            java.lang.String str5 = r1Var.f413067g;
            int i38 = r1Var.f413063c;
            i27 = i29;
            i28 = 3;
            str2 = "";
            su4.k2.e(i37, str3, str4, str5, i38, r1Var.f413061a == 1, r1Var.f413085y, z17, r1Var.f413062b, r1Var.f413064d);
            java.lang.String str6 = this.f413126p.f369877f;
        } else {
            i27 = i29;
            str2 = "";
            i28 = 3;
        }
        this.f413122i.onSceneEnd(i18, i19, str, this);
        su4.k3.g(i27, i28, i18, i19, str2);
    }
}
