package l64;

/* loaded from: classes4.dex */
public abstract class a {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppIdFromExtra", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
            str2 = new org.json.JSONObject(str).optString("appId");
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("OpenSdkAdHelper", "getAppIdFromExtra, exp=" + str.toString() + ", extInfo=" + str);
            str2 = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppIdFromExtra", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "uxInfo"
            java.lang.String r1 = "canvasId"
            java.lang.String r2 = "getOpenCanvasAdExtraInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = ""
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L1c
            r5.<init>(r10)     // Catch: java.lang.Exception -> L1c
            java.lang.String r6 = r5.optString(r1)     // Catch: java.lang.Exception -> L1c
            java.lang.String r10 = r5.optString(r0)     // Catch: java.lang.Exception -> L1d
            goto L39
        L1c:
            r6 = r4
        L1d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "getOpenCanvasAdExtraInfo, appId="
            r5.<init>(r7)
            r5.append(r9)
            java.lang.String r7 = ", extInfo="
            r5.append(r7)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            java.lang.String r5 = "OpenSdkAdHelper"
            com.tencent.mars.xlog.Log.e(r5, r10)
            r10 = r4
        L39:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L56
            r5.<init>()     // Catch: java.lang.Exception -> L56
            java.lang.String r7 = "appId"
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Exception -> L56
            if (r9 != 0) goto L45
            r9 = r4
        L45:
            r5.put(r7, r9)     // Catch: java.lang.Exception -> L56
            r5.put(r1, r6)     // Catch: java.lang.Exception -> L56
            r5.put(r0, r10)     // Catch: java.lang.Exception -> L56
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> L56
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r9
        L56:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l64.a.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromOpenSdk", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        boolean z17 = i17 == 29;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromOpenSdk", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        return z17;
    }

    public static void d(java.lang.String str, int i17) {
        java.lang.String jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenCanvas", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("OpenSdkAdHelper", "reportOpenCanvas, exp=" + th6.toString());
        }
        if (!gm0.j1.a() && com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("OpenSdkAdHelper", "reportOpenCanvas, !MMKernel has ready, subKey=" + i17 + ", content=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenCanvas", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
            return;
        }
        com.tencent.mars.xlog.Log.i("OpenSdkAdHelper", "reportOpenCanvas, subKey=" + i17 + ", content=" + str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1667, i17);
        java.lang.String str2 = "";
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("subKey", i17);
                jSONObject = jSONObject2.toString();
            } else {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(str);
                jSONObject3.put("subKey", i17);
                jSONObject = jSONObject3.toString();
            }
            str2 = jSONObject;
        } catch (java.lang.Exception unused) {
        }
        ca4.m0.a("opensdk_open_canvas", str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenCanvas", "com.tencent.mm.plugin.sns.ad.opensdk.OpenSdkAdHelper");
    }
}
