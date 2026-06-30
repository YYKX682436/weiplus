package ls1;

/* loaded from: classes8.dex */
public final class e0 extends com.tencent.mm.plugin.webview.core.e3 {

    /* renamed from: i2, reason: collision with root package name */
    public static final ls1.c f320974i2 = new ls1.c(null);
    public final r45.wm6 N1;
    public final jz5.g O1;
    public final com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 P1;
    public long Q1;
    public long R1;
    public long S1;
    public boolean T1;
    public boolean U1;
    public final long V1;
    public final jz5.g W1;
    public java.lang.String X1;
    public java.lang.String Y1;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final java.lang.String f320975a2;

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.List f320976b2;

    /* renamed from: c2, reason: collision with root package name */
    public final java.lang.String f320977c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f320978d2;

    /* renamed from: e2, reason: collision with root package name */
    public final java.util.HashSet f320979e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f320980f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f320981g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.lang.Runnable f320982h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.wm6 tmplParams, com.tencent.mm.ui.widget.MMWebView viewWV) {
        super(viewWV, new com.tencent.mm.plugin.webview.model.b6(), new zg0.k2(null, false, false, false, false, 0, false, 127, null));
        kotlin.jvm.internal.o.g(tmplParams, "tmplParams");
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        this.N1 = tmplParams;
        this.O1 = jz5.h.b(new ls1.d(this));
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0();
        i0Var.f94268a = tmplParams;
        this.P1 = i0Var;
        this.T1 = true;
        this.V1 = 5000L;
        this.W1 = jz5.h.b(new ls1.w(this, viewWV));
        this.f320975a2 = "__tmpl_webview_inject_data";
        ls1.f0 f0Var = viewWV instanceof ls1.f0 ? (ls1.f0) viewWV : null;
        if (f0Var != null) {
            f0Var.setValidUrlProxy(new ls1.a(this));
            f0Var.setCurrentUrlProxy(new ls1.b(this));
        }
        java.util.List list = this.f181965y0;
        list.addAll(kz5.c0.i(new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$UpdateData
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                kotlin.jvm.internal.o.e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return waitFor(-102) && waitFor(-111);
            }
        }, new ls1.i(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$StartPreload
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                kotlin.jvm.internal.o.e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return waitFor(((ls1.e0) controller).f181933i0);
            }
        }, new ls1.k(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$PreloadNext
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                kotlin.jvm.internal.o.e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return waitFor(-130);
            }
        }, new ls1.l(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$NotifyAuth
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                kotlin.jvm.internal.o.e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return waitFor(-102) && ((waitFor(((ls1.e0) controller).f181931h0) && waitFor(-121)) || waitFor(-122));
            }
        }, new ls1.m(this)), new com.tencent.mm.plugin.webview.core.e(new com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$ForceUrl
            @Override // com.tencent.mm.plugin.webview.core.BaseWebViewController$ControllerAction
            public boolean verify() {
                com.tencent.mm.plugin.webview.core.r0 controller = getController();
                kotlin.jvm.internal.o.e(controller, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return (waitFor(-103) || waitFor(-113) || waitFor(-124)) && waitFor(((ls1.e0) controller).f181933i0);
            }
        }, new ls1.n(this))));
        this.f320976b2 = list;
        this.f320977c2 = "__tmpl_webview_inject_data.__getString()";
        this.f320979e2 = new java.util.HashSet();
        this.f320982h2 = new ls1.p(this);
    }

    public static final java.lang.String G1(nw4.y2 y2Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("performance", (java.lang.String) y2Var.f340790a.get("performance"));
        jSONObject.put("injectPageDataResult", (java.lang.String) y2Var.f340790a.get("injectPageDataResult"));
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public boolean A0() {
        return false;
    }

    public final java.lang.String B1() {
        return (java.lang.String) ((jz5.n) this.O1).getValue();
    }

    public final r45.zb5 C1() {
        return (r45.zb5) ((jz5.n) this.W1).getValue();
    }

    public final void D1(java.lang.String forceUrl) {
        kotlin.jvm.internal.o.g(forceUrl, "forceUrl");
        com.tencent.mars.xlog.Log.i(B1(), "loadForceUrl");
        this.P1.f94291l0 = true;
        H1();
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_tmpl_test_noredir", false)) {
            return;
        }
        M();
        this.f181921c0 = true;
        V0(E1(forceUrl), true, 8);
    }

    public final java.lang.String E1(java.lang.String str) {
        return hy4.i.b(hy4.i.d(hy4.i.d(hy4.i.d(str, "fasttmpl_flag", false, 2, null), "fasttmpl_type", false, 2, null), "fasttmpl_fullversion", false, 2, null), "forceh5", "1");
    }

    public final void F1(java.lang.String str) {
        hy4.k0 k0Var = this.V;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = this.P1;
        com.tencent.mars.xlog.Log.i(B1(), "notifyPageInfo pageInfo:" + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("performance"));
            long optLong = jSONObject2.optLong("compileTime");
            long optLong2 = jSONObject2.optLong("receivePageDataTimestamp");
            long optLong3 = jSONObject2.optLong("firstScreenTimestamp");
            long optLong4 = jSONObject2.optLong("firstScreenTime");
            k0Var.a("firstScreenTimestamp", optLong3);
            k0Var.a("firstScreenTime", optLong4);
            i0Var.f94294n = optLong;
            i0Var.f94296o = optLong2;
            i0Var.f94288k = optLong3;
            i0Var.f94292m = optLong4;
            if (kotlin.jvm.internal.o.b(jSONObject.optString("injectPageDataResult", "fail"), "ok")) {
                this.f320980f2 = true;
                i0Var.X = true;
                i0Var.l(new ls1.t(this));
                ax4.a.b(this.N1.f389300o, 131, 1, true);
                ax4.a.c(108);
            } else {
                i0Var.f94291l0 = true;
                I(-124);
                com.tencent.mars.xlog.Log.i(B1(), "notifyPageInfo fail");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(B1(), e17, "notifyPageInfo", new java.lang.Object[0]);
            i0Var.f94291l0 = true;
            I(-124);
        }
        i0Var.B = java.lang.System.currentTimeMillis();
        J1();
        H1();
    }

    @Override // com.tencent.mm.plugin.webview.core.r0, com.tencent.mm.plugin.webview.permission.a
    /* renamed from: G0 */
    public void e(int i17, java.lang.String reqUrl, java.lang.String fullUrl, r45.s83 response) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        kotlin.jvm.internal.o.g(response, "response");
        if (i17 == 0) {
            this.f181964y = fullUrl;
            Q0(fullUrl);
            P0(fullUrl);
            this.C = fullUrl;
        }
        super.e(i17, reqUrl, fullUrl, response);
        if (i17 == 0) {
            this.X1 = fullUrl;
            java.util.Map g17 = com.tencent.mm.plugin.webview.permission.d.g(response.f385562x);
            ax4.a.b(this.N1.f389300o, 117, 1, true);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = this.P1;
            i0Var.f94303t = currentTimeMillis;
            i0Var.W = true;
            J1();
            i0Var.l(new ls1.u(this));
            K1(reqUrl, fullUrl, g17);
            I(-121);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public boolean H(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, this.N1.f389294f)) {
            return true;
        }
        return str != null && r26.i0.y(str, "file://", false);
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public void H0() {
        char c17;
        com.tencent.mars.xlog.Log.i(B1(), "onStartLoad");
        android.content.Intent d07 = d0();
        B1();
        this.B = d07;
        this.R1 = java.lang.System.currentTimeMillis();
        boolean z17 = true;
        this.T1 = d07.getBooleanExtra(com.tencent.mm.ui.w2.f211190c, true);
        this.Q1 = d07.getLongExtra(com.tencent.mm.ui.w2.f211191d, 0L);
        km0.a aVar = ((km0.c) gm0.j1.p().a()).f308991e;
        java.lang.String stringExtra = d07.getStringExtra(com.tencent.mm.ui.w2.f211192e);
        java.lang.String stringExtra2 = d07.getStringExtra("rawUrl");
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = this.P1;
        if (stringExtra2 == null || stringExtra == null) {
            com.tencent.mars.xlog.Log.e(B1(), "rawUrl is null, " + com.tencent.mm.plugin.brandservice.ui.timeline.preload.w.d(d07));
            ax4.a.c(151);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17260, 1, com.tencent.mm.plugin.brandservice.ui.timeline.preload.w.d(d07));
            z17 = false;
        } else {
            boolean z18 = aVar.f308986f < this.Q1;
            i0Var.U = z18;
            ax4.a.c(z18 ? 104 : 103);
            int intExtra = d07.getIntExtra(com.tencent.mm.ui.w2.f211196i, -1);
            long j17 = this.Q1;
            int myPid = android.os.Process.myPid();
            long j18 = aVar.f308981a;
            jz5.g gVar = com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.f94488a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(intExtra);
            sb6.append('-');
            sb6.append(j17);
            int hashCode = sb6.toString().hashCode();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().getInt("_tmpl_lastest_mm_open", 0) == hashCode) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(myPid);
                sb7.append('-');
                sb7.append(j18);
                int hashCode2 = sb7.toString().hashCode();
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().getInt("_tmpl_lastest_mp_open", 0) == hashCode2) {
                    c17 = 2;
                } else {
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().putInt("_tmpl_lastest_mp_open", hashCode2);
                    c17 = 1;
                }
            } else {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.z1.g().putInt("_tmpl_lastest_mm_open", hashCode);
                c17 = 0;
            }
            if (c17 == 1) {
                i0Var.V = 1;
                this.Q1 = aVar.f308981a;
            } else if (c17 == 2) {
                i0Var.V = 2;
                this.Q1 = -1L;
            }
            i0Var.Q = C1().f391892q;
            i0Var.R = C1().f391893r;
            i0Var.S = nw4.v2.c(mMWebView);
            i0Var.T = C1().f391895t;
            i0Var.C = aVar.f308981a;
            i0Var.D = aVar.f308982b;
            i0Var.E = aVar.f308983c;
            i0Var.F = 0L;
            i0Var.G = 0L;
            i0Var.H = 0L;
            i0Var.I = aVar.f308984d;
            i0Var.f94267J = aVar.f308985e;
            i0Var.K = aVar.f308986f;
            i0Var.f94286j = this.Q1;
            i0Var.f94298p = this.R1;
            i0Var.f94295n0 = C1().f391886h;
            java.lang.String stringExtra3 = d07.getStringExtra("srcUsername");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.f94435a.h(this, stringExtra, C1(), stringExtra3, new ls1.v(this));
        }
        if (!z17) {
            E0();
            return;
        }
        i0Var.getClass();
        r45.wm6 wm6Var = this.N1;
        kotlin.jvm.internal.o.g(wm6Var, "<set-?>");
        i0Var.f94268a = wm6Var;
        java.lang.String i17 = i();
        kotlin.jvm.internal.o.g(i17, "<set-?>");
        i0Var.f94272c = i17;
        boolean p07 = p0(-102);
        i0Var.M = p07;
        i0Var.L = this.U1;
        i0Var.f94287j0 = mMWebView.getCurrentInstanceWebCoreType().name();
        ax4.a.c(p07 ? 106 : 105);
        z1(Y(), i(), this.V0, e42.d0.clicfg_android_webview_menu_search_ai_mp);
        U0(i(), false);
        if (this.f320980f2) {
            return;
        }
        H1();
        com.tencent.mars.xlog.Log.i(B1(), "check notifyPage");
        this.f320981g2 = false;
        b0().postUIDelayed(this.f320982h2, this.V1);
    }

    public final void H1() {
        B1();
        b0().removeCallbacks(this.f320982h2);
        this.f320981g2 = true;
    }

    public final void I1(java.lang.String contentId, long j17, long j18) {
        kotlin.jvm.internal.o.g(contentId, "contentId");
        B1();
        i();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.m(i());
        java.lang.String i17 = i();
        this.f181964y = i17;
        Q0(i17);
        P0(i17);
        this.C = i17;
        this.Y1 = contentId;
        this.Q1 = j17;
        this.S1 = j18;
        I(-111);
    }

    public final void J1() {
        B1();
        hy4.k0 k0Var = this.V;
        long b17 = k0Var.b("onInjectStart", 0L);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.i0 i0Var = this.P1;
        i0Var.f94306w = b17;
        i0Var.f94307x = k0Var.b("onInjectEnd", 0L);
        i0Var.f94309z = k0Var.b("onTmplLoadStart", 0L);
        i0Var.A = k0Var.b("onTmplLoadEnd", 0L);
        i0Var.f94304u = k0Var.b("onCreateStart", 0L);
        i0Var.f94305v = k0Var.b("onCreateEnd", 0L);
        i0Var.N = this.f320978d2;
        i0Var.f94308y = k0Var.b("onWebInjectEnd", 0L);
        java.lang.String randomStr = this.f181916a.getRandomStr();
        kotlin.jvm.internal.o.f(randomStr, "getRandomStr(...)");
        i0Var.f94270b = randomStr;
        i0Var.O = p0(-102);
    }

    public final void K1(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mars.xlog.Log.i(B1(), "[updatePageAuth]reqUrl:" + str + " fullUrl:" + str2 + " httpHeader:" + map);
        java.lang.String g17 = this.f181916a.getSettings().g();
        kotlin.jvm.internal.o.f(g17, "getUserAgentString(...)");
        map.put("User-agent", g17);
        g0().L = new org.json.JSONObject(map).toString();
        g0().K = android.net.Uri.parse(str2).getQueryParameter("pass_ticket");
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public java.util.List S() {
        return this.f320976b2;
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public void S0(boolean z17) {
        T0(z17, null);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.g(new ls1.x(this, e17));
        }
        pw4.c cVar = this.f181938l;
        if (cVar.f358730s == null) {
            cVar.f358730s = new java.util.HashMap();
        }
        java.util.Map map = cVar.f358730s;
        kotlin.jvm.internal.o.d(map);
        if (map.get("photoAccount") == null) {
            java.util.Map map2 = cVar.f358730s;
            kotlin.jvm.internal.o.d(map2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
            jSONObject.put("enable", gVar.Di());
            jSONObject.put("picTextNameVersion", gVar.Ui() ? 1 : 0);
            org.json.JSONObject put = jSONObject.put("supportViewPhotoAcct", gVar.Ui() ? 1 : 0);
            kotlin.jvm.internal.o.d(put);
            map2.put("photoAccount", put);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean U0(java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        return !kotlin.jvm.internal.o.b(url, this.N1.f389294f) && super.U0(url, z17);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean X() {
        return p0(-112) || p0(-113);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean Y0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return super.Y0(url) && !kotlin.jvm.internal.o.b(url, this.N1.f389294f);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean Z0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return super.Y0(url) && !kotlin.jvm.internal.o.b(url, this.N1.f389294f);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean b1() {
        return p0(this.f181935j0) && p0(-102);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0, com.tencent.mm.plugin.webview.permission.a
    public void c(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        super.c(i17, reqUrl, i18, i19, errMsg);
        if (i17 == 0) {
            this.X1 = reqUrl;
            I(-122);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean c1() {
        boolean contains;
        synchronized (this) {
            contains = this.D0.contains(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Inject.class).g());
        }
        return contains && p0(-121);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0, zg0.q2
    public java.lang.String i() {
        try {
            return r26.i0.x(com.tencent.mm.plugin.webview.core.r0.Q0.a(d0()), "http://", "https://", false, 4, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(B1(), java.lang.String.valueOf(e17.getMessage()));
            E0();
            return "";
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0, zg0.q2
    public void j(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        super.j(intent);
        S0(com.tencent.mm.plugin.webview.ui.tools.r3.f186801d.a(i(), intent));
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        super.n(webView, str);
        r45.wm6 wm6Var = this.N1;
        if (!kotlin.jvm.internal.o.b(str, wm6Var.f389294f) || p0(-102) || p0(-101)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(B1(), "checkInject start");
        ax4.a.b(wm6Var.f389300o, 113, 1, true);
        L("JSON.stringify(window.__appmsg_skeleton_success__)", new ls1.o(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        int B = i65.a.B(mMWebView.getContext());
        float g17 = i65.a.g(mMWebView.getContext());
        com.tencent.mars.xlog.Log.i(B1(), "adjustInnerWidth() screenWidth:" + B + ", density:" + g17);
        if (B > 0 && g17 > 0.0f) {
            int ceil = (int) java.lang.Math.ceil(B / g17);
            com.tencent.mars.xlog.Log.i(B1(), "adjustInnerWidth() innerWidth:" + ceil);
            L("window.innerWidth = " + ceil, null);
        }
        com.tencent.mars.xlog.Log.i(B1(), "[onPageReady]");
    }

    @Override // com.tencent.mm.plugin.webview.core.e3, com.tencent.mm.plugin.webview.core.r0
    public void r0() {
        r45.wm6 wm6Var = this.N1;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        E(new ls1.h(wm6Var, mMWebView));
        super.r0();
        mMWebView.addJavascriptInterface(new ls1.q(this), this.f320975a2);
        g0().x0(true);
        g0().f340907u = new ls1.r(this);
        java.lang.String str = wm6Var.f389294f;
        com.tencent.mars.xlog.Log.i(B1(), "WebView-Trace loadTmpl getResourceResponse, requrl:%s, url:%s", str, wm6Var.f389295g);
        java.lang.String initFilePath = wm6Var.f389295g;
        kotlin.jvm.internal.o.f(initFilePath, "initFilePath");
        B1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (ls1.c.a(f320974i2, mMWebView, initFilePath) == null) {
            com.tencent.mars.xlog.Log.e(B1(), "return intercepted null");
            ax4.a.b(wm6Var.f389300o, 126, 1, true);
        } else {
            com.tencent.mars.xlog.Log.i(B1(), "return intercepted success");
            I(this.f181937k0);
            mMWebView.loadUrl(str);
            I(this.f181935j0);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.e3
    public void r1() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        mMWebView.setVerticalScrollBarEnabled(false);
        mMWebView.setHorizontalScrollBarEnabled(false);
    }

    @Override // com.tencent.mm.plugin.webview.core.e3
    public boolean v1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return kotlin.jvm.internal.o.b(context.getClass(), com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewMMUI.class);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean w0() {
        return p0(this.f181935j0);
    }
}
