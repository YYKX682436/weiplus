package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class c2 {
    public static java.lang.String a() {
        if (c01.z1.I()) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b_5);
        }
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            return com.tencent.mm.wallet_core.ui.r1.O() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b_4) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b_3);
        }
        com.tencent.mars.xlog.Log.i("MicrMsg.WalletWordingManager", "get wechat user wallet entry : %s", Ai);
        return com.tencent.mm.wallet_core.ui.r1.O() ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mew, Ai) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mev, Ai);
    }

    public static java.lang.String b() {
        return c01.z1.I() ? "R" : c01.z1.z() ? "HK$" : "¥";
    }

    public static java.lang.String c() {
        if (c01.z1.I()) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b2o);
        }
        java.lang.String Ai = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ai();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ky7);
        }
        com.tencent.mars.xlog.Log.i("MicrMsg.WalletWordingManager", "get wechat user wallet entry : %s", Ai);
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n2y, Ai);
    }
}
