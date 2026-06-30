package com.tencent.mm.plugin.walletlock.model;

/* loaded from: classes9.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static long f181373a = -1;

    public static void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "idkey fingerprint open result: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(713L, z17 ? 0L : 1L, 1L, false);
    }

    public static void b(int i17, int i18, long j17) {
        int i19 = 6;
        if (i18 == 6) {
            i19 = 5;
        } else if (i18 != 1004) {
            i19 = (i18 == 1023 && i17 == 3) ? 4 : -1;
        }
        if (i19 != -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "wallet lock idkey report id: %d, key: %d, value: %d", 713, java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(713L, i19, j17, false);
        }
    }

    public static void c(int i17, int i18, int i19) {
        long j17 = f181373a;
        if (j17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletLockReportManager", "wallet lock report sessionId is -1, not create session, ignore");
        } else {
            if (i17 == -1) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletLockReportManager", "reportVerifyWalletLock session: %d, protectScene: %d, walletLockType: %d, result: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14839, java.lang.Long.valueOf(f181373a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
    }
}
