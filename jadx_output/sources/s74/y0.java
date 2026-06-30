package s74;

/* loaded from: classes4.dex */
public final class y0 implements z74.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s74.z0 f404603a;

    public y0(s74.z0 z0Var) {
        this.f404603a = z0Var;
    }

    @Override // z74.c
    public final void a(android.view.View view, z74.b event, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$videoCallbackListener$1");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$Companion");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the video call back ");
        sb6.append(event);
        sb6.append(", duration: ");
        sb6.append(i17);
        sb6.append(", progress: ");
        sb6.append(i18);
        sb6.append(", component is ");
        s74.z0 z0Var = this.f404603a;
        sb6.append(z0Var.H());
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", sb6.toString());
        s74.o2 H = z0Var.H();
        if (H != null) {
            H.W(event, i17, i18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        boolean z17 = z0Var.f404624z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$hasEndCover", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if (z17 && event == z74.b.f470587g && (view instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView)) {
            ((com.tencent.mm.plugin.sns.ui.OnlineVideoView) view).F();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$videoCallbackListener$1");
    }
}
