package mw4;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mw4.n f331780h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, mw4.n nVar) {
        super(4);
        this.f331776d = str;
        this.f331777e = str2;
        this.f331778f = str3;
        this.f331779g = str4;
        this.f331780h = nVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.tencent.xweb.y0 y0Var;
        android.net.Uri url;
        java.lang.String scheme;
        yz5.q qVar = (yz5.q) obj;
        com.tencent.xweb.WebView webview = (com.tencent.xweb.WebView) obj2;
        com.tencent.xweb.x0 request = (com.tencent.xweb.x0) obj3;
        java.util.Map lowercaseHeaders = (java.util.Map) obj4;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(lowercaseHeaders, "lowercaseHeaders");
        java.util.Objects.toString(request.getUrl());
        java.lang.String str = this.f331776d;
        if (str != null && ((url = request.getUrl()) == null || (scheme = url.getScheme()) == null || !kotlin.jvm.internal.o.b(scheme, str))) {
            return null;
        }
        java.lang.String str2 = this.f331777e;
        if (str2 == null) {
            str2 = "weixin.local";
        }
        android.net.Uri url2 = request.getUrl();
        java.lang.String host = url2 != null ? url2.getHost() : null;
        android.net.Uri url3 = request.getUrl();
        java.lang.String path = url3 != null ? url3.getPath() : null;
        if (!kotlin.jvm.internal.o.b(host, str2)) {
            return null;
        }
        java.lang.String method = request.getMethod();
        if (kotlin.jvm.internal.o.b(method, "OPTIONS") && this.f331777e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RestWebInterceptor", "[sessionAuth] OPTIONS request, trusted origin: " + this.f331778f);
            y0Var = new com.tencent.xweb.y0("text/plain", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, 204, "No Content", kz5.c1.k(new jz5.l("Access-Control-Allow-Origin", this.f331778f), new jz5.l("Access-Control-Allow-Methods", "POST, GET, OPTIONS"), new jz5.l("Access-Control-Allow-Headers", "*"), new jz5.l("Access-Control-Allow-Credentials", "true"), new jz5.l("Access-Control-Max-Age", "300")), new java.io.ByteArrayInputStream(new byte[0]));
        } else {
            if (!kz5.n0.O(this.f331780h.f331784d, path)) {
                return null;
            }
            if (!kotlin.jvm.internal.o.b(method, "POST")) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RestWebInterceptor", "[sessionAuth] only POST method is allowed");
                return null;
            }
            java.lang.String lowerCase = "Session-ID".toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
            java.lang.String str3 = (java.lang.String) lowercaseHeaders.get(lowerCase);
            if ((!kotlin.jvm.internal.o.b(str3, this.f331779g)) || this.f331780h.f331785e.f331786a) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RestWebInterceptor", "[sessionAuth] Blocking future intercepts due to wrong sessionId. host=" + host + ", path=" + path + ", sessionId=" + str3);
                this.f331780h.f331785e.f331786a = true;
                return null;
            }
            java.util.Map l17 = kz5.c1.l(new jz5.l("Access-Control-Allow-Origin", this.f331778f), new jz5.l("Access-Control-Allow-Credentials", "true"));
            if (qVar == null || (y0Var = (com.tencent.xweb.y0) qVar.invoke(webview, request, lowercaseHeaders)) == null) {
                return null;
            }
            java.util.Map map = y0Var.f220625e;
            if (map != null) {
                l17.putAll(map);
            }
            y0Var.f220625e = l17;
        }
        return y0Var;
    }
}
