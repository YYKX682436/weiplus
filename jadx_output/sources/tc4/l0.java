package tc4;

/* loaded from: classes4.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.n0 f417395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(tc4.n0 n0Var) {
        super(0);
        this.f417395d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$videoPlayerContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$videoPlayerContainer$2");
        android.view.View T = tc4.n0.T(this.f417395d);
        android.widget.FrameLayout frameLayout = T != null ? (android.widget.FrameLayout) T.findViewById(com.tencent.mm.R.id.s_h) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$videoPlayerContainer$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem$videoPlayerContainer$2");
        return frameLayout;
    }
}
