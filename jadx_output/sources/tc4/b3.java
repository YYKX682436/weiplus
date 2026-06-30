package tc4;

/* loaded from: classes4.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.c3 f417295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(tc4.c3 c3Var) {
        super(0);
        this.f417295d = c3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$root$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$root$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.View view = this.f417295d.f417307x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.ViewGroup viewGroup = view != null ? (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.n96) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$root$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$root$2");
        return viewGroup;
    }
}
