package tc4;

/* loaded from: classes4.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.k4 f417360d;

    public h4(tc4.k4 k4Var) {
        this.f417360d = k4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoContainer$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout = this.f417360d.f417393z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoContainer$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$3");
    }
}
