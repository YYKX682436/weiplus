package lc4;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC f317962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC) {
        super(1);
        this.f317962d = improveDataUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$3");
        java.util.List it = (java.util.List) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$3");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC P6 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.P6(this.f317962d);
        P6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceSmoothToPositionWithOffset", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.h2 U6 = P6.U6();
        U6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnUpdateCallback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
        U6.K = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnUpdateCallback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
        P6.getRecycleView().post(new com.tencent.mm.plugin.sns.ui.improve.component.c1(P6));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceSmoothToPositionWithOffset", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$3");
        return f0Var;
    }
}
