package f54;

/* loaded from: classes4.dex */
public final class v extends ab4.d0 {
    public static final f54.s Q = new f54.s(null);
    public final f54.u F = new f54.u();
    public final f54.t G = new f54.t();
    public final java.util.List H = new java.util.ArrayList();
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public int f259755J;
    public int K;
    public java.lang.String L;
    public java.util.List M;
    public java.util.List N;
    public boolean P;

    public static final f54.v e(java.util.Map map, java.lang.String str, int i17, int i18, int i19, int i27) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        f54.s sVar = Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        f54.v vVar = new f54.v();
        if (map == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        } else {
            if (str != null) {
                try {
                    f54.u b17 = vVar.b();
                    java.lang.String str6 = (java.lang.String) map.get(str.concat(".rotateAnimInfo.animationImg"));
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str6 == null) {
                        str6 = "";
                    }
                    b17.getClass();
                    str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion";
                    try {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b17.f259751a = str6;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAnimImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        java.lang.String str7 = (java.lang.String) map.get(str.concat(".rotateAnimInfo.animationColor"));
                        if (str7 == null) {
                            str7 = "";
                        }
                        java.lang.String str8 = (java.lang.String) map.get(str.concat(".rotateAnimInfo.animationColorAlpha"));
                        if (str8 == null) {
                            str8 = "";
                        }
                        f54.u b18 = vVar.b();
                        java.lang.String q07 = ca4.m0.q0(str7, str8);
                        kotlin.jvm.internal.o.f(q07, "parseColor(...)");
                        b18.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b18.f259752b = q07;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        f54.u b19 = vVar.b();
                        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str.concat(".rotateAnimInfo.imgWidth")), 0);
                        b19.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImgWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b19.f259753c = D1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImgWidth", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        f54.u b27 = vVar.b();
                        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str.concat(".rotateAnimInfo.imgHeight")), 0);
                        b27.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImgHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        b27.f259754d = D12;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImgHeight", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$RotateAnimInfo");
                        f54.t d17 = vVar.d();
                        java.lang.String str9 = (java.lang.String) map.get(str.concat(".preAnimInfo.cardImg"));
                        if (str9 == null) {
                            str9 = "";
                        }
                        d17.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        d17.f259748a = str9;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardImgUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        f54.t d18 = vVar.d();
                        java.lang.String str10 = (java.lang.String) map.get(str.concat(".preAnimInfo.title"));
                        if (str10 == null) {
                            str10 = "";
                        }
                        d18.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        d18.f259749b = str10;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        f54.t d19 = vVar.d();
                        java.lang.String str11 = (java.lang.String) map.get(str.concat(".preAnimInfo.subTitle"));
                        if (str11 == null) {
                            str11 = "";
                        }
                        d19.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        d19.f259750c = str11;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$PreAnimInfo");
                        str5 = (java.lang.String) map.get(str.concat(".backgroundImg"));
                        if (str5 == null) {
                            str5 = "";
                        }
                        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo";
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo";
                        com.tencent.mars.xlog.Log.e("AdLandingHalfEggCardContainerInfo", "parseFromXml exp=" + e);
                        str4 = "parseFromXml";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
                        return vVar;
                    }
                    try {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundImgUrl", str3);
                        vVar.I = str5;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundImgUrl", str3);
                        int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str.concat(".backgroundImgWidth")), 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundImgW", str3);
                        vVar.f259755J = D13;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundImgW", str3);
                        int D14 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str.concat(".backgroundImgHeight")), 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundImgH", str3);
                        vVar.K = D14;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundImgH", str3);
                        java.lang.String str12 = (java.lang.String) map.get(str.concat(".bulletCommentsTitle"));
                        if (str12 == null) {
                            str12 = "";
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBulletCommentsTitle", str3);
                        vVar.L = str12;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBulletCommentsTitle", str3);
                        java.util.List a17 = sVar.a(map, str.concat(".positiveBulletComments"));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPositiveBulletCommentList", str3);
                        vVar.M = a17;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPositiveBulletCommentList", str3);
                        java.util.List a18 = sVar.a(map, str.concat(".negativeBulletComments"));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNegativeBulletCommentList", str3);
                        vVar.N = a18;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNegativeBulletCommentList", str3);
                        int i28 = 0;
                        while (true) {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str);
                            sb6.append(".items.item");
                            sb6.append(i28 == 0 ? "" : java.lang.Integer.valueOf(i28));
                            f54.r a19 = f54.r.f259735m.a(map, sb6.toString(), i17, i18, i19, i27);
                            if (a19 == null) {
                                break;
                            }
                            ((java.util.ArrayList) vVar.c()).add(a19);
                            if (a19.d()) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSupportRepeatPick", str3);
                                vVar.P = true;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSupportRepeatPick", str3);
                            }
                            i28++;
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.e("AdLandingHalfEggCardContainerInfo", "parseFromXml exp=" + e);
                        str4 = "parseFromXml";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str2);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
                        return vVar;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    str2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion";
                }
                str4 = "parseFromXml";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
                return vVar;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$Companion");
        }
        str4 = "parseFromXml";
        str3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str4, str3);
        return vVar;
    }

    public final f54.u b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return this.F;
    }

    public final java.util.List c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardInfoList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        java.util.List list = this.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardInfoList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return list;
    }

    public final f54.t d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreAnimInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        return this.G;
    }
}
