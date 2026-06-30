package fc4;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(fc4.f0 f0Var) {
        super(1);
        this.f261097d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$6");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInsectValue$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        fc4.f0 f0Var = this.f261097d;
        int i17 = f0Var.f261142i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInsectValue$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
        if (intValue != i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setInsectValue$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            f0Var.f261142i = intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setInsectValue$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            android.content.res.Configuration configuration = f0Var.getContext().getResources().getConfiguration();
            kotlin.jvm.internal.o.f(configuration, "getConfiguration(...)");
            f0Var.onConfigurationChanged(configuration);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$6");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$6");
        return bool;
    }
}
