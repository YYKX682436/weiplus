package lc4;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f317961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.ArrayList arrayList) {
        super(1);
        this.f317961d = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$2");
        java.util.ArrayList it = (java.util.ArrayList) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$2");
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.O6().addAll(it);
        it.clear();
        it.addAll(this.f317961d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$changeToUnreadData$2");
        return f0Var;
    }
}
