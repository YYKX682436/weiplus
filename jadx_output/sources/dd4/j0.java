package dd4;

/* loaded from: classes4.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f229014d;

    public j0(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView) {
        this.f229014d = flexibleVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$2");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.f169220J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbImg$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f229014d.f169224g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbImg$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        maskImageView.setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$onInfo$2");
    }
}
