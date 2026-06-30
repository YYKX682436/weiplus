package fc4;

/* loaded from: classes4.dex */
public final class w implements z35.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261206a;

    public w(fc4.f0 f0Var) {
        this.f261206a = f0Var;
    }

    @Override // z35.s0
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$1");
        fc4.f0 f0Var = this.f261206a;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O6 = fc4.f0.O6(f0Var);
            if (O6 != null) {
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView.m(O6, false, false, false, 7, null);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O62 = fc4.f0.O6(f0Var);
            if (O62 != null) {
                O62.k(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayStatusChanged", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$1");
    }
}
