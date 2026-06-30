package s34;

/* loaded from: classes4.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f402824a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402825b;

    @za4.k1(flag = 4, resType = 2)
    public java.lang.String backBorderImage;

    @za4.k1
    public s34.d1 buttonInfo;

    /* renamed from: c, reason: collision with root package name */
    public float f402826c;

    @za4.k1(resType = 5)
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    /* renamed from: d, reason: collision with root package name */
    public int f402827d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jj4 f402828e;

    @za4.k1(flag = 4, resType = 2)
    public java.lang.String frontBorderImage;

    public static s34.d1 b(java.util.Map map, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseButtonInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        s34.d1 d1Var = new s34.d1();
        java.lang.String str2 = (java.lang.String) map.get(str + ".icon");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        d1Var.f402618a = str2;
        java.lang.String str3 = (java.lang.String) map.get(str + ".title");
        d1Var.f402619b = str3 != null ? str3 : "";
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f17 = com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo.f(map, str + ".clickActionInfo");
        d1Var.btnClickActionInfo = f17;
        f17.f162569a = 4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseButtonInfo", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return d1Var;
    }

    public static r45.jj4 c(java.util.Map map, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        r45.jj4 jj4Var = new r45.jj4();
        java.lang.String str2 = (java.lang.String) map.get(str + ".id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        jj4Var.f377855d = "SlideFullCardAd_".concat(str2);
        jj4Var.N = true;
        jj4Var.f377856e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".type"), 0);
        jj4Var.f377873v = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".subtype"), 0);
        java.lang.String str3 = (java.lang.String) map.get(str + ".url");
        if (str3 == null) {
            str3 = "";
        }
        jj4Var.f377858g = str3;
        jj4Var.f377859h = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".url.$type"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".url.$md5");
        if (str4 == null) {
            str4 = "";
        }
        jj4Var.f377878y = str4;
        java.lang.String str5 = (java.lang.String) map.get(str + ".thumb");
        jj4Var.f377860i = str5 != null ? str5 : "";
        jj4Var.f377862m = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".thumb.$type"), 0);
        r45.lj4 lj4Var = new r45.lj4();
        jj4Var.f377865p = lj4Var;
        lj4Var.f379521e = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".size.$height"), 0);
        jj4Var.f377865p.f379520d = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".size.$width"), 0);
        jj4Var.f377865p.f379522f = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".size.$totalSize"), 0);
        jj4Var.Y = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseMediaObj", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return jj4Var;
    }

    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        boolean z17 = this.f402827d == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSight", "com.tencent.mm.plugin.sns.ad.adxml.AdSlideFullCardItemInfo");
        return z17;
    }
}
