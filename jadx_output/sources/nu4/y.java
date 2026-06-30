package nu4;

/* loaded from: classes7.dex */
public final class y implements lu4.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340292e;

    public y(nu4.b0 b0Var, java.lang.String str) {
        this.f340291d = b0Var;
        this.f340292e = str;
    }

    @Override // lu4.r
    public int F() {
        return com.tencent.mm.plugin.webview.webcompt.a.b(this.f340291d.B0());
    }

    @Override // lu4.r
    public void I(java.lang.String func, java.lang.String message) {
        kotlin.jvm.internal.o.g(func, "func");
        kotlin.jvm.internal.o.g(message, "message");
    }

    @Override // lu4.r
    public int S() {
        com.tencent.mm.plugin.appbrand.appcache.u3 F0 = this.f340291d.F0(this.f340292e, false);
        int b17 = com.tencent.mm.plugin.webview.webcompt.a.b(F0);
        com.tencent.mapsdk.rastercore.tools.IO.safeClose((java.io.Closeable) F0);
        return b17;
    }

    @Override // lu4.r
    public java.lang.String getLocalData(java.lang.String key) {
        nu4.b0 b0Var = this.f340291d;
        kotlin.jvm.internal.o.g(key, "key");
        try {
            nu4.k kVar = nu4.b0.f340241J;
            java.lang.String s17 = nu4.b0.L.s(this.f340292e + '-' + key, "");
            java.lang.String str = b0Var.C;
            return s17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(b0Var.C, e17, "getLocalData:".concat(key), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // lu4.r
    public nw4.i s() {
        return new nu4.x();
    }

    @Override // lu4.r
    public void setLocalData(java.lang.String key, java.lang.String data) {
        nu4.b0 b0Var = this.f340291d;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(data, "data");
        try {
            nu4.k kVar = nu4.b0.f340241J;
            ((com.tencent.mm.sdk.platformtools.o4) nu4.b0.L.i()).D(this.f340292e + '-' + key, data);
            java.lang.String str = b0Var.C;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(b0Var.C, e17, "setLocalData:" + key + ", " + data, new java.lang.Object[0]);
        }
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(event, "event");
        this.f340291d.t(eventType, event, valueCallback);
    }

    @Override // lu4.r
    public boolean y(int i17, java.lang.String cgiUrl) {
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        return false;
    }
}
