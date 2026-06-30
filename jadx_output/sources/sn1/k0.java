package sn1;

/* loaded from: classes12.dex */
public class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static long f410044c;

    /* renamed from: d, reason: collision with root package name */
    public static long f410045d;

    /* renamed from: e, reason: collision with root package name */
    public static long f410046e;

    /* renamed from: f, reason: collision with root package name */
    public static long f410047f;

    /* renamed from: a, reason: collision with root package name */
    public final java.text.SimpleDateFormat f410048a = new java.text.SimpleDateFormat("yyyyMMdd");

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f410049b;

    public final long a(long j17) {
        java.lang.String format = this.f410048a.format(new java.util.Date(j17));
        java.lang.String str = com.tencent.mm.storage.v3.f196274b + "/MM_" + format + ".xlog";
        if (com.tencent.mm.vfs.w6.j(str)) {
            return com.tencent.mm.vfs.w6.k(str);
        }
        java.lang.String str2 = lp0.b.g0() + "/MM_" + format + ".xlog";
        if (com.tencent.mm.vfs.w6.j(str2)) {
            return com.tencent.mm.vfs.w6.k(str2);
        }
        return 0L;
    }

    public final void b(int i17, long j17, long j18, boolean z17) {
        if (j18 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupLogManager", "reportKv logSize is 0, skip report");
            return;
        }
        long j19 = j18 / (j17 / 1000);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupLogManager", "reportKv, backupMode[%d], time[%d ms], logSize[%d KB], aveLogSize[%d B/s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j19));
        if (i17 == 11) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 83L, j18 / 1024, false);
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(400L, 81L, j18 / 1024, false);
            if (j17 != 0) {
                g0Var.idkeyStat(400L, 82L, j19, false);
            }
            c(i17);
            return;
        }
        if (i17 == 12) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 88L, j18 / 1024, false);
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(400L, 86L, j18 / 1024, false);
            if (j17 != 0) {
                g0Var2.idkeyStat(400L, 87L, j19, false);
            }
            c(i17);
            return;
        }
        if (i17 == 21) {
            if (z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 93L, j18 / 1024, false);
                return;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(485L, 91L, j18 / 1024, false);
            if (j17 != 0) {
                g0Var3.idkeyStat(485L, 92L, j19, false);
            }
            c(i17);
            return;
        }
        if (i17 != 22) {
            return;
        }
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 98L, j18 / 1024, false);
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var4 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var4.idkeyStat(485L, 96L, j18 / 1024, false);
        if (j17 != 0) {
            g0Var4.idkeyStat(485L, 97L, j19, false);
        }
        c(i17);
    }

    public final void c(int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(a(java.lang.System.currentTimeMillis()));
        if (valueOf.longValue() == 0 || valueOf2.longValue() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupLogManager", "startLogAfterTimeHandler is zero, startAfterLogTime[%d], startAfterLogSize[%d], skip", valueOf, valueOf2);
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new sn1.j0(this, valueOf, i17, valueOf2), false);
        this.f410049b = b4Var;
        b4Var.c(300000L, 300000L);
    }
}
