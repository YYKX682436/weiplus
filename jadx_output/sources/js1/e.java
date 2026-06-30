package js1;

/* loaded from: classes7.dex */
public final class e implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f301482a;

    public e(zq1.g0 g0Var) {
        this.f301482a = g0Var;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        zq1.g0 g0Var = this.f301482a;
        if (g0Var != null) {
            g0Var.b(result);
        }
    }
}
