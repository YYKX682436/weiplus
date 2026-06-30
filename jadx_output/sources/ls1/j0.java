package ls1;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ls1.j0 f320995a = new ls1.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f320996b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f320997c = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(ls1.j0 j0Var, int i17) {
        synchronized (j0Var) {
            if (i17 == 6) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner]tmplParams: " + i17);
            r45.wm6 c17 = is1.l.c(i17);
            if (c17 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f320996b;
                if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "preload skip when exist:" + i17);
                } else {
                    ls1.e0 b17 = f320995a.b(c17, new android.content.MutableContextWrapper(com.tencent.mm.sdk.platformtools.x2.f193071a));
                    if (b17 != null) {
                        concurrentHashMap.put(java.lang.Integer.valueOf(i17), b17);
                        ls1.g0 g0Var = new ls1.g0(i17, b17);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = b17.f181917a0;
                        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) concurrentHashMap2.get(-103);
                        if (concurrentLinkedDeque == null) {
                            concurrentLinkedDeque = new java.util.concurrent.ConcurrentLinkedDeque();
                            concurrentHashMap2.put(-103, concurrentLinkedDeque);
                        }
                        concurrentLinkedDeque.add(g0Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "preload:" + i17 + ", " + b17.U());
                    }
                }
            }
        }
    }

    public final ls1.e0 b(r45.wm6 wm6Var, android.content.MutableContextWrapper mutableContextWrapper) {
        int i17 = wm6Var.f389292d;
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] empty tmplType %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wm6Var.f389294f)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] initUrl " + wm6Var.f389294f + " is empty");
            return null;
        }
        if (!com.tencent.mm.vfs.w6.j(wm6Var.f389295g)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] filePath %s isn't exist", wm6Var.f389295g);
            return null;
        }
        try {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.tencent.mm.ui.widget.MMWebView.F;
            com.tencent.xweb.WebView.v0(mutableContextWrapper, com.tencent.xweb.f1.WV_KIND_PINUS, com.tencent.mm.sdk.platformtools.x2.n() ? "mm" : "tools", null);
            ls1.e0 e0Var = new ls1.e0(wm6Var, new ls1.f0(mutableContextWrapper));
            e0Var.q0();
            return e0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplWebViewManager", "createWebView ex " + e17.getMessage());
            return null;
        }
    }

    public final ls1.e0 c(android.content.Context context, int i17, android.content.Intent intent, long j17) {
        ls1.e0 e0Var;
        synchronized (this) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f320997c;
            e0Var = (ls1.e0) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            if (e0Var != null) {
                kotlin.jvm.internal.o.g(intent, "intent");
                boolean z17 = false;
                if (e0Var.f181915J) {
                    java.lang.String stringExtra = intent.getStringExtra("rawUrl");
                    if (kotlin.jvm.internal.o.b(stringExtra != null ? r26.i0.w(stringExtra, "http://", "https://", false) : null, e0Var.i())) {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "pick started:" + i17 + ", " + e0Var.U());
                    concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f320996b;
            e0Var = (ls1.e0) concurrentHashMap2.get(java.lang.Integer.valueOf(i17));
            if (e0Var != null) {
                if (e0Var.p0(-102)) {
                    concurrentHashMap2.remove(java.lang.Integer.valueOf(i17));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "pick cached:" + i17 + ", " + e0Var.U());
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplWebViewManager", "pick null when tmpl not ready:" + i17 + ", " + e0Var.U());
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.Preload.TmplWebViewManager", "pick null:" + i17);
            e0Var = null;
        }
        if (e0Var == null) {
            return null;
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = e0Var.f181916a;
        mMWebView.getPerformanceHelper().a("onCreateStart", j17);
        mMWebView.i(context);
        mMWebView.getPerformanceHelper().a("onCreateEnd", java.lang.System.currentTimeMillis());
        return e0Var;
    }

    public final void d(int i17) {
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0.a().getBoolean("preload_tmpl_test_no_preload_next", false)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Preload.TmplWebViewManager", "tryPreloadTmplWebview:" + i17);
        pm0.v.X(new ls1.i0(i17));
    }
}
