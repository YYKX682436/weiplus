package tc4;

/* loaded from: classes4.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.c3 f417530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(tc4.c3 c3Var) {
        super(0);
        this.f417530d = c3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        android.view.View view = this.f417530d.f417307x1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getConvertView$p", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem");
        com.tencent.mm.plugin.ting.widget.MusicView musicView = view != null ? (com.tencent.mm.plugin.ting.widget.MusicView) view.findViewById(com.tencent.mm.R.id.qap) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.MusicImproveTimelineItem$musicView$2");
        return musicView;
    }
}
