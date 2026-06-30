package dm3;

/* loaded from: classes11.dex */
public final class m extends com.tencent.unit_rc.BaseObject implements b66.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.o f241713d;

    public m(dm3.o oVar) {
        this.f241713d = oVar;
    }

    @Override // b66.t
    public void o(byte[] item, int i17, byte[] msg) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (i17 == 3) {
            dm3.o oVar = this.f241713d;
            if (oVar.f241727t) {
                return;
            }
            oVar.f241727t = true;
            ku5.u0 u0Var = ku5.t0.f312615d;
            dm3.n nVar = new dm3.n(oVar);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            oVar.f241728u = t0Var.z(nVar, 5000L, false);
        }
    }

    @Override // b66.t
    public void x(long j17, long j18, long j19) {
        pm0.v.X(new dm3.l(this.f241713d, j17));
    }
}
