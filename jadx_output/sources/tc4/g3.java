package tc4;

/* loaded from: classes4.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.h3 f417341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(tc4.h3 h3Var) {
        super(0);
        this.f417341d = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        android.view.View view = this.f417341d.f417357x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem");
        com.tencent.mm.plugin.ting.widget.TingCategoryView tingCategoryView = view != null ? (com.tencent.mm.plugin.ting.widget.TingCategoryView) view.findViewById(com.tencent.mm.R.id.o9e) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicTingCategoryImproveTimelineItem$tingCategoryView$2");
        return tingCategoryView;
    }
}
