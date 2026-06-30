package com.tencent.mm.wallet_core;

/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.wallet_core.b f213793a;

    public static com.tencent.mm.wallet_core.b a() {
        if (f213793a == null) {
            f213793a = new com.tencent.mm.wallet_core.b();
        }
        return f213793a;
    }

    public boolean b() {
        return d(e42.d0.clicfg_open_kinda_bind_card, true);
    }

    public final boolean c(e42.c0 c0Var, boolean z17) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("kinda");
        if ("open".equals(com.tencent.mm.sdk.platformtools.z.f193116l)) {
            return true;
        }
        if ("close".equals(com.tencent.mm.sdk.platformtools.z.f193116l)) {
            return false;
        }
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_KindaConfigEnable_Int, 0);
        if (g17 == 1) {
            return true;
        }
        if (g17 == 2) {
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(c0Var, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TenPaySdkAbTest", "isKindaEnable svrConfig %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public final boolean d(e42.d0 d0Var, boolean z17) {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("kinda");
        if ("open".equals(com.tencent.mm.sdk.platformtools.z.f193116l)) {
            return true;
        }
        if ("close".equals(com.tencent.mm.sdk.platformtools.z.f193116l)) {
            return false;
        }
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_KindaConfigEnable_Int, 0);
        if (g17 == 1) {
            return true;
        }
        if (g17 == 2) {
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(d0Var, z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TenPaySdkAbTest", "isKindaEnable svrConfig %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public boolean e() {
        return d(e42.d0.clicfg_pay_security_kinda_switch_android, false);
    }

    public boolean f() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_tenpay_offline_cert_rsa_2048, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TenPaySdkAbTest", "isOfflineOpen2048 %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public boolean g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TenPaySdkAbTest", "isPwdOpen2048 %s", java.lang.Boolean.TRUE);
        return true;
    }
}
