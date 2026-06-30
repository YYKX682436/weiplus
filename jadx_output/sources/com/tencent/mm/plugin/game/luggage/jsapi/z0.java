package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class z0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return null;
        }
        com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem d17 = com.tencent.mm.plugin.webview.model.m4.d(iPCString.f68406d);
        d17.f182748t = true;
        d17.f182742n = 1;
        com.tencent.mm.plugin.webview.modeltools.z.Zi().a(d17);
        return new com.tencent.mm.ipcinvoker.type.IPCString(d17.f182736e);
    }
}
