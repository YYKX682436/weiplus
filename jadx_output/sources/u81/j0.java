package u81;

/* loaded from: classes7.dex */
public abstract class j0 extends k75.c {

    /* renamed from: d, reason: collision with root package name */
    public final u81.k0 f425439d;

    public j0(u81.k0 k0Var) {
        this.f425439d = k0Var;
    }

    @Override // k75.c
    public void a() {
        u81.b z17;
        u81.b z18;
        u81.f0 f0Var = (u81.f0) this.f425439d;
        f0Var.A.set(null);
        f0Var.B.set(this);
        android.os.Message d17 = f0Var.d();
        if (d17 != null && d17.what == -2) {
            f0Var.F = this;
            return;
        }
        k75.c cVar = f0Var.F;
        f0Var.F = this;
        if (cVar == null || (z17 = f0Var.z(cVar)) == (z18 = f0Var.z(this))) {
            return;
        }
        f0Var.v(z17, z18);
    }
}
