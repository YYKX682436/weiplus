package tc4;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tc4.a0 a0Var) {
        super(0);
        this.f417411d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveLongFeedTip$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveLongFeedTip$2");
        android.view.View T = tc4.a0.T(this.f417411d);
        android.widget.TextView textView = T != null ? (android.widget.TextView) T.findViewById(com.tencent.mm.R.id.f484706f80) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveLongFeedTip$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLiveLongFeedTip$2");
        return textView;
    }
}
