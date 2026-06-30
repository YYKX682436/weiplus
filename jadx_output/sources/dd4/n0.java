package dd4;

/* loaded from: classes4.dex */
public final class n0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f229029d;

    public n0(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView) {
        this.f229029d = flexibleVideoView;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestAudioFocus$2");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f229029d;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.f(flexibleVideoView, "onPause: audio focus");
        ik4.p d17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.d(flexibleVideoView);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isLoopBackPlay$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        java.lang.Boolean bool2 = flexibleVideoView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isLoopBackPlay$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        d17.j(bool, bool2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestAudioFocus$2");
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestAudioFocus$2");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = this.f229029d;
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.f(flexibleVideoView, "onResume: audio focus");
        ik4.p d17 = com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.d(flexibleVideoView);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isLoopBackPlay$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        java.lang.Boolean bool2 = flexibleVideoView.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isLoopBackPlay$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView");
        d17.j(bool, bool2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestAudioFocus$2");
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestAudioFocus$2");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.f(this.f229029d, "onStop: audio focus");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView$requestAudioFocus$2");
    }
}
