package s34;

/* loaded from: classes4.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f402785a;

    @za4.k1(resType = 2)
    public java.lang.String iconUrl;

    public static s34.u0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str + ".iconUrl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            java.util.List b17 = b(map, str + ".textList");
            if (!a84.b0.b(b17)) {
                s34.u0 u0Var = new s34.u0();
                u0Var.iconUrl = str2;
                u0Var.f402785a = b17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
                return u0Var;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        return null;
    }

    public static java.util.List b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
            return arrayList;
        }
        java.lang.String str2 = str + ".text";
        int i17 = 0;
        java.lang.String str3 = str2;
        while (true) {
            if (i17 > 0) {
                str3 = str2 + i17;
            }
            if (!map.containsKey(str3)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRollTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdRollInfo");
                return arrayList;
            }
            java.lang.String str4 = (java.lang.String) map.get(str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                arrayList.add(str4);
            }
            i17++;
        }
    }
}
