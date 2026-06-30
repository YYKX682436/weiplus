package fp;

/* loaded from: classes11.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fp.n0 f265215a = new fp.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f265216b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f265217c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.o f265218d;

    static {
        long totalBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getTotalBytes();
        f265216b = totalBytes;
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageAlertUtil", "init, totalSize = " + totalBytes);
        f265217c = kz5.c1.k(new jz5.l(fp.l0.f265204d, new jz5.o(500000000L, 500000000L, 100000000L)), new jz5.l(fp.l0.f265205e, new jz5.o(500000000L, 500000000L, 200000000L)), new jz5.l(fp.l0.f265206f, new jz5.o(1000000000L, 1000000000L, 500000000L)));
        f265218d = new jz5.o(10000000000L, 5000000000L, 500000000L);
    }

    public static final java.lang.String a(long j17) {
        if (j17 >= 1000000000) {
            java.lang.String format = java.lang.String.format("%.1f GB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 * 1.0d) / 1000000000)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            return format;
        }
        if (j17 >= 1000000) {
            java.lang.String format2 = java.lang.String.format("%.1f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 * 1.0d) / 1000000)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            return format2;
        }
        if (j17 < 1000) {
            return j17 > 0 ? "< 1 KB" : "0 KB";
        }
        java.lang.String format3 = java.lang.String.format("%.0f KB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 * 1.0d) / 1000)}, 1));
        kotlin.jvm.internal.o.f(format3, "format(...)");
        return format3;
    }

    public final fp.m0 b() {
        long j17;
        int parseInt;
        if (z65.c.a()) {
            try {
                java.lang.Integer h17 = r26.h0.h(bm5.o1.f22719a.l(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageAvailableBytes()));
                if (h17 != null) {
                    parseInt = h17.intValue();
                } else {
                    new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageAvailableBytes();
                    parseInt = java.lang.Integer.parseInt("10000".toString());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StorageAlertUtil", "getAvailableSizeFromRepairer, availableBytes = " + parseInt);
                j17 = parseInt * 1000000;
            } catch (java.lang.Throwable unused) {
                j17 = -1;
            }
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            j17 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getAvailableBytes();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageAlertUtil", "getStorageStatus, availableSize = " + j17);
        if (j17 < 0) {
            return fp.m0.f265209d;
        }
        long j18 = f265216b / 1000000000;
        jz5.o oVar = (jz5.o) f265217c.get(j18 <= 64 ? fp.l0.f265204d : j18 <= 128 ? fp.l0.f265205e : fp.l0.f265206f);
        if (oVar == null) {
            oVar = f265218d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StorageAlertUtil", "getStorageStatus, threshold = " + oVar);
        return j17 < ((java.lang.Number) oVar.f302843f).longValue() ? fp.m0.f265211f : j17 < ((java.lang.Number) oVar.f302841d).longValue() ? fp.m0.f265210e : fp.m0.f265209d;
    }
}
