package com.tencent.mm.sdcard_migrate;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f192345a = bm5.f1.a();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.b5 f192346b = new com.tencent.mm.sdk.platformtools.b5("ExtStorageMigrateMonitor", java.util.concurrent.TimeUnit.DAYS.toMillis(1), true, true);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f192347c = {false};

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps f192348d = new com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps(null);

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.sdcard_migrate.c f192349e = new com.tencent.mm.sdcard_migrate.a();

    public static void a(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            com.tencent.mars.xlog.Log.i(str, str2);
        } else if (i17 == 5) {
            com.tencent.mars.xlog.Log.w(str, str2);
        } else {
            if (i17 != 6) {
                return;
            }
            com.tencent.mars.xlog.Log.e(str, str2);
        }
    }

    public static void b(long j17, long j18, long j19) {
        if (f192346b.b("idkey_" + j17 + "_" + j18)) {
            boolean[] zArr = f192347c;
            synchronized (zArr) {
                if (zArr[0]) {
                    jx3.f.INSTANCE.idkeyStat(j17, j18, j19, true);
                } else {
                    com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps extStorageMigrateMonitor$PendingOps = f192348d;
                    extStorageMigrateMonitor$PendingOps.getClass();
                    extStorageMigrateMonitor$PendingOps.f192337d.add(new com.tencent.mm.sdcard_migrate.e(j17, j18, j19));
                }
            }
        }
    }
}
