package f54;

/* loaded from: classes4.dex */
public class a0 extends ab4.d0 {
    public java.lang.String F = "";
    public java.lang.String G = "";
    public int H = 0;

    public static f54.a0 b(java.util.Map map, java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMBInfo");
        com.tencent.mars.xlog.Log.i("AdLandingMBInfo", "create a mb info from xml");
        f54.a0 a0Var = new f54.a0();
        java.lang.String str2 = (java.lang.String) map.get(str + ".dsl");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        a0Var.G = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".frameSetName");
        a0Var.F = str3 != null ? str3 : "";
        a0Var.H = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".fullScreen"), 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingMBInfo");
        return a0Var;
    }
}
