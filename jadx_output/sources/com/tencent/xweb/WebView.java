package com.tencent.xweb;

/* loaded from: classes13.dex */
public class WebView extends android.widget.FrameLayout implements tx5.f {

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.xweb.f1 f220189m;

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.xweb.f1 f220190n;

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f220191o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f220192p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f220193q;

    /* renamed from: r, reason: collision with root package name */
    public static final xx5.u f220194r;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.f1 f220195d;

    /* renamed from: e, reason: collision with root package name */
    public tx5.f f220196e;

    /* renamed from: f, reason: collision with root package name */
    public qx5.l f220197f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnLongClickListener f220198g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f220199h;

    /* renamed from: i, reason: collision with root package name */
    public final xx5.t f220200i;

    static {
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_NONE;
        f220189m = f1Var;
        f220190n = f1Var;
        f220191o = "";
        f220192p = false;
        f220193q = false;
        f220194r = new xx5.u();
    }

    public WebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void B0() {
        com.tencent.xweb.f1 n17 = org.xwalk.core.XWalkEnvironment.n(by5.u3.b(org.xwalk.core.XWalkEnvironment.f347970c));
        by5.c4.a("WebView", "reinitToXWeb, webViewKind:" + n17);
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.f1.WV_KIND_PINUS;
        if (n17 == f1Var) {
            by5.c4.a("WebView", "reinitToPinus");
            f220189m = com.tencent.xweb.f1.WV_KIND_NONE;
            org.xwalk.core.XWalkEnvironment.f347971d = by5.u3.c(by5.a.b());
            v0(org.xwalk.core.XWalkEnvironment.f347970c, f1Var, f220191o, null);
            by5.s0.e(1749L, 66L, 1L);
        }
    }

    public static boolean C0(android.content.Context context, com.tencent.xweb.f1 f1Var) {
        com.tencent.xweb.f1 n17;
        boolean z17;
        int i17;
        boolean z18;
        by5.c4.a("WebView", "tryInitWebViewCore start, type:" + f1Var);
        com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_CW;
        if ((f1Var == f1Var2 || f1Var == com.tencent.xweb.f1.WV_KIND_PINUS) && (n17 = org.xwalk.core.XWalkEnvironment.n(org.xwalk.core.XWalkEnvironment.d())) != com.tencent.xweb.f1.WV_KIND_NONE && f1Var != n17) {
            by5.c4.a("WebView", "tryInitWebViewCore, type:" + f1Var + ", but actual type:" + n17);
            return false;
        }
        java.util.List list = by5.q.f36580j;
        synchronized (by5.q.class) {
            com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
            if (!by5.d4.e().getBoolean("bIgnoreCrashWatch", false)) {
                if (by5.q.c("LOAD_CORE", f1Var).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_LOAD_CORE, module:" + getModuleName() + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 1);
                } else if (by5.q.c("CREATE_WEBVIEW", f1Var).e()) {
                    by5.c4.f("CrashWatchDog", "hasRecentCrash, SCENE_CREATE_WEBVIEW, module:" + getModuleName() + ", kind:" + f1Var);
                    by5.s0.k(f1Var, 2);
                }
                z17 = true;
            }
            z17 = false;
        }
        if (z17) {
            by5.c4.a("WebView", "tryInitWebViewCore, has recent crash");
            com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
            if (n1Var != null && (f1Var == f1Var2 || f1Var == com.tencent.xweb.f1.WV_KIND_PINUS)) {
                n1Var.b(577L, 61L, 1L);
                by5.s0.p(nd1.a2.CTRL_INDEX, 62);
            }
            return false;
        }
        by5.q c17 = by5.q.c("LOAD_CORE", f1Var);
        c17.g();
        try {
            tx5.i c18 = tx5.j.c(f1Var);
            if (c18 != null) {
                z18 = c18.c(context, null);
                if (z18) {
                    synchronized (com.tencent.xweb.WebView.class) {
                        by5.a1.e(new com.tencent.xweb.WebView$$a(c18));
                    }
                    by5.c4.a("WebView", "tryInitWebViewCore success");
                    by5.s0.l(f1Var);
                    c17.f();
                    f220190n = f1Var;
                    return z18;
                }
            } else {
                z18 = false;
            }
            by5.c4.a("WebView", "tryInitWebViewCore failed");
            return z18;
        } catch (java.lang.Throwable th6) {
            com.tencent.xweb.n1 n1Var2 = by5.s0.f36595c;
            if (n1Var2 != null) {
                if (f1Var != com.tencent.xweb.f1.WV_KIND_CW && f1Var != com.tencent.xweb.f1.WV_KIND_PINUS) {
                    i17 = f1Var == com.tencent.xweb.f1.WV_KIND_SYS ? 80 : 82;
                }
                n1Var2.b(577L, i17, 1L);
            }
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(th6);
            by5.q.a(stackTraceString);
            by5.c4.a("WebView", "tryInitWebViewCore failed, type:" + f1Var + ", error:" + stackTraceString);
            xx5.g.a(1, stackTraceString, f1Var.ordinal(), "");
            return false;
        }
    }

    public static com.tencent.xweb.f1 getCurrentModuleLastInitWebCoreType() {
        return f220190n;
    }

