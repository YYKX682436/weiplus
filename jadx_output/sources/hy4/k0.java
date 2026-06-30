package hy4;

/* loaded from: classes7.dex */
public final class k0 extends o25.k2 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[][] f286122d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f286123e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f286124f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f286125g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f286127i;

    /* renamed from: j, reason: collision with root package name */
    public long f286128j;

    /* renamed from: p, reason: collision with root package name */
    public boolean f286134p;

    /* renamed from: s, reason: collision with root package name */
    public long f286137s;

    /* renamed from: t, reason: collision with root package name */
    public int f286138t;

    /* renamed from: v, reason: collision with root package name */
    public long f286140v;

    /* renamed from: x, reason: collision with root package name */
    public int f286142x;

    /* renamed from: y, reason: collision with root package name */
    public volatile android.os.MessageQueue.IdleHandler f286143y;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f286126h = "";

    /* renamed from: k, reason: collision with root package name */
    public final boolean f286129k = true;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f286130l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f286131m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f286132n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f286133o = "";

    /* renamed from: q, reason: collision with root package name */
    public cx4.n f286135q = cx4.n.f224638e;

    /* renamed from: r, reason: collision with root package name */
    public cx4.r f286136r = cx4.r.f224649e;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f286139u = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f286141w = "";

    public final void c(java.lang.String titles, java.lang.String data, com.tencent.xweb.WebView webview, java.util.List list) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(titles, "titles");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(webview, "webview");
        if (nw4.w2.a()) {
            java.lang.String x17 = r26.i0.x(r26.i0.w(new java.lang.String(s46.d.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("jsapi/vconsole_performance.js")), r26.c.f368865a), "$WF_DATAS$", data, false), "$WF_TITLES$", titles, false, 4, null);
            if (list != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    jz5.l lVar = (jz5.l) it.next();
                    arrayList.add("{k:'" + ((java.lang.String) lVar.f302833d) + "', v:'" + r26.i0.v((java.lang.String) lVar.f302834e, "'", "\\'", false, 4, null) + "'}");
                }
                str = kz5.n0.g0(arrayList, ",", "[", "]", 0, null, null, 56, null);
            } else {
                str = "[]";
            }
            webview.evaluateJavascript(r26.i0.x(x17, "$WF_LOG$", str, false, 4, null), null);
        }
    }

    public final void d() {
        android.os.MessageQueue.IdleHandler idleHandler = this.f286143y;
        if (idleHandler != null) {
            try {
                android.os.Looper.myQueue().removeIdleHandler(idleHandler);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewPerformanceHelper", "removePendingIdleHandler error: " + e17.getMessage());
            }
            this.f286143y = null;
        }
    }
}
