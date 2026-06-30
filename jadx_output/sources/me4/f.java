package me4;

/* loaded from: classes11.dex */
public abstract class f {
    public static java.lang.String a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return "";
        }
        java.lang.String replace = str.replace(",", ";");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processJsonStrForKVReport", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        return replace;
    }

    public static void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportDeviceChange isWxEnvInitDone==false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            java.lang.String a17 = a(str);
            com.tencent.mars.xlog.Log.i("ad.waid.WaidReporter", "reportDeviceChange data=" + a17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18666, 2004, a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportDeviceChange exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportDeviceChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    public static void c(me4.d dVar, java.lang.String str) {
        java.lang.String[] strArr;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportPkg isWxEnvInitDone==false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        if (dVar != null && (strArr = dVar.f325943b) != null && strArr.length > 1) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i17 = 0;
                while (true) {
                    java.lang.String[] strArr2 = dVar.f325943b;
                    if (i17 >= strArr2.length) {
                        break;
                    }
                    sb6.append(strArr2[i17]);
                    if (i17 != dVar.f325943b.length - 1) {
                        sb6.append("|");
                    }
                    i17++;
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("rawCallPkg", dVar.f325942a);
                jSONObject.put("callPkgType", dVar.f325944c);
                jSONObject.put("pkgsFromUid", sb6.toString());
                jSONObject.put("queryPkg", str);
                java.lang.String a17 = a(jSONObject.toString());
                com.tencent.mars.xlog.Log.i("ad.waid.WaidReporter", "reportPkg data=" + a17);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18666, 2002, a17);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportPkg exp=" + android.util.Log.getStackTraceString(th6));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPkg", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    public static void d(java.lang.String str, int i17, java.lang.String str2, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportQuery isWxEnvInitDone==false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("callPkg", str);
            jSONObject.put("callPkgType", i17);
            jSONObject.put("queryPkg", str2);
            jSONObject.put("errCode", i18);
            jSONObject.put("waitInit", i19);
            jSONObject.put("timeCost", i27);
            java.lang.String a17 = a(jSONObject.toString());
            com.tencent.mars.xlog.Log.i("ad.waid.WaidReporter", "reportQuery data=" + a17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18666, 2000, a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportQuery exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportQuery", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
        if (!me4.c.j()) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportWaidChange isWxEnvInitDone==false");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("needUpdate", i17);
            jSONObject.put("kvCount", i18);
            java.lang.String a17 = a(jSONObject.toString());
            com.tencent.mars.xlog.Log.i("ad.waid.WaidReporter", "reportWaidChange data=" + a17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18666, 2003, a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ad.waid.WaidReporter", "reportWaidChange exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportWaidChange", "com.tencent.mm.plugin.sns.waid.WaidReporter");
    }
}
