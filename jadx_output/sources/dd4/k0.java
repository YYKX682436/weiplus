package dd4;

/* loaded from: classes4.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f229017d;

    public k0(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView) {
        this.f229017d = flexibleVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$4");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.f169220J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f229017d;
        flexibleVideoView.A = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showLoading", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        flexibleVideoView.f169226i.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showLoading", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$4");
    }
}
