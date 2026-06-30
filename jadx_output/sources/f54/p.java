package f54;

/* loaded from: classes4.dex */
public class p extends ab4.d0 {
    public java.lang.String F;
    public ab4.g G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f259734J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public float P;
    public final f54.o[] Q = new f54.o[4];

    @za4.k1(resType = 2)
    public java.lang.String hbImgUrl;

    @za4.k1(resType = 2)
    public java.lang.String shareThumbUrl;

    public static f54.p b(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        try {
            f54.p pVar = new f54.p();
            java.lang.String str2 = (java.lang.String) map.get(str + ".hbImgUrl");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            pVar.hbImgUrl = str2;
            ab4.d0 i28 = za4.z0.i(map, str + ".componentItem", i17, i18, i19, i27);
            if (i28 instanceof ab4.g) {
                i28.f2820g = 0.0f;
                i28.f2819f = 0.0f;
                i28.f2821h = 0.0f;
                i28.f2822i = 0.0f;
                pVar.G = (ab4.g) i28;
            }
            java.lang.String str3 = (java.lang.String) map.get(str + ".title");
            if (str3 == null) {
                str3 = "";
            }
            pVar.H = str3;
            java.lang.String str4 = (java.lang.String) map.get(str + ".shareTitle");
            if (str4 == null) {
                str4 = "";
            }
            pVar.L = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".shareThumbUrl");
            if (str5 == null) {
                str5 = "";
            }
            pVar.shareThumbUrl = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".jumpUrl");
            if (str6 == null) {
                str6 = "";
            }
            pVar.K = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".inviteLinkTxt");
            if (str7 == null) {
                str7 = "";
            }
            pVar.I = str7;
            java.lang.String str8 = (java.lang.String) map.get(str + ".inviteLinkTxtColor");
            if (str8 == null) {
                str8 = "";
            }
            java.lang.String str9 = (java.lang.String) map.get(str + ".inviteLinkTxtColorAlpha");
            if (str9 == null) {
                str9 = "";
            }
            pVar.f259734J = ca4.m0.q0(str8, str9);
            java.lang.String str10 = (java.lang.String) map.get(str + ".btnTxtColor");
            if (str10 == null) {
                str10 = "";
            }
            java.lang.String str11 = (java.lang.String) map.get(str + ".btnTxtColorAlpha");
            if (str11 == null) {
                str11 = "";
            }
            java.lang.String q07 = ca4.m0.q0(str10, str11);
            pVar.M = q07;
            if (android.text.TextUtils.isEmpty(q07)) {
                pVar.M = "#FFFFFF";
            }
            java.lang.String str12 = (java.lang.String) map.get(str + ".btnBgColor");
            if (str12 == null) {
                str12 = "";
            }
            java.lang.String str13 = (java.lang.String) map.get(str + ".btnBgColorAlpha");
            if (str13 == null) {
                str13 = "";
            }
            java.lang.String q08 = ca4.m0.q0(str12, str13);
            pVar.N = q08;
            if (android.text.TextUtils.isEmpty(q08)) {
                pVar.N = "#FA5151";
            }
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".btnCornerRadius"), 0);
            if (D1 <= 0) {
                D1 = 8;
            }
            pVar.P = za4.z0.o(D1, 1, i18, i19);
            int i29 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(".item");
                sb6.append(i29 == 0 ? "" : java.lang.Integer.valueOf(i29));
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
                    return pVar;
                }
                int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(sb7 + ".subType"), 0);
                if (D12 >= 1 && D12 <= 4) {
                    pVar.Q[D12 - 1] = c(map, sb7);
                }
                i29++;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageComponentInfo", "parse, exp=" + th6.toString());
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageComponentInfo", "parse, null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            return null;
        }
    }

    public static f54.o c(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
        try {
            f54.o oVar = new f54.o();
            if (com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".subType"), 0) != 3) {
                java.lang.String str2 = (java.lang.String) map.get(str + ".headline");
                if (str2 == null) {
                    str2 = "";
                }
                oVar.f259725a = str2;
                java.lang.String str3 = (java.lang.String) map.get(str + ".desc");
                if (str3 == null) {
                    str3 = "";
                }
                oVar.f259726b = str3;
                java.lang.String str4 = (java.lang.String) map.get(str + ".decorationTitle");
                if (str4 == null) {
                    str4 = "";
                }
                oVar.f259727c = str4;
                java.lang.String str5 = (java.lang.String) map.get(str + ".btnTitle");
                if (str5 == null) {
                    str5 = "";
                }
                oVar.f259728d = str5;
                java.lang.String str6 = (java.lang.String) map.get(str + ".btnTitleExpired");
                if (str6 == null) {
                    str6 = "";
                }
                oVar.f259729e = str6;
                java.lang.String str7 = (java.lang.String) map.get(str + ".btnTitleGetByOther");
                if (str7 == null) {
                    str7 = "";
                }
                oVar.f259730f = str7;
                oVar.f259731g = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".expireTime"), 0);
            }
            int i17 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(".item");
                sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
                    return oVar;
                }
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(sb7 + ".subType"), 0);
                if (D1 == 1) {
                    oVar.f259732h = c(map, sb7);
                } else if (D1 == 2) {
                    oVar.f259733i = c(map, sb7);
                }
                i17++;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageComponentInfo", "parseHBCardInfo, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseHBCardInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHBCardCompInfo");
            return null;
        }
    }
}
