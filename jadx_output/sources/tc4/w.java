package tc4;

/* loaded from: classes4.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f417494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417496g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tc4.a0 a0Var, r45.nw1 nw1Var, int i17, r45.g92 g92Var) {
        super(0);
        this.f417493d = a0Var;
        this.f417494e = nw1Var;
        this.f417495f = i17;
        this.f417496g = g92Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        r45.g92 g92Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$2$1");
        java.lang.String str = "onLiveFinish: update ui, liveId=" + this.f417494e.getLong(0) + ", position=" + this.f417495f + ", feedId=" + this.f417496g.getString(2);
        tc4.a0 a0Var = this.f417493d;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", str);
        zc4.b data = a0Var.getData();
        if (data != null && (n17 = data.n()) != null && (h17 = n17.h1()) != null && (a90Var = h17.ContentObj) != null && (g92Var = a90Var.f369848s) != null) {
            g92Var.set(13, 2);
            r45.nw1 nw1Var = (r45.nw1) g92Var.getCustom(24);
            if (nw1Var != null) {
                nw1Var.set(2, 2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLiveTag$default", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            a0Var.e0(g92Var, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLiveTag$default", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.d0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopAutoPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$play$2$2$1");
        return f0Var;
    }
}
