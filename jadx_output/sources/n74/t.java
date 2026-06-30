package n74;

/* loaded from: classes4.dex */
public abstract class t {
    public static int a(java.lang.String str) {
        java.lang.String[] split;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        try {
            if (!android.text.TextUtils.isEmpty(str) && (split = str.split("-")) != null && split.length > 0) {
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
                return D1;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdImgDownloadReporter", "getRawRequestType, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawRequestDownType", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        return 0;
    }

    public static void b(int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAdPicDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        com.tencent.mars.xlog.Log.i("AdImgDownloadReporter", "reportAdPicDownload, result=" + i17 + ", scene=" + i18 + ", downloader=" + i19 + ", imgUrl=" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("AdImgDownloadReporter", "reportAdPicDownload, url is empty");
        } else {
            try {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.d(21534, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                if (i18 == 0) {
                    if (i17 == 0) {
                        g0Var.A(2044, 21);
                    } else {
                        g0Var.A(2044, 22);
                    }
                } else if (i18 == 1) {
                    if (i17 == 0) {
                        g0Var.A(2044, 23);
                    } else {
                        g0Var.A(2044, 24);
                    }
                }
                if (i19 == 1) {
                    if (i17 == 0) {
                        g0Var.A(2044, 25);
                    } else {
                        g0Var.A(2044, 26);
                    }
                } else if (i19 == 0) {
                    if (i17 == 0) {
                        g0Var.A(2044, 27);
                    } else {
                        g0Var.A(2044, 28);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdImgDownloadReporter", "reportAdPicDownload, exp=" + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAdPicDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
    }

    public static void c(la4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAvif", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
        if (aVar == null || aVar.f317542a == null || android.text.TextUtils.isEmpty(aVar.d())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAvif", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
            return;
        }
        r45.jj4 jj4Var = aVar.f317542a;
        m44.d.d("ThumbCdnDownload", jj4Var.f377860i, aVar.d() + ca4.z0.U(jj4Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAvif", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdImgDownloadReporter");
    }
}
