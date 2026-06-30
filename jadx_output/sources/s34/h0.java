package s34;

/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402651a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402652b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f402653c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402654d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f402655e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f402656f;

    public static s34.h0 a(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        if (a84.b0.c(map)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        try {
            java.lang.String str2 = (java.lang.String) map.get(str + ".finderEncryptedTopicId");
            java.lang.String str3 = (java.lang.String) map.get(str + ".finderTopicName");
            if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
                s34.h0 h0Var = new s34.h0();
                h0Var.f402651a = str2;
                h0Var.f402652b = str3;
                java.lang.String str4 = (java.lang.String) map.get(str + ".finderTopicTitle");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                h0Var.f402653c = str4;
                java.lang.String str6 = (java.lang.String) map.get(str + ".relationText");
                if (str6 != null) {
                    str5 = str6;
                }
                h0Var.f402654d = str5;
                h0Var.f402655e = c(map, str + ".relationAvatarList");
                h0Var.f402656f = b(map, str + ".finderTopicResList");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
                return h0Var;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
    }

    public static java.util.List b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        s34.i0 b17 = s34.i0.b(map, str + ".finderTopicResInfo");
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        arrayList.add(b17);
        for (int i17 = 1; i17 < 5; i17++) {
            s34.i0 b18 = s34.i0.b(map, str + ".finderTopicResInfo" + i17);
            if (b18 == null) {
                break;
            }
            arrayList.add(b18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFinderTopicResInfoList", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        return arrayList;
    }

    public static java.util.List c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        java.lang.String str2 = (java.lang.String) map.get(str + ".avatar");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        arrayList.add(str2);
        int i17 = 1;
        while (true) {
            if (android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get(str + ".avatar" + i17)) || i17 >= 10) {
                break;
            }
            arrayList.add((java.lang.String) map.get(str + ".avatar" + i17));
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseRelationAvatar", "com.tencent.mm.plugin.sns.ad.adxml.AdFinderTopicInfo");
        return arrayList;
    }
}
