package tc4;

/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tc4.a0 a0Var) {
        super(0);
        this.f417445d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
        android.view.View U = tc4.a0.U(this.f417445d);
        android.widget.TextView textView = U != null ? (android.widget.TextView) U.findViewById(com.tencent.mm.R.id.frn) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$finderLivingUITip$2");
        return textView;
    }
}
