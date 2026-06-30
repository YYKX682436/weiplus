package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f165999a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166000b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166001c;

    public static com.tencent.mm.plugin.sns.storage.g a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".objectNonceId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".finderUsername");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".exportId");
        java.lang.String str5 = str4 != null ? str4 : "";
        if (android.text.TextUtils.isEmpty(str5) || android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.g gVar = new com.tencent.mm.plugin.sns.storage.g();
        gVar.f165999a = str2;
        gVar.f166000b = str3;
        gVar.f166001c = str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADFinderInfo");
        return gVar;
    }
}
