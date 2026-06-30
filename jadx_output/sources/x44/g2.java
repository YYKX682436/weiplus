package x44;

/* loaded from: classes4.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.j2 f451831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(x44.j2 j2Var) {
        super(3);
        this.f451831d = j2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$doAction$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        this.f451831d.q(intValue, intValue2, intValue3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$doAction$1");
        return f0Var;
    }
}
