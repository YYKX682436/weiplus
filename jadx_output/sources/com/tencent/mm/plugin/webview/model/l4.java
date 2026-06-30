package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class l4 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.l4 f183002b = new com.tencent.mm.plugin.webview.model.l4();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f183003a = new java.util.HashMap();

    public l4() {
        java.lang.String c17 = c();
        if (com.tencent.mm.vfs.w6.j(c17) || com.tencent.mm.vfs.w6.u(c17)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "checkJSSDKFileTempDirectory mkdirs failed");
    }

    public static java.lang.String c() {
        if (!gm0.j1.a()) {
            return new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a("wcf://temp")), "jsapi_temp/").o();
        }
        return gm0.j1.u().d() + "jsapi_temp/";
    }

    public void a(com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem) {
        if (webViewJSSDKFileItem == null || com.tencent.mm.sdk.platformtools.t8.K0(webViewJSSDKFileItem.f182736e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "item is null or local id is null, ignore this add");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewJSSDKFileItemManager", "add jssdk file item, local id : %s, file path : %s", webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem.f182738g);
            this.f183003a.put(webViewJSSDKFileItem.f182736e, webViewJSSDKFileItem);
        }
    }

    public com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return (com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem) this.f183003a.get(str);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "get by local id error, local id is null or nil");
        return null;
    }
}
