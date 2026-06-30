package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166171a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166172b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166173c;

    /* renamed from: d, reason: collision with root package name */
    public int f166174d;

    public static com.tencent.mm.plugin.sns.storage.y a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".appUserName");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".relativePagePath");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".appVersion");
        java.lang.String str5 = str4 != null ? str4 : "";
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".miniProgramType"), 0);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.y yVar = new com.tencent.mm.plugin.sns.storage.y();
        yVar.f166171a = str2;
        yVar.f166172b = str3;
        yVar.f166173c = str5;
        yVar.f166174d = D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$WeAppInfo");
        return yVar;
    }
}
