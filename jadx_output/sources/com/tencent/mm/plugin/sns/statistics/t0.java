package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes.dex */
public abstract class t0 {
    public static void a(int i17, java.lang.String str, int i18) {
        java.lang.String format = java.lang.String.format("%s,%s,%s,%s", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MicroMsg.SNS.SnsReportLogic", "snsRedDotAction 16172 report %s", format);
        jx3.f.INSTANCE.kvStat(16172, format);
    }
}
