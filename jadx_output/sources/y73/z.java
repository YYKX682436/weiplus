package y73;

/* loaded from: classes5.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static long f459770a;

    public static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15974, str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "CodeVersion:%s PatchVersion:%s TinkerId:%s Scene:%d Result:%d", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public static void b(int i17) {
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report download failed");
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 41L, 1L, false);
        } else if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 42L, 1L, false);
        } else {
            if (i17 != 2) {
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 3L, 1L, false);
        }
    }

    public static void c(int i17) {
        long j17 = f459770a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report report download cost = %d", java.lang.Long.valueOf(elapsedRealtime));
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 40L, 1L, false);
        }
        if (elapsedRealtime < 0) {
            com.tencent.mars.xlog.Log.e("Tinker.HotPatchReportHelper", "hp_report report download cost failed, invalid cost");
            return;
        }
        if (elapsedRealtime <= 5000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 1, 43, false);
            return;
        }
        if (elapsedRealtime <= 60000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 1, 44, false);
        } else if (elapsedRealtime <= 180000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 1, 45, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.y(338, 1, 46, false);
        }
    }

    public static void d(int i17) {
        com.tencent.mars.xlog.Log.i("Tinker.HotPatchReportHelper", "hp_report new hotpatch requested");
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 0L, 1L, false);
        } else if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(338L, 20L, 1L, false);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 0L, 1L, false);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f459770a = android.os.SystemClock.elapsedRealtime();
    }

    public static java.lang.String e(java.lang.StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = stackTraceElementArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 != 0) {
                sb6.append(" ");
            }
            sb6.append(stackTraceElementArr[i17].toString());
        }
        return sb6.toString();
    }
}
