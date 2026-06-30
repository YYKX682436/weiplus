package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class c6 extends com.tencent.mm.plugin.webview.ui.tools.a implements db5.r4 {
    public java.lang.String A;
    public com.tencent.mm.pluginsdk.model.m2 B;
    public final int C;
    public final boolean D;
    public com.tencent.mm.pluginsdk.model.g2 E;
    public boolean F;
    public boolean G;
    public final java.util.Set H;
    public final java.util.Set I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f184044J;
    public long K;
    public db5.g4 L;
    public java.util.ArrayList M;
    public java.lang.Boolean N;
    public java.lang.String O;
    public com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection P;
    public zh1.z0 Q;
    public com.tencent.mm.plugin.webview.ui.tools.o7 R;
    public long S;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f184045b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f184046c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f184047d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f184048e;

    /* renamed from: f, reason: collision with root package name */
    public final hx4.x f184049f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.pm.ResolveInfo f184050g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f184051h;

    /* renamed from: i, reason: collision with root package name */
    public final hy4.m0 f184052i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f184053j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f184054k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f184055l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f184056m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f184057n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f184058o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.m7 f184059p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.floatball.v f184060q;

    /* renamed from: r, reason: collision with root package name */
    public int f184061r;

    /* renamed from: s, reason: collision with root package name */
    public int f184062s;

    /* renamed from: t, reason: collision with root package name */
    public long f184063t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.x3 f184064u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f184065v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f184066w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f184067x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f184068y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f184069z;

    public c6(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        super(webViewUI);
        this.f184045b = new java.util.HashMap();
        this.f184046c = new java.util.HashMap();
        this.f184047d = new com.tencent.mm.sdk.platformtools.r2(12);
        this.f184048e = new java.util.HashMap();
        this.f184049f = new hx4.x(1);
        this.f184050g = null;
        this.f184051h = new java.util.HashMap();
        this.f184052i = new hy4.m0();
        this.f184053j = null;
        this.f184055l = new java.util.HashMap();
        this.f184056m = false;
        this.f184057n = false;
        this.f184058o = false;
        this.f184059p = com.tencent.mm.plugin.webview.ui.tools.m7.DEFAULT;
        this.f184060q = null;
        this.f184061r = 0;
        this.f184062s = 0;
        this.f184063t = 0L;
        this.f184064u = null;
        this.f184065v = new java.util.LinkedList();
        this.f184066w = new java.util.LinkedList();
        this.f184067x = new java.util.LinkedList();
        this.f184068y = new java.util.LinkedList();
        this.f184069z = null;
        this.A = null;
        this.B = null;
        this.C = 5;
        this.D = false;
        this.E = null;
        this.F = true;
        this.G = false;
        this.H = new java.util.HashSet();
        this.I = new com.tencent.mm.plugin.webview.ui.tools.z6(this);
        this.K = 0L;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = 0L;
        int i17 = webViewUI.getResources().getDisplayMetrics().widthPixels;
        int i18 = webViewUI.getResources().getDisplayMetrics().heightPixels;
        boolean l17 = hy4.i.l(webViewUI.F7());
        this.f184056m = l17;
        this.f184057n = hy4.i.k(webViewUI.F7());
        if (l17) {
            this.C = 6;
        }
        this.D = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(this.C);
        this.f184064u = new com.tencent.mm.plugin.webview.ui.tools.x3(this);
    }

    public static void e(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, android.view.MenuItem menuItem) {
        c6Var.getClass();
        if (menuItem instanceof db5.h4) {
            java.lang.String str = ((db5.h4) menuItem).A;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.equals(c6Var.c().f183815f.getUrl())) {
                return;
            }
            c6Var.c().p8(str, null, false);
        }
    }

    public static boolean f(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        c6Var.getClass();
        try {
            return c6Var.c().L1.A.Jg("favorite");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public static android.graphics.Bitmap g(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, android.graphics.drawable.Drawable drawable) {
        c6Var.getClass();
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        android.graphics.Rect bounds = drawable.getBounds();
        int width = !bounds.isEmpty() ? bounds.width() : drawable.getIntrinsicWidth();
        int height = !bounds.isEmpty() ? bounds.height() : drawable.getIntrinsicHeight();
        if (width <= 0) {
            width = 1;
        }
        if (height <= 0) {
            height = 1;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "convertDrawableToRoundedBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "convertDrawableToRoundedBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        drawable.setBounds(bounds);
        return createBitmap;
    }

    public static void h(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, db5.g4 g4Var, java.util.List list, int i17) {
        c6Var.getClass();
        list.clear();
        for (int i18 = 0; i18 < g4Var.size(); i18++) {
            ((db5.h4) g4Var.getItem(i18)).f228362J = new com.tencent.mm.plugin.webview.ui.tools.k6(c6Var, list, i18, i17);
        }
    }

    public boolean A(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, int i17, int i18) {
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.d(i17) == 1 && n(i18);
    }

    public void B(java.lang.String str, android.content.Intent intent) {
        java.util.Map map = this.f184045b;
        android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) ((java.util.HashMap) map).get(str);
        if (sparseBooleanArray == null) {
            sparseBooleanArray = new android.util.SparseBooleanArray();
            ((java.util.HashMap) map).put(str, sparseBooleanArray);
        }
        sparseBooleanArray.put(34, true);
        sparseBooleanArray.put(10, intent.getBooleanExtra("key_menu_hide_expose", false));
    }

    public boolean C() {
        com.tencent.mm.plugin.webview.ui.tools.x3 x3Var = this.f184064u;
        if (x3Var != null && x3Var.i()) {
            return true;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f184044J;
        if (k0Var == null) {
            return false;
        }
        return k0Var.i();
    }

    public final boolean D() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
        return c17 != null && c17.E.f257227c;
    }

    public final void E() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "JumpToReadArticle");
        if (c().f183844p0 != null) {
            nw4.n nVar = c().f183844p0;
            if (!nVar.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onArticleReadBtnClicked fail, not ready");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onArticleReadBtnClicked");
                com.tencent.mm.sdk.platformtools.u3.h(new nw4.k0(nVar, nw4.x2.c("onArticleReadingBtnClicked", new java.util.HashMap(), nVar.f340903q, nVar.f340904r)));
            }
        }
    }

    public final void F(boolean z17) {
        zh1.z0 z0Var;
        com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
        if (k5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, openMaterialService is null");
            return;
        }
        zh1.p pVar = (zh1.p) k5Var;
        if (!pVar.Vi(bi1.g.WEB_VIEW)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, openMaterialService is disabled");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, webViewUI is null");
            return;
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = c17.L1;
        if (e3Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, controller is null");
            return;
        }
        java.lang.String l07 = e3Var.l0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(l07)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, url is empty");
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.webview.ui.tools.n6 n6Var = new com.tencent.mm.plugin.webview.ui.tools.n6(this, z17);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(n6Var, 1000L, false);
            return;
        }
        if (z17 && (z0Var = this.Q) != null) {
            z0Var.dead();
            this.Q = null;
        }
        if (!l07.equals(this.O)) {
            pVar.Ni(new com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel("text/html", "html", l07), new com.tencent.mm.plugin.webview.ui.tools.n7(this, l07, pVar));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "loadOpenMaterialsIfNeedAndEnhanceBottomSheet, already load");
            q(pVar);
        }
    }

    public final void G(boolean z17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.permission.d dVar, android.content.Intent intent) {
        if (!z17) {
            j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        if (!j62.e.g().l("clicfg_webview_expose_config_switch_android", false, false, true)) {
            j45.l.j(c(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
        bundle.putString("query", "{\"scene\":34}");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("k_expose_url", str);
        bundle2.putString("k_expose_raw_url", c().F7());
        bundle2.putInt("k_expose_web_scene", c().L1.k0(str2));
        bundle2.putInt("lastGetA8KeyRequestId", dVar.f183390j);
        bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(c(), bundle, true, false, new com.tencent.mm.plugin.webview.ui.tools.u6(this, intent));
    }

    public void H() {
        com.tencent.mm.plugin.webview.ui.tools.jd c17 = c().f183866w2.c(c().x7());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "brandInfo.sendArticleReadingBtnClicked = " + c17.f184882l);
        if (c17.f184882l) {
            E();
            return;
        }
        java.lang.String x76 = c().x7();
        com.tencent.mm.plugin.webview.ui.tools.jd c18 = c().f183866w2.c(x76);
        if (c18 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "tryTingReadArticle fail, brandInfo is null, currentUrl:%s", x76);
            return;
        }
        bw5.lp0 a17 = c18.a();
        bw5.v70 d17 = a17.d();
        if (d17 != null) {
            d17.y(2);
        }
        il4.e eVar = new il4.e();
        eVar.f292107d = false;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_MpArticleSharePanelRead;
        eVar.f292106c = 1104;
        if (b().getIntExtra("KOpenArticleSceneFromScene", 0) == 334) {
            eVar.f292127x = bw5.x2.BizAudioEnterScene_ArticleMenuListenFromStar;
        } else {
            eVar.f292127x = bw5.x2.BizAudioEnterScene_ArticleMenuListen;
        }
        ((rk4.a) ((qk.k6) i95.n0.c(qk.k6.class))).Ui("webview", a17, eVar);
        b0(2);
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_ReadButtonClicked, ar0Var, a17, null, null);
        }
    }

    public void I() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 3, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(157L, 6L, 1L, false);
        s();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[LOOP:0: B:16:0x00a1->B:18:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[LOOP:1: B:21:0x00d7->B:22:0x00d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.c6.J():void");
    }

    public void K() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 34, 1);
        c().F2.B(false);
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(c().x7())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", 0);
            c().f183844p0.i0("onPageStarStateChanged", hashMap, null);
        }
    }

    public void L() {
        Z(5);
        com.tencent.mm.sdk.platformtools.b0.e(c().L1.l0());
        dp.a.makeText(c(), c().getString(com.tencent.mm.R.string.laa), 0).show();
    }

    public void M() {
        if (hy4.b0.c(c().x7())) {
            c().f183844p0.p("onClickMenuSetFontScale", new org.json.JSONObject());
            com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 51, 1);
            return;
        }
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 8, 1);
        if (c().f183863v.getVisibility() == 8) {
            c().f183863v.startAnimation(android.view.animation.AnimationUtils.loadAnimation(c(), com.tencent.mm.R.anim.f477801bu));
            android.view.View view = c().f183863v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "readerModeFont", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "readerModeFont", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c(), com.tencent.mm.R.anim.f477802bv);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.webview.ui.tools.i6(this));
        c().f183863v.startAnimation(loadAnimation);
        android.view.View view2 = c().f183863v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "readerModeFont", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "readerModeFont", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void N() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 33, 1);
        if (c().v7() != 16) {
            c().E1.a(false);
        }
        c().F2.B(true);
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(c().x7())) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("state", 1);
            c().f183844p0.i0("onPageStarStateChanged", hashMap, null);
        }
    }

    public void O(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.webview.ui.tools.floatball.w wVar = c().f183874y2;
        if (wVar != null) {
            wVar.A(true, 2);
        }
        com.tencent.mm.plugin.webview.ui.tools.floatball.n nVar = c().f183877z2;
        if (nVar != null) {
            nVar.A(true, 2);
        }
        if ((menuItem instanceof db5.h4) && ((db5.h4) menuItem).f228363d) {
            ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ai(this.f184056m ? pv.b0.f358480e : pv.b0.f358481f);
        }
    }

    public void P() {
        com.tencent.mm.plugin.webview.permission.d O = c().L1 != null ? c().L1.O() : null;
        if (O != null) {
            com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 13, 1, "", "", "", 0, "", O.f183386f, java.lang.Integer.valueOf(O.f183390j), O.A, O.f183402v, java.lang.Integer.valueOf(O.F), java.lang.Integer.valueOf(O.G));
        }
        if (this.f184050g != null) {
            c().A8(this.f184050g);
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
        com.tencent.mm.plugin.webview.stub.v0 v0Var = c17.K1;
        com.tencent.mm.plugin.webview.modeltools.h hVar = c17.f183808c3;
        hVar.getClass();
        if (c17.isFinishing()) {
            return;
        }
        hVar.f183258a = new java.lang.ref.WeakReference(this);
        java.lang.String x76 = c17.x7();
        if (com.tencent.mm.sdk.platformtools.t8.K0(x76)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooserHelper", "open in browser fail, url is null");
            return;
        }
        if (v0Var != null) {
            try {
                x76 = v0Var.O3(x76);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooserHelper", "showAndOpenInBrowser, getShareUrl, exception = %s", e17);
            }
        }
        if (!x76.startsWith("http://") && !x76.startsWith("https://")) {
            x76 = "http://".concat(x76);
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(x76));
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.P0(c17) && !com.tencent.mm.sdk.platformtools.a0.c()) {
                c17.startActivityForResult(hx4.r.a(c17, intent, x76, true), 205);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooserHelper", "open in browser %b/%b", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.P0(c17)), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.a0.c()));
            if (fp.h.c(29)) {
                android.app.PendingIntent.getActivity(c17, 0, intent, fp.g0.a(134217728)).send(c17, 1, null, new com.tencent.mm.plugin.webview.modeltools.a(hVar), null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;Lcom/tencent/mm/plugin/webview/stub/WebViewStub_AIDL;Lcom/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c17.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(c17, "com/tencent/mm/plugin/webview/modeltools/BrowserChooserHelper", "showAndOpenInBrowser", "(Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;Lcom/tencent/mm/plugin/webview/stub/WebViewStub_AIDL;Lcom/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrowserChooserHelper", "open in browser failed : %s", e18.getMessage());
        }
    }

    public void Q() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 10, 1);
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
        if (c17.E1.c()) {
            c17.E1.a(false);
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = c17.L1;
        if (e3Var != null) {
            e3Var.J0();
        }
        if (c17.f183841o2 == null || android.text.TextUtils.isEmpty(c17.getMMTitle())) {
            return;
        }
        c17.f183841o2.f36403d = true;
    }

    public void R() {
        zx4.l0 l0Var = new zx4.l0();
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = c();
        kotlin.jvm.internal.o.g(webViewUI, "webViewUI");
        l0Var.g(webViewUI, false, false, "", null);
        com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct webviewFullSnapshotActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct();
        webviewFullSnapshotActionReportStruct.f62947e = 2L;
        webviewFullSnapshotActionReportStruct.f62949g = 2L;
        webviewFullSnapshotActionReportStruct.p(c().x7());
        webviewFullSnapshotActionReportStruct.k();
    }

    public void S() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(480L, 1L, 1L, false);
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 28, 1);
        if (c().H.isShown()) {
            return;
        }
        c().H.c();
        c().H.f187084e.setText("");
        com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter webViewSearchContentInputFooter = c().H;
        webViewSearchContentInputFooter.setVisibility(0);
        com.tencent.mm.plugin.webview.ui.tools.widget.p7 p7Var = webViewSearchContentInputFooter.f187089m;
        if (p7Var != null) {
            p7Var.onShow();
        }
        webViewSearchContentInputFooter.f187084e.requestFocus();
        webViewSearchContentInputFooter.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.widget.o7(webViewSearchContentInputFooter), 100L);
    }

    public void T() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 15, 1);
        c().f183844p0.j("sendEmail", true);
        nw4.n nVar = c().f183844p0;
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSendMail fail, not ready");
            return;
        }
        nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:email", new java.util.HashMap(), nVar.f340903q, nVar.f340904r) + ")", null);
    }

    public void U() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 17, 1);
        c().f183844p0.j("shareQQ", true);
        nw4.n nVar = c().f183844p0;
        java.util.HashMap v17 = v();
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onShareQQ not ready");
            nVar.v0(nVar.x(v17), "shareQQ");
            return;
        }
        android.os.Bundle w17 = nVar.w(1);
        if (w17 != null && w17.getBoolean("WebViewShare_reslut", false)) {
            nVar.v0(w17, "shareQQ");
            return;
        }
        nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:qq", new java.util.HashMap(), nVar.f340903q, nVar.f340904r) + ")", null);
    }

    public void V() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 24, 1);
        c().f183844p0.j("shareQZone", true);
        nw4.n nVar = c().f183844p0;
        java.util.HashMap v17 = v();
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onShareQZone not ready");
            nVar.v0(nVar.x(v17), "shareQZone");
            return;
        }
        android.os.Bundle w17 = nVar.w(1);
        if (w17 != null && w17.getBoolean("WebViewShare_reslut", false)) {
            nVar.v0(w17, "shareQZone");
            return;
        }
        nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:QZone", new java.util.HashMap(), nVar.f340903q, nVar.f340904r) + ")", null);
    }

    public void W() {
        Z(2);
        java.util.HashMap hashMap = this.f184055l;
        e0(hashMap.containsKey(c().f183815f.getUrl()) ? ((java.lang.Integer) hashMap.get(c().f183815f.getUrl())).intValue() : 0, 0);
    }

    public void X() {
        com.tencent.mm.plugin.webview.model.t5.a(c().F7(), 27, 1);
        java.lang.String l07 = c().L1.l0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(l07)) {
            l07 = c().F7();
        }
        try {
            l07 = "weread://mp?url=" + fp.s0.b(l07, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "encode url failed ; %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "now url = %s", l07);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(l07));
        intent.addFlags(268435456);
        if (!com.tencent.mm.sdk.platformtools.t8.I0(c(), intent, true, false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "not availble app match this intent");
            return;
        }
        try {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "shareToWeRead", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            c17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(c17, "com/tencent/mm/plugin/webview/ui/tools/WebViewMenuHelper", "shareToWeRead", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e18, "", new java.lang.Object[0]);
        }
    }

    public void Y() {
        if (((cw4.p0) c().f183866w2.f185656g.f181745h.getValue()) != cw4.p0.f224265f) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("translate_to_language", com.tencent.mm.sdk.platformtools.m2.c(c()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("webview_menu_translate_full_text_btn", "view_clk", hashMap, 30223);
        }
        if (c().l8()) {
            c().f183866w2.f185656g.e(cw4.b0.f224196d);
        } else {
            c().C8(new com.tencent.mm.plugin.webview.ui.tools.w6(this));
        }
    }

    public void Z(int i17) {
        if (c() == null || c().isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.webview.permission.d O = c().L1.O();
        com.tencent.mm.plugin.webview.model.t5.a(c().x7(), java.lang.Integer.valueOf(i17), 1, b().getStringExtra("KPublisherId"), b().getStringExtra("KAppId"), b().getStringExtra("srcUsername"), 0, "", O.f183386f, java.lang.Integer.valueOf(O.f183390j), O.A, O.f183402v, java.lang.Integer.valueOf(O.F), java.lang.Integer.valueOf(O.G), java.lang.Integer.valueOf(O.d()), 0);
    }

    @Override // db5.r4
    public void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        gp1.s Ai;
        if (menuItem.getItemId() != 58 || (Ai = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai()) == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("btn_scene", java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(c().x7()) ? 4 : 5));
        Ai.c(view, hashMap, java.lang.Long.valueOf(this.K));
        if ((menuItem instanceof db5.h4) && ((db5.h4) menuItem).f228363d) {
            ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ni(this.f184056m ? pv.b0.f358480e : pv.b0.f358481f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(int r34, int r35, int r36, com.tencent.mm.plugin.webview.model.s5 r37) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.c6.a0(int, int, int, com.tencent.mm.plugin.webview.model.s5):void");
    }

    public final void b0(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.S >= 1000 && (c17 = c()) != null) {
            this.S = currentTimeMillis;
            java.lang.String x76 = c17.x7();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (x76 == null) {
                x76 = "";
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29209, java.lang.Long.valueOf(currentTimeMillis), 2, java.lang.Integer.valueOf(i17), x76.replaceAll(",", ";"));
        }
    }

    public void c0(boolean z17, boolean z18) {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.S >= 1000 && (c17 = c()) != null) {
            this.S = currentTimeMillis;
            java.lang.String x76 = c17.x7();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (x76 == null) {
                x76 = "";
            }
            java.lang.String replaceAll = x76.replaceAll(",", ";");
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29209, java.lang.Long.valueOf(currentTimeMillis), 1, 1, replaceAll);
            }
            if (z18) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29209, java.lang.Long.valueOf(currentTimeMillis), 1, 2, replaceAll);
            }
        }
    }

    public final void d0(java.lang.String str) {
        c().f183844p0.j("sendAppMessage", false);
        nw4.n nVar = c().f183844p0;
        if (!nVar.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSendToEnterprise fail, not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "enterprise");
        nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:appmessage", hashMap, nVar.f340903q, nVar.f340904r) + ")", null);
        try {
            nVar.f340899m.q7("connector_local_send", str, nVar.f340906t);
            nVar.f340899m.q7(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "enterprise", nVar.f340906t);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e17.getMessage());
        }
    }

    public final void e0(int i17, int i18) {
        c().f183844p0.j(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME, true);
        c().f183844p0.l0(i17, v(), i18);
        c().f183835m2.j("mm_share_sns_count");
    }

    public boolean f0(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, int i17) {
        return jsapiPermissionWrapper != null && jsapiPermissionWrapper.d(i17) == 10;
    }

    public void g0() {
        h0(0L, new java.util.ArrayList(), false, false, -1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(long r18, java.util.ArrayList r20, boolean r21, boolean r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.c6.h0(long, java.util.ArrayList, boolean, boolean, int, int):void");
    }

    public final void i(db5.g4 g4Var, java.lang.String str, android.graphics.drawable.Drawable drawable, android.graphics.Bitmap bitmap, boolean z17, boolean z18) {
        if (this.f184044J == null) {
            return;
        }
        if (!z18) {
            if (o(g4Var, java.lang.Math.max(0, g4Var.y(7)), drawable, str, z17)) {
                this.f184044J.j();
            }
        } else {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.webview.ui.tools.m6 m6Var = new com.tencent.mm.plugin.webview.ui.tools.m6(this, g4Var, drawable, str, z17);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(m6Var, 100L, false);
        }
    }

    public void i0(java.lang.String str, int i17) {
        if (c().f183844p0 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(str, i17);
            nw4.n nVar = c().f183844p0;
            nVar.getClass();
            try {
                nVar.f340899m.ng(21, bundle, nVar.f340906t);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "updateJsapiArgsBundleKV, ex = " + e17);
            }
        }
    }

    public void j() {
        java.lang.String u76 = c().u7(c().L1.f181964y);
        java.lang.String stringExtra = b().getStringExtra("shortcut_user_name");
        if (com.tencent.mm.sdk.platformtools.t8.K0(u76) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "addShortcut, appid or username is null");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("KAppId", u76);
        bundle.putString("shortcut_user_name", stringExtra);
        bundle.putInt("webviewui_binder_id", hashCode());
        try {
            c().L1.A.i(80, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "addShortcut, e = " + e17.getMessage());
        }
    }

    public void k() {
        java.lang.String x76 = c().x7();
        com.tencent.mm.plugin.webview.ui.tools.jd c17 = c().f183866w2.c(x76);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "addToTingLaterPlayList fail, brandInfo is null, currentUrl:%s", x76);
            return;
        }
        bw5.ar0 ar0Var = bw5.ar0.TingScene_MpArticleSharePanelRead;
        final bw5.lp0 a17 = c17.a();
        final com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(c(), c().getString(com.tencent.mm.R.string.f490573yv), c().getString(com.tencent.mm.R.string.me6), true, false, null);
        Q.show();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.wechat.iam.biz.o.f217761b.a(a17, 1104, new fx4.i(new com.tencent.mm.plugin.webview.ui.tools.y6(this, Q, a17)));
        } else {
            try {
                com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args addItemToPlayLaterIPCTask$Args = new com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Args(a17.toByteArray(), 1104);
                final yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.webview.ui.tools.c6$$b
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = com.tencent.mm.plugin.webview.ui.tools.c6.this;
                        c6Var.getClass();
                        ik1.h0.b(new com.tencent.mm.plugin.webview.ui.tools.a7(c6Var, Q, (com.tencent.mm.plugin.webview.ui.tools.audio.AddItemToPlayLaterIPCTask$Result) obj, a17));
                        return null;
                    }
                };
                uk0.a.b(addItemToPlayLaterIPCTask$Args, new fx4.e(), new com.tencent.mm.ipcinvoker.r(lVar) { // from class: fx4.f

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f267152d;

                    {
                        kotlin.jvm.internal.o.g(lVar, "function");
                        this.f267152d = lVar;
                    }

                    @Override // com.tencent.mm.ipcinvoker.r
                    public final /* synthetic */ void a(java.lang.Object obj) {
                        this.f267152d.invoke(obj);
                    }
                });
            } catch (java.io.IOException e17) {
                Q.dismiss();
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "listenLaterTingItem to byte array error " + e17);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(20L, 2114L, 0L, false);
        }
        b0(1);
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (Zi != null) {
            ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_AddToListenLaterList, ar0Var, a17, null, null);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_listen_later");
        hashMap.put("currscene", 1104);
        hashMap.put("which_button", 21);
        hashMap.put("actionbizinfo", rk4.j5.f(c().x7()));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
    }

    public final com.tencent.mm.pluginsdk.model.g2 l(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2("text/html", webViewUI.L1.l0());
        long longExtra = b().getLongExtra("msg_id", Long.MIN_VALUE);
        g2Var.f189313f = b().getStringExtra("msg_talker");
        if (longExtra != Long.MIN_VALUE && longExtra != com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            g2Var.f189312e = longExtra;
        }
        g2Var.f189315h = this.C;
        g2Var.f189316i = b().getIntExtra("geta8key_scene", 0);
        return g2Var;
    }

    public boolean m(int i17) {
        return D() ? i17 == 6 || i17 == 10 : !this.F || this.H.contains(java.lang.Integer.valueOf(i17));
    }

    public boolean n(int i17) {
        android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) ((java.util.HashMap) this.f184045b).get(c().f183815f.getUrl());
        return sparseBooleanArray == null || !sparseBooleanArray.get(i17, false);
    }

    public final boolean o(db5.g4 g4Var, int i17, android.graphics.drawable.Drawable drawable, java.lang.String str, boolean z17) {
        if (g4Var == null) {
            return false;
        }
        if (g4Var.findItem(45) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "doAddDefaultBrowserMenuItem has added and ignore");
            return false;
        }
        android.view.MenuItem e17 = g4Var.e(45, i17, str, 0, 0, z17);
        db5.h4 h4Var = (db5.h4) e17;
        h4Var.f228372p = android.text.TextUtils.TruncateAt.END;
        h4Var.f228380x = false;
        ((db5.h4) e17).setIcon(drawable);
        return true;
    }

    public void p(java.lang.String str) {
        boolean z17;
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var;
        com.tencent.mm.plugin.webview.ui.tools.m7 m7Var;
        java.lang.String str2;
        java.lang.String stringExtra = b().getStringExtra("geta8key_username");
        java.lang.String x76 = c().x7();
        java.lang.String str3 = null;
        java.lang.String host = !com.tencent.mm.sdk.platformtools.t8.K0(x76) ? android.net.Uri.parse(x76).getHost() : null;
        boolean z18 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(host) && host.startsWith(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9))) {
            try {
                str3 = java.lang.String.format(com.tencent.mm.ui.n2.f209399b, fp.s0.b(x76, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", e17.getMessage());
            }
        }
        java.lang.String u76 = c().u7(c().f183815f.getUrl());
        if (!android.text.TextUtils.isEmpty(u76) && !android.text.TextUtils.isEmpty(c().f183815f.getUrl())) {
            long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
            c().f183815f.getUrl();
            java.lang.String str4 = c().P;
            try {
                str2 = fp.s0.b(c().f183815f.getUrl(), com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.io.UnsupportedEncodingException e18) {
                str2 = "";
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e18, "", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13377, java.lang.Long.valueOf(i17), u76, str2, c().P, 4, 1);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 34);
            z17 = true;
        } else {
            z17 = false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                intent.putExtra("k_webview_html", android.util.Base64.encodeToString(str.getBytes(com.tencent.mapsdk.internal.rv.f51270c), 11));
            } catch (java.io.UnsupportedEncodingException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "[oneliang]html get byte error, ex = " + e19.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "expose curUrl %s, rawUrl %s", x76, c().F7());
        intent.putExtra("rawUrl", str3);
        intent.putExtra("k_expose_url", x76);
        intent.putExtra("k_expose_raw_url", c().F7());
        intent.putExtra("k_expose_web_scene", c().L1.k0(stringExtra));
        intent.putExtra("key_menu_hide_expose", true);
        com.tencent.mm.plugin.webview.permission.d O = c().L1.O();
        intent.putExtra("lastGetA8KeyRequestId", O.f183390j);
        if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(c().x7())) {
            zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
            java.lang.String x77 = c().x7();
            ((yq1.z) a0Var).getClass();
            if (!(x77 != null ? hy4.i.k(x77) : false)) {
                c6Var = this;
                m7Var = c6Var.f184059p;
                if (m7Var != com.tencent.mm.plugin.webview.ui.tools.m7.DISABLED || (m7Var == com.tencent.mm.plugin.webview.ui.tools.m7.DEFAULT && z18)) {
                    G(z17, x76, stringExtra, O, intent);
                } else {
                    db5.e1.C(c(), c().getString(com.tencent.mm.R.string.l77), "", c().getString(com.tencent.mm.R.string.f490007i9), c().getString(com.tencent.mm.R.string.f490373t6), false, new com.tencent.mm.plugin.webview.ui.tools.s6(this, intent, z17, x76, stringExtra, O), new com.tencent.mm.plugin.webview.ui.tools.t6(this, z17, x76, stringExtra, O, intent));
                    return;
                }
            }
        }
        c6Var = this;
        z18 = true;
        m7Var = c6Var.f184059p;
        if (m7Var != com.tencent.mm.plugin.webview.ui.tools.m7.DISABLED) {
        }
        G(z17, x76, stringExtra, O, intent);
    }

    public final void q(com.tencent.mm.plugin.appbrand.service.k5 k5Var) {
        if (this.P == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, openMaterialCollection is null");
            return;
        }
        if (this.f184044J == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, mmBottomSheet is null");
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, webViewUI is null");
            return;
        }
        boolean z17 = false;
        try {
            com.tencent.mm.protocal.JsapiPermissionWrapper C7 = c().C7();
            if (!this.f184058o && c().v7() != 16 && m(7) && z(C7, 45) && n(7) && !f0(C7, 45)) {
                if (!this.N.booleanValue()) {
                    z17 = true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "canShowOpenMaterials fail since " + e17);
        }
        com.tencent.mm.pluginsdk.model.g2 l17 = l(c17);
        this.E = l17;
        if (this.D) {
            if (this.f184044J.f211861g2) {
                return;
            }
            com.tencent.mm.pluginsdk.model.m2 w17 = w(c17, l17);
            this.B = w17;
            if (w17 != null && z17) {
                ((com.tencent.mm.pluginsdk.ui.otherway.v) w17).e(this.f184044J);
                return;
            }
        }
        zh1.p pVar = (zh1.p) k5Var;
        if (!pVar.Zi(this.f184044J, this.P)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, not need enhance");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "enhanceBottomSheet, canShowOpenMaterials: " + z17);
        zh1.z0 z0Var = this.Q;
        if (z0Var != null) {
            z0Var.o(z17 ? zh1.y0.ENABLE : zh1.y0.HIDE);
            return;
        }
        if (z17) {
            this.Q = pVar.Ai(bi1.g.WEB_VIEW, c17, this.f184044J, this.P, null, null);
            com.tencent.mm.plugin.webview.ui.tools.o7 o7Var = this.R;
            if (o7Var == null) {
                o7Var = new com.tencent.mm.plugin.webview.ui.tools.o7(this);
                this.R = o7Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "keepMyself#OpenMaterialReleaser, isKept: " + o7Var.f186731d);
            if (o7Var.f186731d) {
                return;
            }
            c17.keep(o7Var);
            o7Var.f186731d = true;
        }
    }

    public final void r(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mm.sdk.platformtools.r2 r2Var = this.f184047d;
            if (r2Var.get(str) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "find %s icon from cache ok", str);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "not found %s icon from cache, try to load", str);
                try {
                    java.lang.String R9 = c().L1.A.R9(str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(R9)) {
                        java.util.HashMap hashMap = com.tencent.mm.plugin.webview.ui.tools.a1.f183889a;
                        android.graphics.Bitmap a17 = hy4.z.f286206a.a(R9);
                        if (a17 != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "load ok, and cache it");
                            r2Var.put(str, a17);
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + e17.getMessage());
                }
            }
            java.util.HashMap hashMap2 = this.f184048e;
            if (hashMap2.containsKey(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "find %s nick from cache ok", str);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "not found %s nick from cache, try to load", str);
                java.lang.String str2 = null;
                try {
                    str2 = c().L1.A.getDisplayName(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "load nick ok");
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebViewMenuHelper", "onAttach, ex = " + e18.getMessage());
                }
                hashMap2.put(str, str2);
            }
        }
    }

    public void s() {
        if (c().f183844p0 != null) {
            c().f183844p0.U("fav");
            c().f183844p0.j("sendAppMessage", false);
            c().f183844p0.J(v(), 0);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("msg_talker", b().getStringExtra("msg_talker"));
        bundle.putLong("msg_id", b().getLongExtra("msg_id", Long.MIN_VALUE));
        bundle.putString("sns_local_id", b().getStringExtra("sns_local_id"));
        bundle.putInt("news_svr_id", b().getIntExtra("news_svr_id", 0));
        bundle.putString("news_svr_tweetid", b().getStringExtra("news_svr_tweetid"));
        bundle.putInt("message_index", b().getIntExtra("message_index", 0));
        bundle.putString("rawUrl", c().F7());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c().F7()) && c().F7().endsWith("#rd")) {
            java.lang.String substring = c().F7().substring(0, c().F7().length() - 3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(c().L1.f181964y) && !c().L1.f181964y.startsWith(substring)) {
                bundle.putString("rawUrl", c().L1.f181964y);
                bundle.putLong("msg_id", Long.MIN_VALUE);
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c().L1.f181964y) && !c().L1.f181964y.startsWith(c().F7())) {
            bundle.putString("rawUrl", c().L1.f181964y);
            bundle.putLong("msg_id", Long.MIN_VALUE);
        }
        android.content.Intent b17 = b();
        if (b17 != null) {
            bundle.putString("preChatName", b17.getStringExtra("preChatName"));
            bundle.putInt("preMsgIndex", b17.getIntExtra("preMsgIndex", 0));
            bundle.putString("prePublishId", b17.getStringExtra("prePublishId"));
            bundle.putString("preUsername", b17.getStringExtra("preUsername"));
        }
        try {
            com.tencent.mm.plugin.webview.stub.e jg6 = c().L1.A.jg(bundle);
            if (jg6.k2()) {
                c().f183844p0.j("sendAppMessage", false);
                c().f183844p0.J(v(), 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "on favorite simple url");
                return;
            }
            o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
            int ret = jg6.getRet();
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI c17 = c();
            com.tencent.mm.ui.widget.snackbar.g gVar = c().f183850q3;
            ((com.tencent.mm.pluginsdk.model.s1) e4Var).getClass();
            com.tencent.mm.plugin.fav.ui.u1.g(ret, 35, c17, gVar);
            if (jg6.getRet() == 0) {
                t(3, 1);
            } else {
                t(3, 2);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "edw, favoriteUrl fail, ex = " + e17.getMessage());
        }
    }

    public void t(int i17, int i18) {
        java.lang.String str;
        java.lang.String u76 = c().u7(c().L1.f181964y);
        if (android.text.TextUtils.isEmpty(c().L1.f181964y) || android.text.TextUtils.isEmpty(u76)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "stev appId is null or empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "stev appId %s", u76);
        long i19 = com.tencent.mm.sdk.platformtools.t8.i1();
        java.lang.String str2 = c().L1.f181964y;
        java.lang.String str3 = c().P;
        try {
            str = fp.s0.b(c().L1.f181964y, com.tencent.mapsdk.internal.rv.f51270c);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMenuHelper", e17, "", new java.lang.Object[0]);
            str = "";
        }
        int k07 = c().L1.k0(b().getStringExtra("geta8key_username"));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13377, java.lang.Long.valueOf(i19), u76, str, c().P, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 0, (k07 == 7 || k07 == 56) ? b().getStringExtra("geta8key_username") : "");
    }

    public void u(int i17, db5.g4 g4Var) {
        if (this.f184058o || i17 == 16) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(g4Var.f228344d);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "filterMenu original size:" + arrayList.size());
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int itemId = ((android.view.MenuItem) it.next()).getItemId();
                if (!((java.util.HashSet) this.I).contains(java.lang.Integer.valueOf(itemId))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "filterMenu removeItem:" + itemId);
                    g4Var.removeItem(itemId);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "filterMenu return size:" + g4Var.size());
        }
    }

    public java.util.HashMap v() {
        if (!c().f183820g3) {
            return null;
        }
        android.content.Intent b17 = b();
        java.lang.String stringExtra = b17.getStringExtra("share_report_pre_msg_url");
        java.lang.String stringExtra2 = b17.getStringExtra("share_report_pre_msg_title");
        java.lang.String stringExtra3 = b17.getStringExtra("share_report_pre_msg_icon_url");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("share_report_pre_msg_url", stringExtra);
        hashMap.put("share_report_pre_msg_title", stringExtra2);
        hashMap.put("share_report_pre_msg_desc", b17.getStringExtra("share_report_pre_msg_desc"));
        hashMap.put("share_report_pre_msg_icon_url", stringExtra3);
        return hashMap;
    }

    public final com.tencent.mm.pluginsdk.model.m2 w(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, com.tencent.mm.pluginsdk.model.g2 g2Var) {
        com.tencent.mm.pluginsdk.model.m2 m2Var = this.B;
        if (m2Var != null) {
            return m2Var;
        }
        com.tencent.mm.pluginsdk.model.m2 wi6 = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).wi(webViewUI, g2Var);
        if (wi6 != null) {
            com.tencent.mm.protocal.JsapiPermissionWrapper C7 = c().C7();
            if ((gm0.m.i() != 0) && m(20) && z(C7, 91) && com.tencent.mm.plugin.webview.stub.a.a(c()) && n(20)) {
                com.tencent.mm.pluginsdk.model.o0 o0Var = new com.tencent.mm.pluginsdk.model.o0("web_share_to_qq");
                o0Var.f189393e = !f0(C7, 91);
                o0Var.f189392d = java.lang.Integer.valueOf(com.tencent.mm.R.raw.bottomsheet_icon_qq);
                o0Var.f189390b = c().getString(com.tencent.mm.R.string.oot);
                o0Var.f189394f = new com.tencent.mm.pluginsdk.model.n0() { // from class: com.tencent.mm.plugin.webview.ui.tools.c6$$a
                    @Override // com.tencent.mm.pluginsdk.model.n0
                    public final void a(android.content.Context context) {
                        com.tencent.mm.plugin.webview.ui.tools.c6.this.U();
                    }
                };
                com.tencent.mm.pluginsdk.ui.otherway.v vVar = (com.tencent.mm.pluginsdk.ui.otherway.v) wi6;
                com.tencent.mm.pluginsdk.ui.otherway.w wVar = new com.tencent.mm.pluginsdk.ui.otherway.w();
                wVar.f191017g = o0Var;
                vVar.a(kz5.c0.d(wVar));
                vVar.b("com.tencent.mobileqq", false);
            }
        }
        return wi6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int x() {
        if (c() == null || c().f183876z1 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewMenuHelper", "getShareFuncFlag params failed");
            return -1;
        }
        com.tencent.mm.protocal.JsapiPermissionWrapper c17 = c().f183876z1.c();
        boolean A = A(c17, 21, 1);
        int i17 = A;
        if (A(c17, 23, 2)) {
            i17 = (A ? 1 : 0) | 2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "getShareFuncFlag %d", java.lang.Integer.valueOf(i17));
        return i17;
    }

    public void y() {
        this.F = true;
        java.util.Set set = this.H;
        ((java.util.HashSet) set).clear();
        if (c() instanceof com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI) {
            ((java.util.HashSet) set).add(11);
            ((java.util.HashSet) set).add(28);
        } else {
            ((java.util.HashSet) set).add(7);
            ((java.util.HashSet) set).add(11);
            ((java.util.HashSet) set).add(28);
        }
    }

    public boolean z(com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, int i17) {
        if (jsapiPermissionWrapper == null) {
            return false;
        }
        int d17 = jsapiPermissionWrapper.d(i17);
        return d17 == 1 || d17 == 10;
    }
}
