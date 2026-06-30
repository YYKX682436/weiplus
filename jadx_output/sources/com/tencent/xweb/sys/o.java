package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f220565a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f220566b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f220567c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a() {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Calling WebView methods on another thread than the UI thread.");
        }
        if (f220567c.getAndSet(true)) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        by5.c4.f("SysWebFactory.PreIniter", "ensureSystemWebViewGlobalLooper, init system webview");
        android.webkit.CookieManager.getInstance();
        android.webkit.CookieSyncManager.createInstance(org.xwalk.core.XWalkEnvironment.f347970c);
        new android.webkit.WebView(org.xwalk.core.XWalkEnvironment.f347970c).destroy();
        by5.c4.f("SysWebFactory.PreIniter", "ensureSystemWebViewGlobalLooper cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
    }

    public static boolean b() {
        if (f220566b == null) {
            f220566b = java.lang.Boolean.valueOf(by5.d4.a("SysWebFactory.PreIniter", false).getBoolean("isEnforceMainLooper", false));
        }
        return f220566b.booleanValue();
    }
}
