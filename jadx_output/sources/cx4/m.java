package cx4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final cx4.c f224632e = new cx4.c(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f224633f = jz5.h.b(cx4.b.f224584d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f224634a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f224635b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f224636c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f224637d;

    public m() {
        java.util.Iterator it = kz5.c0.i(0, 1, 2, 3, 5).iterator();
        while (it.hasNext()) {
            java.lang.String b17 = b(((java.lang.Number) it.next()).intValue());
            cx4.c cVar = f224632e;
            com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount webViewKeyWordAuditReport$TimeStampedCount = (com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount) cx4.c.a(cVar).r(b17, com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount.class);
            if (webViewKeyWordAuditReport$TimeStampedCount != null) {
                long c17 = (c01.id.c() - webViewKeyWordAuditReport$TimeStampedCount.f183465d) / 1000;
                com.tencent.mars.xlog.Log.i(this.f224634a, "checkClear, saveTime: " + java.lang.Long.valueOf(webViewKeyWordAuditReport$TimeStampedCount.f183465d) + " value: " + java.lang.Integer.valueOf(webViewKeyWordAuditReport$TimeStampedCount.f183466e) + " offest: " + c17);
                if (c17 > 86400) {
                    cx4.c.a(cVar).W(b17);
                }
            }
        }
        this.f224634a = "MicroMsg.WebViewKeyWordAuditReport";
    }

    public final void a(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.webview.permission.d a8Key, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(a8Key, "a8Key");
        if (str == null) {
            return;
        }
        if (!this.f224635b || z17) {
            this.f224635b = true;
            int i18 = a8Key.E.f387989i;
            if (i18 <= 0 || i18 > 30) {
                return;
            }
            int i19 = a8Key.f183390j;
            d(i17);
            ku5.u0 u0Var = ku5.t0.f312615d;
            cx4.g gVar = new cx4.g(webView, this, str, i17, i18, str2, i19);
            long j17 = z17 ? 0L : i18 * 1000;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(gVar, j17, false);
        }
    }

    public final java.lang.String b(int i17) {
        return "webview_keyword_audit_report_scene_" + i17;
    }

    public final boolean c(int i17) {
        com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount webViewKeyWordAuditReport$TimeStampedCount = (com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount) cx4.c.a(f224632e).r(b(i17), com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hasReachedLimit key: ");
        sb6.append(b(i17));
        sb6.append(" count: ");
        sb6.append(webViewKeyWordAuditReport$TimeStampedCount != null ? webViewKeyWordAuditReport$TimeStampedCount.f183466e : 0);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i(this.f224634a, sb6.toString());
        return (webViewKeyWordAuditReport$TimeStampedCount != null ? webViewKeyWordAuditReport$TimeStampedCount.f183466e : 0) >= 10;
    }

    public final void d(int i17) {
        cx4.c cVar = f224632e;
        com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount webViewKeyWordAuditReport$TimeStampedCount = (com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount) cx4.c.a(cVar).r(b(i17), com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount.class);
        if (webViewKeyWordAuditReport$TimeStampedCount == null) {
            webViewKeyWordAuditReport$TimeStampedCount = new com.tencent.mm.plugin.webview.reporter.WebViewKeyWordAuditReport$TimeStampedCount();
            webViewKeyWordAuditReport$TimeStampedCount.f183465d = c01.id.c();
        }
        webViewKeyWordAuditReport$TimeStampedCount.f183466e++;
        com.tencent.mars.xlog.Log.i(this.f224634a, "save result: " + cx4.c.a(cVar).C(b(i17), webViewKeyWordAuditReport$TimeStampedCount) + " scene: " + i17 + " count: " + webViewKeyWordAuditReport$TimeStampedCount.f183466e);
    }
}
