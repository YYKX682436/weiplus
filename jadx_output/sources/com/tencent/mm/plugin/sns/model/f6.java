package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public abstract class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f164192a = new java.util.HashMap();

    public static java.lang.String a(r45.jj4 jj4Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCdnSightDownloadFileName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String str2 = ca4.z0.R(jj4Var) + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCdnSightDownloadFileName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str2;
    }

    public static java.lang.String b(java.lang.String str, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCdnSightDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String i17 = com.tencent.mm.plugin.sns.model.y6.i(str, jj4Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(i17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = jj4Var.f377855d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCdnSightDownloadDirName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            java.lang.String d17 = d(com.tencent.mm.plugin.sns.model.l4.Di(), str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCdnSightDownloadDirName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            sb6.append(d17);
            sb6.append(a(jj4Var, ""));
            i17 = sb6.toString();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCdnSightDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return i17;
    }

    public static java.lang.String c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String d17 = d(com.tencent.mm.plugin.sns.model.l4.Di(), str);
        com.tencent.mm.vfs.w6.u(d17);
        java.lang.String str2 = d17 + str + "image_bg_";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str2;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        if (str == null || str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            return "";
        }
        boolean equals = android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper());
        java.util.Map map = f164192a;
        if (equals) {
            if (((java.util.HashMap) map).containsKey(str.concat(str2))) {
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) map).get(str.concat(str2));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                    return str3;
                }
            }
        }
        java.lang.String g17 = kk.k.g(str2.getBytes());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        if (g17.length() >= 1) {
            stringBuffer.append(g17.charAt(0));
            stringBuffer.append("/");
        }
        if (g17.length() >= 2) {
            stringBuffer.append(g17.charAt(1));
            stringBuffer.append("/");
        }
        if (equals) {
            ((java.util.HashMap) map).put(str.concat(str2), stringBuffer.toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return stringBuffer2;
    }
}
