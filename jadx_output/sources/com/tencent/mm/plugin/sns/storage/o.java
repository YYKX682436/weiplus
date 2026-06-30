package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166080a;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adSelectCardClickInfoLeft;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adSelectCardClickInfoRight;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166081b;

    public o(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
    }

    public void a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSelectInfo");
        java.lang.String str2 = str + ".leftBtnClickActionInfo";
        if (map.containsKey(str2)) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str2);
            this.adSelectCardClickInfoLeft = f17;
            f17.f162569a = 5;
        }
        java.lang.String str3 = str + ".rightBtnClickActionInfo";
        if (map.containsKey(str3)) {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f18 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str3);
            this.adSelectCardClickInfoRight = f18;
            f18.f162569a = 6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.ADXml$AdSelectInfo");
    }
}
