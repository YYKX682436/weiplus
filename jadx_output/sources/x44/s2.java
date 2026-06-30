package x44;

/* loaded from: classes4.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.t2 f451887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ca4.b0 f451888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451889f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(x44.t2 t2Var, ca4.b0 b0Var, java.lang.String str) {
        super(2);
        this.f451887d = t2Var;
        this.f451888e = b0Var;
        this.f451889f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String path = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        kotlin.jvm.internal.o.g(path, "path");
        if (intValue != 0) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.ScanQRCode", "download qr file failed!!!");
            x44.t2 t2Var = this.f451887d;
            t2Var.b(w44.d.k(t2Var, -1, "scan qr failed!", null, 4, null));
        } else {
            this.f451888e.k(path, this.f451889f, x44.r2.f451884a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            x44.t2 t2Var2 = this.f451887d;
            org.json.JSONObject l17 = t2Var2.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode");
            t2Var2.b(l17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$work$2");
        return f0Var;
    }
}
