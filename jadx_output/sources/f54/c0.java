package f54;

/* loaded from: classes4.dex */
public final class c0 extends ab4.u implements java.io.Serializable {
    public final java.lang.String A1;
    public final java.lang.String B1;
    public final java.lang.String C1;
    public final java.lang.String D1;
    public final java.lang.String E1;
    public final java.lang.String F1;
    public final java.lang.String G1;
    public final java.lang.String H1;
    public final long I1;
    public final java.lang.String J1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.String f259702z1;

    public c0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, long j17, java.lang.String str11) {
        this.f259702z1 = str;
        this.A1 = str2;
        this.B1 = str4;
        this.C1 = str5;
        this.D1 = str6;
        this.E1 = str7;
        this.F1 = str8;
        this.G1 = str9;
        this.H1 = str10;
        this.I1 = j17;
        this.J1 = str11;
    }

    public static final f54.c0 b(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        f54.c0 c0Var;
        java.lang.Long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo$Companion");
        if (!(map == null || map.isEmpty())) {
            if (!(str == null || str.length() == 0)) {
                java.lang.String str4 = (java.lang.String) map.get(str + ".imageUrl");
                java.lang.String str5 = str4 == null ? "" : str4;
                java.lang.String str6 = (java.lang.String) map.get(str + ".videoUrl");
                java.lang.String str7 = str6 == null ? "" : str6;
                java.lang.String str8 = (java.lang.String) map.get(str + ".videoMd5");
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.String str10 = (java.lang.String) map.get(str + ".iconId");
                java.lang.String str11 = str10 == null ? "" : str10;
                java.lang.String str12 = (java.lang.String) map.get(str + ".customIconDescription");
                java.lang.String str13 = str12 == null ? "" : str12;
                java.lang.String str14 = (java.lang.String) map.get(str + ".desc");
                java.lang.String str15 = str14 == null ? "" : str14;
                java.lang.String str16 = (java.lang.String) map.get(str + ".sourceFooterData");
                if (str16 == null) {
                    str16 = "";
                }
                java.lang.String str17 = (java.lang.String) map.get(str + ".sourceVerifyInfo");
                if (str17 == null) {
                    str17 = "";
                }
                java.lang.String str18 = (java.lang.String) map.get(str + ".emoticonUrl");
                if (str18 == null) {
                    str18 = "";
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo";
                sb6.append(".emoticonMd5");
                java.lang.String str19 = (java.lang.String) map.get(sb6.toString());
                if (str19 == null) {
                    str19 = "";
                }
                java.lang.String str20 = (java.lang.String) map.get(str + ".expiredTime");
                long longValue = (str20 == null || (j17 = r26.h0.j(str20)) == null) ? 0L : j17.longValue();
                java.lang.String str21 = (java.lang.String) map.get(str + ".expiredToast");
                if (str21 == null) {
                    str21 = "";
                }
                com.tencent.mars.xlog.Log.i("SnsAd.AdLandingPageJumpTextStatusBtnInfo", "imageUrl is " + str5 + ", videoUrl is " + str7 + ", videoMd5 is " + str9 + ", iconId is " + str11 + ", desc is " + str15 + ", sourceFooterData is " + str16 + ", sourceVerifyInfo is " + str17 + ", emoticonUrl is " + str18 + ", emoticonMd5 is " + str19 + ", expiredTime is " + longValue + ", expiredToast is " + str21);
                c0Var = new f54.c0(str5, str7, str9, str11, str13, str15, str16, str17, str18, str19, longValue, str21);
                str2 = "parse";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
                return c0Var;
            }
        }
        str2 = "parse";
        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo";
        com.tencent.mars.xlog.Log.e("SnsAd.AdLandingPageJumpTextStatusBtnInfo", "the config map or component str is empty, Please check!");
        c0Var = new f54.c0(null, null, null, null, null, null, null, null, null, null, 0L, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
        return c0Var;
    }
}
