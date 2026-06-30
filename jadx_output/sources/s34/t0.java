package s34;

/* loaded from: classes4.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public long f402766a;

    /* renamed from: b, reason: collision with root package name */
    public long f402767b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402768c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402770e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402771f;

    public static s34.t0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".endTime");
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(str2);
        if (android.text.TextUtils.isEmpty(str2) || E1 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
            return null;
        }
        s34.t0 t0Var = new s34.t0();
        t0Var.f402767b = E1 * 1000;
        t0Var.f402766a = com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) map.get(str + ".startTime")) * 1000;
        java.lang.String str3 = (java.lang.String) map.get(str + ".barBgColor");
        if (str3 == null) {
            str3 = "";
        }
        t0Var.f402768c = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".barBgAlpha");
        if (str4 == null) {
            str4 = "";
        }
        t0Var.f402769d = str4;
        com.tencent.mm.sdk.platformtools.t8.C1((java.lang.String) map.get(str + ".leftTitleType"));
        java.lang.String str5 = (java.lang.String) map.get(str + ".leftTitle");
        if (str5 == null) {
            str5 = "";
        }
        t0Var.f402770e = str5;
        java.lang.String str6 = (java.lang.String) map.get(str + ".rightTitle");
        t0Var.f402771f = str6 != null ? str6 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdPromotionInfo");
        return t0Var;
    }
}
