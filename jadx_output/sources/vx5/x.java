package vx5;

/* loaded from: classes13.dex */
public class x implements tx5.i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f441396a = false;

    public x(vx5.v vVar) {
    }

    @Override // tx5.i
    public tx5.g a() {
        return vx5.c.f441331a.f220340d;
    }

    @Override // tx5.i
    public tx5.f b(com.tencent.xweb.WebView webView) {
        if (!h()) {
            return null;
        }
        by5.c4.f("PinusWebFactory", "createWebView, PinusWebView is available");
        return new vx5.i0(webView);
    }

    @Override // tx5.i
    public boolean c(android.content.Context context, com.tencent.xweb.e1 e1Var) {
        by5.c4.f("PinusWebFactory", "initWebviewCore");
        boolean h17 = h();
        if (e1Var != null) {
            if (h17) {
                e1Var.a();
            } else {
                e1Var.b();
            }
        }
        return h17;
    }

    @Override // tx5.i
    public boolean d() {
        return this.f441396a;
    }

    @Override // tx5.i
    public tx5.e e() {
        if (!com.tencent.xweb.o2.c() || !org.xwalk.core.XWalkEnvironment.t()) {
            return new vx5.m();
        }
        by5.c4.f("PinusWebFactory", "getWebviewStorage, profileName:" + com.tencent.xweb.o2.f220368c);
        tx5.c orCreateProfile = com.tencent.xweb.c0.a().getOrCreateProfile(com.tencent.xweb.o2.f220368c);
        if (orCreateProfile != null) {
            return orCreateProfile.getWebStorage();
        }
        by5.c4.c("PinusWebFactory", "getWebviewStorage error, profile is null");
        xx5.l.a(6, 1, com.tencent.xweb.o2.c());
        return null;
    }

    @Override // tx5.i
    public void f(android.content.Context context, boolean z17) {
        tx5.e e17;
        tx5.b cookieManager;
        if (com.tencent.xweb.WebView.getCurrentModuleWebCoreType() != com.tencent.xweb.f1.WV_KIND_PINUS) {
            by5.c4.g("PinusWebFactory", "clearAllWebViewCache, not pinus");
            return;
        }
        try {
            if (org.xwalk.core.XWalkEnvironment.d() <= 0) {
                by5.c4.g("PinusWebFactory", "clearAllWebViewCache, no available version");
                return;
            }
            com.tencent.xweb.pinus.sdk.WebView webView = new com.tencent.xweb.pinus.sdk.WebView(new com.tencent.xweb.pinus.PSContextWrapper(org.xwalk.core.XWalkEnvironment.f347970c, org.xwalk.core.XWalkEnvironment.d()));
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
            webView.clearCache(true);
            if (z17 && (cookieManager = getCookieManager()) != null) {
                cookieManager.e();
            }
            if (!com.tencent.xweb.o2.c() || (e17 = e()) == null) {
                return;
            }
            e17.a();
        } catch (java.lang.Throwable th6) {
            by5.c4.d("PinusWebFactory", "clearAllWebViewCache, error", th6);
        }
    }

    @Override // tx5.i
    public tx5.h g() {
        return com.tencent.xweb.pinus.PSCoreWrapper.getInstance();
    }

    @Override // tx5.i
    public tx5.b getCookieManager() {
        if (!com.tencent.xweb.o2.c() || !org.xwalk.core.XWalkEnvironment.t()) {
            return new vx5.e();
        }
        by5.c4.f("PinusWebFactory", "getCookieManager, profileName:" + com.tencent.xweb.o2.f220368c);
        tx5.c orCreateProfile = com.tencent.xweb.c0.a().getOrCreateProfile(com.tencent.xweb.o2.f220368c);
        if (orCreateProfile != null) {
            return orCreateProfile.getCookieManager();
        }
        by5.c4.c("PinusWebFactory", "getCookieManager error, profile is null");
        xx5.l.a(5, 1, com.tencent.xweb.o2.c());
        return null;
    }

    @Override // tx5.i
    public tx5.d getProfileStore() {
        by5.a1.a();
        return new vx5.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.x.h():boolean");
    }
}
