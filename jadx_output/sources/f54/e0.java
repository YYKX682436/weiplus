package f54;

/* loaded from: classes4.dex */
public final class e0 extends ab4.u {
    public final java.lang.String A1;
    public final java.lang.String B1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.String f259718z1;

    public e0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f259718z1 = str;
        this.A1 = str2;
        this.B1 = str3;
    }

    public static final f54.e0 b(java.util.Map map, java.lang.String str) {
        f54.e0 e0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo$Companion");
        if (!(map == null || map.isEmpty())) {
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = str + ".redEnvelopesSkinInfo";
                java.lang.String str3 = (java.lang.String) map.get(str2 + ".receiveUri");
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = (java.lang.String) map.get(str2 + ".extInfo");
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = (java.lang.String) map.get(str2 + ".scene");
                e0Var = new f54.e0(str3, str4, str5 != null ? str5 : "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
                return e0Var;
            }
        }
        com.tencent.mars.xlog.Log.e("SnsAd.RedPkgUrlBtnInfo", "the config map or component str is empty, Please check!");
        e0Var = new f54.e0("", "", "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        return e0Var;
    }
}
