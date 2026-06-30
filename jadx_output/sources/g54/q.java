package g54;

/* loaded from: classes15.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.c f268948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView f268949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kk4.c cVar, com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView) {
        super(0);
        this.f268948d = cVar;
        this.f268949e = adThumbPlayerVideoView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$release$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$release$1");
        this.f268948d.release();
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.n(this.f268949e), "Player instance has been released");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$release$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$release$1");
        return f0Var;
    }
}
