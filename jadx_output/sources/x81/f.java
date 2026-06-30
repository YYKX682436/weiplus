package x81;

/* loaded from: classes8.dex */
public abstract class f extends com.tencent.mm.modelbase.i {
    public f(int i17, long j17, long j18, com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj appBrandRecommendStatObj) {
        p(s(i17, j17, j18, appBrandRecommendStatObj).a());
    }

    public static com.tencent.mm.modelbase.l s(int i17, long j17, long j18, com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj appBrandRecommendStatObj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "clickType:%d, page_stay_time:%d, app_stay_time:%d, recommendStatObj:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), appBrandRecommendStatObj.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ki5 ki5Var = new r45.ki5();
        r45.vk5 vk5Var = new r45.vk5();
        r45.sk5 sk5Var = new r45.sk5();
        vk5Var.f388324d = appBrandRecommendStatObj.f87787r;
        r45.k40 k40Var = new r45.k40();
        k40Var.f378353d = com.tencent.mars.comm.NetStatusUtil.getNetTypeString(com.tencent.mm.sdk.platformtools.x2.f193071a);
        k40Var.f378354e = appBrandRecommendStatObj.f87785p;
        k40Var.f378355f = appBrandRecommendStatObj.f87786q;
        ki5Var.f378723d = vk5Var;
        ki5Var.f378724e = sk5Var;
        sk5Var.f385815d = i17;
        int i18 = appBrandRecommendStatObj.f87784o;
        java.lang.String str = appBrandRecommendStatObj.f87783n;
        java.lang.String str2 = appBrandRecommendStatObj.f87779g;
        java.lang.String str3 = appBrandRecommendStatObj.f87778f;
        java.lang.String str4 = appBrandRecommendStatObj.f87776d;
        if (i17 == 1) {
            r45.y35 y35Var = new r45.y35();
            y35Var.f390750d = str4;
            y35Var.f390751e = appBrandRecommendStatObj.f87777e;
            y35Var.f390752f = "" + java.lang.System.currentTimeMillis();
            y35Var.f390753g = str3;
            y35Var.f390754h = str2;
            y35Var.f390755i = str;
            y35Var.f390756m = i18;
            y35Var.f390757n = (int) j17;
            y35Var.f390758o = (int) j18;
            sk5Var.f385816e = y35Var;
        } else {
            r45.r8 r8Var = new r45.r8();
            r8Var.f384601d = str4;
            r8Var.f384602e = "" + java.lang.System.currentTimeMillis();
            r8Var.f384603f = str3;
            r8Var.f384604g = str2;
            r8Var.f384605h = str;
            r8Var.f384606i = i18;
            r8Var.f384607m = (int) j18;
            sk5Var.f385817f = r8Var;
        }
        lVar.f70664a = ki5Var;
        lVar.f70665b = new r45.li5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/rtreportrecommdclick";
        lVar.f70667d = 2799;
        return lVar;
    }
}
