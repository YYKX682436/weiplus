package rc3;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f394053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f394054e;

    public q0(rc3.w0 w0Var, yz5.a aVar) {
        this.f394053d = w0Var;
        this.f394054e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc3.w0 w0Var = this.f394053d;
        w0Var.f394101v = false;
        this.f394054e.invoke();
        while (!w0Var.f394101v) {
            kz5.q qVar = w0Var.f394100u;
            if (!(!qVar.isEmpty())) {
                return;
            } else {
                ((yz5.a) qVar.removeFirst()).invoke();
            }
        }
    }
}
