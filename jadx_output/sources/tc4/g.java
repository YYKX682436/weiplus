package tc4;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f417335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f417336f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f417337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tc4.a0 a0Var, r45.g92 g92Var, java.lang.Object obj, int i17) {
        super(0);
        this.f417334d = a0Var;
        this.f417335e = g92Var;
        this.f417336f = obj;
        this.f417337g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
        tc4.a0 a0Var = this.f417334d;
        a0Var.x("MicroMsg.Improve.FinderLiveTimelineItem", "checkLiveStatus --> updateLiveTag");
        java.lang.Object obj = this.f417336f;
        r45.l71 l71Var = obj instanceof r45.l71 ? (r45.l71) obj : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        a0Var.e0(this.f417335e, l71Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateLiveTag", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getShouldPlayLive$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        boolean z17 = a0Var.O1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getShouldPlayLive$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
        int i17 = this.f417337g;
        if (z17 && i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayPos$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            int i18 = a0Var.N1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayPos$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
            a0Var.c(null, i18);
        } else if (i17 == 2) {
            a0Var.stop();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$checkLiveStatus$2$statusCallBack$1$onLiveStatusCallback$3");
        return f0Var;
    }
}
