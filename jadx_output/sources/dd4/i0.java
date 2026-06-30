package dd4;

/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f229011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f229012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, long j17, long j18) {
        super(1);
        this.f229010d = i17;
        this.f229011e = j17;
        this.f229012f = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$1");
        ok4.d report = (ok4.d) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$1");
        kotlin.jvm.internal.o.g(report, "$this$report");
        report.t(this.f229010d, this.f229011e, this.f229012f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$1");
        return f0Var;
    }
}
