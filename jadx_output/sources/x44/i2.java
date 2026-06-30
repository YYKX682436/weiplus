package x44;

/* loaded from: classes4.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f451836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(q64.b bVar) {
        super(3);
        this.f451836d = bVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        q64.b bVar = this.f451836d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", intValue);
            bundle.putInt("opType", intValue2);
            bundle.putInt("status", intValue3);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.RequestAppointment$onServerRun$1");
        return f0Var;
    }
}
