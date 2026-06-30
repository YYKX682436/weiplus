package js1;

/* loaded from: classes7.dex */
public final class f implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f301483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f301484b;

    public f(zq1.g0 g0Var, boolean z17, long j17) {
        this.f301483a = g0Var;
        this.f301484b = z17;
    }

    @Override // zq1.g0
    public boolean a(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        zq1.g0 g0Var = this.f301483a;
        if (g0Var != null) {
            return g0Var.a(transferRequestInfo);
        }
        return false;
    }

    @Override // zq1.g0
    public void b(com.tencent.mm.plugin.brandservice.api.TransferResultInfo result) {
        kotlin.jvm.internal.o.g(result, "result");
        result.f93929g = !this.f301484b;
        java.lang.System.currentTimeMillis();
        result.toString();
        zq1.g0 g0Var = this.f301483a;
        if (g0Var != null) {
            g0Var.b(result);
        }
    }
}
