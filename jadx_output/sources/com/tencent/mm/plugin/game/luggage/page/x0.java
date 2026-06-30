package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class x0 extends com.tencent.mm.plugin.webview.luggage.e0 implements sx4.z {

    /* renamed from: i2, reason: collision with root package name */
    public static final /* synthetic */ int f139948i2 = 0;
    public android.view.View E1;
    public com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final sx4.v L1;
    public final com.tencent.mm.game.report.api.GameWebPerformanceInfo M1;
    public long N1;
    public long O1;
    public final sx4.d0 P1;
    public long Q1;
    public final java.util.Map R1;
    public android.view.ViewGroup S1;
    public boolean T1;
    public boolean U1;
    public com.tencent.mm.plugin.game.luggage.page.l V1;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public long Z1;

    /* renamed from: a2, reason: collision with root package name */
    public long f139949a2;

    /* renamed from: b2, reason: collision with root package name */
    public long f139950b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f139951c2;

    /* renamed from: d2, reason: collision with root package name */
    public java.lang.String f139952d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f139953e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f139954f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.page.w0 f139955g2;

    /* renamed from: h2, reason: collision with root package name */
    public zq1.v f139956h2;

    public x0(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        h53.i iVar;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Q1 = 0L;
        this.R1 = new java.util.HashMap();
        this.U1 = false;
        this.W1 = false;
        this.X1 = true;
        this.Y1 = false;
        this.Z1 = 0L;
        this.f139949a2 = 0L;
        this.f139950b2 = 0L;
        this.f139951c2 = null;
        this.f139953e2 = false;
        this.f139954f2 = 0L;
        this.f139956h2 = null;
        this.L1 = new com.tencent.mm.plugin.game.luggage.page.m0(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "initWebPageEnd, __Time__， time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String string = bundle.getString("rawUrl");
        com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(string);
        this.M1 = b17;
        b17.f68175e = P();
        b17.B = java.lang.System.currentTimeMillis();
        this.P1 = R(string);
        android.os.Bundle bundle2 = this.f406657n;
        java.lang.String string2 = bundle2.getString("rawUrl");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            android.net.Uri parse = android.net.Uri.parse(string2);
            java.lang.String queryParameter = com.tencent.mm.ui.bk.C() ? parse.getQueryParameter("darkmode_nav_color") : parse.getQueryParameter("nav_color");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                try {
                    bundle2.putInt("customize_status_bar_color", android.graphics.Color.parseColor("#" + queryParameter));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        java.lang.String N = com.tencent.mm.sdk.platformtools.t8.N(string);
        if (N != null && N.equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
            this.f406655i.f406619e = td.c.f417583a;
        }
        S().f441764l = new com.tencent.mm.plugin.game.luggage.page.k0(this);
        ((com.tencent.mm.plugin.game.luggage.page.b0) this.f406655i.h()).setRawUrl(string);
        uw4.n nVar = this.f182180p;
        if (nVar != null) {
            nVar.evaluateJavascript(";(function(){return window.devicePixelRatio})();", new com.tencent.mm.plugin.game.luggage.o());
        }
        this.f182180p.addJavascriptInterface(new h53.m(com.tencent.mm.plugin.webview.luggage.u1.a(this)), "WxGameJsCoreNative");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_game_create_jscore_android, false)) {
            java.util.LinkedList linkedList = h53.j.f279055m;
            synchronized (h53.j.class) {
                java.util.LinkedList linkedList2 = h53.j.f279055m;
                h53.j jVar = (h53.j) linkedList2.peek();
                if (jVar != null && (iVar = jVar.f279058h) != h53.i.destroyed) {
                    if (iVar == h53.i.stopped) {
                        jVar.f279058h = h53.i.inited;
                        jVar.f279056f.a(new h53.f(jVar, "onResume"));
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameJsCore", "create new");
                linkedList2.addFirst(new h53.j());
            }
            N("created", com.tencent.mm.plugin.webview.luggage.u1.a(this), string);
        }
        this.f139955g2 = new com.tencent.mm.plugin.game.luggage.page.n0(this);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public void C(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onUrlLoadingFinished, url = %s, __Time__, time = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.webview.model.k.b(this.f182180p);
        this.f182186t.setOptionEnable(true);
        w();
        com.tencent.mm.plugin.webview.luggage.x2 x2Var = this.D;
        if (x2Var != null) {
            x2Var.c0("rawUrl", str);
            x2Var.t0(str);
        }
        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = this.F;
        if (handOffURL != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            handOffURL.setUrl(str);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.F);
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.M1;
        if (gameWebPerformanceInfo.F == 0) {
            gameWebPerformanceInfo.F = currentTimeMillis;
        }
        sx4.d0 d0Var = this.P1;
        if (d0Var.f413586e == 0) {
            d0Var.f413586e = currentTimeMillis;
        }
        try {
            if (!this.H1) {
                this.H1 = true;
                jj0.a.a().b(7, java.net.URLEncoder.encode(s()), "", currentTimeMillis - d0Var.f413582a);
            }
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.game.luggage.v0.a(this.f406655i, this.P);
        sx4.u uVar = this.L1.f413666f;
        uVar.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sx4.v vVar = uVar.f413660a;
        vVar.f413663c = currentTimeMillis2;
        vVar.f413664d = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public void D(int i17, java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onReceivedError, errorCode: %d, description: %s, failingUrl: %s , time: %d", java.lang.Integer.valueOf(i17), str, str2, java.lang.Long.valueOf(currentTimeMillis));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errcode", i17);
            jSONObject.put("errurl", str2);
            jj0.a.a().b(8, java.net.URLEncoder.encode(s()), java.net.URLEncoder.encode(jSONObject.toString()), currentTimeMillis - this.P1.f413582a);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public void E(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onUrlRedirect, reqUrl = %s, full = %s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
            this.P = str2;
        }
        uw4.n nVar = this.f182180p;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || nVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.x(str2, map, nVar));
        }
        sd.o0 webCore = this.f182180p.getWebCore();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.webview.luggage.w(webCore, str2));
        }
        boolean y17 = y(str);
        sd.o0 o0Var = this.f406655i;
        if (!y17 && !this.T && !this.f182181p0 && !this.Z) {
            o0Var.f406633i.stopLoading();
            if (map == null || map.size() <= 0) {
                o0Var.j(str2);
            } else {
                o0Var.f406633i.loadUrl(str2, map);
            }
        }
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = (com.tencent.mm.plugin.game.luggage.page.b0) o0Var.h();
        b0Var.S = str2;
        b0Var.T = map;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, fullUrl is null");
        } else if (android.net.Uri.parse(str2).getHost().equals(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy))) {
            com.tencent.mm.plugin.game.luggage.h0.f139559a = str2;
            com.tencent.mm.plugin.game.luggage.h0.f139560b = java.lang.System.currentTimeMillis() / 1000;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, host is not wxgame");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean equals = str.equals(s());
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.M1;
        if (equals) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "getA8Key end, __Time__, time: %d", java.lang.Long.valueOf(currentTimeMillis));
            gameWebPerformanceInfo.H = currentTimeMillis;
        }
        if (gameWebPerformanceInfo.D == 0) {
            gameWebPerformanceInfo.D = currentTimeMillis;
        }
        sx4.d0 d0Var = this.P1;
        if (d0Var.f413588g == 0) {
            d0Var.f413588g = java.lang.System.currentTimeMillis();
        }
        uw4.n nVar2 = this.f182180p;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || nVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.game.luggage.u0(str2, map, nVar2));
        }
        com.tencent.mm.plugin.game.luggage.v0.a(o0Var, str2);
        this.J1 = true;
    }

    public final void L() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f139952d2)) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.pluginsdk.model.b0.f189208l).getValue()).booleanValue()) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            if (com.tencent.mm.pluginsdk.model.b0.f189212p && com.tencent.mm.pluginsdk.model.b0.f189213q != 2) {
                b0Var.v(9L);
                b0Var.a(com.tencent.mm.pluginsdk.model.b0.f189201e, true, 5, com.tencent.mm.pluginsdk.model.u.f189467d);
            }
            com.tencent.mm.pluginsdk.model.b0.f189212p = false;
            java.lang.String str = this.f139952d2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "startCheck fail bizUserName is null");
                return;
            }
            if (this.f139956h2 == null) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                this.f139956h2 = new com.tencent.mm.pluginsdk.model.h(9);
            }
            ((com.tencent.mm.pluginsdk.model.h) this.f139956h2).a(str);
        }
    }

    public void M(java.lang.Runnable runnable) {
        if (!this.Y1) {
            this.Y1 = true;
            this.f182180p.evaluateJavascript("window.performance.getEntriesByName('first-contentful-paint')[0].startTime", new com.tencent.mm.plugin.game.luggage.page.s0(this, runnable));
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // sx4.z
    public java.util.Map M1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(21, P());
        hashMap.put(22, com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
        hashMap.put(23, java.lang.String.valueOf(y7.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        java.lang.String s17 = s();
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            hashMap.put(24, fp.s0.b(s17 == null ? "" : s17, com.tencent.mapsdk.internal.rv.f51270c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        hashMap.put(25, java.lang.Integer.valueOf(y(s17) ? 1 : 0));
        hashMap.put(26, 1);
        if (this instanceof com.tencent.mm.plugin.game.luggage.page.c1) {
            hashMap.put(27, 1);
        } else {
            hashMap.put(27, 0);
        }
        com.tencent.mm.plugin.wepkg.model.WepkgVersion wepkgVersion = S().f441758f;
        hashMap.put(28, wepkgVersion != null ? wepkgVersion.f188376f : "");
        S().getClass();
        hashMap.put(29, vz4.b.a());
        return hashMap;
    }

    public final void N(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (h53.j.d() != null) {
            h53.j d17 = h53.j.d();
            d17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameJsCore", "onPageLifeChanged, state:[%s], pageId:[%s], url:[%s]", str, str2, str3);
            d17.f279056f.a(new h53.g(d17, str, str3, str2));
        }
    }

    public java.lang.String O() {
        return this.f406657n.getString("game_pre_inject_data");
    }

    public java.lang.String P() {
        return (hashCode() & Integer.MAX_VALUE) + "_" + (s().hashCode() & Integer.MAX_VALUE);
    }

    public java.lang.String Q() {
        java.lang.String string = this.f406657n.getString("key_extData");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("extData", string);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebPage", e17.getMessage());
        }
        return jSONObject.toString();
    }

    public sx4.d0 R(java.lang.String str) {
        return sx4.d0.b(str);
    }

    public vz4.x S() {
        return ((com.tencent.mm.plugin.game.luggage.page.b0) this.f182180p).getWePkgPlugin();
    }

    public void T(boolean z17) {
        android.content.Context context = this.f406610d;
        if (z17) {
            this.f182186t.setVisibility(8);
            this.f182193y.setVisibility(0);
            com.tencent.mm.plugin.webview.luggage.util.c.a(((android.app.Activity) context).getWindow(), true);
        } else {
            this.f182186t.setVisibility(0);
            this.f182193y.setVisibility(8);
            com.tencent.mm.plugin.webview.luggage.util.c.a(((android.app.Activity) context).getWindow(), false);
        }
        android.os.Bundle bundle = this.f406657n;
        if (bundle.getBoolean("show_full_screen", false)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(bundle.getString("game_hv_menu_appid"))) {
                this.f182193y.setVisibility(0);
                return;
            }
            if (this.F1 == null) {
                com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton gameMenuImageButton = new com.tencent.mm.plugin.webview.ui.tools.game.menu.GameMenuImageButton(context);
                this.F1 = gameMenuImageButton;
                gameMenuImageButton.a(this.f182184r, new com.tencent.mm.plugin.game.luggage.page.t0(this));
            }
            this.f182193y.setVisibility(8);
        }
    }

    public void U() {
        F(new com.tencent.mm.plugin.game.luggage.page.u0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.s()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L2a
            com.tencent.mm.game.report.api.GameWebPerformanceInfo r0 = r5.M1
            long r1 = r0.G
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            long r1 = java.lang.System.currentTimeMillis()
            r0.G = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            java.lang.String r1 = "MicroMsg.GameWebPage"
            java.lang.String r2 = "startGetA8Key, url: %s, time: %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
        L2a:
            com.tencent.mm.plugin.webview.permission.d r0 = r5.f182178J
            java.util.HashSet r0 = r0.f183381a
            boolean r0 = r0.contains(r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L39
            r5.Q = r2
            goto L5d
        L39:
            com.tencent.mm.plugin.webview.permission.d r0 = r5.f182178J
            com.tencent.mm.plugin.webview.permission.a r3 = r5.B1
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L61
            r4 = -1
            com.tencent.mm.plugin.webview.permission.i r3 = r0.t(r6, r1, r4, r3)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            com.tencent.mm.plugin.webview.permission.i r0 = com.tencent.mm.plugin.webview.permission.i.WILL_GET
            if (r3 != r0) goto L4b
            r1 = r2
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "MicroMsg.LuggageMMWebPage"
            java.lang.String r2 = "startGetA8Key, url: %s, ret: %b"
            com.tencent.mars.xlog.Log.i(r0, r2, r6)
            r5.Q = r1
        L5d:
            return r1
        L5e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r6     // Catch: java.lang.Throwable -> L61
        L61:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.page.x0.V(java.lang.String):boolean");
    }

    @Override // sd.u0, sd.k
    public void b(java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "load url, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        sx4.d0 d0Var = this.P1;
        if (d0Var.f413584c == 0) {
            d0Var.f413584c = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.game.luggage.page.v0 v0Var = new com.tencent.mm.plugin.game.luggage.page.v0(this, str, bundle);
        if (com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "activeIpcTask, service is alive");
            v0Var.run();
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask activeMainProcessTask = new com.tencent.mm.plugin.webview.luggage.ipc.ActiveMainProcessTask();
        activeMainProcessTask.f182228f = new com.tencent.mm.plugin.game.luggage.page.c0(this, currentTimeMillis, activeMainProcessTask, pBool, v0Var, str);
        activeMainProcessTask.d();
        ((ku5.t0) ku5.t0.f312615d).k(new com.tencent.mm.plugin.game.luggage.page.e0(this, pBool, v0Var), 1000L);
    }

    @Override // sd.k
    public void d() {
        tx4.l lVar;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        if (this.G1) {
            this.G1 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onBackground, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mm.sdk.event.IListener iListener = this.f139951c2;
            if (iListener != null) {
                iListener.dead();
                this.f139951c2 = null;
            }
            zq1.v vVar = this.f139956h2;
            if (vVar != null) {
                ((com.tencent.mm.pluginsdk.model.h) vVar).b();
            }
            M(new com.tencent.mm.plugin.game.luggage.page.o0(this));
            sd.x xVar = this.f406612f;
            int indexOf = ((sd.u) xVar).f406653a.f406663d.indexOf(this);
            if (indexOf <= 1 || !(((sd.k) ((sd.u) xVar).f406653a.f406663d.get(indexOf - 1)) instanceof com.tencent.mm.plugin.game.luggage.page.a)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onBackground");
                this.X = false;
                B("onPause");
                com.tencent.mm.plugin.game.luggage.page.u uVar = (com.tencent.mm.plugin.game.luggage.page.u) this.f182186t;
                a53.b bVar = uVar.G;
                if (bVar != null && (k0Var = bVar.f182639c) != null) {
                    k0Var.u();
                }
                b53.f fVar = uVar.H;
                if (fVar != null && (lVar = fVar.f18087c) != null) {
                    lVar.b();
                }
                this.f182180p.onPause();
                this.U = false;
                com.tencent.mm.plugin.webview.luggage.x2 x2Var = this.D;
                if (x2Var != null) {
                    x2Var.z();
                }
                com.tencent.mm.plugin.webview.luggage.x3 x3Var = this.E;
                if (x3Var != null) {
                    x3Var.A();
                }
                java.util.Iterator it = this.R1.values().iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.game.luggage.page.b) it.next()).d();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "report page background");
                e53.b.c(hashCode());
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.M1;
                long j17 = gameWebPerformanceInfo.I;
                long j18 = this.N1;
                gameWebPerformanceInfo.I = j17 + (currentTimeMillis - j18);
                this.O1 += currentTimeMillis - j18;
                this.L1.f413666f.b();
                if (!this.X1 && currentTimeMillis - this.f139954f2 > 1000) {
                    e53.e.b((int) ((currentTimeMillis - this.N1) / 1000), u(), this.f182195y1);
                    this.f139954f2 = currentTimeMillis;
                }
                N("background", com.tencent.mm.plugin.webview.luggage.u1.a(this), null);
            }
        }
    }

    @Override // sd.k
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onDestroy, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        boolean z17 = this.V;
        com.tencent.mm.plugin.webview.luggage.x3 x3Var = this.E;
        if (!z17) {
            this.V = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onDestroy");
            this.A1.dead();
            this.B.f182669j = null;
            synchronized (com.tencent.mm.plugin.webview.luggage.u1.f182626a) {
                com.tencent.mm.plugin.webview.luggage.u1.f182628c.remove(this);
                com.tencent.mm.plugin.webview.luggage.u1.f182629d.remove(com.tencent.mm.plugin.webview.luggage.u1.a(this));
            }
            this.f182184r.removeAllViews();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            sd.o0 o0Var = this.f406655i;
            o0Var.l(context);
            com.tencent.mm.plugin.webview.luggage.x2 x2Var = this.D;
            if (x2Var != null) {
                x2Var.o0();
            }
            if (x3Var != null) {
                if (x3Var.s()) {
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = x3Var.f300077a;
                    java.lang.String str = multiTaskInfo != null ? multiTaskInfo.field_id : null;
                    com.tencent.mm.plugin.webview.permission.d dVar = this.f182178J;
                    java.util.HashMap hashMap = com.tencent.mm.plugin.webview.luggage.z2.f182721a;
                    if (!hashMap.containsKey(str)) {
                        int i17 = com.tencent.mm.plugin.webview.luggage.k2.f182547a;
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sd.q0.f406645a;
                        o0Var.l(context2);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = o0Var.f406618d;
                        java.util.Iterator it = concurrentHashMap2.keySet().iterator();
                        while (it.hasNext()) {
                            o0Var.f406634m.f344520e.remove((java.lang.String) it.next());
                        }
                        concurrentHashMap2.clear();
                        o0Var.f406632h = null;
                        o0Var.f406619e = null;
                        o0Var.f406635n = true;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = sd.q0.f406645a;
                        concurrentHashMap3.put(java.lang.Integer.valueOf(o0Var.hashCode()), o0Var);
                        com.tencent.mars.xlog.Log.i(sd.q0.class.getSimpleName(), "stash, holding size: %d", java.lang.Integer.valueOf(concurrentHashMap3.size()));
                        int intValue = java.lang.Integer.valueOf(o0Var.hashCode()).intValue();
                        com.tencent.mm.plugin.webview.permission.l.f183427a.put(java.lang.Integer.valueOf(o0Var.hashCode()), dVar);
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallManager", "onMultiTaskItemClick, stash, ballKey = %s, ticket = %d", str, java.lang.Integer.valueOf(intValue));
                        hashMap.put(str, java.lang.Integer.valueOf(intValue));
                    }
                } else {
                    B("onDestroy");
                }
            }
            if (this.F != null) {
                ((d73.i) i95.n0.c(d73.i.class)).Ef(this.F);
            }
            com.tencent.mm.plugin.webview.permission.d dVar2 = this.f182178J;
            dVar2.f183396p = true;
            dVar2.f183382b.clear();
            this.f182186t.d();
            android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.f182192x1;
            if (accessibilityStateChangeListener != null) {
                this.f182182p1.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
            }
        }
        e53.b.a(hashCode());
        this.L1.f413666f.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.M1;
        gameWebPerformanceInfo.f68173J = currentTimeMillis;
        if (!this.f406657n.getBoolean("from_bag", false)) {
            jj0.a a17 = jj0.a.a();
            if (a17 != null) {
                a17.e(gameWebPerformanceInfo);
            }
            try {
                if (!this.I1) {
                    this.I1 = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    long j17 = this.Q1;
                    sx4.d0 d0Var = this.P1;
                    if (j17 == 0) {
                        jSONObject.put("render_duration", 0);
                    } else {
                        jSONObject.put("render_duration", j17 - d0Var.f413582a);
                    }
                    jj0.a.a().b(9, java.net.URLEncoder.encode(s()), java.net.URLEncoder.encode(jSONObject.toString()), java.lang.System.currentTimeMillis() - d0Var.f413582a);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        java.util.Collection values = ((java.util.HashMap) this.R1).values();
        if (values != null && values.size() > 0) {
            java.util.Iterator it6 = values.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.game.luggage.page.b) it6.next()).f();
            }
            if (x3Var.s()) {
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = x3Var.f300077a;
                com.tencent.mm.plugin.webview.luggage.z2.a(multiTaskInfo2 != null ? multiTaskInfo2.field_id : null);
            }
        }
        N("destroyed", com.tencent.mm.plugin.webview.luggage.u1.a(this), null);
    }

    @Override // sd.k
    public void g() {
        m53.i5 p17;
        if (!com.tencent.mm.plugin.webview.luggage.u1.f182627b || this.G1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "onForeground, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.G1 = true;
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182186t;
        if ((y1Var instanceof com.tencent.mm.plugin.game.luggage.page.u) && this.f139951c2 == null) {
            final com.tencent.mm.plugin.game.luggage.page.u uVar = (com.tencent.mm.plugin.game.luggage.page.u) y1Var;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent>(uVar) { // from class: com.tencent.mm.plugin.game.luggage.page.GameWebPage$BizFinderLineStatusChangedEventListenerImpl

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.ref.WeakReference f139867d;

                {
                    super(com.tencent.mm.app.a0.f53288d);
                    this.f139867d = new java.lang.ref.WeakReference(uVar);
                    this.__eventId = -1230141771;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent) {
                    java.lang.ref.WeakReference weakReference = this.f139867d;
                    if (weakReference == null || weakReference.get() == null) {
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "callback");
                    com.tencent.mm.plugin.game.luggage.page.u uVar2 = (com.tencent.mm.plugin.game.luggage.page.u) weakReference.get();
                    uVar2.getClass();
                    uVar2.post(new com.tencent.mm.plugin.game.luggage.page.s(uVar2));
                    return false;
                }
            };
            this.f139951c2 = iListener;
            iListener.alive();
        }
        e53.b.b(hashCode());
        L();
        com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo = this.M1;
        if (gameWebPerformanceInfo.f68193z == 0) {
            gameWebPerformanceInfo.f68193z = java.lang.System.currentTimeMillis();
        }
        this.N1 = java.lang.System.currentTimeMillis();
        this.L1.f413666f.d();
        synchronized (com.tencent.mm.plugin.webview.luggage.u1.f182626a) {
            java.util.LinkedList linkedList = com.tencent.mm.plugin.webview.luggage.u1.f182628c;
            if (linkedList.contains(this)) {
                linkedList.remove(this);
                linkedList.addLast(this);
            } else {
                linkedList.add(this);
                com.tencent.mm.plugin.webview.luggage.u1.f182629d.put(com.tencent.mm.plugin.webview.luggage.u1.a(this), this);
            }
        }
        if (!this.X) {
            this.X = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuggageMMWebPage", "onForeground");
            if (this.W) {
                p(false);
            } else {
                l();
                T(this.f406657n.getBoolean("show_full_screen", false));
                if (!this.R) {
                    int i17 = this.f406657n.getInt("customize_status_bar_color");
                    this.S = i17;
                    if (i17 == 0 && (p17 = com.tencent.mm.plugin.game.commlib.i.p()) != null && !com.tencent.mm.sdk.platformtools.t8.K0(p17.f323795d) && !com.tencent.mm.sdk.platformtools.t8.K0(p17.f323797f)) {
                        try {
                            if (com.tencent.mm.ui.bk.C()) {
                                this.S = android.graphics.Color.parseColor(p17.f323797f);
                            } else {
                                this.S = android.graphics.Color.parseColor(p17.f323795d);
                            }
                        } catch (java.lang.IllegalArgumentException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.GameWebPage", "parse color: " + e17.getMessage());
                        }
                        if (this.S == 0) {
                            this.S = b3.l.getColor(this.f406610d, com.tencent.mm.R.color.f478586bk);
                        }
                    }
                }
                if (!this.K1) {
                    this.K1 = true;
                    G();
                }
                com.tencent.mm.plugin.webview.luggage.y1 y1Var2 = this.f182186t;
                java.lang.Integer num = y1Var2.B;
                if (num != null) {
                    vj5.h hVar = y1Var2.f182692d;
                    hVar.f437715u = null;
                    vj5.a.a(hVar, num.intValue(), !y1Var2.C);
                }
                B("onResume");
                this.f182180p.onResume();
                this.U = true;
                r(0);
                if (this.Y) {
                    this.D.x();
                    this.E.z();
                }
                ((com.tencent.mm.plugin.game.luggage.page.u) this.f182186t).l();
            }
        }
        this.f139950b2 = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.HashMap) this.R1).values().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.game.luggage.page.b) it.next()).g();
        }
        N("foreground", com.tencent.mm.plugin.webview.luggage.u1.a(this), null);
        this.X1 = false;
    }

    @Override // sd.u0
    public void i() {
        if (this.U) {
            this.f139949a2 += java.lang.System.currentTimeMillis() - this.f139950b2;
        }
        M(new com.tencent.mm.plugin.game.luggage.page.p0(this));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0, sd.u0
    public android.view.View k() {
        android.view.View k17 = super.k();
        android.view.View inflate = android.view.LayoutInflater.from(this.f406610d).inflate(com.tencent.mm.R.layout.bgw, (android.view.ViewGroup) this.f182196z, false);
        this.E1 = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "initContentView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "initContentView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f182196z.addView(this.E1, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPage", "create vie end, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return k17;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public android.view.View m() {
        com.tencent.mm.plugin.game.luggage.page.u uVar = new com.tencent.mm.plugin.game.luggage.page.u(this);
        this.f182186t = uVar;
        return uVar;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public boolean v(int i17) {
        td.c cVar = this.f406655i.f406619e;
        td.c cVar2 = td.c.f417583a;
        if ((cVar == null ? cVar2 : cVar) == cVar2) {
            return true;
        }
        if (cVar == null) {
            cVar = cVar2;
        }
        return cVar != td.c.f417584b && this.f182178J.h(u()).d(i17) == 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public void w() {
        android.view.View view = this.E1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // sx4.z
    public java.util.Map w5() {
        java.util.HashMap hashMap = new java.util.HashMap();
        sx4.d0 c17 = sx4.d0.c(s());
        if (c17 != null) {
            hashMap.put(30, java.lang.Long.valueOf(c17.f413584c - c17.f413583b));
            hashMap.put(31, java.lang.Long.valueOf(c17.f413585d - c17.f413583b));
            hashMap.put(32, java.lang.Long.valueOf(c17.f413586e - c17.f413585d));
            hashMap.put(33, java.lang.Long.valueOf(c17.f413588g - c17.f413587f));
            hashMap.put(34, java.lang.Long.valueOf(c17.f413590i - c17.f413589h));
            hashMap.put(45, java.lang.Long.valueOf(c17.f413591j));
            hashMap.put(50, java.lang.Long.valueOf(c17.f413592k));
            hashMap.put(38, java.lang.Long.valueOf(c17.f413593l));
            hashMap.put(39, java.lang.Long.valueOf(c17.f413594m));
            hashMap.put(40, java.lang.Long.valueOf(c17.f413595n));
            hashMap.put(41, java.lang.Long.valueOf(c17.f413596o));
            hashMap.put(42, java.lang.Long.valueOf(c17.f413597p));
            hashMap.put(43, java.lang.Long.valueOf(c17.f413598q));
            hashMap.put(44, java.lang.Long.valueOf(c17.f413599r));
            hashMap.put(51, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            hashMap.put(52, java.lang.Long.valueOf(c17.f413600s));
            hashMap.put(70, java.lang.Long.valueOf(c17.f413583b - c17.f413591j));
        }
        vz4.x S = S();
        if (!S.f441756d) {
            S.f441769q = null;
        }
        hashMap.put(49, java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(S.f441769q) ? 1 : 0));
        hashMap.put(53, java.lang.Integer.valueOf(this.X1 ? 1 : 0));
        hashMap.put(54, java.lang.Integer.valueOf(this.W1 ? 1 : 0));
        hashMap.put(55, java.lang.Long.valueOf(this.Z1));
        hashMap.put(56, java.lang.Long.valueOf(this.f139949a2));
        return hashMap;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.e0
    public boolean y(java.lang.String str) {
        com.tencent.mm.plugin.game.luggage.page.b0 b0Var = (com.tencent.mm.plugin.game.luggage.page.b0) this.f182180p;
        boolean z17 = b0Var.Q;
        vz4.x xVar = b0Var.P;
        if (!z17) {
            xVar.e(str, true, false);
            b0Var.Q = true;
        }
        return xVar.d(str);
    }
}
