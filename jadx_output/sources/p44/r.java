package p44;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f351835a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f351836b;

    /* renamed from: c, reason: collision with root package name */
    public int f351837c;

    @za4.k1
    public p44.u cardInfo;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351838d;

    /* renamed from: e, reason: collision with root package name */
    public int f351839e;

    /* renamed from: f, reason: collision with root package name */
    public int f351840f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f351841g;

    /* renamed from: h, reason: collision with root package name */
    public int f351842h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f351843i;

    /* renamed from: j, reason: collision with root package name */
    public int f351844j;

    /* renamed from: k, reason: collision with root package name */
    public int f351845k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f351846l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f351847m = "";

    @za4.k1(flag = 4, resType = 2)
    public java.lang.String titleIconUrl;

    public static final p44.r c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
        p44.r rVar = null;
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
        } else if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
        } else {
            p44.r rVar2 = new p44.r();
            java.lang.String str2 = (java.lang.String) map.get(str.concat(".title"));
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351835a = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str3 = (java.lang.String) map.get(str.concat(".introduceTitle"));
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351836b = str3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str4 = (java.lang.String) map.get(str.concat(".titleIconUrl"));
            if (str4 == null) {
                str4 = "";
            }
            rVar2.titleIconUrl = str4;
            java.lang.String str5 = (java.lang.String) map.get(str.concat(".titleColor"));
            if (str5 == null) {
                str5 = "";
            }
            int e17 = ca4.n0.e(str5, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351837c = e17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str6 = (java.lang.String) map.get(str.concat(".desc"));
            if (str6 == null) {
                str6 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351838d = str6;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str7 = (java.lang.String) map.get(str.concat(".descColor"));
            if (str7 == null) {
                str7 = "";
            }
            int e18 = ca4.n0.e(str7, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351839e = e18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str8 = (java.lang.String) map.get(str.concat(".descColorDark"));
            if (str8 == null) {
                str8 = "";
            }
            int e19 = ca4.n0.e(str8, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351840f = e19;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str9 = (java.lang.String) map.get(str.concat(".doneTitle"));
            if (str9 == null) {
                str9 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDoneTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351841g = str9;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDoneTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str10 = (java.lang.String) map.get(str.concat(".doneTitleColor"));
            if (str10 == null) {
                str10 = "";
            }
            int e27 = ca4.n0.e(str10, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDoneTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351842h = e27;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDoneTitleColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str11 = (java.lang.String) map.get(str.concat(".doneDesc"));
            if (str11 == null) {
                str11 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351843i = str11;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str12 = (java.lang.String) map.get(str.concat(".doneDescColor"));
            if (str12 == null) {
                str12 = "";
            }
            int e28 = ca4.n0.e(str12, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDoneDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351844j = e28;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDoneDescColor", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str13 = (java.lang.String) map.get(str.concat(".doneDescColorDark"));
            if (str13 == null) {
                str13 = "";
            }
            int e29 = ca4.n0.e(str13, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDoneDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351845k = e29;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDoneDescColorDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str14 = (java.lang.String) map.get(str.concat(".numberRequestParams"));
            java.lang.String str15 = str14 != null ? str14 : "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            rVar2.f351846l = str15;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNumberRequestParams", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            p44.u a17 = p44.u.f351853e.a(map, str.concat(".cardsInfo"));
            rVar2.cardInfo = a17;
            java.util.List<p44.s> list = a17 != null ? a17.cardItemList : null;
            if (list == null || list.isEmpty()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo$Companion");
                rVar = rVar2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        return rVar;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        java.lang.String str = this.f351838d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        return str;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        java.lang.String str = this.f351836b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIntroduceTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        return str;
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f351847m = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEggCanvasPageId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
    }
}
