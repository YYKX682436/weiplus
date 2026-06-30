package o93;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.plugin.appbrand.jsruntime.t {

    /* renamed from: d, reason: collision with root package name */
    public final o93.e f343726d = new o93.e();

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript URL:%s script:%s cacheCategory:%s cacheKey:%s cacheType:%d", java.lang.String.valueOf(url), str3, str, str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript URL:%s script:%s ", java.lang.String.valueOf(url), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "addJavascriptInterface name:%s ", str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "destroy");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "evaluateJavascript script:%s ", str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public com.tencent.mm.plugin.appbrand.jsruntime.u h0(java.lang.Class cls) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "getAddon");
        return this.f343726d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.t
    public void setJsExceptionHandler(com.tencent.mm.plugin.appbrand.jsruntime.s sVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(sVar != null ? sVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandJsRuntime", "setJsExceptionHandler handler:%s ", objArr);
    }
}
