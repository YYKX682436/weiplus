package s34;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f402800a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402801b;

    @za4.k1(resType = 2)
    public java.lang.String cardImageUrl;

    public static s34.w a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
        if (!map.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
            return null;
        }
        s34.w wVar = new s34.w();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".clockwise");
        wVar.f402800a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
        java.lang.String str2 = (java.lang.String) map.get(str + ".transitionImg");
        if (str2 == null) {
            str2 = "";
        }
        wVar.cardImageUrl = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".transitionColor");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".transitionColorAlpha");
        wVar.f402801b = ca4.m0.q0(str3, str4 != null ? str4 : "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
        return wVar;
    }
}
