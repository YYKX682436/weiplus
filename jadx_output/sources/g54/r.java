package g54;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f268951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, double d17) {
        super(1);
        this.f268950d = i17;
        this.f268951e = d17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$seekTo$1");
        ok4.d report = (ok4.d) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$seekTo$1");
        kotlin.jvm.internal.o.g(report, "$this$report");
        report.g(this.f268950d, (int) this.f268951e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$seekTo$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$seekTo$1");
        return f0Var;
    }
}