    public static com.tencent.xweb.f1 getCurrentModuleWebCoreType() {
        return f220189m;
    }

    public static java.lang.String getModuleName() {
        return f220191o;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[LOOP:0: B:10:0x0029->B:19:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.tencent.xweb.f1[] getWebViewKindList() {
        /*
            com.tencent.xweb.b r0 = com.tencent.xweb.b.m()
            java.lang.String r1 = "webview_kind_list"
            java.lang.String r2 = getModuleName()
            java.lang.String r0 = r0.g(r1, r2)
            if (r0 == 0) goto L7b
            java.lang.String r1 = ""
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L7b
            java.lang.String r1 = ","
            java.lang.String[] r1 = r0.split(r1)
            if (r1 == 0) goto L7b
            int r2 = r1.length
            if (r2 <= 0) goto L7b
            int r2 = r1.length
            com.tencent.xweb.f1[] r2 = new com.tencent.xweb.f1[r2]
            r3 = 0
            r4 = r3
        L29:
            int r5 = r1.length
            java.lang.String r6 = "WebView"
            if (r4 >= r5) goto L65
            com.tencent.xweb.b r5 = com.tencent.xweb.b.m()
            r7 = r1[r4]
            r5.getClass()
            com.tencent.xweb.f1 r8 = com.tencent.xweb.f1.WV_KIND_NONE
            if (r7 == 0) goto L51
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L42
            goto L51
        L42:
            com.tencent.xweb.f1 r5 = com.tencent.xweb.f1.valueOf(r7)     // Catch: java.lang.Throwable -> L47
            goto L52
        L47:
            r7 = move-exception
            java.lang.String r5 = r5.n()
            java.lang.String r9 = "convertWebType error"
            by5.c4.d(r5, r9, r7)
        L51:
            r5 = r8
        L52:
            if (r5 == r8) goto L59
            r2[r4] = r5
            int r4 = r4 + 1
            goto L29
        L59:
            java.lang.String r1 = "getWebViewKindList, error config:"
            java.lang.String r0 = r1.concat(r0)
            by5.c4.g(r6, r0)
            com.tencent.xweb.f1[] r0 = new com.tencent.xweb.f1[r3]
            return r0
        L65:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getWebViewKindList:"
            r0.<init>(r1)
            java.lang.String r1 = java.util.Arrays.toString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            by5.c4.f(r6, r0)
            return r2
        L7b:
            com.tencent.xweb.f1 r0 = com.tencent.xweb.f1.WV_KIND_PINUS
            com.tencent.xweb.f1 r1 = com.tencent.xweb.f1.WV_KIND_SYS
            com.tencent.xweb.f1[] r0 = new com.tencent.xweb.f1[]{r0, r1}
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.WebView.getWebViewKindList():com.tencent.xweb.f1[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.xweb.f1 u0(com.tencent.xweb.f1 r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.WebView.u0(com.tencent.xweb.f1, java.lang.String):com.tencent.xweb.f1");
    }

    public static synchronized void v0(android.content.Context context, com.tencent.xweb.f1 f1Var, java.lang.String str, com.tencent.xweb.e1 e1Var) {
        synchronized (com.tencent.xweb.WebView.class) {
            by5.c4.a("WebView", "initWebviewCore start, kind:" + f1Var + ", module:" + str);
            com.tencent.xweb.f1 f1Var2 = f220189m;
            if (f1Var2 != com.tencent.xweb.f1.WV_KIND_NONE) {
                if (f1Var2 != f1Var) {
                    by5.c4.a("WebView", "initWebviewCore, set invalid webview kind:" + f1Var + ", expected:" + f220189m);
                    if (e1Var != null) {
                        e1Var.b();
                    }
                } else {
                    by5.c4.a("WebView", "initWebviewCore, already init webview kind:" + f1Var);
                    if (e1Var != null) {
                        e1Var.a();
                    }
                }
                return;
            }
            xx5.u uVar = f220194r;
            uVar.f458113c = java.lang.System.currentTimeMillis();
            if (str == null || str.isEmpty()) {
                str = "tools";
            }
            f220191o = str;
            by5.s0.f36593a = str;
            org.xwalk.core.XWalkEnvironment.c(context);
            by5.c4.f("XWebUpdater", "tryEmbedInstall, start check runtime update");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("UpdaterCheckType", "4");
            ((zx5.i0) zx5.n0.f477252a).e(org.xwalk.core.XWalkEnvironment.f347970c, hashMap);
            uVar.a(w0(context, u0(f1Var, str), e1Var, true), f220189m.ordinal(), str);
            by5.c4.g("WebView", "###### initWebviewCore costTime:" + uVar.f458115e + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
        }
    }

    public static synchronized boolean w0(android.content.Context context, com.tencent.xweb.f1 f1Var, com.tencent.xweb.e1 e1Var, boolean z17) {
        synchronized (com.tencent.xweb.WebView.class) {
            by5.c4.a("WebView", "initWebviewCore, kind:" + f1Var + ", bTryOtherWebtype:" + z17);
            boolean C0 = C0(context, f1Var);
            if (!C0 && z17) {
                by5.c4.g("WebView", "initWebviewCore failed, type:" + f1Var + ", try other webview types");
                com.tencent.xweb.f1[] webViewKindList = getWebViewKindList();
                int i17 = 0;
                while (true) {
                    if (i17 >= webViewKindList.length) {
                        break;
                    }
                    com.tencent.xweb.f1 f1Var2 = webViewKindList[i17];
                    if (f1Var2 != f1Var && (C0 = C0(context, f1Var2))) {
                        f220189m = webViewKindList[i17];
                        break;
                    }
                    i17++;
                }
            } else if (C0) {
                f220189m = f1Var;
            }
            if (!C0) {
                by5.c4.c("WebView", "initWebviewCore failed finally");
                if (e1Var != null) {
                    e1Var.b();
                }
                com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
                if (n1Var != null) {
                    n1Var.b(577L, 83L, 1L);
                }
                return false;
            }
            if (e1Var != null) {
                e1Var.a();
            }
            by5.c4.a("WebView", "initWebviewCore success, type:" + f220189m + ", sdkVer:" + com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE + ", apkVer:" + org.xwalk.core.XWalkEnvironment.d());
            return true;
        }
    }

    public static boolean x0() {
        return f220189m == com.tencent.xweb.f1.WV_KIND_SYS;
    }

    public static boolean y0() {
        return f220189m == com.tencent.xweb.f1.WV_KIND_PINUS;
    }

    public void A0(int i17, int i18, int i19, int i27) {
    }

    @Override // tx5.f
    public boolean F() {
        return this.f220196e.F();
    }

    @Override // tx5.f
    public void S(boolean z17) {
        this.f220196e.S(z17);
    }

    @Override // tx5.f
    public boolean T() {
        return this.f220196e.T();
    }

    @Override // tx5.f
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f220196e.addJavascriptInterface(obj, str);
    }

    public void b() {
        onResume();
    }

    public void c() {
        onPause();
    }

    @Override // tx5.f
    public boolean canGoBack() {
        return this.f220196e.canGoBack();
    }

    @Override // tx5.f
    public boolean canGoForward() {
        return this.f220196e.canGoForward();
    }

    @Override // tx5.f
    public void captureLongScreenshot(android.graphics.Rect rect, android.webkit.ValueCallback valueCallback) {
        this.f220196e.captureLongScreenshot(rect, valueCallback);
    }

    @Override // tx5.f
    public void clearHistory() {
        this.f220196e.clearHistory();
    }

    @Override // tx5.f
    public void clearMatches() {
        this.f220196e.clearMatches();
    }

    @Override // tx5.f
    public void clearSslPreferences() {
        this.f220196e.clearSslPreferences();
    }

    @Override // tx5.f
    public void clearView() {
        this.f220196e.clearView();
    }

    public void destroy() {
        android.content.Context context = getContext();
        if (context instanceof com.tencent.xweb.i1) {
            ((com.tencent.xweb.i1) context).f220300a = null;
        }
        this.f220196e.destroy();
        if (this.f220199h) {
            return;
        }
        this.f220199h = true;
        com.tencent.xweb.f1 f1Var = this.f220195d;
        synchronized (com.tencent.xweb.j1.class) {
            com.tencent.xweb.j1.f220317a--;
            com.tencent.xweb.f1 f1Var2 = com.tencent.xweb.f1.WV_KIND_PINUS;
            com.tencent.xweb.j1.f220318b = f1Var == f1Var2 ? com.tencent.xweb.j1.f220318b - 1 : com.tencent.xweb.j1.f220318b;
            com.tencent.xweb.f1 f1Var3 = com.tencent.xweb.f1.WV_KIND_SYS;
            com.tencent.xweb.j1.f220319c = f1Var == f1Var3 ? com.tencent.xweb.j1.f220319c - 1 : com.tencent.xweb.j1.f220319c;
            by5.c4.f("WebViewCounter", "decrease, count:" + com.tencent.xweb.j1.f220317a + ", sPinusCount:" + com.tencent.xweb.j1.f220318b + ", sSysCount:" + com.tencent.xweb.j1.f220319c + ", WebViewKind:" + f1Var);
            if (f1Var == f1Var3 && com.tencent.xweb.j1.f220319c == 0 && !com.tencent.xweb.t1.f() && getCurrentModuleWebCoreType() == f1Var2 && com.tencent.xweb.b.m().h("webview_counter_reinit_pinus", "mm", true)) {
                w0(org.xwalk.core.XWalkEnvironment.f347970c, f1Var2, null, false);
                by5.c4.f("WebViewCounter", "decrease, reinit pinus webview core.");
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        try {
            return super.drawChild(canvas, view, j17);
        } catch (java.lang.Throwable th6) {
            by5.c4.g("WebView", "drawChild error:" + android.util.Log.getStackTraceString(th6));
            return false;
        }
    }

    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f220196e.evaluateJavascript(str, valueCallback);
    }

    public android.graphics.Bitmap f() {
        return this.f220196e.f();
    }

    @Override // tx5.f
    public void findAllAsync(java.lang.String str) {
        this.f220196e.findAllAsync(str);
    }

    @Override // tx5.f
    public void findNext(boolean z17) {
        this.f220196e.findNext(z17);
    }

    @Override // tx5.f
    public java.lang.String getAbstractInfo() {
        return this.f220196e.getAbstractInfo();
    }

    public android.graphics.Bitmap getBitmap() {
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        if (createBitmap != null) {
            createBitmap.eraseColor(-1);
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            if (z0()) {
                try {
                    android.graphics.Paint paint = new android.graphics.Paint();
                    paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_OVER));
                    java.util.Iterator it = ((java.util.ArrayList) t0(this)).iterator();
                    while (it.hasNext()) {
                        android.graphics.Bitmap bitmap = ((android.view.TextureView) it.next()).getBitmap();
                        if (bitmap != null) {
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                        } else {
                            by5.c4.c("WebView", "getBitmap, textureViewBitmap = null");
                        }
                    }
                    int width2 = getWidth();
                    int height2 = getHeight();
                    android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(config2);
                    arrayList2.add(java.lang.Integer.valueOf(height2));
                    arrayList2.add(java.lang.Integer.valueOf(width2));
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                    yj0.a.e(obj2, createBitmap2, "com/tencent/xweb/WebView", "getBitmap", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    getTopView().draw(new android.graphics.Canvas(createBitmap2));
                    canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
                } catch (java.lang.Throwable th6) {
                    by5.c4.d("WebView", "getBitmap, error", th6);
                }
            } else {
                draw(canvas);
            }
        }
        return createBitmap;
    }

    @Override // tx5.f
    public android.net.http.SslCertificate getCertificate() {
        return this.f220196e.getCertificate();
    }

    @Override // tx5.f
    public int getContentHeight() {
        return this.f220196e.getContentHeight();
    }

    @java.lang.Deprecated
    public tx5.b getCookieManager() {
        return null;
    }

    public com.tencent.xweb.f1 getCurrentInstanceWebCoreType() {
        return this.f220195d;
    }

    public qx5.l getDebugView() {
        return this.f220197f;
    }

    @Override // tx5.f
    public android.graphics.Bitmap getFavicon() {
        return this.f220196e.getFavicon();
    }

    @Override // tx5.f
    public com.tencent.xweb.c1 getFullscreenVideoKind() {
        return this.f220196e.getFullscreenVideoKind();
    }

    @Override // tx5.f
    public com.tencent.xweb.d1 getHitTestResult() {
        return this.f220196e.getHitTestResult();
    }

    @Override // tx5.f
    public void getImageFromDiskCache(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f220196e.getImageFromDiskCache(str, valueCallback);
    }

    @Override // tx5.f
    public java.lang.String getOriginalUrl() {
        return this.f220196e.getOriginalUrl();
    }

    @Override // tx5.f
    public int getProgress() {
        return this.f220196e.getProgress();
    }

    @Override // tx5.f
    public float getScale() {
        return this.f220196e.getScale();
    }

    @Override // tx5.f
    public int getScrollHeight() {
        return this.f220196e.getScrollHeight();
    }

    @Override // tx5.f
    public com.tencent.xweb.z0 getSettings() {
        return this.f220196e.getSettings();
    }

    @Override // tx5.f
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        return this.f220196e.getTextClassifier();
    }

    public java.lang.String getTitle() {
        return this.f220196e.getTitle();
    }

    @Override // tx5.f
    public android.view.ViewGroup getTopView() {
        return this.f220196e.getTopView();
    }

    @Override // tx5.f
    public java.lang.String getUrl() {
        return this.f220196e.getUrl();
    }

    @Override // tx5.f
    public java.lang.String getVersionInfo() {
        return this.f220196e.getVersionInfo();
    }

    @Override // tx5.f
    public android.view.View getView() {
        return this.f220196e.getView();
    }

    @Override // tx5.f
    public int getVisibleTitleHeight() {
        return this.f220196e.getVisibleTitleHeight();
    }

    @Override // tx5.f
    public com.tencent.xweb.s0 getWebChromeClient() {
        return this.f220196e.getWebChromeClient();
    }

    @Override // tx5.f
    public int getWebScrollX() {
        return this.f220196e.getWebScrollX();
    }

    @Override // tx5.f
    public int getWebScrollY() {
        return this.f220196e.getWebScrollY();
    }

    @Override // tx5.f
    public com.tencent.xweb.g1 getWebViewCallbackClient() {
        return this.f220196e.getWebViewCallbackClient();
    }

    @Override // tx5.f
    public com.tencent.xweb.h1 getWebViewClient() {
        return this.f220196e.getWebViewClient();
    }

    @Override // tx5.f
    public android.os.Looper getWebViewLooper() {
        return this.f220196e.getWebViewLooper();
    }

    @Override // tx5.f
    public com.tencent.xweb.m1 getWebViewRenderProcessClient() {
        this.f220196e.getWebViewRenderProcessClient();
        return null;
    }

    @Override // tx5.f
    public android.view.View getWebViewUI() {
        return this.f220196e.getWebViewUI();
    }

    @Override // tx5.f
    public void goBack() {
        this.f220196e.goBack();
    }

    @Override // tx5.f
    public void goForward() {
        this.f220196e.goForward();
    }

    public boolean isSysKernel() {
        return this.f220195d == com.tencent.xweb.f1.WV_KIND_SYS;
    }

    @java.lang.Deprecated
    public boolean isXWalkKernel() {
        return this.f220195d == com.tencent.xweb.f1.WV_KIND_PINUS;
    }

    public void loadData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f220196e.loadData(str, str2, str3);
        by5.s0.q(str, this);
    }

    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f220196e.loadDataWithBaseURL(str, str2, str3, str4, str5);
        by5.s0.q(str, this);
    }

    public void loadUrl(java.lang.String str, java.util.Map map) {
        java.util.HashMap hashMap;
        if (this.f220197f.d(str)) {
            this.f220196e.loadUrl("http://weixin.qq.com/");
            return;
        }
        if (r0(str)) {
            return;
        }
        if (map != null) {
            synchronized (map) {
                hashMap = new java.util.HashMap();
                hashMap.putAll(map);
            }
        } else {
            hashMap = null;
        }
        this.f220196e.loadUrl(str, hashMap);
        by5.s0.q(str, this);
    }

    @Override // tx5.f
    public void m() {
        this.f220196e.m();
    }

    @Override // tx5.f
    public com.tencent.xweb.o0 m0(com.tencent.xweb.VideoJsCallback videoJsCallback) {
        return this.f220196e.m0(videoJsCallback);
    }

    @Override // tx5.f
    public boolean n0(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.GetImageBitmapToFileFinishedCallback getImageBitmapToFileFinishedCallback) {
        return this.f220196e.n0(str, str2, str3, getImageBitmapToFileFinishedCallback);
    }

    public void onHide() {
        this.f220196e.onHide();
    }

    public void onPause() {
        this.f220196e.onPause();
    }

    public void onResume() {
        this.f220196e.onResume();
    }

    public void onShow() {
        this.f220196e.onShow();
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        tx5.f fVar = this.f220196e;
        if (fVar != null) {
            android.view.View view2 = fVar.getView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/xweb/WebView", "onVisibilityChanged", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/xweb/WebView", "onVisibilityChanged", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void q0(com.tencent.xweb.f1 f1Var) {
        java.util.LinkedList<java.lang.String> linkedList;
        by5.c4.a("WebView", "createWebView start, prefer type:" + getCurrentModuleWebCoreType() + ", force type:" + f1Var);
        org.xwalk.core.XWalkEnvironment.c(getContext());
        com.tencent.xweb.f1 f1Var2 = this.f220195d;
        com.tencent.xweb.f1 f1Var3 = com.tencent.xweb.f1.WV_KIND_NONE;
        if (f1Var2 != f1Var3) {
            this.f220200i.f458087a = true;
            by5.c4.a("WebView", "createWebView, already init, webview type:" + this.f220195d);
            return;
        }
        com.tencent.xweb.f1 currentModuleWebCoreType = getCurrentModuleWebCoreType();
        java.lang.String str = "";
        if (com.tencent.xweb.t1.f()) {
            com.tencent.xweb.f1 f1Var4 = com.tencent.xweb.f1.WV_KIND_SYS;
            this.f220195d = f1Var4;
            str = "ChildProcessMonitor";
            by5.c4.a("WebView", "createWebView, XWebChildProcessMonitor force to use sys");
            C0(getContext(), f1Var4);
        } else {
            com.tencent.xweb.f1 f1Var5 = com.tencent.xweb.f1.WV_KIND_SYS;
            if (f1Var == f1Var5) {
                this.f220195d = f1Var;
                str = "WebViewParam";
                by5.c4.a("WebView", "createWebView, force to use sys by webview param");
                C0(getContext(), f1Var5);
            } else if (getCurrentModuleWebCoreType() == f1Var3) {
                this.f220200i.f458088b = false;
                java.lang.String m17 = org.xwalk.core.XWalkEnvironment.m("tools");
                if (m17 == null || m17.isEmpty()) {
                    m17 = "tools";
                }
                f220191o = m17;
                by5.s0.f36593a = m17;
                com.tencent.xweb.f1 u07 = u0(com.tencent.xweb.f1.WV_KIND_PINUS, m17);
                by5.c4.a("WebView", "createWebView, not init core, use prefer type:" + u07);
                if (u07 != f1Var3) {
                    this.f220195d = u07;
                    if (C0(getContext(), this.f220195d) && z0()) {
                        f220189m = this.f220195d;
                        by5.c4.f("WebView", "createWebView, sProcessWebViewKind:" + f220189m);
                    }
                } else {
                    str = "NonePreferWebViewKind";
                    this.f220195d = f1Var5;
                    C0(getContext(), f1Var5);
                }
            } else {
                this.f220195d = getCurrentModuleWebCoreType();
            }
        }
        xx5.t tVar = this.f220200i;
        tVar.f458091e = str;
        tVar.f458090d = getModuleName();
        xx5.t tVar2 = this.f220200i;
        tVar2.f458097k = this.f220195d.ordinal();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        tVar2.f458098l = currentTimeMillis;
        tVar2.f458096j = currentTimeMillis - tVar2.f458092f;
        by5.c4.a("WebView", "createWebView, try create webview type:" + this.f220195d);
        tx5.f a17 = tx5.j.a(this.f220195d, this);
        this.f220196e = a17;
        if (a17 == null) {
            xx5.t tVar3 = this.f220200i;
            tVar3.getClass();
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            tVar3.f458099m = currentTimeMillis2;
            tVar3.f458100n = currentTimeMillis2 - tVar3.f458098l;
            tVar3.f458101o = 2;
            xx5.t tVar4 = this.f220200i;
            tVar4.getClass();
            tVar4.f458103q = java.lang.System.currentTimeMillis();
            by5.c4.a("WebView", "createWebView failed, try other webview types");
            com.tencent.xweb.f1[] webViewKindList = getWebViewKindList();
            int i17 = 0;
            while (true) {
                if (i17 >= webViewKindList.length) {
                    break;
                }
                if (webViewKindList[i17] != this.f220195d && w0(getContext(), webViewKindList[i17], null, false)) {
                    tx5.f a18 = tx5.j.a(webViewKindList[i17], this);
                    this.f220196e = a18;
                    if (a18 != null) {
                        this.f220195d = getCurrentModuleWebCoreType();
                        break;
                    }
                }
                i17++;
            }
            if (this.f220196e == null) {
                xx5.t tVar5 = this.f220200i;
                tVar5.f458102p = 0;
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                tVar5.f458104r = currentTimeMillis3;
                tVar5.f458105s = currentTimeMillis3 - tVar5.f458103q;
                tVar5.f458106t = 2;
                com.tencent.xweb.f1 f1Var6 = this.f220195d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create webview instance failed. ExpectedKind:");
                sb6.append(f1Var);
                sb6.append(",PreferredKind:");
                sb6.append(f1Var6);
                sb6.append(",AllSupportKind:");
                for (com.tencent.xweb.f1 f1Var7 : webViewKindList) {
                    sb6.append(f1Var7);
                    sb6.append(",");
                }
                sb6.append(",ModuleKindBeforeInit:");
                sb6.append(currentModuleWebCoreType);
                if (!android.text.TextUtils.isEmpty(str)) {
                    sb6.append("downgradeReason:");
                    sb6.append(str);
                }
                sb6.append(",AllCrashStacks:\n");
                java.util.List list = by5.q.f36580j;
                synchronized (by5.q.class) {
                    linkedList = new java.util.LinkedList(by5.q.f36580j);
                }
                if (linkedList.size() != 0) {
                    for (java.lang.String str2 : linkedList) {
                        sb6.append("<<<<<<--->>>>>>\n");
                        sb6.append(str2);
                    }
                }
                java.lang.String sb7 = sb6.toString();
                by5.c4.c("WebView", sb7);
                com.tencent.xweb.n1 n1Var = by5.s0.f36595c;
                if (n1Var != null) {
                    n1Var.b(577L, 87L, 1L);
                }
                throw new com.tencent.xweb.e(sb7);
            }
            xx5.t tVar6 = this.f220200i;
            tVar6.f458102p = this.f220195d.ordinal();
            long currentTimeMillis4 = java.lang.System.currentTimeMillis();
            tVar6.f458104r = currentTimeMillis4;
            tVar6.f458105s = currentTimeMillis4 - tVar6.f458103q;
            tVar6.f458106t = 1;
        } else {
            xx5.t tVar7 = this.f220200i;
            tVar7.getClass();
            long currentTimeMillis5 = java.lang.System.currentTimeMillis();
            tVar7.f458099m = currentTimeMillis5;
            tVar7.f458100n = currentTimeMillis5 - tVar7.f458098l;
            tVar7.f458101o = 1;
        }
        synchronized (by5.q.class) {
            ((java.util.LinkedList) by5.q.f36580j).clear();
        }
        xx5.t tVar8 = this.f220200i;
        tVar8.f458107u = this.f220195d.ordinal();
        tVar8.f458108v = java.lang.System.currentTimeMillis();
        addView(this.f220196e.getWebViewUI());
        by5.c4.f("WebView", "createWebView success, webview type:" + this.f220195d);
        this.f220196e.getView().setOnLongClickListener(new com.tencent.xweb.b1(this));
        try {
            this.f220197f = new qx5.y(this);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("WebView", "initDebugView, create dummy one, error", th6);
            this.f220197f = new qx5.e();
        }
        com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
        boolean z17 = by5.d4.e().getBoolean("bEnableRemoteDebug", false);
        zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
        by5.c4.f("WebView", "initRemoteDebug, enableRemoteDebug:" + z17 + ", testMode:false");
        if (z17) {
            com.tencent.xweb.a3.s(true);
        }
        boolean z18 = by5.d4.e().getBoolean("bRemoteDebugStarted", false);
        by5.c4.f("WebView", "initRemoteDebug, remoteDebugStarted:" + z18);
        if (z18) {
            wx5.f.a(by5.d4.e().getString("bRemoteDebugToken", ""));
        }
        if (z0()) {
            android.content.Context context = getContext();
            if (context instanceof com.tencent.xweb.i1) {
                ((com.tencent.xweb.i1) context).f220300a = this.f220196e;
            }
        }
        getSettings().Q(getSettings().g() + " MMWEBID/" + by5.a4.b());
        com.tencent.xweb.f1 f1Var8 = this.f220195d;
        synchronized (com.tencent.xweb.j1.class) {
            com.tencent.xweb.j1.f220317a++;
            com.tencent.xweb.j1.f220318b = f1Var8 == com.tencent.xweb.f1.WV_KIND_PINUS ? com.tencent.xweb.j1.f220318b + 1 : com.tencent.xweb.j1.f220318b;
            com.tencent.xweb.j1.f220319c = f1Var8 == com.tencent.xweb.f1.WV_KIND_SYS ? com.tencent.xweb.j1.f220319c + 1 : com.tencent.xweb.j1.f220319c;
            if (!com.tencent.xweb.j1.f220320d) {
                com.tencent.xweb.j1.f220320d = true;
            }
            by5.c4.f("WebViewCounter", "increase, count:" + com.tencent.xweb.j1.f220317a + ", sPinusCount:" + com.tencent.xweb.j1.f220318b + ", sSysCount:" + com.tencent.xweb.j1.f220319c + ", WebViewKind:" + f1Var8);
        }
        xx5.t tVar9 = this.f220200i;
        tVar9.getClass();
        long currentTimeMillis6 = java.lang.System.currentTimeMillis();
        tVar9.f458109w = currentTimeMillis6;
        tVar9.f458110x = currentTimeMillis6 - tVar9.f458108v;
    }

    public final boolean r0(java.lang.String str) {
        if (com.tencent.xweb.t0.f220594a.a() || android.text.TextUtils.isEmpty(str) || !str.startsWith("chrome://")) {
            return false;
        }
        by5.c4.f("WebView", "Intercept chrome scheme url success, show the 404 page.");
        loadDataWithBaseURL("file:///android_asset/", by5.y3.a(getContext(), 404, "Not found", str), "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        return true;
    }

    @Override // tx5.f
    public void reload() {
        this.f220196e.reload();
    }

    @Override // tx5.f
    public void removeJavascriptInterface(java.lang.String str) {
        this.f220196e.removeJavascriptInterface(str);
    }

    @Override // tx5.f
    public boolean s() {
        return this.f220196e.s();
    }

    public void s0(android.graphics.Canvas canvas) {
        if (!z0()) {
            draw(canvas);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.ArrayList) t0(this)).iterator();
        while (it.hasNext()) {
            android.view.TextureView textureView = (android.view.TextureView) it.next();
            android.graphics.Bitmap bitmap = textureView.getBitmap();
            by5.c4.c("WebView", "drawCanvas, costTime1:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            if (bitmap != null) {
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                canvas.drawBitmap(bitmap, textureView.getLeft(), textureView.getTop(), (android.graphics.Paint) null);
                by5.c4.c("WebView", "drawCanvas, costTime2:" + (java.lang.System.currentTimeMillis() - currentTimeMillis2) + ", view:" + textureView);
            } else {
                by5.c4.c("WebView", "drawCanvas, textureViewBitmap is null");
            }
        }
        getTopView().draw(canvas);
        by5.c4.c("WebView", "drawCanvas, costTime:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // tx5.f
    public boolean savePage(java.lang.String str, java.lang.String str2, int i17) {
        return this.f220196e.savePage(str, str2, i17);
    }

    @Override // tx5.f
    public void setAudioMuted(boolean z17) {
        this.f220196e.setAudioMuted(z17);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        by5.c4.f("WebView", "setBackgroundColor, color:" + java.lang.Integer.toHexString(i17));
        super.setBackgroundColor(i17);
        tx5.f fVar = this.f220196e;
        if (fVar != null) {
            fVar.getWebViewUI().setBackgroundColor(i17);
        }
    }

    @Override // tx5.f
    public void setBottomHeight(int i17) {
        this.f220196e.setBottomHeight(i17);
    }

    @Override // tx5.f
    public void setDownloadListener(android.webkit.DownloadListener downloadListener) {
        this.f220196e.setDownloadListener(downloadListener);
    }

    @Override // tx5.f
    public void setFindListener(android.webkit.WebView.FindListener findListener) {
        this.f220196e.setFindListener(findListener);
    }

    @Override // android.view.View
    public void setFocusable(boolean z17) {
        if (z17) {
            setDescendantFocusability(131072);
            super.setFocusable(false);
        } else {
            setDescendantFocusability(393216);
            super.setFocusable(false);
        }
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z17) {
        if (z17) {
            setDescendantFocusability(131072);
            super.setFocusableInTouchMode(false);
        } else {
            setDescendantFocusability(393216);
            super.setFocusableInTouchMode(false);
        }
    }

    @Override // android.view.View, tx5.f
    public void setHorizontalScrollBarEnabled(boolean z17) {
        this.f220196e.setHorizontalScrollBarEnabled(z17);
    }

    @Override // tx5.f
    public void setHorizontalScrollbarOverlay(boolean z17) {
        this.f220196e.setHorizontalScrollbarOverlay(z17);
    }

    @Override // tx5.f
    public void setInitialScale(int i17) {
        this.f220196e.setInitialScale(i17);
    }

    @Override // tx5.f
    public void setInputOutOfKeyboardEnable(boolean z17) {
        this.f220196e.setInputOutOfKeyboardEnable(z17);
    }

    @Override // tx5.f
    public void setJSExceptionListener(com.tencent.xweb.l1 l1Var) {
        this.f220196e.setJSExceptionListener(l1Var);
    }

    @Override // tx5.f
    public void setNativeDownloadClient(com.tencent.xweb.p2 p2Var) {
        this.f220196e.setNativeDownloadClient(p2Var);
    }

    @Override // tx5.f
    public void setNetworkAvailable(boolean z17) {
        this.f220196e.setNetworkAvailable(z17);
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.f220198g = onLongClickListener;
    }

    @Override // android.view.View
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.f220196e.getWebViewUI().setOnTouchListener(onTouchListener);
    }

    @Override // tx5.f
    @java.lang.Deprecated
    public void setPictureListener(android.webkit.WebView.PictureListener pictureListener) {
        this.f220196e.setPictureListener(pictureListener);
    }

    @Override // tx5.f
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        this.f220196e.setTextClassifier(textClassifier);
    }

    @Override // android.view.View, tx5.f
    public void setVerticalScrollBarEnabled(boolean z17) {
        this.f220196e.setVerticalScrollBarEnabled(z17);
    }

    @Override // tx5.f
    public void setVerticalScrollbarOverlay(boolean z17) {
        this.f220196e.setVerticalScrollbarOverlay(z17);
    }

    public void setWebChromeClient(com.tencent.xweb.s0 s0Var) {
        this.f220196e.setWebChromeClient(s0Var);
    }

    @Override // tx5.f
    public void setWebContentsSize(int i17, int i18) {
        this.f220196e.setWebContentsSize(i17, i18);
    }

    @Override // tx5.f
    public void setWebViewCallbackClient(com.tencent.xweb.g1 g1Var) {
        this.f220196e.setWebViewCallbackClient(g1Var);
    }

    public void setWebViewClient(com.tencent.xweb.h1 h1Var) {
        this.f220196e.setWebViewClient(h1Var);
    }

    @Override // tx5.f
    public void setWebViewClientExtension(com.tencent.xweb.internal.ProxyWebViewClientExtension proxyWebViewClientExtension) {
        this.f220196e.setWebViewClientExtension(proxyWebViewClientExtension);
    }

    public void setWebViewRenderProcessClient(com.tencent.xweb.m1 m1Var) {
        this.f220196e.t(null, m1Var);
    }

    @Override // tx5.f
    public void setXWebKeyEventHandler(com.tencent.xweb.XWebKeyEventHandler xWebKeyEventHandler) {
        this.f220196e.setXWebKeyEventHandler(xWebKeyEventHandler);
    }

    @Override // tx5.f
    public void smoothScroll(int i17, int i18, long j17) {
        this.f220196e.smoothScroll(i17, i18, j17);
    }

    @Override // tx5.f
    public void stopLoading() {
        this.f220196e.stopLoading();
    }

    @Override // tx5.f
    public void t(java.util.concurrent.Executor executor, com.tencent.xweb.m1 m1Var) {
        this.f220196e.t(executor, m1Var);
    }

    public final java.util.List t0(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (view instanceof android.view.TextureView) {
            arrayList.add((android.view.TextureView) view);
        } else if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                arrayList.addAll(t0(viewGroup.getChildAt(i17)));
            }
        }
        return arrayList;
    }

    @Override // tx5.f
    public boolean u(int i17) {
        return this.f220196e.u(i17);
    }

    @Override // tx5.f
    public boolean y() {
        return this.f220196e.y();
    }

    public boolean z0() {
        return this.f220195d == com.tencent.xweb.f1.WV_KIND_PINUS;
    }

    @Override // tx5.f
    public boolean zoomIn() {
        return this.f220196e.zoomIn();
    }

    @Override // tx5.f
    public boolean zoomOut() {
        return this.f220196e.zoomOut();
    }

    public WebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, com.tencent.xweb.f1.WV_KIND_NONE);
    }

    public WebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, com.tencent.xweb.f1 f1Var) {
        super(context instanceof android.content.MutableContextWrapper ? new com.tencent.xweb.i1(((android.content.MutableContextWrapper) context).getBaseContext()) : context, attributeSet, i17);
        this.f220195d = com.tencent.xweb.f1.WV_KIND_NONE;
        this.f220199h = false;
        xx5.t tVar = new xx5.t();
        this.f220200i = tVar;
        tVar.f458092f = java.lang.System.currentTimeMillis();
        try {
            try {
                q0(f1Var);
                tVar.a(1);
                by5.c4.g("WebView", "###### createWebView costTime:" + tVar.f458094h + ", result:true, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
            } catch (com.tencent.xweb.e e17) {
                throw e17;
            }
        } catch (java.lang.Throwable th6) {
            this.f220200i.a(2);
            by5.c4.g("WebView", "###### createWebView costTime:" + this.f220200i.f458094h + ", result:false, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable("please ignore this exception")));
            throw th6;
        }
    }

    public void loadUrl(java.lang.String str) {
        if (this.f220197f.d(str)) {
            this.f220196e.loadUrl("http://weixin.qq.com/");
        } else {
            if (r0(str)) {
                return;
            }
            this.f220196e.loadUrl(str);
            by5.s0.q(str, this);
        }
    }
}
