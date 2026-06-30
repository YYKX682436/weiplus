package s34;

/* loaded from: classes4.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f402599a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f402600b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f402601c;

    @za4.k1(resType = 5)
    private final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    @za4.k1(resType = 2)
    private final java.lang.String clickIcon;

    @za4.k1(resType = 2)
    private final java.lang.String clickIconDark;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f402602d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f402603e;

    public c1(java.lang.String str, java.lang.String descText, java.lang.String clickText, java.lang.String clickTextColor, java.lang.String str2, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(descText, "descText");
        kotlin.jvm.internal.o.g(clickText, "clickText");
        kotlin.jvm.internal.o.g(clickTextColor, "clickTextColor");
        this.f402599a = str;
        this.f402600b = descText;
        this.f402601c = clickText;
        this.f402602d = clickTextColor;
        this.f402603e = str2;
        this.clickActionInfo = adClickActionInfo;
        this.clickIcon = str3;
        this.clickIconDark = str4;
    }

    public static final s34.c1 d(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        s34.c1 c1Var = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        } else {
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = map.containsKey(str.concat(".clickActionInfo")) ? com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str.concat(".clickActionInfo")) : null;
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".icon"));
            java.lang.String str3 = str2 == null ? "" : str2;
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".descText"));
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".clickText"));
            java.lang.String str7 = str6 == null ? "" : str6;
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".clickTextColor"));
            java.lang.String str9 = str8 == null ? "" : str8;
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".clickTextColorDark"));
            java.lang.String str11 = str10 == null ? "" : str10;
            java.lang.String str12 = (java.lang.String) map.get(str.concat(".clickIconLight"));
            java.lang.String str13 = str12 == null ? "" : str12;
            java.lang.String str14 = (java.lang.String) map.get(str.concat(".clickIconDark"));
            if (str14 == null) {
                str14 = "";
            }
            s34.c1 c1Var2 = new s34.c1(str3, str5, str7, str9, str11, f17, str13, str14);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDescText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDescText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
            if (!r26.n0.N(c1Var2.f402600b)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickText", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                if (!r26.n0.N(c1Var2.f402601c)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
                    if (!r26.n0.N(c1Var2.f402602d)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
                        c1Var = c1Var2;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo$Companion");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return c1Var;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return adClickActionInfo;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        java.lang.String str = this.clickIcon;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickIcon", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return str;
    }

    public final java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickIconDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        java.lang.String str = this.clickIconDark;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickIconDark", "com.tencent.mm.plugin.sns.ad.adxml.AdWeAppGameGiftTagInfo");
        return str;
    }
}
