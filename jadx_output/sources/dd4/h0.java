package dd4;

/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f229007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(int i17, int i18) {
        super(1);
        this.f229006d = i17;
        this.f229007e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onError$1");
        ok4.d report = (ok4.d) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onError$1");
        kotlin.jvm.internal.o.g(report, "$this$report");
        report.onError(this.f229006d, this.f229007e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onError$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onError$1");
        return f0Var;
    }
}
