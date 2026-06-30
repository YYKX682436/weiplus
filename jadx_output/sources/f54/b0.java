package f54;

/* loaded from: classes4.dex */
public class b0 extends ab4.d0 {
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f259700J;
    public float K;
    public int N;
    public int P;
    public int Q;

    @za4.k1(resType = 2)
    public java.lang.String coverUrl;
    public int F = 0;
    public int L = 0;
    public float M = 0.0f;

    public static f54.b0 b(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMusicComponentInfo");
        try {
            f54.b0 b0Var = new f54.b0();
            b0Var.F = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".displayType"), 0);
            java.lang.String str2 = (java.lang.String) map.get(str + ".musicInfo.voiceUrl");
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            b0Var.G = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".musicInfo.coverUrl");
            if (str4 == null) {
                str4 = "";
            }
            b0Var.coverUrl = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".musicInfo.title");
            if (str5 == null) {
                str5 = "";
            }
            b0Var.H = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".musicInfo.subTitle");
            if (str6 == null) {
                str6 = "";
            }
            b0Var.I = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".musicInfo.bgColor");
            if (str7 != null) {
                str3 = str7;
            }
            b0Var.f259700J = str3;
            b0Var.K = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(str + ".musicInfo.bgColorAlpha"), 1.0f);
            b0Var.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".musicInfo.isDarkColor"), 0);
            b0Var.M = com.tencent.mm.sdk.platformtools.t8.L((java.lang.String) map.get(str + ".musicInfo.musicDuration"), 0.0f);
            b0Var.N = i17;
            b0Var.Q = i19;
            b0Var.P = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMusicComponentInfo");
            return b0Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingMusicComponentInfo", "parse, exp=" + th6.toString());
            com.tencent.mars.xlog.Log.e("AdLandingMusicComponentInfo", "parse, null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMusicComponentInfo");
            return null;
        }
    }
}
