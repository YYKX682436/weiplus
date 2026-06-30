package tc4;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f417289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(zy2.g5 g5Var, tc4.n0 n0Var) {
        super(0);
        this.f417289d = g5Var;
        this.f417290e = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$asyncReleasePlayer$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$asyncReleasePlayer$1");
        zy2.g5 g5Var = this.f417289d;
        if (g5Var != null) {
            g5Var.d();
        }
        if (g5Var != null) {
            g5Var.b();
        }
        this.f417290e.x("MicroMsg.Improve.FinderMediaTimelineItem", "asyncReleasePlayer " + g5Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$asyncReleasePlayer$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$asyncReleasePlayer$1");
        return f0Var;
    }
}
