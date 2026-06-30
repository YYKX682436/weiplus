package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes16.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f164933a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f164934b = 0;

    public static void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        java.util.Map map = f164933a;
        synchronized (map) {
            try {
                long j17 = f164934b;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - j17 <= u04.d.f423477c) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                    return;
                }
                f164934b = android.os.SystemClock.elapsedRealtime();
                ((java.util.concurrent.ConcurrentHashMap) map).clear();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanExpiredObjectIfNeeded", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
                throw th6;
            }
        }
    }

    public static java.lang.String b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        int indexOf = str.indexOf(63);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf("://");
        if (indexOf2 >= 0) {
            str = str.substring(indexOf2 + 3);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            return str;
        }
        java.lang.String substring = str.substring(indexOf3 + 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPartialUrl", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        return substring;
    }

    public static void c(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, int i27, long j17, long j18, long j19, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareReportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            com.tencent.mm.plugin.sns.statistics.p pVar = new com.tencent.mm.plugin.sns.statistics.p(null);
            java.lang.String b17 = b(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164915a = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164916b = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164917c = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164918d = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164919e = i19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164920f = i27;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164921g = j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164922h = j18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164924j = j19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            pVar.f164925k = i28;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
            ((java.util.concurrent.ConcurrentHashMap) f164933a).put(str, pVar);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareReportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }

    public static void d(java.lang.String str, long j17) {
        com.tencent.mm.plugin.sns.statistics.p pVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            pVar = (com.tencent.mm.plugin.sns.statistics.p) ((java.util.concurrent.ConcurrentHashMap) f164933a).remove(str);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            throw th6;
        }
        if (pVar == null) {
            a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        pVar.f164923i = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1902", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgDownloadInfo");
        java.lang.String a17 = com.tencent.mm.plugin.sns.statistics.p.a(pVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsImgStats", "report dl: " + a17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13513, a17);
        a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportImgDownloadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportImgUploadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
        try {
            com.tencent.mm.plugin.sns.statistics.q qVar = new com.tencent.mm.plugin.sns.statistics.q(null);
            java.lang.String b17 = b(str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f164927a = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f164928b = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f164929c = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f164930d = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f164931e = i19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            qVar.f164932f = j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsImgStats$SnsImgUploadInfo");
            java.lang.String a17 = com.tencent.mm.plugin.sns.statistics.q.a(qVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsImgStats", "report up: " + a17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(13512, a17);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportImgUploadInfo", "com.tencent.mm.plugin.sns.statistics.SnsImgStats");
    }
}
