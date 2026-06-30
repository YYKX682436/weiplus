package com.tencent.mm.plugin.fts.train;

/* loaded from: classes7.dex */
public abstract class p {
    public static void a(int i17) {
        try {
            jx3.f.INSTANCE.idkeyStat(1030L, i17, 1L, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.GroupTrainReport", "inc(%d) failed: %s", java.lang.Integer.valueOf(i17), th6.getMessage());
        }
    }

    public static void b(int i17, int i18, long j17) {
        int i19 = j17 > 2147483647L ? Integer.MAX_VALUE : (int) j17;
        try {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(1030L, i17, i19, false);
            fVar.idkeyStat(1030L, i18, 1L, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTS.GroupTrainReport", "timing(%d/%d,%d) failed: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), th6.getMessage());
        }
    }
}
