package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public abstract class a {
    public static void a() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:mm");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 31L, 1L, true);
        } else if (com.tencent.mm.sdk.platformtools.x2.p()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:push");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 32L, 1L, true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "reportWritePreventCrashFile() process:other");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 33L, 1L, true);
        }
    }

    public static void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CrashSecondReport", "secondReportCrash() process:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, "mm")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 21L, 1L, true);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 22L, 1L, true);
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str, "other")) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1185L, 23L, 1L, true);
        }
    }
}
