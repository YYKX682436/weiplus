package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class b5 implements dx4.g {

    /* renamed from: r, reason: collision with root package name */
    public static byte[] f183925r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f183926s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f183927t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Map f183928u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.Map f183929v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static long f183930w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static long f183931x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static com.tencent.mm.sdk.event.IListener f183932y;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f183934b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.xweb.d1 f183935c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.d1 f183936d;

    /* renamed from: e, reason: collision with root package name */
    public hy4.s f183937e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f183938f;

    /* renamed from: g, reason: collision with root package name */
    public final kd0.p2 f183939g;

    /* renamed from: h, reason: collision with root package name */
    public hy4.h0 f183940h;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.ref.WeakReference f183946n;

    /* renamed from: o, reason: collision with root package name */
    public dx4.f f183947o;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f183933a = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183941i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f183942j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Long f183943k = 0L;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Long f183944l = 0L;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f183945m = 0L;

    /* renamed from: p, reason: collision with root package name */
    public final hy4.r f183948p = new com.tencent.mm.plugin.webview.ui.tools.k5(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.snackbar.g f183949q = new com.tencent.mm.plugin.webview.ui.tools.j5(this);

    public b5(dx4.f fVar) {
        this.f183946n = new java.lang.ref.WeakReference(fVar.getContext());
        this.f183947o = fVar;
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.app.Activity context = fVar.getContext();
        kd0.n2 n2Var = new kd0.n2() { // from class: com.tencent.mm.plugin.webview.ui.tools.b5$$a
            @Override // kd0.n2
            public final void a() {
                com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = com.tencent.mm.plugin.webview.ui.tools.b5.this;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = b5Var.f183938f;
                if (k0Var == null || !k0Var.i()) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.l5(b5Var));
            }
        };
        ((jd0.q2) x2Var).getClass();
        this.f183939g = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, n2Var);
    }

    public static boolean a(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, android.view.View view) {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        com.tencent.xweb.d1 hitTestResult;
        int i17;
        int i18;
        if (b5Var.q() || (mMWebView = b5Var.f183947o.getController().f181916a) == null) {
            return false;
        }
        try {
            if (view instanceof android.webkit.WebView) {
                com.tencent.xweb.d1 hitTestResult2 = mMWebView.getHitTestResult();
                if (hitTestResult2 != null && ((i18 = hitTestResult2.f220239a) == 5 || i18 == 8)) {
                    b5Var.t(hitTestResult2);
                }
            } else if ((view instanceof com.tencent.mm.ui.widget.MMWebView) && (hitTestResult = ((com.tencent.mm.ui.widget.MMWebView) view).getHitTestResult()) != null && ((i17 = hitTestResult.f220239a) == 5 || i17 == 8)) {
                b5Var.s(hitTestResult);
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", e17.getMessage());
            return false;
        }
    }

    public static void b(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, int i17, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        java.lang.String str;
        hy4.h0 h0Var = b5Var.f183940h;
        if (h0Var == null) {
            return;
        }
        dx4.f fVar = b5Var.f183947o;
        if (fVar != null) {
            h0Var.f286108b = b5Var.f183941i;
            h0Var.f286110d = fVar.getController().Q();
        }
        if (imageQBarDataBean != null) {
            hy4.h0 h0Var2 = b5Var.f183940h;
            h0Var2.f286109c = true;
            h0Var2.f286113g = imageQBarDataBean.f158620e == 22 ? "WX_CODE" : "QR_CODE";
            h0Var2.f286112f = imageQBarDataBean.f158619d;
        }
        if (android.webkit.URLUtil.isDataUrl(b5Var.f183934b)) {
            try {
                str = kk.r.b(b5Var.f183934b);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "getSHA1 ex %s", e17.getMessage());
                str = "";
            }
        } else {
            java.lang.String str2 = b5Var.f183934b;
            com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
            str = com.tencent.mm.sdk.platformtools.y9.a(str2);
        }
        hy4.h0 h0Var3 = b5Var.f183940h;
        h0Var3.f286114h = str;
        h0Var3.a(i17);
    }

    public static void c(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, java.lang.String str, java.lang.Boolean bool) {
        b5Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic mResultOfImageUrl nil");
            return;
        }
        try {
            com.tencent.mm.pluginsdk.ui.tools.e9.f(b5Var.l(), str, b5Var.f183941i, com.tencent.xweb.d.g().a(str), b5Var.k(), new com.tencent.mm.plugin.webview.ui.tools.i5(b5Var, bool, str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic Exception:%s", e17.getLocalizedMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic");
    }

    public static void d(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, java.lang.String str) {
        b5Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = b5Var.f183942j;
        if (hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "do cancelRecogQBar:" + str);
            try {
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.webview.ui.tools.WebViewLongClickHelper$CancelRecogQBarData(str, ((java.lang.Long) hashMap.get(str)).longValue()), com.tencent.mm.plugin.webview.ui.tools.a6.class, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewLongClickHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void e(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        java.lang.String str;
        java.lang.String substring;
        b5Var.getClass();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("preUsername", b5Var.l().getIntent().getStringExtra("preUsername"));
            bundle.putString("preChatName", b5Var.l().getIntent().getStringExtra("preChatName"));
            bundle.putString("rawUrl", b5Var.f183947o.getController().i());
            java.lang.String stringExtra = b5Var.l().getIntent().getStringExtra("pre_username");
            if (stringExtra == null || !b5Var.f183947o.getController().A.j8(stringExtra)) {
                bundle.putString("pre_username", b5Var.l().getIntent().getStringExtra(com.tencent.mm.ui.w2.f211203p));
            } else {
                bundle.putString("pre_username", stringExtra);
            }
            com.tencent.mm.plugin.webview.permission.d O = b5Var.f183947o.getController().O();
            int i17 = O.f183391k;
            if (i17 == 0) {
                i17 = O.f183390j;
            }
            bundle.putInt("geta8key_init_request_id", i17);
            java.lang.String str2 = f183926s;
            if (str2 != null && str2.equals(imageQBarDataBean.f158627o) && f183925r != null) {
                java.lang.String Ri = ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ri(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                com.tencent.mm.vfs.w6.R(Ri, f183925r);
                bundle.putString(com.tencent.mm.ui.w2.f211204q, Ri);
                f183925r = null;
            }
            int U = b5Var.f183947o.getController().U();
            com.tencent.mm.plugin.webview.stub.v0 v0Var = b5Var.f183947o.getController().A;
            java.lang.String str3 = imageQBarDataBean.f158619d;
            java.lang.String str4 = b5Var.f183941i;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                substring = "";
            } else {
                if (str3.length() <= 1024) {
                    str = str3;
                    v0Var.yf(U, str3, str4, str, imageQBarDataBean.f158620e, imageQBarDataBean.f158621f, bundle);
                    f183927t = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode, imagePath: %s", imageQBarDataBean.f158627o);
                }
                substring = str3.substring(0, 1024);
            }
            str = substring;
            v0Var.yf(U, str3, str4, str, imageQBarDataBean.f158620e, imageQBarDataBean.f158621f, bundle);
            f183927t = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode, imagePath: %s", imageQBarDataBean.f158627o);
        } catch (android.os.RemoteException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "recognize qbar result failed");
        }
    }

    public static void f(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, java.lang.String str) {
        if (b5Var.q()) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.Intent intent = b5Var.f183947o.getContext().getIntent();
            bundle.putString("serverMsgID", intent.getStringExtra("serverMsgID"));
            bundle.putString("geta8key_username", intent.getStringExtra("geta8key_username"));
            bundle.putString("KPublisherReqId", java.lang.String.valueOf(b5Var.f183947o.a()));
            bundle.putString("sns_local_id", intent.getStringExtra("sns_local_id"));
            b5Var.f183947o.getController().A.X9(str, b5Var.f183947o.getController().U(), bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "sendImgToFriend fail, ex = " + e17.getMessage());
        }
    }

    public static void g(com.tencent.mm.plugin.webview.ui.tools.b5 b5Var, java.lang.String str) {
        if (b5Var.q()) {
            return;
        }
        try {
            o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
            int Sg = b5Var.f183947o.getController().A.Sg(str);
            android.app.Activity l17 = b5Var.l();
            com.tencent.mm.ui.widget.snackbar.g gVar = b5Var.f183949q;
            ((com.tencent.mm.pluginsdk.model.s1) e4Var).getClass();
            com.tencent.mm.plugin.fav.ui.u1.g(Sg, 34, l17, gVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "favoriteUrl fail, ex = " + e17.getMessage());
        }
    }

    public r01.h0 h() {
        java.util.Map map = f183929v;
        if (!((java.util.HashMap) map).containsKey(m(this.f183941i))) {
            return new r01.h0("", false, "", "", 0, 0, "", "", "", 0);
        }
        return (r01.h0) ((java.util.HashMap) map).get(m(this.f183941i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r0.startsWith("http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/s") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f183941i
            java.lang.String r1 = "/s"
            java.lang.String r2 = "http://"
            java.lang.String r3 = "https://"
            r4 = 0
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r0)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r3)     // Catch: java.lang.Exception -> L46
            r3 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r6)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r2)     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r2)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L50
        L44:
            r4 = 1
            goto L50
        L46:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "MicroMsg.WebViewLongClickHelper"
            java.lang.String r3 = "isMpUrl"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r1)
        L50:
            if (r4 == 0) goto L54
            r0 = 5
            return r0
        L54:
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.b5.i():int");
    }

    public final java.lang.String j() {
        java.lang.String Z = this.f183947o.getController().Z();
        this.f183941i = Z;
        if (com.tencent.mm.sdk.platformtools.t8.K0(Z)) {
            this.f183941i = this.f183947o.getController().i();
        }
        return this.f183941i;
    }

    public final boolean k() {
        try {
            return this.f183947o.getController().A.isSDCardAvailable();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + e17.getMessage());
            return false;
        }
    }

    public android.app.Activity l() {
        return (android.app.Activity) this.f183946n.get();
    }

    public final java.lang.String m(java.lang.String url) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
            return "";
        }
        if (!((url == null || gm0.j1.s(zq1.a0.class) == null) ? false : ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(url))) {
            return url;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        kotlin.jvm.internal.o.g(url, "url");
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.n(url);
    }

    public void n() {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        if (q() || (mMWebView = this.f183947o.getController().f181916a) == null) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_long_press_test_enable, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress AB Test Enabled");
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_long_press_menu_duration, 500);
            if (Ni < 150 || Ni > 2500) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "WebViewLongPress  is invalid, time = %d", java.lang.Integer.valueOf(Ni));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress Set Time: %d", java.lang.Integer.valueOf(Ni));
                mMWebView.getSettings().a(Ni);
            }
        }
        mMWebView.setOnLongClickListener(new com.tencent.mm.plugin.webview.ui.tools.n5(this, mMWebView));
    }

    public final boolean o() {
        java.lang.String stringExtra = l().getIntent().getStringExtra("sentUsername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        int k07 = this.f183947o.getController().k0(stringExtra);
        if (k07 == 53 || k07 == 52) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "isAllowScanQRCode open link not allow to ScanQRCode");
            return false;
        }
        try {
            if (this.f183947o.getController().A != null) {
                return this.f183947o.getController().A.Yh();
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "invoker is null");
            return false;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + e17.getMessage());
            return false;
        }
    }

    public final boolean p() {
        java.util.Map map = f183928u;
        if (!((java.util.HashMap) map).containsKey(m(this.f183941i))) {
            return false;
        }
        return ((java.lang.Boolean) ((java.util.HashMap) map).get(m(this.f183941i))).booleanValue();
    }

    public boolean q() {
        return l() == null || this.f183947o == null || l().isFinishing();
    }

    public final boolean r(java.lang.String str) {
        if (q()) {
            return false;
        }
        if (!k()) {
            return true;
        }
        this.f183934b = str;
        if (this.f183938f == null) {
            this.f183938f = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) l(), 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f183938f;
        k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.o5(this);
        k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.p5(this, str);
        k0Var.p(new com.tencent.mm.plugin.webview.ui.tools.q5(this));
        if (!l().isFinishing()) {
            if ((p() && com.tencent.mm.sdk.platformtools.t8.L0(this.f183933a)) ? false : true) {
                this.f183938f.v();
            }
        }
        return this.f183938f.i();
    }

    public final boolean s(com.tencent.xweb.d1 d1Var) {
        boolean r17 = r(d1Var.f220240b);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183947o.getController().f181916a;
        com.tencent.mm.plugin.webview.permission.w wVar = this.f183947o.getController().R;
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f183933a) && wVar != null && wVar.b().a() && o()) {
            this.f183936d = d1Var;
            hy4.s sVar = new hy4.s();
            this.f183937e = sVar;
            sVar.a(mMWebView, this.f183948p);
        }
        return r17;
    }

    public final boolean t(com.tencent.xweb.d1 d1Var) {
        boolean r17 = r(d1Var.f220240b);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f183947o.getController().f181916a;
        com.tencent.mm.plugin.webview.permission.w wVar = this.f183947o.getController().R;
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f183933a) && wVar != null && wVar.b().a() && o()) {
            this.f183935c = d1Var;
            hy4.s sVar = new hy4.s();
            this.f183937e = sVar;
            sVar.a(mMWebView, this.f183948p);
        }
        return r17;
    }

    public void u() {
        kd0.p2 p2Var = this.f183939g;
        if (p2Var != null) {
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).f158647d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f183938f;
        if (k0Var != null) {
            k0Var.k();
            this.f183938f = null;
        }
        hy4.s sVar = this.f183937e;
        if (sVar != null) {
            sVar.b();
        }
        this.f183947o = null;
    }

    public final void v() {
        java.util.ArrayList arrayList = this.f183933a;
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName mImageQBarDataList nil");
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList.get(0);
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        int i17 = imageQBarDataBean.f158620e;
        java.lang.String str = imageQBarDataBean.f158619d;
        ((jd0.z1) l2Var).getClass();
        if (com.tencent.mm.plugin.scanner.z0.e(i17, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName");
            kd0.p2 p2Var = this.f183939g;
            int i18 = imageQBarDataBean.f158620e;
            java.lang.String str2 = imageQBarDataBean.f158619d;
            java.lang.String str3 = this.f183941i;
            kd0.f2 f2Var = new kd0.f2(str2);
            f2Var.f306635b = 4;
            f2Var.f306636c = str3;
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).i(i18, f2Var);
        }
    }
}
