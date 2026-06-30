package s34;

/* loaded from: classes4.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402739a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f402741c;

    public p1(int i17, int i18, java.lang.String str, java.lang.String str2, int i19) {
        this.f402739a = str;
        this.f402740b = str2;
        this.f402741c = i19;
    }

    public static final s34.p1 b(java.util.Map map, java.lang.String str) {
        java.lang.Integer h17;
        java.lang.Integer h18;
        java.lang.Integer h19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
        s34.p1 p1Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
        } else {
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".clickActionType"));
            int intValue = (str2 == null || (h19 = r26.h0.h(str2)) == null) ? 0 : h19.intValue();
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".needUpdateQrUrl"));
            int intValue2 = (str3 == null || (h18 = r26.h0.h(str3)) == null) ? 0 : h18.intValue();
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".qrExtInfo"));
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".qrUrl"));
            java.lang.String str7 = str6 != null ? str6 : "";
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".qrResultType"));
            p1Var = new s34.p1(intValue, intValue2, str5, str7, (str8 == null || (h17 = r26.h0.h(str8)) == null) ? 0 : h17.intValue());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        return p1Var;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQrUrl", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        return this.f402740b;
    }
}
