package tc4;

/* loaded from: classes4.dex */
public final class c4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc4.k4 f417310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(tc4.k4 k4Var) {
        super(0);
        this.f417310d = k4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
        tc4.k4 k4Var = this.f417310d;
        k4Var.x("MicroMsg.Improve.VideoTimelineItem", "video view remove");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVideoView$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        k4Var.C1 = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVideoView$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoBtn$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        android.view.View view = k4Var.B1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoBtn$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$buildCustomView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/item/VideoImproveTimelineItem$buildCustomView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbImg$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = k4Var.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbImg$p", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem");
        if (maskImageView != null) {
            maskImageView.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.VideoImproveTimelineItem$buildCustomView$1");
        return f0Var;
    }
}
