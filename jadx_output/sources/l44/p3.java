package l44;

/* loaded from: classes4.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.p3 f316299a = new l44.p3();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.r0 f316300b;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        f316300b = new l44.o3(kotlinx.coroutines.q0.f310567d);
    }

    public static final void a(l44.p3 p3Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        p3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        if (u3Var != null) {
            try {
                if (u3Var.isShowing()) {
                    u3Var.dismiss();
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
    }

    public static final void d(s34.p1 p1Var, com.tencent.mm.ui.MMActivity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        kotlin.jvm.internal.o.g(activity, "activity");
        if (p1Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        kotlinx.coroutines.y0 b17 = v65.m.b(activity);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a.plus(f316300b), null, new l44.m3(p1Var, activity, h0Var, str, str3, str2, i17, str4, null), 2, null)).p(new l44.n3(h0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openQr", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
    }

    public final org.json.JSONObject b(l44.j3 reportInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildExtData", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        kotlin.jvm.internal.o.g(reportInfo, "reportInfo");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("type", reportInfo.f316196e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrResult", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrResult", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("qrResult", reportInfo.f316197f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            java.lang.String str = reportInfo.f316198g;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("qrUrl", str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrResultUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrResultUrl", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            java.lang.String str3 = reportInfo.f316199h;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("qrResultUrl", str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            java.lang.String str4 = reportInfo.f316200i;
            if (str4 != null) {
                str2 = str4;
            }
            jSONObject.put("qrExtInfo", str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDirectJump", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDirectJump", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            jSONObject.put("directJump", 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
            int i17 = reportInfo.f316201j;
            if (i17 != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrResultUrlType", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$AdQrReportInfo");
                jSONObject.put("qrResultUrlType", i17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("AdQrClickHelper", "buildKVData exp:" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildExtData", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return jSONObject;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return "AdQrClickHelper";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169 A[Catch: Exception -> 0x016f, TRY_LEAVE, TryCatch #1 {Exception -> 0x016f, blocks: (B:28:0x0117, B:31:0x0125, B:34:0x0132, B:37:0x0163, B:39:0x0169), top: B:27:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(l44.j3 r24) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l44.p3.e(l44.j3):void");
    }

    public final int f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        int i18 = 2;
        if (i17 != 1 && i17 != 2) {
            i18 = 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toScene", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper");
        return i18;
    }
}
