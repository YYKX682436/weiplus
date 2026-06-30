package com.tencent.mm.plugin.webview.luggage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q3 implements com.tencent.mm.ipcinvoker.k0 {
    private q3() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = new com.tencent.mm.ipcinvoker.type.IPCBoolean();
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("EnableWebviewScanQRCode"), 1);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageWebViewLongClickHelper", "isAllowScanQRCode parseInt failed");
            i17 = 0;
        }
        iPCBoolean.f68400d = i17 == 1;
        return iPCBoolean;
    }
}
