package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f181367a;

    public static int a() {
        java.lang.String str;
        if (!f181367a && gm0.j1.a()) {
            try {
                str = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("PatternLockTimeInterval");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletLockInitTask", e17, "", new java.lang.Object[0]);
                str = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                hu4.c.f285224a = 300;
            } else {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
                if (P >= 0) {
                    java.lang.String.format("Dynamic config for PatternLockInterval override default config, newval=%d", java.lang.Integer.valueOf(P));
                    hu4.c.f285224a = P;
                } else {
                    hu4.c.f285224a = 300;
                }
            }
            f181367a = true;
        }
        return hu4.c.f285224a;
    }
}
