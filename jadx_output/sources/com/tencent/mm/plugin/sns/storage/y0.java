package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166175a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166176b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166177c;

    public static com.tencent.mm.plugin.sns.storage.y0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
        if (a84.b0.c(map) || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        }
        if (!map.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        }
        try {
            com.tencent.mm.plugin.sns.storage.y0 y0Var = new com.tencent.mm.plugin.sns.storage.y0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".title");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            y0Var.f166175a = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".description");
            if (str4 == null) {
                str4 = "";
            }
            y0Var.f166176b = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".iconUrl");
            if (str5 != null) {
                str3 = str5;
            }
            y0Var.f166177c = str3;
            if (com.tencent.mm.sdk.platformtools.t8.K0(y0Var.f166176b)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
                return null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return y0Var;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.AdSellingPointInfo");
            return null;
        }
    }
}
