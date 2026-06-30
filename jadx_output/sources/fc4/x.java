package fc4;

/* loaded from: classes4.dex */
public final class x implements z35.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261207a;

    public x(fc4.f0 f0Var) {
        this.f261207a = f0Var;
    }

    @Override // z35.h0
    public long a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPlayTimeMs", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$2");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView O6 = fc4.f0.O6(this.f261207a);
        long currentPositionMs = O6 != null ? O6.getCurrentPositionMs() : 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPlayTimeMs", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$2");
        return currentPositionMs;
    }
}
