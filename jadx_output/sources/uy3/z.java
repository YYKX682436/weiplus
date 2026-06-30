package uy3;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.box.webview.BoxWebView f432003b;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f432005d;

    /* renamed from: a, reason: collision with root package name */
    public static final uy3.z f432002a = new uy3.z();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f432004c = new java.lang.Object();

    static {
        com.tencent.mars.xlog.Log.i("MicroMsg.BoxWebViewPreloadManager", "init enablePreloadWebView enablePreload: true, enablePreloadAfterGet: true, enablePreloadFromFindTab: false");
        java.lang.System.currentTimeMillis();
        f432005d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        java.lang.System.currentTimeMillis();
    }

    public static final synchronized void a(long j17) {
        synchronized (uy3.z.class) {
            if (f432003b != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BoxWebViewPreloadManager", "MultiWebView-Trace destroy 1 webView for ScannerWebView");
                com.tencent.mm.plugin.box.webview.BoxWebView boxWebView = f432003b;
                if (boxWebView != null) {
                    boxWebView.destroy();
                }
                f432003b = null;
            }
        }
    }

    public static final void b(int i17, long j17) {
        if (i17 == 1 || i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BoxWebViewPreloadManager", "try preloadBoxWebView delay: %d", java.lang.Long.valueOf(j17));
            uy3.w wVar = uy3.w.f431999d;
            com.tencent.mm.sdk.platformtools.n3 n3Var = f432005d;
            if (n3Var != null) {
                n3Var.postDelayed(new uy3.y(wVar), j17);
            }
        }
    }
}
