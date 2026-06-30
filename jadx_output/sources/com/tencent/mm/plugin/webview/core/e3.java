package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public class e3 extends com.tencent.mm.plugin.webview.core.r0 {
    public final com.tencent.mm.plugin.webview.core.u1 A1;
    public java.lang.String B1;
    public final boolean C1;
    public final com.tencent.mm.plugin.webview.core.j2 D1;
    public final com.tencent.mm.plugin.webview.core.b2 E1;
    public final com.tencent.mm.plugin.webview.core.i2 F1;
    public final com.tencent.mm.plugin.webview.core.z1 G1;
    public final com.tencent.mm.plugin.webview.core.v1 H1;
    public final com.tencent.mm.plugin.webview.core.f2 I1;
    public final com.tencent.mm.plugin.webview.core.w1 J1;
    public long K1;
    public final com.tencent.mm.plugin.webview.core.y1 L1;
    public final com.tencent.mm.plugin.webview.core.a2 M1;
    public final com.tencent.mm.plugin.webview.model.b6 S0;
    public final jz5.g T0;
    public final jz5.g U0;
    public com.tencent.mm.plugin.webview.ui.tools.c6 V0;
    public com.tencent.mm.plugin.webview.ui.tools.ld W0;
    public dy4.l X0;
    public final com.tencent.mm.plugin.webview.ui.tools.floatball.x Y0;
    public final com.tencent.mm.plugin.webview.ui.tools.u4 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public cw4.e0 f181799a1;

    /* renamed from: b1, reason: collision with root package name */
    public ex4.a f181800b1;

    /* renamed from: c1, reason: collision with root package name */
    public final jz5.g f181801c1;

    /* renamed from: d1, reason: collision with root package name */
    public final jz5.g f181802d1;

    /* renamed from: e1, reason: collision with root package name */
    public final jz5.g f181803e1;

    /* renamed from: f1, reason: collision with root package name */
    public final jz5.g f181804f1;

    /* renamed from: g1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.t4 f181805g1;

    /* renamed from: h1, reason: collision with root package name */
    public final jz5.g f181806h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f181807i1;

    /* renamed from: j1, reason: collision with root package name */
    public final jz5.g f181808j1;

    /* renamed from: k1, reason: collision with root package name */
    public java.lang.String f181809k1;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f181810l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f181811m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f181812n1;

    /* renamed from: o1, reason: collision with root package name */
    public final java.lang.String f181813o1;

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.Set f181814p1;

    /* renamed from: q1, reason: collision with root package name */
    public final jz5.g f181815q1;

    /* renamed from: r1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.l2 f181816r1;

    /* renamed from: s1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.n2 f181817s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f181818t1;

    /* renamed from: u1, reason: collision with root package name */
    public final java.util.List f181819u1;

    /* renamed from: v1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.t2 f181820v1;

    /* renamed from: w1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.c2 f181821w1;

    /* renamed from: x1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.x1 f181822x1;

    /* renamed from: y1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.d2 f181823y1;

    /* renamed from: z1, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.e2 f181824z1;

    public /* synthetic */ e3(com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.model.b6 b6Var, zg0.k2 k2Var, java.util.Set set, nw4.j jVar, int i17, kotlin.jvm.internal.i iVar) {
        this(mMWebView, (i17 & 2) != 0 ? new com.tencent.mm.plugin.webview.model.b6() : b6Var, (i17 & 4) != 0 ? new zg0.k2(null, false, false, false, false, 0, false, 127, null) : k2Var, (i17 & 8) != 0 ? null : set, (i17 & 16) == 0 ? jVar : null);
    }

    public static final void d1(com.tencent.mm.plugin.webview.core.e3 e3Var, int i17) {
        e3Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("update_type_key", i17);
        try {
            e3Var.e0().ng(1, bundle, e3Var.U());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "doUpdate fail, ex = " + e17.getMessage());
        }
    }

    public static final void e1(com.tencent.mm.plugin.webview.core.e3 e3Var, int i17) {
        e3Var.getClass();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("scene_end_type", i17);
            bundle.putInt("scene_end_listener_hash_code", e3Var.j1().e());
            e3Var.e0().ng(6, bundle, e3Var.j1().e());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "removeSceneEnd, ex = " + e17.getMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean A0() {
        java.util.Iterator it = this.X.iterator();
        while (it.hasNext()) {
            if (!((com.tencent.mm.plugin.webview.core.i3) it.next()).k(i())) {
                return false;
            }
        }
        java.lang.String stringExtra = d0().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        return (stringExtra == null || r26.n0.N(stringExtra)) && !this.f181918b.f472752e;
    }

    public final void A1(int i17) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.core.w2(this, i17, (i17 < 1 || i17 > 8) ? 2 : i17));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(44:6|(11:8|(1:10)(1:27)|11|(1:13)(1:26)|14|(1:16)(1:25)|17|(1:19)(1:24)|20|(1:22)|23)|28|(4:30|(4:32|33|34|35)|39|35)|40|(1:42)|43|(2:44|(2:46|(2:48|49)(1:136))(2:137|138))|50|51|52|53|(1:55)|56|(1:58)(1:132)|59|(2:128|129)|61|(2:63|64)|68|69|70|(1:125)(1:74)|(1:76)(2:(1:124)(1:121)|(1:123))|77|(1:79)|80|(1:82)(1:117)|83|(1:85)|86|(2:89|87)|90|91|92|93|94|(2:95|96)|97|(2:99|(1:103))|104|105|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0663, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0664, code lost:
    
        com.tencent.mars.xlog.Log.w(o1(), "postBinded, jumpToActivity, ex = " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0633  */
    @Override // com.tencent.mm.plugin.webview.core.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0() {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.C0():void");
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public void D0() {
        boolean p07 = p0(this.f181933i0);
        jz5.g gVar = this.f181804f1;
        if (p07) {
            ((com.tencent.mm.plugin.webview.core.l2) ((jz5.n) gVar).getValue()).a("", com.tencent.mm.sdk.platformtools.t8.i1(), 0);
        }
        com.tencent.mm.plugin.webview.ui.tools.u uVar = (com.tencent.mm.plugin.webview.ui.tools.u) ((jz5.n) this.f181808j1).getValue();
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebView.MMSslErrorHandler", "detach");
        uVar.f186914a = null;
        uVar.f186915b = null;
        ((java.util.HashMap) uVar.f186916c).clear();
        ((java.util.HashMap) uVar.f186917d).clear();
        if (t1()) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("srcUsername", d0().getStringExtra("srcUsername"));
                e0().ng(30, bundle, U());
            } catch (java.lang.Exception unused) {
            }
        }
        try {
            e0().A5(j1().e());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(o1(), "onDestroy remove callbacker ex " + e17.getMessage());
        }
        com.tencent.mm.plugin.webview.model.f3 f3Var = ((com.tencent.mm.plugin.webview.core.o2) this.f181816r1).f181903c;
        if (f3Var != null) {
            f3Var.c();
        }
        com.tencent.mm.plugin.webview.core.l2 l2Var = (com.tencent.mm.plugin.webview.core.l2) ((jz5.n) gVar).getValue();
        android.os.MessageQueue.IdleHandler idleHandler = l2Var.f181875h;
        if (idleHandler != null) {
            android.os.Looper.myQueue().removeIdleHandler(idleHandler);
            l2Var.f181875h = null;
        }
        this.K = true;
        if (!this.L) {
            N0(false);
        }
        com.tencent.mm.plugin.webview.core.x0 x0Var = this.G0;
        if (x0Var != null) {
            try {
                com.tencent.mars.xlog.Log.i(T(), "unbindService");
                vz5.b.a(x0Var, null);
            } finally {
            }
        }
        b0().removeCallbacksAndMessages((java.lang.Runnable) ((jz5.n) this.T).getValue());
        g0().n();
        nw4.v2 f07 = f0();
        f07.f340990a = null;
        f07.f340991b = null;
        f07.f340992c = null;
        dead();
        com.tencent.mm.plugin.webview.permission.d O = O();
        O.f183396p = true;
        O.f183382b.clear();
        int i17 = O().E.f387989i;
        if (i17 <= 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (i17 > 0) {
            h0().getClass();
        }
        this.V.d();
        this.Z.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0045, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d A[LOOP:1: B:51:0x0147->B:53:0x014d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // com.tencent.mm.plugin.webview.core.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F0() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.F0():void");
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean H(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public void H0() {
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.X;
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            if (((com.tencent.mm.plugin.webview.core.i3) it.next()).p(i(), d0())) {
                return;
            }
        }
        z1(Y(), i(), this.V0, e42.d0.clicfg_android_webview_menu_search_ai_h5);
        if (p1(i())) {
            return;
        }
        boolean A0 = A0();
        zw4.d dVar = this.f181928g;
        if (A0) {
            com.tencent.mars.xlog.Log.i(o1(), "needSyncGetA8Key");
            zw4.b bVar = zw4.b.f476889f;
            dVar.getClass();
            dVar.f476908n = bVar;
            zw4.n.f476934a.b(zw4.a.f476881f, dVar);
            com.tencent.mm.plugin.webview.core.r0.W0(this, i(), false, 0, 6, null);
            return;
        }
        com.tencent.mars.xlog.Log.i(o1(), "terry onStartLoad:" + i());
        java.lang.String str = (java.lang.String) ((jz5.n) this.f181927f0).getValue();
        boolean z17 = str == null || r26.n0.N(str);
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = this.Z;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(o1(), str);
            if (d0().getBooleanExtra("QRDataFlag", true)) {
                try {
                    str = e0().S1(str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w(o1(), "postBinded, formatQRString, ex = " + e17.getMessage());
                }
            }
            mMWebView.getSettings().P(false);
            mMWebView.getSettings().G(false);
            mMWebView.getSettings().E(false);
            java.util.Iterator it6 = concurrentLinkedDeque2.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.webview.core.f3) it6.next()).p(true);
            }
            this.f181916a.loadDataWithBaseURL(null, str, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
            com.tencent.mars.xlog.Log.i(o1(), "loadDataWithBaseUrl, data = " + str);
            return;
        }
        if (N(i())) {
            com.tencent.mars.xlog.Log.f(o1(), "postBinded 2, canLoadUrl fail, url = " + i());
            return;
        }
        if (this.f181918b.f472752e) {
            this.R.g(i(), null, null);
        }
        java.util.Iterator it7 = concurrentLinkedDeque.iterator();
        while (it7.hasNext()) {
            if (((com.tencent.mm.plugin.webview.core.i3) it7.next()).o(i())) {
                return;
            }
        }
        if (mMWebView.f211371t) {
            return;
        }
        zw4.b bVar2 = zw4.b.f476889f;
        dVar.getClass();
        dVar.f476908n = bVar2;
        zw4.n.f476934a.b(zw4.a.f476881f, dVar);
        java.util.Iterator it8 = concurrentLinkedDeque2.iterator();
        while (it8.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it8.next()).p(false);
        }
        zg0.q2.b(this, i(), null, false, 6, null);
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public boolean I0(com.tencent.xweb.WebView webView, java.lang.String url) {
        com.tencent.mm.plugin.webview.core.h3 h3Var;
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i(o1(), "WebView-Trace shouldOverride url = ".concat(url));
        com.tencent.mm.plugin.webview.core.t2 t2Var = this.f181820v1;
        t2Var.getClass();
        if (!com.tencent.mm.plugin.webview.model.k2.e(url, t2Var.f181986g.d0().getIntExtra("geta8key_scene", 0)) && this.f181918b.f472754g) {
            if (com.tencent.mm.plugin.webview.modeltools.c0.f183246a == null) {
                com.tencent.mm.plugin.webview.modeltools.c0.f183246a = new java.util.ArrayList();
            }
            if (!com.tencent.mm.plugin.webview.modeltools.c0.f183246a.contains(url)) {
                com.tencent.mm.plugin.webview.modeltools.c0.f183246a.add(url);
            }
        }
        java.util.Iterator it = this.X.iterator();
        while (true) {
            if (!it.hasNext()) {
                h3Var = new com.tencent.mm.plugin.webview.core.h3(false, false);
                break;
            }
            h3Var = ((com.tencent.mm.plugin.webview.core.i3) it.next()).r(webView, url);
            if (h3Var.f181845a) {
                break;
            }
        }
        if (h3Var.f181845a) {
            return h3Var.f181846b;
        }
        if (N(url)) {
            com.tencent.mars.xlog.Log.f(o1(), "shouldOverrideUrlLoading, canLoadUrl fail, url = ".concat(url));
            return true;
        }
        if (nf.e.c(url, "about:blank", true)) {
            com.tencent.mars.xlog.Log.e(o1(), "shouldOverride, url is about:blank");
            return true;
        }
        vz.g1 g1Var = (vz.g1) i95.n0.c(vz.g1.class);
        java.lang.String i17 = i1();
        ((uz.c) g1Var).getClass();
        if (com.tencent.mm.plugin.downloader.model.o.a(url, i17, webView)) {
            com.tencent.mars.xlog.Log.i(o1(), "use the downloader to download");
            return true;
        }
        if (nf.e.c(url, "weixinping://iframe", true) || nf.e.c(url, "weixinpreinject://iframe", true)) {
            return true;
        }
        if (h1(url)) {
            com.tencent.mars.xlog.Log.i(o1(), "weixin scheme url deal success, url = ".concat(url));
            return true;
        }
        if (g1(url)) {
            com.tencent.mars.xlog.Log.i(o1(), "custom scheme url deal success, url = ".concat(url));
            return true;
        }
        com.tencent.mm.plugin.webview.model.k.c(webView instanceof com.tencent.mm.ui.widget.MMWebView ? (com.tencent.mm.ui.widget.MMWebView) webView : null, url, u1());
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public int Q() {
        return k0(d0().getStringExtra("geta8key_username"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.webview.core.r0
    public void T0(boolean z17, android.content.Context context) {
        pw4.c cVar = this.f181938l;
        cVar.f358712a = z17 ? 1 : 0;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        if (context == null) {
            context = mMWebView.getActivityContextIfHas();
        }
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewController", "[setupWebViewEnv] context is not Activity, skip setupWebViewEnv");
            return;
        }
        com.tencent.mm.ui.bl.h(context);
        float mMDensity = mMWebView.getMMDensity();
        float a17 = ((mMDensity > 0.0f ? 1 : (mMDensity == 0.0f ? 0 : -1)) == 0) != false ? 0.0f : com.tencent.mm.ui.bl.a(context) / mMDensity;
        float p17 = mMDensity == 0.0f ? 0.0f : com.tencent.mm.ui.bk.p(mMWebView.getActivityContextIfHas()) / mMDensity;
        cVar.f358714c = a17 + p17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewController", "[setupWebViewEnv] setNormalTopInset: actionBarLogicHeight=%f  statusBarLogicHeight=%f", java.lang.Float.valueOf(a17), java.lang.Float.valueOf(p17));
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public java.lang.String V(java.lang.String str) {
        java.lang.String str2 = "";
        if (!android.text.TextUtils.isEmpty(str)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("webview_binder_id", U());
            bundle.putString("rawUrl", str);
            try {
                java.lang.String string = e0().i(76, bundle).getString("appId");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string != null) {
                    str2 = string;
                }
                com.tencent.mars.xlog.Log.i(o1(), "stev cachedAppId %s", str2);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w(o1(), "get cachedAppId error %s", th6.getMessage());
            }
        }
        return str2;
    }

    public final void f1(int i17) {
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("scene_end_type", i17);
            bundle.putInt("scene_end_listener_hash_code", j1().e());
            e0().ng(5, bundle, j1().e());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(o1(), "addSceneEnd, ex = " + e17.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023b  */
    @Override // com.tencent.mm.plugin.webview.permission.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r11, java.lang.String r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.g(int, java.lang.String, java.lang.Object):boolean");
    }

    public final boolean g1(java.lang.String str) {
        java.lang.String str2 = str;
        com.tencent.mars.xlog.Log.i(o1(), "dealCustomScheme, url = " + str2);
        if (str2 == null || str.length() == 0) {
            return false;
        }
        try {
            if (e0().r6(str2)) {
                com.tencent.mars.xlog.Log.i(o1(), "dealCustomScheme, url is handled by QrCodeURLHelper, url = " + str2);
                e0().Gd(str2, U());
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(o1(), "dealCustomScheme, tryHandleEvents, ex = " + e17.getMessage());
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse != null && !r26.i0.y(str2, "weixin://", false) && !r26.i0.y(str2, "http", false)) {
            java.lang.String str3 = "";
            if (r26.i0.y(str2, "tel:", false)) {
                java.lang.String t17 = r26.i0.t(str2, "tel:", "", false);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                    try {
                        e0().u1(t17, U());
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.w(o1(), "showPhoneSpanDialog, ex = %s", e18.getMessage());
                    }
                }
                return true;
            }
            if (r26.i0.y(str2, "sms:", false) || r26.i0.y(str2, "smsto:", false)) {
                com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
                if (mMWebView.getActivityContextIfHas() == null) {
                    com.tencent.mars.xlog.Log.e(o1(), "sms, viewWV.activityContextIfHas = null");
                    return true;
                }
                android.content.Context activityContextIfHas = mMWebView.getActivityContextIfHas();
                kotlin.jvm.internal.o.f(activityContextIfHas, "getActivityContextIfHas(...)");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("sms:(\\d*)(\\?body=(.*))?");
                kotlin.jvm.internal.o.f(compile, "compile(...)");
                java.lang.String decode = java.net.URLDecoder.decode(str2, com.tencent.mapsdk.internal.rv.f51270c);
                kotlin.jvm.internal.o.d(decode);
                java.util.regex.Matcher matcher = compile.matcher(decode);
                kotlin.jvm.internal.o.f(matcher, "matcher(...)");
                r26.q qVar = !matcher.matches() ? null : new r26.q(matcher, decode);
                java.lang.String str4 = qVar != null ? (java.lang.String) kz5.n0.a0(qVar.a(), 1) : null;
                java.lang.String str5 = qVar != null ? (java.lang.String) kz5.n0.a0(qVar.a(), 3) : null;
                if (str4 == null || str4.length() == 0) {
                    str3 = activityContextIfHas.getString(com.tencent.mm.R.string.k4j);
                } else {
                    if (!(str4 == null || str4.length() == 0)) {
                        if (str5 == null || str5.length() == 0) {
                            str3 = com.tencent.mm.sdk.platformtools.t8.z1(activityContextIfHas.getString(com.tencent.mm.R.string.k4k), str4);
                        }
                    }
                    if (!(str4 == null || str4.length() == 0)) {
                        if (!(str5 == null || str5.length() == 0)) {
                            str3 = com.tencent.mm.sdk.platformtools.t8.z1(activityContextIfHas.getString(com.tencent.mm.R.string.k4l), str5, str4);
                        }
                    }
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUI.SMSQueryHelper", "sms, url is illegal, url = %s", str);
                } else {
                    pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.g3(activityContextIfHas, str3, str2));
                }
                return true;
            }
            if (r26.i0.y(str2, "mailto:", false)) {
                android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
                intent.addFlags(268435456);
                intent.setData(parse);
                try {
                    android.content.Context Y = Y();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(Y, arrayList.toArray(), "com/tencent/mm/plugin/webview/core/WebViewController", "dealCustomScheme", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    Y.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(Y, "com/tencent/mm/plugin/webview/core/WebViewController", "dealCustomScheme", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e(o1(), "start mailto app failed:[%s]", e19.getMessage());
                }
                return true;
            }
            try {
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.printErrStackTrace(o1(), e27, "", new java.lang.Object[0]);
            }
            if (!((this.R.b().f192177d & 8192) != 0) && e0().lb()) {
                com.tencent.mars.xlog.Log.e(o1(), "dealCustomScheme, not allow outer open url");
                return true;
            }
            int intExtra = d0().getIntExtra("key_download_restrict", 0);
            java.lang.String stringExtra = d0().getStringExtra("key_function_id");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14596, stringExtra, java.lang.Integer.valueOf(intExtra), 1);
            }
            if (intExtra == 1) {
                com.tencent.mars.xlog.Log.e(o1(), "not allow launch app by custom scheme : %s", str);
                return true;
            }
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1() - this.f181818t1;
            com.tencent.mars.xlog.Log.i(o1(), "scheme launch interval ; %d", java.lang.Long.valueOf(i17));
            if (i17 <= 2) {
                java.lang.String Z = Z();
                try {
                    Z = fp.s0.b(Z, com.tencent.mapsdk.internal.rv.f51270c);
                    str2 = fp.s0.b(str2, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.i(o1(), "formate url failed");
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13983, 4, Z, str2);
            }
            if (d0().getBooleanExtra("show_openapp_dialog", true)) {
                return p95.a.a(new com.tencent.mm.plugin.webview.core.p2(this, parse));
            }
            android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", parse);
            intent2.addFlags(268435456);
            if (com.tencent.mm.sdk.platformtools.t8.I0(Y(), intent2, true, false)) {
                try {
                    android.content.Context Y2 = Y();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(Y2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/core/WebViewController", "dealCustomScheme", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    Y2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(Y2, "com/tencent/mm/plugin/webview/core/WebViewController", "dealCustomScheme", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(o1(), e28, "", new java.lang.Object[0]);
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h1(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.h1(java.lang.String):boolean");
    }

    public final java.lang.String i1() {
        return !p0(this.f181933i0) ? "" : d0().getStringExtra("KPublisherId");
    }

    @Override // com.tencent.mm.plugin.webview.core.r0, zg0.q2
    public void j(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String T = T();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(U());
        pw4.c cVar = this.f181938l;
        com.tencent.mars.xlog.Log.i(T, "startWebViewController#%s, isPreload: %s", valueOf, java.lang.Boolean.valueOf(cVar.f358728q));
        this.f181915J = true;
        this.B = intent;
        alive();
        E(new yw4.b(intent.getIntExtra(com.tencent.mm.ui.w2.f211197j, -1), new yw4.a(i())));
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("hardcode_jspermission");
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = parcelableExtra instanceof com.tencent.mm.protocal.JsapiPermissionWrapper ? (com.tencent.mm.protocal.JsapiPermissionWrapper) parcelableExtra : null;
        android.os.Parcelable parcelableExtra2 = intent.getParcelableExtra("hardcode_general_ctrl");
        com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper = parcelableExtra2 instanceof com.tencent.mm.protocal.GeneralControlWrapper ? (com.tencent.mm.protocal.GeneralControlWrapper) parcelableExtra2 : null;
        com.tencent.mm.plugin.webview.permission.w wVar = this.R;
        wVar.h(jsapiPermissionWrapper, generalControlWrapper);
        if (intent.hasExtra("scan_jspermission") && intent.hasExtra("scan_general_ctrl")) {
            java.lang.String i17 = i();
            android.os.Parcelable parcelableExtra3 = intent.getParcelableExtra("scan_jspermission");
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper2 = parcelableExtra3 instanceof com.tencent.mm.protocal.JsapiPermissionWrapper ? (com.tencent.mm.protocal.JsapiPermissionWrapper) parcelableExtra3 : null;
            android.os.Parcelable parcelableExtra4 = intent.getParcelableExtra("scan_general_ctrl");
            wVar.g(i17, jsapiPermissionWrapper2, parcelableExtra4 instanceof com.tencent.mm.protocal.GeneralControlWrapper ? (com.tencent.mm.protocal.GeneralControlWrapper) parcelableExtra4 : null);
        }
        I(this.f181933i0);
        hy4.k0 k0Var = this.V;
        long j17 = k0Var.f286137s;
        long j18 = k0Var.f286140v;
        cx4.n procBootType = k0Var.f286135q;
        zw4.d dVar = this.f181928g;
        dVar.getClass();
        kotlin.jvm.internal.o.g(procBootType, "procBootType");
        dVar.f476895a = java.lang.System.currentTimeMillis();
        dVar.f476898d = j17;
        dVar.f476899e = j18;
        dVar.f476901g = procBootType;
        dVar.f476900f.clear();
        dVar.f476903i = cx4.s.b();
        dVar.f476905k = cVar.f358728q;
        dVar.f476904j = k0Var.f286134p;
        java.lang.String i18 = i();
        kotlin.jvm.internal.o.g(i18, "<set-?>");
        dVar.f476896b = i18;
        java.lang.String str = (java.lang.String) ((jz5.n) this.f181958v).getValue();
        kotlin.jvm.internal.o.f(str, "<get-prefetchId>(...)");
        dVar.f476897c = str;
        cx4.n nVar = this.f181960w;
        kotlin.jvm.internal.o.g(nVar, "<set-?>");
        dVar.f476902h = nVar;
        if (!this.f181807i1) {
            vw4.b bVar = vw4.b.f441212a;
            java.lang.String i19 = i();
            if ((i19 == null || i19.length() == 0 ? false : r26.n0.D(i19, "adCgiRedirect=1", false, 2, null)) || bVar.d(i19)) {
                boolean c17 = bVar.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHighRiskAdH5Interceptor", "checkInitAdInterceptor, controller.hash=" + hashCode() + "，rawUrl=" + i() + ", expt=" + c17);
                java.lang.String i27 = i();
                boolean D = i27 == null || i27.length() == 0 ? false : r26.n0.D(i27, "adCgiRedirect=1", false, 2, null);
                boolean d17 = bVar.d(i());
                if (D) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1951, 2);
                }
                if (d17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1951, 11);
                }
                if (c17) {
                    E(new vw4.c());
                    this.f181807i1 = true;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1951, 1);
                }
            }
        }
        n1().b(d0().getBooleanExtra("KSetHiddenOnCaptureAsDefault", false), com.tencent.mm.plugin.webview.ui.tools.qd.f186782d);
        hashCode();
        i();
    }

    public final com.tencent.mm.plugin.webview.core.h2 j1() {
        return (com.tencent.mm.plugin.webview.core.h2) ((jz5.n) this.f181815q1).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169  */
    @Override // com.tencent.xweb.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.tencent.xweb.WebView r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.k(com.tencent.xweb.WebView, java.lang.String, boolean):void");
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public int k0(java.lang.String str) {
        int i17 = this.f181918b.f472753f;
        if (i17 != 0) {
            return i17;
        }
        int i18 = 0;
        int intExtra = d0().getIntExtra("geta8key_scene", 0);
        if (intExtra == 0) {
            intExtra = 1;
            if (!(str == null || str.length() == 0)) {
                try {
                    if (p0(this.f181931h0)) {
                        if (e0().wc(str)) {
                            intExtra = 8;
                        } else if (e0().j8(str)) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("enterprise_biz_username", str);
                            try {
                                android.os.Bundle i19 = e0().i(102, bundle);
                                if (i19 != null) {
                                    i19.getBoolean("is_enterprise_username");
                                }
                            } catch (android.os.RemoteException unused) {
                                com.tencent.mars.xlog.Log.e(o1(), "invoke the check enterprise failed");
                            }
                            intExtra = 7;
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(o1(), "getScene fail, ex = " + e17.getMessage());
                }
            }
            com.tencent.mars.xlog.Log.i(o1(), "KGetA8KeyScene = %s", java.lang.Integer.valueOf(i18));
            return i18;
        }
        i18 = intExtra;
        com.tencent.mars.xlog.Log.i(o1(), "KGetA8KeyScene = %s", java.lang.Integer.valueOf(i18));
        return i18;
    }

    public final java.lang.String k1() {
        java.lang.String title = this.f181916a.getTitle();
        if (title != null) {
            return title;
        }
        java.lang.String stringExtra = d0().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra != null) {
            return stringExtra;
        }
        java.lang.String stringExtra2 = d0().getStringExtra("webpageTitle");
        return stringExtra2 == null ? "" : stringExtra2;
    }

    @Override // com.tencent.xweb.h1
    public void l(com.tencent.xweb.WebView webView, java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i(o1(), "edw onLoadResource opt, url = ".concat(url));
        if (N(url)) {
            com.tencent.mars.xlog.Log.f(o1(), "onLoadResource, canLoadUrl fail, url = ".concat(url));
            return;
        }
        com.tencent.mm.plugin.webview.model.v5 d17 = this.S0.d();
        d17.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onLoadResource failed, url is null");
            return;
        }
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17.f183154c) || url.equals(d17.f183154c) || !d17.f183155d) {
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = d17.f183152a;
            if (concurrentHashMap.containsKey(d17.f183154c)) {
                concurrentHashMap.put(d17.f183154c, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Long) concurrentHashMap.get(d17.f183154c)).longValue()));
            }
            d17.f183155d = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewReporter", e17, "onLoadResource", new java.lang.Object[0]);
        }
    }

    public final android.graphics.Point l1() {
        return this.f181820v1.f181982c;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022e  */
    @Override // com.tencent.xweb.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(com.tencent.xweb.WebView r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.m(com.tencent.xweb.WebView, java.lang.String):void");
    }

    public final long m1() {
        return this.f181820v1.f181983d;
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        java.lang.String str2;
        android.os.Parcelable parcelable;
        java.lang.String str3;
        if (v0()) {
            com.tencent.mars.xlog.Log.w(T(), "ActivityFinished");
        } else {
            if (webView == null || (str2 = webView.getUrl()) == null) {
                str2 = str;
            }
            java.lang.String W = W(str2 == null ? "" : str2);
            com.tencent.mars.xlog.Log.i(T(), "WebView-Trace onPageFinished#" + U() + ": " + str2 + ", callbackUrl:" + W);
            if (!this.B0.contains(java.lang.Integer.valueOf(this.f181951r0)) && !w0()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1200L, 104L, 1L, false);
                com.tencent.mars.xlog.Log.i(T(), "WebView-Trace onPageFinished#" + U() + " callback before onPageCommitVisible");
            }
            J(this.f181953s0, B0(str2));
            java.util.Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.core.o1 o1Var = (com.tencent.mm.plugin.webview.core.o1) it.next();
                if (x0()) {
                    o1Var.g(webView, W);
                }
            }
            K(webView, str2);
        }
        this.V.a("onPageFinished", java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.webview.model.k.c(this.f181916a, str, u1());
        if (H(str)) {
            return;
        }
        if (!this.f181812n1) {
            this.f181812n1 = true;
            hy4.l0 l0Var = this.f181934j;
            if (l0Var != null) {
                l0Var.f286162l = java.lang.System.currentTimeMillis();
            }
            hy4.l0 l0Var2 = this.f181934j;
            if (l0Var2 != null) {
                l0Var2.f286157g = l0Var2.f286159i - l0Var2.f286158h;
                long j17 = l0Var2.f286162l - l0Var2.f286151a;
                if (j17 > 0) {
                    l0Var2.f286155e = ((km0.c) gm0.j1.p().a()).f308991e.f308986f > l0Var2.f286151a;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Web-Trace Report kernelMode=");
                    int i17 = l0Var2.f286152b;
                    sb6.append(i17);
                    sb6.append(", progressMode=");
                    int i18 = l0Var2.f286153c;
                    sb6.append(i18);
                    sb6.append(", progressLaunchTime=");
                    sb6.append(l0Var2.f286154d);
                    sb6.append(", isProgressColdLaunch=");
                    sb6.append(l0Var2.f286155e);
                    sb6.append(", webViewCreateTime=");
                    sb6.append(l0Var2.f286156f);
                    sb6.append(", bindCostTime=");
                    sb6.append(l0Var2.f286157g);
                    sb6.append(",isMPPreloadController=");
                    sb6.append(l0Var2.f286160j);
                    sb6.append(", isRenderProcessInit:");
                    sb6.append(l0Var2.f286163m);
                    sb6.append(", isGPUProcessInit:");
                    sb6.append(l0Var2.f286165o);
                    sb6.append(", isRenderSandBoxProcessInit:");
                    sb6.append(l0Var2.f286164n);
                    sb6.append(", onPageFinishedTime:");
                    sb6.append(j17);
                    sb6.append(", isFirstStartWebViewAfterBoot:");
                    sb6.append(l0Var2.f286166p);
                    sb6.append(" enhanceBitFlag:");
                    sb6.append(hy4.l0.f286150r);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPerformanceMonitor", sb6.toString());
                    try {
                        str3 = java.net.URLEncoder.encode(str == null ? "" : str, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.lang.Throwable unused) {
                        str3 = "";
                    }
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[21];
                    objArr[0] = java.lang.Integer.valueOf(i17);
                    objArr[1] = java.lang.Integer.valueOf(i18);
                    objArr[2] = java.lang.Long.valueOf(l0Var2.f286154d);
                    objArr[3] = java.lang.Integer.valueOf(l0Var2.f286155e ? 1 : 0);
                    objArr[4] = java.lang.Long.valueOf(l0Var2.f286156f);
                    objArr[5] = java.lang.Long.valueOf(l0Var2.f286157g);
                    objArr[6] = java.lang.Integer.valueOf(l0Var2.f286160j ? 1 : 0);
                    objArr[7] = java.lang.Integer.valueOf(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE);
                    objArr[8] = java.lang.Integer.valueOf(com.tencent.xweb.a3.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
                    objArr[9] = java.lang.Integer.valueOf(org.xwalk.core.XWalkEnvironment.k());
                    objArr[10] = java.lang.Integer.valueOf(org.xwalk.core.XWalkEnvironment.e() ? 1 : 2);
                    objArr[11] = 1;
                    objArr[12] = java.lang.Long.valueOf(j17);
                    objArr[13] = java.lang.Integer.valueOf(l0Var2.f286163m ? 2 : 1);
                    objArr[14] = java.lang.Integer.valueOf(l0Var2.f286164n ? 2 : 1);
                    objArr[15] = java.lang.Integer.valueOf(l0Var2.f286165o ? 2 : 1);
                    objArr[16] = str3;
                    int i19 = com.tencent.mm.pluginsdk.model.g4.f189322a;
                    objArr[17] = 3;
                    objArr[18] = java.lang.Integer.valueOf(l0Var2.f286161k ? 1 : 0);
                    objArr[19] = java.lang.Integer.valueOf(l0Var2.f286166p);
                    objArr[20] = java.lang.Integer.valueOf(hy4.l0.f286150r);
                    g0Var.d(25365, objArr);
                }
            }
        }
        com.tencent.mars.xlog.Log.i(o1(), "edw onPageFinished opt, url = %s", str);
        com.tencent.mm.plugin.webview.model.b6 b6Var = this.S0;
        if (b6Var.f182806i == null) {
            b6Var.f182806i = new com.tencent.mm.plugin.webview.model.r5();
        }
        com.tencent.mm.plugin.webview.model.r5 r5Var = b6Var.f182806i;
        if (r5Var.f183092a && !r5Var.f183093b) {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                if (str.startsWith("http")) {
                    java.lang.String host = parse.getHost();
                    if (host != null && host.equalsIgnoreCase("v.html5.qq.com")) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(283L, 0L, 1L, true);
                        r5Var.f183093b = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter.DomainReporter", "onPageFinished, domain visit reported, url = %s", str);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter.DomainReporter", "onPageFinished, url not startswith http");
                }
            } catch (java.lang.Exception unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter.DomainReporter", "onPageFinished, parse url fail, url = %s", str);
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f186897a)) {
            t7Var.c(2, "", 0);
        }
        com.tencent.mm.plugin.webview.modeltools.m1 m1Var = (com.tencent.mm.plugin.webview.modeltools.m1) ((jz5.n) this.f181810l1).getValue();
        m1Var.getClass();
        try {
            m1Var.a(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewURLRouteList", "add exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        boolean booleanExtra = d0().getBooleanExtra("shouldForceViewPort", false);
        o1();
        if (booleanExtra) {
            java.lang.String stringExtra = d0().getStringExtra("view_port_code");
            kotlin.jvm.internal.o.d(webView);
            webView.evaluateJavascript(stringExtra, null);
        }
        kotlin.jvm.internal.o.d(str);
        if (N(str)) {
            com.tencent.mars.xlog.Log.f(o1(), "onPageFinished, canLoadUrl fail, url = ".concat(str));
            return;
        }
        if (kotlin.jvm.internal.o.b(str, this.f181813o1)) {
            com.tencent.mars.xlog.Log.i(o1(), "onPageFinished, js is finished loaded");
            return;
        }
        if (b6Var.f182800c == null) {
            b6Var.f182800c = new com.tencent.mm.plugin.webview.model.z5(b6Var);
        }
        com.tencent.mm.plugin.webview.model.z5 z5Var = b6Var.f182800c;
        z5Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
        } else {
            java.util.HashMap hashMap = z5Var.f183224a;
            if (hashMap.containsKey(str)) {
                hashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Long) hashMap.get(str)).longValue()));
            }
        }
        com.tencent.mm.plugin.webview.model.v5 d17 = b6Var.d();
        d17.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onPageFinish failed, url is null");
        } else {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = d17.f183153b;
            try {
                if (concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - ((java.lang.Long) concurrentHashMap.get(str)).longValue()));
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebviewReporter", e18, "onPageFinish", new java.lang.Object[0]);
            }
        }
        if (b6Var.f182803f == null) {
            b6Var.f182803f = new com.tencent.mm.plugin.webview.model.w5(b6Var);
        }
        com.tencent.mm.plugin.webview.model.w5 w5Var = b6Var.f182803f;
        if (!w5Var.f183172c) {
            w5Var.f183172c = true;
            int e19 = com.tencent.mm.plugin.webview.model.b6.e();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - w5Var.f183170a;
            if (currentTimeMillis >= 0 && currentTimeMillis <= 180000) {
                java.lang.String str4 = w5Var.f183174e;
                java.lang.Object[] objArr2 = new java.lang.Object[11];
                objArr2[0] = 4;
                objArr2[1] = java.lang.Long.valueOf(currentTimeMillis);
                objArr2[2] = java.lang.Integer.valueOf(e19);
                java.lang.String str5 = w5Var.f183171b;
                if (str5 != null) {
                    str5 = str5.replace(",", "!");
                }
                objArr2[3] = str5;
                objArr2[4] = 0;
                objArr2[5] = 0;
                objArr2[6] = 0;
                objArr2[7] = java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.f182796p);
                objArr2[8] = java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.f182797q);
                objArr2[9] = java.lang.Integer.valueOf(w5Var.f183173d);
                objArr2[10] = w5Var.f183174e;
                com.tencent.mm.plugin.webview.model.b6.a(str4, objArr2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewReporter", "WebViewTotalTimeReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", w5Var.f183171b, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(e19), java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.f182796p), java.lang.Integer.valueOf(com.tencent.mm.plugin.webview.model.b6.f182797q), java.lang.Integer.valueOf(w5Var.f183173d), w5Var.f183174e);
            }
        }
        android.os.Bundle bundle = (android.os.Bundle) d0().getParcelableExtra("jsapiargs");
        if (bundle != null && (parcelable = bundle.getParcelable("KSnsAdTag")) != null && (parcelable instanceof com.tencent.mm.modelsns.SnsAdClick)) {
            java.lang.String string = bundle.getString("KAnsUxInfo", "");
            b6Var.f().f182825a = (com.tencent.mm.modelsns.SnsAdClick) parcelable;
            com.tencent.mm.plugin.webview.model.c5 f17 = b6Var.f();
            java.lang.String str6 = java.lang.System.currentTimeMillis() + "";
            kotlin.jvm.internal.o.d(string);
            java.lang.String[] strArr = {str, "1", str6, string};
            f17.getClass();
            for (int i27 = 0; i27 < 4; i27++) {
                f17.f182827c.add(strArr[i27]);
            }
            b6Var.f().a();
        }
        com.tencent.mm.plugin.webview.ui.tools.fa.f184180a.a(d0(), str, true);
        this.f181818t1 = com.tencent.mm.sdk.platformtools.t8.i1();
    }

    public final com.tencent.mm.plugin.webview.ui.tools.sd n1() {
        return (com.tencent.mm.plugin.webview.ui.tools.sd) ((jz5.n) this.f181801c1).getValue();
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView view, java.lang.String url, android.graphics.Bitmap bitmap) {
        android.os.Parcelable parcelable;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(url, "url");
        boolean z17 = true;
        this.f181811m1 = true;
        if (v0()) {
            com.tencent.mars.xlog.Log.w(T(), "ActivityFinished");
        } else {
            J(this.f181943n0, url);
            com.tencent.mars.xlog.Log.i(T(), "WebView-Trace onPageStarted#" + U() + ": " + url);
            this.f181964y = url;
            synchronized (this) {
                com.tencent.mars.xlog.Log.i(T(), "resetPageActions clear status:" + url + ", [" + kz5.n0.g0(this.B0, ",", null, null, 0, null, null, 62, null) + "] actions: [" + kz5.n0.g0(this.D0, ",", null, null, 0, null, null, 62, null) + ']');
                this.B0.clear();
                this.D0.clear();
                this.A0.clear();
                for (com.tencent.mm.plugin.webview.core.e eVar : S()) {
                    com.tencent.mm.plugin.webview.core.BaseWebViewController$WebAction baseWebViewController$WebAction = eVar.f181787a;
                    baseWebViewController$WebAction.setController(this);
                    if (baseWebViewController$WebAction instanceof com.tencent.mm.plugin.webview.core.BaseWebViewController$PageAction) {
                        this.A0.add(new jz5.l(baseWebViewController$WebAction, eVar.f181788b));
                    }
                }
                Q0(url);
                this.F = "";
            }
            java.util.Iterator it = this.Y.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.core.o1 o1Var = (com.tencent.mm.plugin.webview.core.o1) it.next();
                if (x0()) {
                    o1Var.h(view, W(url));
                }
            }
        }
        this.V.a("onPageStarted", java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.webview.model.k.c(this.f181916a, url, u1());
        if (H(url)) {
            return;
        }
        if (!this.f181916a.u(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END)) {
            g0().k();
        }
        hy4.p0.a(url);
        com.tencent.mars.xlog.Log.i(o1(), "edw onPageStarted opt, url = ".concat(url));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(155L, 0L, 1L, false);
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Ai(i1(), 0);
        if (z65.c.a() && kotlin.jvm.internal.o.b("http://www.dktest-mmcrash.com/", url)) {
            iz5.a.g("test errlog in tools " + new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date()), false);
        }
        this.f181809k1 = this.f181964y;
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        com.tencent.mm.plugin.webview.core.l2 l2Var = (com.tencent.mm.plugin.webview.core.l2) ((jz5.n) this.f181804f1).getValue();
        l2Var.getClass();
        android.os.MessageQueue.IdleHandler idleHandler = l2Var.f181875h;
        if (idleHandler != null) {
            android.os.Looper.myQueue().removeIdleHandler(idleHandler);
            l2Var.f181875h = null;
        }
        com.tencent.mm.plugin.webview.core.k2 k2Var = new com.tencent.mm.plugin.webview.core.k2(l2Var, url, i17, 1);
        l2Var.f181875h = k2Var;
        android.os.Looper.myQueue().addIdleHandler(k2Var);
        this.S0.h().f183029n = this.f181809k1;
        this.f181964y = url;
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        java.lang.String str = t7Var.f186902f;
        java.lang.String str2 = t7Var.f186897a;
        t7Var.f186902f = url;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            t7Var.c(1, str, 0);
        }
        o1();
        if (N(url)) {
            com.tencent.mars.xlog.Log.f(o1(), "onPageStarted, canLoadUrl fail, url = ".concat(url));
            return;
        }
        com.tencent.mm.plugin.webview.modeltools.m1 m1Var = (com.tencent.mm.plugin.webview.modeltools.m1) ((jz5.n) this.f181810l1).getValue();
        m1Var.getClass();
        try {
            m1Var.a(url);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewURLRouteList", "add exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        com.tencent.mm.plugin.webview.model.b6 b6Var = this.S0;
        if (b6Var.f182800c == null) {
            b6Var.f182800c = new com.tencent.mm.plugin.webview.model.z5(b6Var);
        }
        com.tencent.mm.plugin.webview.model.z5 z5Var = b6Var.f182800c;
        int Q = Q();
        java.lang.String i18 = i1();
        z5Var.f183225b = Q;
        z5Var.f183226c = i18;
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.startLoadUrl failed, url is null");
        } else {
            java.util.HashMap hashMap = z5Var.f183224a;
            if (!hashMap.containsKey(url)) {
                hashMap.put(url, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
        android.os.Bundle bundle = (android.os.Bundle) d0().getParcelableExtra("jsapiargs");
        if (bundle != null && (parcelable = bundle.getParcelable("KSnsAdTag")) != null && (parcelable instanceof com.tencent.mm.modelsns.SnsAdClick)) {
            java.lang.String string = bundle.getString("KAnsUxInfo", "");
            this.S0.f().f182825a = (com.tencent.mm.modelsns.SnsAdClick) parcelable;
            com.tencent.mm.plugin.webview.model.c5 f17 = this.S0.f();
            java.lang.String str3 = java.lang.System.currentTimeMillis() + "";
            kotlin.jvm.internal.o.d(string);
            java.lang.String[] strArr = {url, "0", str3, string};
            f17.getClass();
            for (int i19 = 0; i19 < 4; i19++) {
                f17.f182827c.add(strArr[i19]);
            }
            this.S0.f().a();
        }
        com.tencent.mm.plugin.webview.ui.tools.fa.f184180a.a(d0(), url, false);
        com.tencent.mm.plugin.webview.core.t2 t2Var = this.f181820v1;
        t2Var.getClass();
        if (!com.tencent.mm.plugin.webview.model.k2.e(url, t2Var.f181986g.d0().getIntExtra("geta8key_scene", 0)) && this.f181918b.f472754g) {
            if (com.tencent.mm.plugin.webview.modeltools.c0.f183246a == null) {
                com.tencent.mm.plugin.webview.modeltools.c0.f183246a = new java.util.ArrayList();
            }
            if (!com.tencent.mm.plugin.webview.modeltools.c0.f183246a.contains(url)) {
                com.tencent.mm.plugin.webview.modeltools.c0.f183246a.add(url);
            }
        }
        if (!hy4.i.p(url)) {
            if (!r26.i0.y(url, "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.p3v) + '/', false)) {
                if (!r26.i0.y(url, "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.p3v) + '/', false)) {
                    z17 = false;
                }
            }
            if (!z17) {
                return;
            }
        }
        pw4.c cVar = this.f181938l;
        if (cVar.f358730s == null) {
            cVar.f358730s = new java.util.HashMap();
        }
        java.util.Map map = cVar.f358730s;
        if (map != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
            jSONObject.put("enable", gVar.Di());
            jSONObject.put("picTextNameVersion", gVar.Ui() ? 1 : 0);
            jSONObject.put("supportViewPhotoAcct", gVar.Ui() ? 1 : 0);
            map.put("photoAccount", jSONObject);
        }
    }

    public final java.lang.String o1() {
        return (java.lang.String) ((jz5.n) this.T0).getValue();
    }

    @Override // com.tencent.mm.plugin.webview.core.r0, com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        if (!p0(this.f181933i0)) {
            com.tencent.mars.xlog.Log.i(o1(), "onReceivedError, intent not ready");
            return;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9);
        com.tencent.mars.xlog.Log.e(o1(), "edw onReceivedError, failingUrl = %s, errorCode = %d, desc = %s, isNetworkConnected = %b, allowFileAccess = %b", str2, java.lang.Integer.valueOf(i17), str, java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Boolean.valueOf(this.f181916a.getSettings().b()));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(155L, 1L, 1L, false);
        g0Var.idkeyStat(155L, cx4.a.a(i17), 1L, false);
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Ai(i1(), 1);
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Ai(i1(), cx4.a.a(i17));
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).wi(i1(), i(), cx4.a.a(i17), this.S0.g().f183072b);
        super.p(webView, i17, str, str2);
        com.tencent.mm.plugin.webview.ui.tools.t7 t7Var = com.tencent.mm.plugin.webview.ui.tools.t7.f186896i;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t7Var.f186897a)) {
            t7Var.c(3, "", i17);
        }
        this.S0.f().f182826b = i17;
        com.tencent.mm.plugin.webview.ui.tools.fa.f184181b = i17;
        if (((java.lang.Boolean) ((jz5.n) this.f181803e1).getValue()).booleanValue()) {
            E0();
        }
        try {
            if (kotlin.jvm.internal.o.b(new java.net.URL(str2).getHost(), a17)) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.core.v2(str2, i17, a17, this), "WebViewUI.CheckDNS");
            }
        } catch (java.net.MalformedURLException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(o1(), e17, "check mp url", new java.lang.Object[0]);
        }
        super.p(webView, i17, str, str2);
    }

    public boolean p1(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.util.Iterator it = ((java.util.ArrayList) this.f181819u1).iterator();
        while (it.hasNext()) {
            rw4.a aVar = (rw4.a) it.next();
            if (aVar.b(url)) {
                com.tencent.mars.xlog.Log.i(o1(), "url handled, url = ".concat(url));
                boolean f17 = aVar.f(url);
                com.tencent.mars.xlog.Log.i(o1(), "url handled, ret = " + f17 + ", url = " + url);
                return true;
            }
        }
        return false;
    }

    public final boolean q1() {
        return this.f181820v1.f181980a;
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public void r0() {
        E(new com.tencent.mm.plugin.webview.model.e5());
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        E(new yw4.i());
        E(new com.tencent.mm.plugin.webview.webcompt.g1());
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        mMWebView.setWebViewClient(this);
        com.tencent.xweb.z0 settings = mMWebView.getSettings();
        zg0.k2 k2Var = this.f181918b;
        settings.E(((java.lang.Boolean) ((jz5.n) k2Var.f472748a.f472774b).getValue()).booleanValue());
        settings.z(true);
        zg0.p2 p2Var = k2Var.f472748a;
        settings.r(((java.lang.Boolean) ((jz5.n) p2Var.f472773a).getValue()).booleanValue());
        settings.P(true);
        settings.G(true);
        settings.M(false);
        settings.L(false);
        settings.C(true);
        settings.D(true);
        settings.J(0);
        settings.l(10485760L);
        settings.m(mMWebView.getContext().getDir("webviewcache", 0).getAbsolutePath());
        settings.k(true);
        settings.t(true);
        settings.u(lp0.b.X() + "databases/");
        settings.h(true);
        java.lang.String g17 = settings.g();
        if (com.tencent.mm.sdk.platformtools.z.f193109e != null) {
            g17 = g17 + " REV/" + com.tencent.mm.sdk.platformtools.z.f193109e;
        }
        kotlin.jvm.internal.o.d(g17);
        if (!r26.n0.B(g17, " MicroMessenger/", false)) {
            ik1.k0 k0Var = (ik1.k0) nd.f.a(ik1.k0.class);
            if (k0Var == null) {
                k0Var = new com.tencent.mm.plugin.appbrand.luggage.customize.y(mMWebView.getContext());
            }
            hy4.v vVar = hy4.w.f286200f;
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) hy4.w.f286201g).getValue()).putString("key_web_prefetch_ua", g17);
            java.lang.String a17 = ik1.l0.a(mMWebView.getContext(), g17, k0Var);
            g0().f340888b = a17;
            settings.Q(a17);
        }
        if (!((java.lang.Boolean) ((jz5.n) p2Var.f472775c).getValue()).booleanValue()) {
            mMWebView.setVerticalScrollBarEnabled(false);
            mMWebView.setHorizontalScrollBarEnabled(false);
        }
        com.tencent.xweb.d.g().d(true);
        com.tencent.xweb.d.g().f(mMWebView, true);
        if (mMWebView.f211371t) {
            java.lang.String url = mMWebView.getUrl();
            if (url == null) {
                url = "";
            }
            P0(url);
        }
        ((java.util.HashSet) mMWebView.A).add(this.f181925e0);
        hy4.l0 l0Var = this.f181934j;
        if (l0Var != null) {
            l0Var.f286158h = java.lang.System.currentTimeMillis();
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        hy4.k0 k0Var2 = this.V;
        k0Var2.a("onTryBindServiceStart", currentTimeMillis);
        com.tencent.mars.xlog.Log.i(T(), "WebView-Trace tryBindService");
        com.tencent.mm.plugin.webview.core.m3.f181886a.a(true, (java.lang.Class) ((jz5.n) this.U0).getValue(), new com.tencent.mm.plugin.webview.core.b(new java.lang.ref.WeakReference(this)));
        k0Var2.a("onTryBindServiceEnd", java.lang.System.currentTimeMillis());
        E(new mw4.w());
        E(new mw4.i());
        E(new mw4.c());
        g0().f340907u = new com.tencent.mm.plugin.webview.core.z2(this);
    }

    public void r1() {
    }

    public final void s1() {
        int intExtra = d0().getIntExtra("pay_channel", -1);
        if (intExtra != -1) {
            com.tencent.mars.xlog.Log.i(o1(), "hy: found channel in intent. pay channel: %d", java.lang.Integer.valueOf(intExtra));
            return;
        }
        int ia6 = e0().ia();
        if (ia6 != -1) {
            com.tencent.mars.xlog.Log.i(o1(), "hy: found channel in channel helper. pay channel: %d", java.lang.Integer.valueOf(ia6));
            d0().putExtra("pay_channel", ia6);
        }
    }

    @Override // com.tencent.xweb.h1
    public void t(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        int i17;
        if (!p0(this.f181933i0)) {
            com.tencent.mars.xlog.Log.i(o1(), "onReceivedSslError, intent not ready");
            return;
        }
        java.lang.String url = (webView != null ? webView.getUrl() : null) == null ? this.f181964y : webView.getUrl();
        if (url != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            java.lang.String HARDCODE_URL = is1.l.f294424b;
            kotlin.jvm.internal.o.f(HARDCODE_URL, "HARDCODE_URL");
            if (r26.i0.y(url, HARDCODE_URL, false)) {
                url = i();
            }
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(155L, 1L, 1L, false);
        g0Var.idkeyStat(155L, 30L, 1L, false);
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Ai(i1(), 1);
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).Ai(i1(), 30);
        ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).wi(i1(), i(), 30, this.S0.g().f183072b);
        ((com.tencent.mm.plugin.webview.ui.tools.u) ((jz5.n) this.f181808j1).getValue()).b(url, l0Var, sslError);
        l0Var.cancel();
        java.lang.String T = T();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebView-Trace onReceivedSslError#");
        sb6.append(U());
        sb6.append(", ");
        sb6.append(sslError != null ? sslError.toString() : null);
        com.tencent.mars.xlog.Log.i(T, sb6.toString());
        if (!p0(this.f181933i0)) {
            com.tencent.mars.xlog.Log.i(T(), "onReceivedSslError, intent not ready");
            return;
        }
        if (p0(this.f181931h0)) {
            com.tencent.mm.plugin.webview.core.h1 i07 = i0();
            java.lang.String V = V(Z());
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
            if (mMWebView == null) {
                i17 = 0;
            } else {
                i17 = mMWebView.isXWalkKernel() ? 2 : 3;
            }
            int j07 = j0();
            if (i07.d() && sslError != null) {
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.core.f1(sslError, i07, V, i17, j07), "MicroMsg.WebPageErrorMonitor");
            }
        }
        java.util.Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.webview.core.o1 o1Var = (com.tencent.mm.plugin.webview.core.o1) it.next();
            if (x0()) {
                o1Var.l(webView, l0Var, sslError);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x0001, B:5:0x0019, B:10:0x0025), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t1() {
        /*
            r4 = this;
            r0 = 0
            android.content.Intent r1 = r4.d0()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "srcUsername"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Exception -> L2e
            android.content.Intent r2 = r4.d0()     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = "bizofstartfrom"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Exception -> L2e
            r3 = 1
            if (r1 == 0) goto L22
            boolean r1 = r26.n0.N(r1)     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L20
            goto L22
        L20:
            r1 = r0
            goto L23
        L22:
            r1 = r3
        L23:
            if (r1 != 0) goto L2e
            java.lang.String r1 = "enterpriseHomeSubBrand"
            boolean r1 = kotlin.jvm.internal.o.b(r2, r1)     // Catch: java.lang.Exception -> L2e
            if (r1 == 0) goto L2e
            r0 = r3
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.t1():boolean");
    }

    @Override // com.tencent.mm.plugin.webview.core.r0
    public com.tencent.xweb.y0 u0(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request, android.os.Bundle bundle) {
        java.lang.String uri;
        com.tencent.xweb.y0 a17;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        if (x0() && p0(this.f181931h0) && (a17 = this.f181805g1.a(request.getUrl().toString(), request, !((java.lang.Boolean) ((jz5.n) this.f181806h1).getValue()).booleanValue(), e0())) != null) {
            return a17;
        }
        com.tencent.mars.xlog.Log.i(T(), "shouldInterceptRequest, url = " + request.getUrl() + ", method = " + request.getMethod() + ", isForMainFrame = " + request.isForMainFrame());
        java.lang.String uri2 = request.getUrl().toString();
        kotlin.jvm.internal.o.f(uri2, "toString(...)");
        if (N(uri2)) {
            return null;
        }
        if (bundle != null) {
            try {
                int i17 = bundle.getInt("resourceType");
                if (i17 == 1 || i17 == 7) {
                    com.tencent.mars.xlog.Log.i(T(), "get resoutce type is iframe : %d, start geta8key", java.lang.Integer.valueOf(i17));
                    com.tencent.mm.plugin.webview.permission.d O = O();
                    java.lang.String Z = Z();
                    O.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8Key", "setOuterUrlForIframe(%s)", Z);
                    O.f183400t = Z;
                    V0(uri2, false, 5);
                    if (this.f181918b.f472754g) {
                        if (com.tencent.mm.plugin.webview.modeltools.c0.f183246a == null) {
                            com.tencent.mm.plugin.webview.modeltools.c0.f183246a = new java.util.ArrayList();
                        }
                        if (!com.tencent.mm.plugin.webview.modeltools.c0.f183246a.contains(uri2)) {
                            com.tencent.mm.plugin.webview.modeltools.c0.f183246a.add(uri2);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w(T(), "get resource type failed Exception ; " + e17.getMessage());
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w(T(), "get resource type failed Throwable ; " + th6.getMessage());
            }
        }
        java.util.Iterator it = this.X.iterator();
        while (it.hasNext()) {
            com.tencent.xweb.y0 f17 = ((com.tencent.mm.plugin.webview.core.i3) it.next()).f(webview, request);
            if (f17 != null) {
                return f17;
            }
        }
        if (!((java.lang.Boolean) ((jz5.n) this.O0).getValue()).booleanValue()) {
            return null;
        }
        java.lang.String[] strArr = com.tencent.mm.plugin.webview.core.r0.R0;
        int i18 = 0;
        for (int i19 = 0; i19 < 4; i19++) {
            java.lang.String str = strArr[i19];
            i18++;
            android.net.Uri url = request.getUrl();
            if ((url == null || (uri = url.toString()) == null || !r26.i0.y(uri, str, false)) ? false : true) {
                com.tencent.mars.xlog.Log.i(T(), "QuickAppInterceptor interceptor url = " + str);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1551L, (long) i18, 1L);
                if (((java.lang.Boolean) ((jz5.n) this.P0).getValue()).booleanValue()) {
                    com.tencent.mars.xlog.Log.i(T(), "QuickAppInterceptor interceptor WebResourceResponse");
                    return new com.tencent.xweb.y0("", null, null);
                }
            }
        }
        return null;
    }

    public boolean u1() {
        return false;
    }

    public boolean v1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return kotlin.jvm.internal.o.b(context.getClass(), com.tencent.mm.plugin.webview.ui.tools.WebViewUI.class) || kotlin.jvm.internal.o.b(context.getClass(), com.tencent.mm.plugin.webview.ui.tools.MMWebViewUI.class);
    }

    public void w1(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        boolean booleanExtra = d0().getBooleanExtra(com.tencent.mm.ui.w2.f211206s, false);
        com.tencent.mm.plugin.webview.permission.w wVar = this.R;
        if (!((wVar.b().f192177d & 2) > 0) && !booleanExtra) {
            com.tencent.mars.xlog.Log.w(o1(), "shouldOverride, allow inner open url, not allow");
            return;
        }
        com.tencent.mars.xlog.Log.i(o1(), "allowJumpWithoutPerm: " + booleanExtra);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("fromScene", 100);
        if (e0().Ua(url, wVar.c().f(7), bundle)) {
            com.tencent.mars.xlog.Log.i(o1(), "shouldOverride, built in url handled, url = ".concat(url));
        }
    }

    public void x1(java.lang.String url, java.util.Map map, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        boolean u17 = u1();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f181916a;
        com.tencent.mm.plugin.webview.model.k.c(mMWebView, url, u17);
        com.tencent.mars.xlog.Log.i(T(), "WebView-Trace loadUrl#" + U() + " url " + url);
        this.V.a("clientLoadUrl", java.lang.System.currentTimeMillis());
        if (z17) {
            mMWebView.loadUrl(url, kz5.c1.i(new jz5.l("Pragma", "no-cache"), new jz5.l("Cache-Control", "no-cache")));
            return;
        }
        if (map == null || map.isEmpty()) {
            mMWebView.loadUrl(url);
        } else {
            mMWebView.loadUrl(url, map);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(1:5)(2:6|(3:9|10|(1:12)(15:14|(1:16)(1:109)|17|18|(2:22|(11:24|(1:26)(1:53)|27|(4:30|(3:32|33|34)(1:36)|35|28)|37|38|(4:41|(3:43|44|45)(1:47)|46|39)|48|49|(1:51)|52))|54|(1:187)|74|(7:76|(4:79|(3:81|82|83)(1:85)|84|77)|86|87|(3:89|(1:91)|92)|93|(3:95|(1:97)|98))|99|100|101|(1:103)|105|106))(1:8)))|112|18|(3:20|22|(0))|54|(0)|74|(0)|99|100|101|(0)|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02ad, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02ae, code lost:
    
        com.tencent.mars.xlog.Log.e(o1(), "releaseWebView, ex = %s", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a7 A[Catch: Exception -> 0x02ad, TRY_LEAVE, TryCatch #1 {Exception -> 0x02ad, blocks: (B:101:0x0280, B:103:0x02a7), top: B:100:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.core.e3.y1():void");
    }

    public final void z1(android.content.Context context, java.lang.String url, com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, e42.d0 aiSearchExperienceParam) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(aiSearchExperienceParam, "aiSearchExperienceParam");
        if (c6Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewController", "requestAiSearchConfig: webViewMenuHelper is null");
            return;
        }
        if (v1(context) || (context instanceof com.tencent.mm.plugin.webview.ui.tools.fts.SosWebViewUI)) {
            c6Var.f184061r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(aiSearchExperienceParam, 0);
            int i17 = 1;
            boolean z17 = c6Var.f184063t == 0 || java.lang.System.currentTimeMillis() - c6Var.f184063t >= ((long) c6Var.f184062s);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewController", "requestAiSearchConfig: isMenuShowAiSearch = " + c6Var.f184061r + ", needRequestAiSearchConfigNow = " + z17);
            if (c6Var.f184061r == 2 && z17) {
                r45.m0 m0Var = new r45.m0();
                m0Var.f380029d = 0;
                m0Var.f380030e = com.tencent.mm.plugin.websearch.l2.a(0);
                m0Var.f380031f = null;
                m0Var.f380034i = 0L;
                m0Var.f380032g = 0L;
                m0Var.f380036n = url;
                m0Var.f380035m = by5.s0.a();
                m0Var.f380039q = by5.s0.a();
                r45.j30 j30Var = new r45.j30();
                boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                j30Var.f377532g = isTeenMode;
                if (isTeenMode) {
                    int h47 = ((uh4.c0) i95.n0.c(uh4.c0.class)).h4();
                    j30Var.f377529d = h47 != 0 ? h47 != 1 ? h47 != 2 ? 0 : 2 : 1 : 3;
                    int hd6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
                    j30Var.f377530e = hd6 != 0 ? hd6 != 1 ? hd6 != 2 ? 0 : 2 : 1 : 3;
                    int G8 = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
                    if (G8 == 0) {
                        i17 = 3;
                    } else if (G8 != 1) {
                        i17 = G8 != 2 ? 0 : 2;
                    }
                    j30Var.f377531f = i17;
                }
                m0Var.f380037o = j30Var;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = m0Var;
                lVar.f70665b = new r45.n0();
                lVar.f70666c = "/cgi-bin/mmsearch-bin/aisummarysearchconfig";
                lVar.f70667d = 28417;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), com.tencent.mm.plugin.webview.model.c.f182813a);
                if (com.tencent.mm.plugin.webview.model.h.f182901a.a(url)) {
                    c6Var.f184062s = com.tencent.mm.plugin.webview.model.h.f182904d;
                } else {
                    c6Var.f184062s = com.tencent.mm.plugin.webview.model.h.f182903c;
                }
                c6Var.f184063t = java.lang.System.currentTimeMillis();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.ui.widget.MMWebView viewWV, com.tencent.mm.plugin.webview.model.b6 webviewReportMgr, zg0.k2 options, java.util.Set set, nw4.j jVar) {
        super(viewWV, options, set, jVar);
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        kotlin.jvm.internal.o.g(webviewReportMgr, "webviewReportMgr");
        kotlin.jvm.internal.o.g(options, "options");
        this.S0 = webviewReportMgr;
        this.T0 = jz5.h.b(new com.tencent.mm.plugin.webview.core.m2(this));
        this.U0 = jz5.h.b(com.tencent.mm.plugin.webview.core.b3.f181764d);
        this.Y0 = new com.tencent.mm.plugin.webview.ui.tools.floatball.x();
        this.Z0 = new com.tencent.mm.plugin.webview.ui.tools.u4();
        this.f181801c1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.d3(this));
        this.f181802d1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.q2(this));
        this.f181803e1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.r2(this));
        this.f181804f1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.c3(this));
        this.f181805g1 = new com.tencent.mm.plugin.webview.model.t4(Y());
        this.f181806h1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.s2(this));
        this.f181808j1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.a3(viewWV));
        this.f181810l1 = jz5.h.b(com.tencent.mm.plugin.webview.core.x2.f182011d);
        this.f181813o1 = "file:///android_asset/jsapi/wxjs.js";
        this.f181814p1 = new java.util.HashSet();
        this.f181815q1 = jz5.h.b(new com.tencent.mm.plugin.webview.core.y2(this));
        this.f181816r1 = new com.tencent.mm.plugin.webview.core.o2(new java.lang.ref.WeakReference(this));
        this.f181817s1 = new com.tencent.mm.plugin.webview.core.n2(new java.lang.ref.WeakReference(this));
        this.f181819u1 = new java.util.ArrayList();
        this.f181820v1 = new com.tencent.mm.plugin.webview.core.t2(options, this);
        this.f181821w1 = new com.tencent.mm.plugin.webview.core.c2(this);
        this.f181822x1 = new com.tencent.mm.plugin.webview.core.x1(this);
        this.f181823y1 = new com.tencent.mm.plugin.webview.core.d2(this);
        this.f181824z1 = new com.tencent.mm.plugin.webview.core.e2(this);
        this.A1 = new com.tencent.mm.plugin.webview.core.u1(this);
        this.C1 = true;
        this.D1 = new com.tencent.mm.plugin.webview.core.j2(this, viewWV);
        this.E1 = new com.tencent.mm.plugin.webview.core.b2(this);
        this.F1 = new com.tencent.mm.plugin.webview.core.i2(this);
        this.G1 = new com.tencent.mm.plugin.webview.core.z1(this);
        this.H1 = new com.tencent.mm.plugin.webview.core.v1(this);
        this.I1 = new com.tencent.mm.plugin.webview.core.f2(this);
        this.J1 = new com.tencent.mm.plugin.webview.core.w1(this);
        this.L1 = new com.tencent.mm.plugin.webview.core.y1(this, viewWV);
        this.M1 = new com.tencent.mm.plugin.webview.core.a2(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.ui.widget.MMWebView viewWV, com.tencent.mm.plugin.webview.model.b6 webviewReportMgr, zg0.k2 options) {
        this(viewWV, webviewReportMgr, options, null, null, 16, null);
        kotlin.jvm.internal.o.g(viewWV, "viewWV");
        kotlin.jvm.internal.o.g(webviewReportMgr, "webviewReportMgr");
        kotlin.jvm.internal.o.g(options, "options");
    }
}
