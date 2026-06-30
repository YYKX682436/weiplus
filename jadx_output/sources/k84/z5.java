package k84;

/* loaded from: classes4.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f305367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(long j17, k84.c6 c6Var) {
        super(0);
        this.f305367d = j17;
        this.f305368e = c6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f305367d);
        k84.c6 c6Var = this.f305368e;
        com.tencent.mars.xlog.Log.i(c6Var.j(), "onBackPressListener click! timeInterval is " + abs);
        float f18 = (float) abs;
        mb4.a z17 = k84.c6.z(c6Var);
        if (z17 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
            f17 = z17.f325361f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
        } else {
            f17 = 0.0f;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!(f18 > f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$startFullScreenPag$4");
        return valueOf;
    }
}
