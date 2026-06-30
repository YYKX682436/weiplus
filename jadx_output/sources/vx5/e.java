package vx5;

/* loaded from: classes13.dex */
public class e implements tx5.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.xweb.pinus.sdk.c f441337a;

    public e() {
        by5.c4.c("PinusCookieManagerWrapper", "PinusCookieManagerWrapper, Default.");
        if (!"Default".equals(com.tencent.xweb.pinus.sdk.a.f220374b)) {
            synchronized (com.tencent.xweb.pinus.sdk.b.class) {
                com.tencent.xweb.pinus.sdk.a.f220373a = new com.tencent.xweb.pinus.sdk.b();
                com.tencent.xweb.pinus.sdk.a.f220374b = "Default";
            }
        }
        this.f441337a = com.tencent.xweb.pinus.sdk.a.f220373a;
    }

    @Override // tx5.b
    public java.lang.String a(java.lang.String str) {
        try {
            return this.f441337a.a(new com.tencent.xweb.q0(str).toString());
        } catch (java.net.URISyntaxException e17) {
            by5.c4.d("PinusCookieManagerWrapper", "getCookie, Unable to get cookies due to error parsing URL: " + str, e17);
            return null;
        }
    }

    @Override // tx5.b
    public void b(java.lang.String str, java.lang.String str2) {
        try {
            this.f441337a.b(new com.tencent.xweb.q0(str).toString(), str2);
        } catch (java.net.URISyntaxException e17) {
            by5.c4.d("PinusCookieManagerWrapper", "setCookie, Not setting cookie due to error parsing URL: " + str, e17);
        }
    }

    @Override // tx5.b
    public void c() {
        this.f441337a.c();
    }

    @Override // tx5.b
    public void d(boolean z17) {
        by5.c4.f("PinusCookieManagerWrapper", "setAcceptCookie:" + z17);
        this.f441337a.d(z17);
    }

    @Override // tx5.b
    public void e() {
        by5.c4.f("PinusCookieManagerWrapper", "removeAllCookie");
        this.f441337a.e();
    }

    @Override // tx5.b
    public void f(com.tencent.xweb.WebView webView, boolean z17) {
        by5.c4.f("PinusCookieManagerWrapper", "setAcceptThirdPartyCookies:" + z17);
    }

    @Override // tx5.b
    public void flush() {
        this.f441337a.flush();
    }

    public e(com.tencent.xweb.pinus.sdk.c cVar) {
        this.f441337a = cVar;
    }
}
