package la3;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.webview.core.o1 implements com.tencent.xweb.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final la3.d f317512a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f317513b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f317514c;

    /* renamed from: d, reason: collision with root package name */
    public int f317515d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317516e;

    public c(la3.d webViewData) {
        kotlin.jvm.internal.o.g(webViewData, "webViewData");
        this.f317512a = webViewData;
    }

    @Override // com.tencent.xweb.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        this.f317515d = i29;
        if (!this.f317516e) {
            return false;
        }
        this.f317512a.a("disableSwipeGesture", kz5.b1.e(new jz5.l(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, (i19 > 0 || i28 > 0) ? (i28 <= 0 || i19 < i28 - 1) ? i19 <= 1 ? "right" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE : "left" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL)));
        return false;
    }

    @Override // com.tencent.xweb.g1
    public void b(int i17) {
    }

    @Override // com.tencent.xweb.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        char c17 = (i27 != 0 || i18 <= 0) ? (i27 <= 0 || i18 != 0) ? (char) 0 : (char) 2 : (char) 1;
        la3.d dVar = this.f317512a;
        if (c17 > 0) {
            dVar.a("scrolled", kz5.b1.e(new jz5.l("scrolled", java.lang.Boolean.valueOf(c17 == 1))));
        }
        dVar.a("disableSwipeGesture", kz5.b1.e(new jz5.l(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE)));
    }

    @Override // com.tencent.xweb.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        kz5.q0 q0Var = kz5.q0.f314001d;
        la3.d dVar = this.f317512a;
        if (z18 && i18 <= 0 && !this.f317513b) {
            dVar.a("scrollToUpper", q0Var);
            this.f317513b = true;
        } else if (i18 > 0 && this.f317513b) {
            this.f317513b = false;
        }
        int i19 = this.f317515d - i18;
        if (z18 && i19 <= 0 && !this.f317514c) {
            dVar.a("scrollToLower", q0Var);
            this.f317514c = true;
        } else {
            if (i19 <= 0 || !this.f317514c) {
                return;
            }
            this.f317514c = false;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f317516e = true;
        com.tencent.mars.xlog.Log.i("LiteApp.WebViewClientListener", "onPageFinished url=" + str + " isPageLoaded=true");
        if (str == null) {
            str = "";
        }
        this.f317512a.a("finished", kz5.b1.e(new jz5.l("url", str)));
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f317516e = false;
        com.tencent.mars.xlog.Log.i("LiteApp.WebViewClientListener", "onPageStarted url=" + str + " isPageLoaded=false");
        if (str == null) {
            str = "";
        }
        this.f317512a.a("started", kz5.b1.e(new jz5.l("url", str)));
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("LiteApp.WebViewClientListener", "onPageLoadError, url is " + str2);
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(i17));
        if (str == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("description", str);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        jz5.l[] lVarArr2 = new jz5.l[2];
        if (str2 == null) {
            str2 = "";
        }
        lVarArr2[0] = new jz5.l("url", str2);
        lVarArr2[1] = new jz5.l("error", k17);
        this.f317512a.a("error", kz5.c1.k(lVarArr2));
    }
}
