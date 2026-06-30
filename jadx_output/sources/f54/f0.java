package f54;

/* loaded from: classes4.dex */
public class f0 extends ab4.d0 {
    public java.lang.String F;

    public static f54.f0 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
        try {
            f54.f0 f0Var = new f54.f0();
            java.lang.String str2 = "#F2F2F2";
            if (map.containsKey(str + ".bgColor")) {
                java.lang.String str3 = (java.lang.String) map.get(str + ".bgColor");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    str2 = str3;
                }
                f0Var.F = str2;
            } else {
                f0Var.F = "#F2F2F2";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
            return f0Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingSeparatorCompInfo", "parse, exp is " + th6);
            com.tencent.mars.xlog.Log.e("AdLandingSeparatorCompInfo", "parse, null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSeparatorCompInfo");
            return null;
        }
    }
}
