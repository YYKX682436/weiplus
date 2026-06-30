package com.tencent.mm.vfs;

/* loaded from: classes.dex */
public class s7 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        boolean booleanValue;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("VFSStrategy");
        long j17 = M.getLong("VFSSwitchReportTime", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (j17 <= 0 || currentTimeMillis - j17 >= 259200000) {
            M.B("VFSSwitchReportTime", currentTimeMillis);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1317L, 0L, 1L, true);
            synchronized (com.tencent.mm.vfs.t7.class) {
                if (com.tencent.mm.vfs.t7.f213189a == null) {
                    com.tencent.mm.vfs.t7.f213189a = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.o4.M("extmig_status_memo_storage").getBoolean("key_is_olddata_ignored_v2", false));
                }
                booleanValue = com.tencent.mm.vfs.t7.f213189a.booleanValue();
            }
            if (booleanValue) {
                fVar.idkeyStat(1317L, 1L, 1L, true);
            }
            fVar.idkeyStat(1317L, 3L, 1L, true);
            fVar.idkeyStat(1317L, 5L, 1L, true);
            fVar.idkeyStat(1317L, 7L, 1L, true);
            fVar.idkeyStat(1317L, 9L, 1L, true);
        }
    }
}
