package s34;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402829a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402830b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402831c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402832d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f402833e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402834f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f402835g;

    public static s34.y a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        if (map == null || !map.containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
            return null;
        }
        s34.y yVar = new s34.y();
        java.lang.String str2 = (java.lang.String) map.get(str + ".finderUsername");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        yVar.f402829a = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".finderAvatar");
        if (str3 == null) {
            str3 = "";
        }
        yVar.f402830b = str3;
        java.lang.String str4 = (java.lang.String) map.get(str + ".finderNickname");
        if (str4 == null) {
            str4 = "";
        }
        yVar.f402831c = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".finderDesc");
        if (str5 == null) {
            str5 = "";
        }
        yVar.f402832d = str5;
        java.lang.String str6 = (java.lang.String) map.get(str + ".finderFollowingBtnTitle");
        if (str6 == null) {
            str6 = "";
        }
        yVar.f402833e = str6;
        java.lang.String str7 = (java.lang.String) map.get(str + ".finderExportId");
        if (str7 == null) {
            str7 = "";
        }
        yVar.f402834f = str7;
        java.lang.String str8 = (java.lang.String) map.get(str + ".finderObjectNonceId");
        yVar.f402835g = str8 != null ? str8 : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderFollowInfo");
        return yVar;
    }
}
