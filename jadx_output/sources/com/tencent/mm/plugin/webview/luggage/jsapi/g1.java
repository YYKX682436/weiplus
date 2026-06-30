package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
class g1 implements com.tencent.mm.ipcinvoker.k0 {
    private g1() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17 = 0;
        int Ai = i95.n0.c(kh3.f.class) != null ? ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(16) : 0;
        if (Ai != 0) {
            i17 = 1;
            if (Ai != 1) {
                i17 = 2;
            }
        }
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = new com.tencent.mm.ipcinvoker.type.IPCInteger();
        iPCInteger.f68404d = i17;
        return iPCInteger;
    }
}
