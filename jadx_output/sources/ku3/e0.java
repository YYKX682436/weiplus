package ku3;

/* loaded from: classes10.dex */
public final class e0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312201d;

    public e0(ku3.i0 i0Var) {
        this.f312201d = i0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.b bVar = (zt3.b) obj;
        int i17 = bVar.f475585a;
        ku3.i0 i0Var = this.f312201d;
        if (i17 == 1) {
            i0Var.f312251d.S6(9, new ku3.a0(i0Var));
            ku3.b0 b0Var = new ku3.b0(i0Var);
            zt3.a aVar = i0Var.f312251d;
            aVar.S6(5, b0Var);
            aVar.S6(6, new ku3.c0(i0Var));
            aVar.S6(7, new ku3.d0(i0Var));
            return;
        }
        if (i17 != 2) {
            return;
        }
        jz5.f0 f0Var = null;
        android.os.Bundle bundle = bVar.f475586b;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt("PARAM_1_INT")) : null;
        if (valueOf != null) {
            valueOf.intValue();
            androidx.recyclerview.widget.f2 adapter = i0Var.a().getAdapter();
            if (!(adapter instanceof androidx.recyclerview.widget.f2)) {
                adapter = null;
            }
            if (adapter != null) {
                adapter.notifyItemChanged(valueOf.intValue());
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var != null) {
                return;
            }
        }
        androidx.recyclerview.widget.f2 adapter2 = i0Var.a().getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }
}
