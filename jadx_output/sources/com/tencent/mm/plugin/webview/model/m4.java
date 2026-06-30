package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public abstract class m4 {
    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem a(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem webViewJSSDKUpFileItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem();
        webViewJSSDKUpFileItem.f182752w = i17;
        webViewJSSDKUpFileItem.f182753x = str;
        webViewJSSDKUpFileItem.f182738g = str2;
        java.util.HashMap hashMap = com.tencent.mm.plugin.webview.model.o5.f183050a;
        webViewJSSDKUpFileItem.f182736e = com.tencent.mm.plugin.webview.model.n5.a(str2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str3 = webViewJSSDKUpFileItem.f182736e;
        webViewJSSDKUpFileItem.f182740i = com.tencent.mm.modelcdntran.i2.b("jsupfile", currentTimeMillis, str3, str3);
        return webViewJSSDKUpFileItem;
    }

    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem webViewJSSDKVideoItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem();
        webViewJSSDKVideoItem.f182738g = str;
        java.util.HashMap hashMap = com.tencent.mm.plugin.webview.model.o5.f183050a;
        webViewJSSDKVideoItem.f182736e = com.tencent.mm.plugin.webview.model.n5.a(str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = webViewJSSDKVideoItem.f182736e;
        webViewJSSDKVideoItem.f182740i = com.tencent.mm.modelcdntran.i2.b("jsvideofile", currentTimeMillis, str2, str2);
        return webViewJSSDKVideoItem;
    }

    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem c(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKVoiceItem webViewJSSDKVoiceItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKVoiceItem();
        webViewJSSDKVoiceItem.f182741m = str;
        java.lang.String xj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).xj(null, webViewJSSDKVoiceItem.f182741m, null, false);
        webViewJSSDKVoiceItem.f182738g = xj6;
        java.util.HashMap hashMap = com.tencent.mm.plugin.webview.model.o5.f183050a;
        webViewJSSDKVoiceItem.f182736e = com.tencent.mm.plugin.webview.model.n5.a(xj6);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = webViewJSSDKVoiceItem.f182736e;
        webViewJSSDKVoiceItem.f182740i = com.tencent.mm.modelcdntran.i2.b("jsupvoice", currentTimeMillis, str2, str2);
        return webViewJSSDKVoiceItem;
    }

    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem webViewJSSDKImageItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem();
        webViewJSSDKImageItem.f182738g = str;
        webViewJSSDKImageItem.f182736e = com.tencent.mm.plugin.webview.model.n5.a(str);
        webViewJSSDKImageItem.f();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str2 = webViewJSSDKImageItem.f182736e;
        webViewJSSDKImageItem.f182740i = com.tencent.mm.modelcdntran.i2.b("jsupimg", currentTimeMillis, str2, str2);
        return webViewJSSDKImageItem;
    }

    public static com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem e(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem webViewJSSDKImageItem = new com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem();
        webViewJSSDKImageItem.f182738g = str;
        webViewJSSDKImageItem.f182737f = str2;
        webViewJSSDKImageItem.f182736e = com.tencent.mm.plugin.webview.model.n5.a(str);
        webViewJSSDKImageItem.f();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str3 = webViewJSSDKImageItem.f182736e;
        webViewJSSDKImageItem.f182740i = com.tencent.mm.modelcdntran.i2.b("jsupimg", currentTimeMillis, str3, str3);
        return webViewJSSDKImageItem;
    }
}
