package x44;

/* loaded from: classes4.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.d2 f451788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(x44.d2 d2Var, java.lang.String str) {
        super(2);
        this.f451788d = d2Var;
        this.f451789e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$doAction$1");
        java.lang.String hbCoverId = this.f451789e;
        kotlin.jvm.internal.o.f(hbCoverId, "$hbCoverId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        this.f451788d.q(intValue, hbCoverId, intValue2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resultToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.QueryHbCoverState$doAction$1");
        return f0Var;
    }
}
