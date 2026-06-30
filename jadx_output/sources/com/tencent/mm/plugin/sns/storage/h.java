package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166007a;

    /* renamed from: b, reason: collision with root package name */
    public int f166008b;

    @za4.k1(flag = 2, resType = 2)
    public java.lang.String bgImageUrl;

    @za4.k1(flag = 2, resType = 2)
    public java.lang.String descIconUrl;

    @za4.k1(flag = 2, resType = 2)
    public java.lang.String detectSucIconUrl;

    public static com.tencent.mm.plugin.sns.storage.h a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".bgImage");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".descIcon");
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = (java.lang.String) map.get(str + ".detectSucIcon");
        java.lang.String str6 = str5 != null ? str5 : "";
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".scanGestureType"), 0);
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str4) || android.text.TextUtils.isEmpty(str6) || D1 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.h hVar = new com.tencent.mm.plugin.sns.storage.h();
        hVar.bgImageUrl = str2;
        hVar.f166007a = str3;
        hVar.descIconUrl = str4;
        hVar.detectSucIconUrl = str6;
        hVar.f166008b = D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$ADScanJumpInfo");
        return hVar;
    }
}
