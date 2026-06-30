package n0;

/* loaded from: classes14.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f333686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f333687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(n0.b4 b4Var, java.lang.Throwable th6) {
        super(1);
        this.f333686d = b4Var;
        this.f333687e = th6;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        n0.b4 b4Var = this.f333686d;
        java.lang.Object obj2 = b4Var.f333447d;
        java.lang.Throwable th7 = this.f333687e;
        synchronized (obj2) {
            if (th7 == null) {
                th7 = null;
            } else if (th6 != null) {
                if (!(!(th6 instanceof java.util.concurrent.CancellationException))) {
                    th6 = null;
                }
                if (th6 != null) {
                    jz5.a.a(th7, th6);
                }
            }
            b4Var.f333449f = th7;
            ((kotlinx.coroutines.flow.h3) b4Var.f333458o).k(n0.o3.ShutDown);
        }
        return jz5.f0.f302826a;
    }
}
