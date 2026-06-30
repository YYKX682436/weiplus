package n34;

/* loaded from: classes4.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f334707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(n34.v3 v3Var) {
        super(1);
        this.f334707d = v3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$1");
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getInsectValue$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        n34.v3 v3Var = this.f334707d;
        int i17 = v3Var.f334757i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getInsectValue$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (intValue != i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setInsectValue$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            v3Var.f334757i = intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setInsectValue$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getActivityContext$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            android.app.Activity activity = v3Var.f334753e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getActivityContext$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            v3Var.b((activity == null || (resources = activity.getResources()) == null) ? null : resources.getConfiguration());
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$init$1");
        return bool;
    }
}
