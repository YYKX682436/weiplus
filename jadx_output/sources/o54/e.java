package o54;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {
    public e(o54.f fVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder$1");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                o54.g.a(1676L, 9L);
                com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "network wifi");
            } else if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
                o54.g.a(1676L, 10L);
                com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "network 5G");
            } else if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
                o54.g.a(1676L, 11L);
                com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "network 4G");
            } else {
                o54.g.a(1676L, 12L);
                com.tencent.mars.xlog.Log.i("AdLandingPageStaticHelper", "network other");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageStaticHelper", "reportEnterNetWorkType, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder$1");
    }
}
