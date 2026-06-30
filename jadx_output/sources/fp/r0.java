package fp;

/* loaded from: classes11.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fp.r0 f265232a = new fp.r0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f265233b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f265234c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.o f265235d;

    static {
        long totalBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getTotalBytes();
        f265233b = totalBytes;
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "init, totalSize = " + totalBytes);
        f265234c = kz5.c1.k(new jz5.l(fp.o0.f265219d, new jz5.o(500000000L, 100000000L, "100 MB")), new jz5.l(fp.o0.f265220e, new jz5.o(500000000L, 150000000L, "150 MB")), new jz5.l(fp.o0.f265221f, new jz5.o(1000000000L, 300000000L, "300 MB")), new jz5.l(fp.o0.f265222g, new jz5.o(3000000000L, 500000000L, "500 MB")), new jz5.l(fp.o0.f265223h, new jz5.o(3000000000L, 500000000L, "500 MB")), new jz5.l(fp.o0.f265224i, new jz5.o(3000000000L, 1000000000L, "1 GB")));
        f265235d = new jz5.o(3000000000L, 1000000000L, "1 GB");
    }

    public final long a() {
        int parseInt;
        if (!z65.c.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getAvailableBytes();
        }
        try {
            java.lang.Integer h17 = r26.h0.h(bm5.o1.f22719a.l(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageAvailableBytes()));
            if (h17 != null) {
                parseInt = h17.intValue();
            } else {
                new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageAvailableBytes();
                parseInt = java.lang.Integer.parseInt("10000".toString());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getAvailableSizeFromRepairer, availableBytes = " + parseInt);
            return parseInt * 1000000;
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }

    public final fp.p0 b(long j17) {
        fp.p0 c17 = c(j17);
        if (c17 != null) {
            return c17;
        }
        jz5.o d17 = d();
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getStorageStatusByAvailableSize, availableSize = " + j17 + ", threshold = " + d17);
        return j17 > ((java.lang.Number) d17.f302841d).longValue() ? fp.p0.f265226d : j17 > ((java.lang.Number) d17.f302842e).longValue() ? fp.p0.f265227e : fp.p0.f265228f;
    }

    public final fp.p0 c(long j17) {
        w55.a aVar = com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageNoSpaceThreshold.f192218a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").exists() && l75.d1.f316946b <= 0) {
            return null;
        }
        jz5.l a17 = aVar.a();
        boolean booleanValue = ((java.lang.Boolean) a17.f302833d).booleanValue();
        long longValue = ((java.lang.Number) a17.f302834e).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getStorageStatus, availableSize=" + j17 + ", valid=" + booleanValue + ", threshold=" + longValue);
        if (!booleanValue) {
            return null;
        }
        l75.d1.f316946b = longValue;
        if (j17 <= longValue) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StorageDisableAlert", "getStorageStatus, NO_SPACE!");
            return fp.p0.f265228f;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getStorageStatus, OK!");
        return fp.p0.f265226d;
    }

    public final jz5.o d() {
        long j17 = f265233b / 1000000000;
        jz5.o oVar = (jz5.o) f265234c.get(j17 <= 8 ? fp.o0.f265219d : j17 <= 16 ? fp.o0.f265220e : j17 <= 32 ? fp.o0.f265221f : j17 <= 64 ? fp.o0.f265222g : j17 <= 128 ? fp.o0.f265223h : fp.o0.f265224i);
        return oVar == null ? f265235d : oVar;
    }

    public final boolean e() {
        fp.p0 p0Var;
        long a17 = a();
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getStorageStatus, availableSize = " + a17);
        if (a17 < 0) {
            p0Var = fp.p0.f265226d;
        } else {
            fp.p0 c17 = c(a17);
            if (c17 != null) {
                p0Var = c17;
            } else {
                jz5.o d17 = d();
                com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "getStorageStatus, threshold = " + d17);
                p0Var = a17 > ((java.lang.Number) d17.f302841d).longValue() ? fp.p0.f265226d : a17 > ((java.lang.Number) d17.f302842e).longValue() ? fp.p0.f265227e : fp.p0.f265228f;
            }
        }
        return p0Var == fp.p0.f265228f;
    }

    public final void f(android.app.Activity activity) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showStorageDisableAlert, dialogShowing = ");
        boolean z17 = l75.d1.f316945a;
        sb6.append(l75.d1.f316949e);
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", sb6.toString());
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "activity is null, return");
            return;
        }
        if (l75.d1.f316949e) {
            return;
        }
        if (l75.d1.f316950f.contains(com.tencent.mm.sdk.platformtools.t8.n0(com.tencent.mm.sdk.platformtools.x2.f193071a))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "whiteList Activity return");
            jx3.f.INSTANCE.d(25984, java.lang.Integer.valueOf(ac1.g.CTRL_INDEX), "", "", "");
        } else if (l75.d1.f316951g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StorageDisableAlert", "in pay scene return");
            jx3.f.INSTANCE.d(25984, 511, "", "", "");
        } else {
            l75.d1.f316945a = true;
            ((ku5.t0) ku5.t0.f312615d).B(new fp.q0(activity));
        }
    }
}
