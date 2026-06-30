package ir;

/* loaded from: classes15.dex */
public final class q0 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ir.t0 f293894a;

    public q0(ir.t0 t0Var) {
        this.f293894a = t0Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        ir.o0 o0Var = this.f293894a.f293903c;
        if (o0Var != null) {
            o0Var.a(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        ir.o0 o0Var = this.f293894a.f293903c;
        if (o0Var != null) {
            ((lr.y) o0Var).f320612a.notifyItemRangeInserted(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        ir.o0 o0Var = this.f293894a.f293903c;
        if (o0Var != null) {
            ((lr.y) o0Var).f320612a.notifyItemRangeRemoved(i17, i18);
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        ir.o0 o0Var = this.f293894a.f293903c;
        if (o0Var != null) {
            ((lr.y) o0Var).f320612a.notifyItemMoved(i17, i18);
        }
    }
}
