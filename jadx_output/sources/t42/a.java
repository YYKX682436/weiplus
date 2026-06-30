package t42;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f415497a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f415498b = "";

    public static boolean a() {
        if (f415497a == null) {
            if (g42.i.g()) {
                f415497a = java.lang.Boolean.TRUE;
            } else {
                f415497a = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_edge_computing_is_monitor_performance, false));
            }
            com.tencent.mars.xlog.Log.i("EdgeComputingMonitor", "[EdgeComputingMonitor] getMonitorPerformanceSwitch sMonitorSwitch : " + f415497a);
        }
        return f415497a.booleanValue();
    }

    public static void b(java.lang.String str, int i17, long j17) {
        if (a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20177, str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] monitorProcess configID : %s, process : %d, reportTimeEC : %d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    public static void c(long j17, int i17) {
        if (j17 <= 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 26L, 1L, false);
        } else if (j17 <= 100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 27L, 1L, false);
        } else if (j17 <= 1000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 28L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 29L, 1L, false);
        }
        if (j17 <= 1000) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(1409L, 53L, j17, false);
            g0Var.idkeyStat(1409L, 54L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(1409L, 98L, 1L, false);
        if (a()) {
            g0Var2.d(20176, f415498b, 5, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), "");
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] statJsApiCostTime configID : %s, costTime : %d, type : %d", f415498b, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public static void d(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 38L, 1L, false);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 30L, 1L, false);
        } else if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 31L, 1L, false);
        } else if (i17 == 4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 32L, 1L, false);
        } else if (i17 != 5) {
            return;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 33L, 1L, false);
        }
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statRealReportProcess reportProcess : " + i17);
    }

    public static void e(java.lang.String str, long j17) {
        if (a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20176, str, 11, 0, java.lang.Long.valueOf(j17), "");
        }
    }

    public static void f(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 20L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 21L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 55L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statScriptConfigParseError success : " + z17);
    }

    public static void g(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 177L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 178L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 179L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statScriptDownloadSuccess success : " + z17);
    }

    public static void h(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 24L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 25L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 37L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statV8ScriptEngineInitError success : " + z17);
    }

    public static void i(boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 22L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 23L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 36L, 1L, false);
        g42.i.a("EdgeComputingMonitor", "[EdgeComputingMonitor] statSqlConfigParseError success : " + z17);
    }

    public static void j(java.lang.String str, long j17, int i17) {
        if (j17 <= 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 8L, 1L, false);
        } else if (j17 <= 100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 9L, 1L, false);
        } else if (j17 <= 1000) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 10L, 1L, false);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1409L, 11L, 1L, false);
        }
        if (j17 <= 1000) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(1409L, 45L, j17, false);
            g0Var.idkeyStat(1409L, 46L, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.idkeyStat(1409L, 91L, 1L, false);
        if (a()) {
            g0Var2.d(20176, str, 2, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), "");
        }
        g42.i.b("EdgeComputingMonitor", "[EdgeComputingMonitor] statStorageCostTime configID : %s, costTime : %d, dataSzie : %d", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }
}
