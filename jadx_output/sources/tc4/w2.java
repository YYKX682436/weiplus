package tc4;

/* loaded from: classes4.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.c3 f417504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(tc4.c3 c3Var) {
        super(0);
        this.f417504d = c3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicMvRoot$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicMvRoot$2");
        com.tencent.mm.plugin.ting.widget.MusicView Q = tc4.c3.Q(this.f417504d);
        android.view.View musicContainer = Q != null ? Q.getMusicContainer() : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicMvRoot$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicMvRoot$2");
        return musicContainer;
    }
}
