package tc4;

/* loaded from: classes4.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.h3 f417333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(tc4.h3 h3Var) {
        super(0);
        this.f417333d = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryRoot$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryRoot$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View view = this.f417333d.f417357x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.n96) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryRoot$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryRoot$2");
        return findViewById;
    }
}
