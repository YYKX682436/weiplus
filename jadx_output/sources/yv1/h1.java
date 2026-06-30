package yv1;

/* loaded from: classes12.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f466065a;

    /* renamed from: b, reason: collision with root package name */
    public static long[] f466066b = new long[3];

    /* renamed from: c, reason: collision with root package name */
    public static boolean f466067c;

    public static final long a(int i17, long j17) {
        if (i17 == 3) {
            return j17 / 4;
        }
        if (i17 != 23) {
            return 0L;
        }
        return j17 / 16;
    }

    public static final long b(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(gm0.j1.u().h() + '/' + name + ".db");
        if (m17 != null) {
            return m17.f213234d;
        }
        return 0L;
    }

    public static final long[] c() {
        boolean z17;
        java.lang.String X;
        java.io.File externalCacheDir = com.tencent.mm.sdk.platformtools.x2.f193071a.getExternalCacheDir();
        if (externalCacheDir != null) {
            try {
                z17 = android.os.Environment.isExternalStorageEmulated(externalCacheDir);
            } catch (java.lang.Exception unused) {
                z17 = false;
            }
            X = z17 ? lp0.b.X() : lp0.b.e0();
        } else {
            X = lp0.b.X();
        }
        try {
            android.os.StatFs statFs = new android.os.StatFs(X);
            return new long[]{statFs.getAvailableBytes(), statFs.getTotalBytes()};
        } catch (java.lang.Exception unused2) {
            return new long[]{1, 1};
        }
    }

    public static final boolean d() {
        if (f466065a) {
            return true;
        }
        return (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageOtherResAndAccSeparating()) > 0) && j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageForceShowOtherRes()) > 0;
    }

    public static final boolean e(long j17, long j18) {
        if (d()) {
            return true;
        }
        if (kotlin.jvm.internal.o.b(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_module_files_enabled", "0"), "0")) {
            return false;
        }
        boolean z17 = j18 - com.tencent.mm.sdk.platformtools.o4.L().getLong("last_clean_module_files", 0L) > 259200000;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanUtil", "shouldCleanModuleFiles: expired: " + z17 + ", size: " + j17);
        return z17 && j17 > 350000000;
    }

    public static final void f(int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        long[] jArr = f466066b;
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        if (jArr[i17] > 0) {
            for (long j17 = 0; j17 < jArr[i17]; j17 += 200) {
                try {
                    java.lang.Thread.sleep(200L);
                } catch (java.lang.InterruptedException unused) {
                }
                boolean z17 = false;
                if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                    z17 = true;
                }
                if (z17) {
                    return;
                }
            }
        }
    }

    public static /* synthetic */ void g(int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            cancellationSignal = null;
        }
        f(i17, cancellationSignal);
    }
}
