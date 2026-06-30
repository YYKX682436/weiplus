package fc4;

/* loaded from: classes4.dex */
public final class y implements z35.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261208a;

    public y(fc4.f0 f0Var) {
        this.f261208a = f0Var;
    }

    @Override // z35.f0
    public void a(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$3");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O6 = fc4.f0.O6(this.f261208a);
        if (O6 != null) {
            O6.setVideoSpeedRatio(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSpeedChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$3");
    }
}
