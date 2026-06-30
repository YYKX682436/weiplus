package dm3;

/* loaded from: classes11.dex */
public final class b0 extends com.tencent.unit_rc.BaseObject implements b66.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.e0 f241671d;

    public b0(dm3.e0 e0Var) {
        this.f241671d = e0Var;
    }

    @Override // b66.t
    public void o(byte[] item, int i17, byte[] msg) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (i17 == 3) {
            dm3.e0 e0Var = this.f241671d;
            if (e0Var.f241687s) {
                return;
            }
            e0Var.f241687s = true;
            ku5.u0 u0Var = ku5.t0.f312615d;
            dm3.d0 d0Var = new dm3.d0(e0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            e0Var.f241688t = t0Var.z(d0Var, 5000L, false);
        }
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        pm0.v.X(new dm3.a0(this.f241671d, j17));
    }
}
