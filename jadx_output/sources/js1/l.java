package js1;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zq1.g0 f301491d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zq1.g0 g0Var) {
        super(1);
        this.f301491d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.brandservice.api.TransferResultInfo result = (com.tencent.mm.plugin.brandservice.api.TransferResultInfo) obj;
        kotlin.jvm.internal.o.g(result, "result");
        zq1.g0 g0Var = this.f301491d;
        if (g0Var != null) {
            g0Var.b(result);
        }
        return jz5.f0.f302826a;
    }
}
