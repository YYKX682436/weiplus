package com.tencent.mm.plugin.webview.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/util/WebViewControllerPreloadMrg;", "", "<init>", "()V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class WebViewControllerPreloadMrg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg f187731a = new com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f187732b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f187733c = new java.util.concurrent.ConcurrentHashMap();

    private WebViewControllerPreloadMrg() {
    }

    public static void a(com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg webViewControllerPreloadMrg, final java.lang.String url, final com.tencent.mm.plugin.webview.core.r0 controller, boolean z17, int i17, int i18, int i19, boolean z18, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            z17 = true;
        }
        if ((i27 & 8) != 0) {
            i17 = -1;
        }
        if ((i27 & 16) != 0) {
            i18 = -1;
        }
        if ((i27 & 32) != 0) {
            i19 = 80;
        }
        if ((i27 & 64) != 0) {
            z18 = true;
        }
        synchronized (webViewControllerPreloadMrg) {
            kotlin.jvm.internal.o.g(url, "url");
            kotlin.jvm.internal.o.g(controller, "controller");
            if (!webViewControllerPreloadMrg.c(url)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewControllerPreloadMrg", "addToCache, url=" + url + " has cached!");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewControllerPreloadMrg", "addToCache ".concat(url));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f187732b;
            controller.M = z18;
            if (com.tencent.xweb.WebView.x0()) {
                android.content.Context activityContextIfHas = controller.f181916a.getActivityContextIfHas();
                if (activityContextIfHas instanceof android.app.Activity) {
                    android.view.View decorView = ((android.app.Activity) activityContextIfHas).getWindow().getDecorView();
                    android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                    if (viewGroup != null) {
                        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activityContextIfHas);
                        frameLayout.setVisibility(4);
                        frameLayout.addView(controller.f181916a);
                        viewGroup.addView(frameLayout, 0);
                    }
                }
            }
            if (i17 <= 0) {
                i17 = i65.a.B(controller.f181916a.getContext());
            }
            int k17 = i65.a.k(controller.f181916a.getContext());
            if (i18 <= 0) {
                i18 = z17 ? (int) (k17 * 0.75d) : k17;
            }
            controller.f181916a.setWebContentsSize(i17, i18);
            controller.f181916a.setWebChromeClient(new com.tencent.xweb.s0() { // from class: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg$addToCache$1$2
                @Override // com.tencent.xweb.s0
                public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
                    com.tencent.mm.plugin.webview.core.r0.this.f181946p = str;
                }
            });
            pw4.c cVar = controller.f181938l;
            cVar.f358713b = z17;
            cVar.f358728q = true;
            controller.D(new com.tencent.mm.plugin.webview.core.f3() { // from class: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg$addToCache$1$3
                @Override // com.tencent.mm.plugin.webview.core.f3
                public void e() {
                    com.tencent.mm.plugin.webview.core.r0 r0Var = com.tencent.mm.plugin.webview.core.r0.this;
                    try {
                        com.tencent.mm.plugin.webview.ui.tools.widget.m6 m6Var = new com.tencent.mm.plugin.webview.ui.tools.widget.m6(new java.lang.ref.WeakReference(r0Var));
                        com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg.f187733c.put(url, m6Var);
                        nw4.n g07 = r0Var.g0();
                        if (g07 != null) {
                            g07.f340900n = m6Var;
                        }
                        r0Var.e0().rg(m6Var, r0Var.U());
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewControllerPreloadMrg", th6, "addToCache exception", new java.lang.Object[0]);
                    }
                    r0Var.L0(this);
                }
            });
            controller.q0();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", url);
            intent.putExtra("useJs", true);
            intent.putExtra("geta8key_scene", i19);
            controller.j(intent);
            concurrentHashMap.put(url, controller);
        }
    }

    public final synchronized int b() {
        int size;
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : f187732b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) entry.getValue();
            boolean z17 = false;
            if (r0Var != null && !r0Var.K) {
                z17 = true;
            }
            if (z17 && r0Var.M) {
                r0Var.f181916a.destroy();
                r0Var.D0();
                linkedList.add(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewControllerPreloadMrg", "destroy " + str);
            }
        }
        size = f187732b.size();
        for (java.lang.String str2 : linkedList) {
            f187733c.remove(str2);
            f187732b.remove(str2);
        }
        return size;
    }

    public final boolean c(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f187732b;
        if (concurrentHashMap.size() <= 2) {
            return concurrentHashMap.get(url) == null;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WebViewControllerPreloadMrg", "shouldPreload, do not cache more than 2 WebViewController!!!");
        return false;
    }
}
