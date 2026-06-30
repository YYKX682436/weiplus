package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes7.dex */
public class c0 implements qf.c {
    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        java.io.PipedOutputStream pipedOutputStream = new java.io.PipedOutputStream();
        try {
            java.io.PipedInputStream pipedInputStream = new java.io.PipedInputStream(pipedOutputStream);
            com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask luggageMMLocalResourceProvider$GetLocalResourceInfoTask = new com.tencent.mm.plugin.webview.luggage.LuggageMMLocalResourceProvider$GetLocalResourceInfoTask(null);
            luggageMMLocalResourceProvider$GetLocalResourceInfoTask.f182123f = str;
            luggageMMLocalResourceProvider$GetLocalResourceInfoTask.f182124g = 1;
            luggageMMLocalResourceProvider$GetLocalResourceInfoTask.f182126i = new com.tencent.mm.plugin.webview.luggage.a0(this, luggageMMLocalResourceProvider$GetLocalResourceInfoTask, pipedOutputStream);
            luggageMMLocalResourceProvider$GetLocalResourceInfoTask.d();
            return new android.webkit.WebResourceResponse("image/*", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, pipedInputStream);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // qf.c
    public java.lang.String b() {
        return "weixin://resourceid/.*";
    }
}
