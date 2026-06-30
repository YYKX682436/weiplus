package x44;

/* loaded from: classes4.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.t2 f451868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f451869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(x44.t2 t2Var, ca4.b0 b0Var, java.lang.String str) {
        super(2);
        this.f451868d = t2Var;
        this.f451869e = b0Var;
        this.f451870f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        ((java.lang.Number) obj).intValue();
        java.lang.String newQrl = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        kotlin.jvm.internal.o.g(newQrl, "newQrl");
        if (newQrl.length() == 0) {
            newQrl = this.f451870f;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$work", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        this.f451868d.p(newQrl, this.f451869e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$work", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$doAction$2");
        return f0Var;
    }
}
