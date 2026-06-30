package com.tencent.mm.plugin.topstory.ui.webview;

@mk0.a
/* loaded from: classes7.dex */
class n0 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String a17 = zq1.n0.a(((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            a17 = "";
        }
        return new com.tencent.mm.ipcinvoker.type.IPCString(a17);
    }
}
