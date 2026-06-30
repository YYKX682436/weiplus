package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes7.dex */
public class y implements qf.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f182689a;

    public y(java.lang.String str) {
        this.f182689a = "";
        this.f182689a = str;
    }

    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        try {
            android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse("application/javascript", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, new java.io.ByteArrayInputStream((ik1.f.e("LuggageBridge.js") + this.f182689a).getBytes(com.tencent.mapsdk.internal.rv.f51270c)));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
            hashMap.put("Pragma", "no-cache");
            hashMap.put("Expires", "0");
            webResourceResponse.setResponseHeaders(hashMap);
            return webResourceResponse;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.LuggageMMJsBridgeResourceProvider", "", e17);
            return null;
        }
    }

    @Override // qf.c
    public java.lang.String b() {
        return "weixin://bridge.js";
    }
}
