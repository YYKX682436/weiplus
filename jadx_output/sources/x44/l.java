package x44;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f451845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q64.b bVar) {
        super(3);
        this.f451845d = bVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$onServerRun$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String msg = (java.lang.String) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$onServerRun$1");
        kotlin.jvm.internal.o.g(msg, "msg");
        q64.b bVar = this.f451845d;
        if (bVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("error", intValue);
            bundle.putInt("ret", intValue2);
            bundle.putString("msg", msg);
            ((r64.b) bVar).e(bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$onServerRun$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$onServerRun$1");
        return f0Var;
    }
}
