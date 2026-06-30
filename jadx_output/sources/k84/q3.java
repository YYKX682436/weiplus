package k84;

/* loaded from: classes3.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f305210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305211f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(k84.d4 d4Var, long j17, mb4.r rVar) {
        super(0);
        this.f305209d = d4Var;
        this.f305210e = j17;
        this.f305211f = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$3");
        com.tencent.mars.xlog.Log.i(this.f305209d.j(), "onBackPressListener click!");
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f305210e);
        mb4.r rVar = this.f305211f;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        float f17 = rVar.f325468o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullScreenCanCloseDelayTime", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!(abs > ((long) ((int) f17))));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startFullScreenPag$3");
        return valueOf;
    }
}
