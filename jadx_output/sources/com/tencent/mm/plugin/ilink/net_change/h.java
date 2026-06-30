package com.tencent.mm.plugin.ilink.net_change;

/* loaded from: classes8.dex */
public final class h implements com.tencent.mm.plugin.ilink.net_change.a {
    @Override // com.tencent.mm.plugin.ilink.net_change.a
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "startListen: ");
        c(0);
    }

    @Override // com.tencent.mm.plugin.ilink.net_change.a
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "stopListen: ");
        c(1);
    }

    public final void c(int i17) {
        java.lang.String a17 = bm5.f1.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s operate network change: %d", a17, java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from_process", a17);
        bundle.putInt("opcode", i17);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.ilink.net_change.f.class, new com.tencent.mm.plugin.ilink.net_change.g(a17));
    }
}
