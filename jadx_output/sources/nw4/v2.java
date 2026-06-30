package nw4;

/* loaded from: classes8.dex */
public class v2 {

    /* renamed from: f, reason: collision with root package name */
    public static int f340987f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f340988g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f340989h = lp0.b.e() + "/jscache/";

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.xweb.WebView f340990a;

    /* renamed from: b, reason: collision with root package name */
    public nw4.n f340991b;

    /* renamed from: c, reason: collision with root package name */
    public nw4.u2 f340992c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f340993d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f340994e = false;

    public v2(com.tencent.xweb.WebView webView, nw4.n nVar, nw4.u2 u2Var, boolean z17) {
        this.f340990a = webView;
        this.f340991b = nVar;
        this.f340992c = u2Var;
        this.f340993d = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "JsLoader <init>, jsapi: %d, this: %d", java.lang.Integer.valueOf(nVar.hashCode()), java.lang.Integer.valueOf(hashCode()));
    }

    public static boolean c(com.tencent.xweb.WebView webView) {
        com.tencent.mm.plugin.webview.core.q1 q1Var = com.tencent.mm.plugin.webview.core.s1.f181972a;
        if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.core.s1.f181973b).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "local disableWXJSCodeCache");
            return false;
        }
        if (f340987f == -1) {
            f340987f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_xweb_code_cache, 0);
        }
        if ((f340987f & 1) != 0) {
            return webView.u(2002);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "auth url: %s", str);
        if (this.f340990a == null || this.f340991b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsLoader", "auth, viewWV or jsapi is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("state", "authorized");
        if (str != null) {
            hashMap.put("fullUrl", str);
        }
        this.f340991b.A0(true);
        this.f340991b.i0("sys:auth", hashMap, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|(5:15|(1:17)|18|(7:20|(3:24|(1:26)|27)|28|29|30|(2:31|(1:33)(1:34))|35)|(2:40|(2:42|43)))|44|45|46|(1:48)|50|43) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0179, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x017a, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.JsLoader", "tryInterceptBridgeScriptRequest, failed, ", r3);
        r6 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw4.v2.b():void");
    }

    public void d() {
        nw4.n nVar;
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        nw4.u2 u2Var;
        if (this.f340990a == null || (nVar = this.f340991b) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsLoader", "ready, viewWV or jsapi is null");
            return;
        }
        if (nVar.f340887a == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "jsapi init wv is null");
        } else {
            nVar.C0();
            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("sys:init", null, nVar.f340903q, nVar.f340904r) + ")", new nw4.t0(nVar));
            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("sys:bridged", null, nVar.f340903q, nVar.f340904r) + ")", new nw4.d1(nVar));
            nVar.A0(true);
            nVar.q();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nVar.M) && (mMWebView = nVar.f340887a) != null) {
                mMWebView.evaluateJavascript(nVar.v(nVar.M, nVar.N), null);
                nVar.M = null;
                nVar.N = 0;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "jsapi init done");
        if (nw4.w2.a()) {
            try {
                java.lang.String str = new java.lang.String(s46.d.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("jsapi/vconsole.js")));
                com.tencent.xweb.WebView webView = this.f340990a;
                if (webView != null) {
                    webView.evaluateJavascript(str, null);
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsLoader", e17, "openVConsole", new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsLoader", "onTimerExpired, js loaded ret = %b", java.lang.Boolean.valueOf(this.f340994e));
        if (this.f340994e && (u2Var = this.f340992c) != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = ((com.tencent.mm.plugin.webview.ui.tools.widget.u2) u2Var).f187547a;
            u3Var.Q(u3Var.f187554g);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(156L, 1L, 1L, false);
        if (this.f340994e) {
            return;
        }
        g0Var.idkeyStat(156L, 0L, 1L, false);
    }
}
