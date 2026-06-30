package ir;

/* loaded from: classes15.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir.t0 f293896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir.k0 f293897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f293898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ir.t0 t0Var, ir.k0 k0Var, androidx.recyclerview.widget.c0 c0Var) {
        super(0);
        this.f293896d = t0Var;
        this.f293897e = k0Var;
        this.f293898f = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ir.t0 t0Var = this.f293896d;
        ir.o0 o0Var = t0Var.f293903c;
        if (o0Var != null) {
            o0Var.b(this.f293897e);
        }
        this.f293898f.a(new ir.q0(t0Var));
        t0Var.f293902b = false;
        if (t0Var.f293901a) {
            t0Var.f293901a = false;
            t0Var.e();
        }
        return jz5.f0.f302826a;
    }
}
