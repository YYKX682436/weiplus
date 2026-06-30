package x44;

/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.m f451837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x44.m mVar) {
        super(3);
        this.f451837d = mVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$doAction$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String msg = (java.lang.String) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$doAction$1");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        this.f451837d.q(intValue, intValue2, msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$toJs", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.DrawCoupon$doAction$1");
        return f0Var;
    }
}
