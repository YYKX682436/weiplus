package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public abstract class e0 {
    public static void a(long j17, long j18) {
        if (j17 > 0 && 197 != j17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, 1L, false);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(197L, j18, 1L, false);
    }

    public static void b(int i17, int i18, java.lang.String str, int i19, int i27, int i28, int i29, int i37, int i38, int i39, java.lang.String str2) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(11906, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || str2.equals("0")) {
            return;
        }
        g0Var.d(11907, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), str2);
    }

    public static void c(int i17, int i18, java.lang.String str, int i19, com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d0 d0Var, boolean z17, boolean z18, boolean z19, java.lang.String str2) {
        b(i17, i18, str, i19, 1, !z18 ? 1 : 0, d0Var.ordinal(), !z19 ? 1 : 0, 1, !z17 ? 1 : 0, str2);
    }

    public static void d(int i17, int i18, int i19, boolean z17, boolean z18, boolean z19, boolean z27, java.lang.String str) {
        b(i17, i18, "", i19, 2, !z17 ? 1 : 0, 1, !z19 ? 1 : 0, !z18 ? 1 : 0, !z27 ? 1 : 0, str);
    }

    public static void e(int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mm.autogen.mmdata.rpt.ResouceDownloadIdKeyReportSyncStruct resouceDownloadIdKeyReportSyncStruct = new com.tencent.mm.autogen.mmdata.rpt.ResouceDownloadIdKeyReportSyncStruct();
        resouceDownloadIdKeyReportSyncStruct.f60008g = resouceDownloadIdKeyReportSyncStruct.b("Network", com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? "wifi" : "4g" : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, true);
        resouceDownloadIdKeyReportSyncStruct.f60005d = i17;
        resouceDownloadIdKeyReportSyncStruct.f60006e = i18;
        resouceDownloadIdKeyReportSyncStruct.f60007f = i19;
        resouceDownloadIdKeyReportSyncStruct.f60009h = i27;
        resouceDownloadIdKeyReportSyncStruct.f60010i = i28;
        resouceDownloadIdKeyReportSyncStruct.f60011j = 1L;
        resouceDownloadIdKeyReportSyncStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConstantsCheckResUpdate", "kvStatDownload: %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i28));
    }
}
