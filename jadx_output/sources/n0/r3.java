package n0;

/* loaded from: classes14.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f333693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(n0.b4 b4Var) {
        super(1);
        this.f333693d = b4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.util.concurrent.CancellationException a17 = kotlinx.coroutines.e2.a("Recomposer effect job completed", th6);
        n0.b4 b4Var = this.f333693d;
        synchronized (b4Var.f333447d) {
            kotlinx.coroutines.r2 r2Var = b4Var.f333448e;
            if (r2Var != null) {
                ((kotlinx.coroutines.flow.h3) b4Var.f333458o).k(n0.o3.ShuttingDown);
                r2Var.b(a17);
                b4Var.f333457n = null;
                r2Var.p(new n0.q3(b4Var, th6));
            } else {
                b4Var.f333449f = a17;
                ((kotlinx.coroutines.flow.h3) b4Var.f333458o).k(n0.o3.ShutDown);
            }
        }
        return jz5.f0.f302826a;
    }
}
