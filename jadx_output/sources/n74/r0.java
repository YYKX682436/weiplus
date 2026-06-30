package n74;

/* loaded from: classes4.dex */
public final class r0 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f335422a;

    public r0(s34.j0 adGamePlayableClickActionInfo, long j17) {
        kotlin.jvm.internal.o.g(adGamePlayableClickActionInfo, "adGamePlayableClickActionInfo");
        this.f335422a = j17;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
        try {
            long j17 = this.f335422a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
            com.tencent.mars.xlog.Log.e("AdWeappPreRenderHelper", "prerender WeApp fail, errCode is " + i17 + ", errMsg is " + str + ", preRenderTimeCost is " + elapsedRealtime);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 18);
            ca4.e0.a("ad_weapp_pre_render", "preRender failed, check error and costTime", i17, (int) elapsedRealtime, str);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWeappPreRenderHelper", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
    }

    @Override // l81.v0
    public void onSuccess() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSuccess", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
        try {
            long j17 = this.f335422a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("AdWeappPreRenderHelper", "prerender WeApp success! preRenderTimeCost is " + (android.os.SystemClock.elapsedRealtime() - j17));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1911, 17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdWeappPreRenderHelper", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSuccess", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$AdPreRenderColdStartResultCallback");
    }
}
