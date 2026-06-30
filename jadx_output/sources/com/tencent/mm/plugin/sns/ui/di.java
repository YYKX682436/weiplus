package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public abstract class di {
    public static final boolean a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbidShow", "com.tencent.mm.plugin.sns.ui.SnsExceprtUtils");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidShow", "com.tencent.mm.plugin.sns.ui.SnsExceprtUtils");
            return true;
        }
        boolean z17 = false;
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("forbidShowSource");
            com.tencent.mars.xlog.Log.i("SnsExceprtUtils", "sns excerpt url = " + str + ", forbidShowSource = " + queryParameter);
            kotlin.jvm.internal.o.d(queryParameter);
            z17 = java.lang.Integer.parseInt(queryParameter) == 1;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SnsExceprtUtils", "sns excerpt url exception = " + e17.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidShow", "com.tencent.mm.plugin.sns.ui.SnsExceprtUtils");
        return z17;
    }
}
