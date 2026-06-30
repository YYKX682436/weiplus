package com.tencent.mm.plugin.webview.luggage;

@mk0.a
/* loaded from: classes.dex */
class u2 implements com.tencent.mm.ipcinvoker.j {
    private u2() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        java.lang.String str = iPCString.f68406d;
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str2 = iPCString.f68406d;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        java.lang.String c17 = com.tencent.mm.modelavatar.g.c(str2, false, false);
        if (!com.tencent.mm.vfs.w6.j(c17)) {
            dw4.a.a(new com.tencent.mm.plugin.webview.luggage.t2(this, str));
        }
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCString(c17));
    }
}
