package wl1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f447041a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f447042b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f447043c;

    public h(android.content.Context context, wl1.a invoker) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(invoker, "invoker");
        this.f447041a = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f447042b = new java.util.ArrayList();
        com.tencent.mm.ui.widget.MMWebView a17 = al5.l2.a(context);
        com.tencent.xweb.z0 settings = a17.getSettings();
        settings.z(true);
        settings.E(true);
        settings.J(0);
        a17.setHorizontalScrollBarEnabled(false);
        a17.setVerticalScrollBarEnabled(false);
        settings.M(false);
        settings.C(false);
        settings.D(false);
        settings.k(true);
        a17.setWebViewClient(new wl1.g(this));
        settings.h(false);
        a17.addJavascriptInterface(new wl1.i(invoker), "WeixinJSCore");
        com.tencent.mars.xlog.Log.i("Luggage.RichTextWebView", a17 + " init");
        this.f447043c = a17;
    }

    public static final void a(wl1.h hVar, com.tencent.xweb.WebView webView) {
        if (hVar.f447041a.getAndSet(true)) {
            return;
        }
        webView.evaluateJavascript(ik1.f.e("skyline-richtext-wxjs.js"), wl1.e.f447038a);
        webView.evaluateJavascript("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('sys:init', {})", wl1.f.f447039a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(hVar.f447042b);
        hVar.f447042b.clear();
        synchronized (hVar) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this);
        sb6.append(" destroy:");
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f447043c;
        sb6.append(mMWebView.f211376y);
        com.tencent.mars.xlog.Log.i("Luggage.RichTextWebView", sb6.toString());
        if (mMWebView.f211376y) {
            return;
        }
        mMWebView.destroy();
    }

    public final void c(java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("Luggage.RichTextWebView", "load data");
        this.f447041a.set(false);
        this.f447043c.loadDataWithBaseURL(null, data, "text/html", com.tencent.mapsdk.internal.rv.f51270c, null);
    }
}
