package tc4;

/* loaded from: classes4.dex */
public final class i4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.k4 f417371d;

    public i4(tc4.k4 k4Var) {
        this.f417371d = k4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoContainer$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout improveVideoFrameLayout = this.f417371d.f417393z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoContainer$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        if (improveVideoFrameLayout != null) {
            improveVideoFrameLayout.performLongClick();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$onBindViewHolder$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$onBindViewHolder$4");
        return true;
    }
}
