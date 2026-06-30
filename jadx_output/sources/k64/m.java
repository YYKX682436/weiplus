package k64;

/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q64.b f304600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k64.n f304601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q64.b bVar, k64.n nVar, int i17) {
        super(1);
        this.f304600d = bVar;
        this.f304601e = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        k64.b it = (k64.b) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        kotlin.jvm.internal.o.g(it, "it");
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            r45.js5 js5Var = (r45.js5) it.c();
            if (js5Var != null) {
                bundle.putByteArray("resp_pb_bytes", js5Var.toByteArray());
            }
        } catch (java.lang.Throwable unused) {
        }
        bundle.putInt("resp_error_type", it.b());
        bundle.putInt("resp_error_code", it.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        bundle.putString("resp_error_msg", it.f304585c);
        ((r64.b) this.f304600d).e(bundle);
        this.f304601e.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall");
        it.b();
        it.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrMsg", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$CgiResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.netscene.IPCCgiServerCall$onServerCall$1");
        return f0Var;
    }
}
