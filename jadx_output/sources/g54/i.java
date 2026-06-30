package g54;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f268933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f268934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, int i18) {
        super(1);
        this.f268933d = i17;
        this.f268934e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners$onError$1");
        ok4.d report = (ok4.d) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners$onError$1");
        kotlin.jvm.internal.o.g(report, "$this$report");
        report.onError(this.f268933d, this.f268934e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners$onError$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners$onError$1");
        return f0Var;
    }
}
