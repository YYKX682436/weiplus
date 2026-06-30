package ku3;

/* loaded from: classes10.dex */
public final class a0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312160d;

    public a0(ku3.i0 i0Var) {
        this.f312160d = i0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ku3.i0 i0Var = this.f312160d;
        java.lang.Integer P6 = i0Var.f312251d.P6(9);
        if (P6 != null) {
            int intValue = P6.intValue();
            androidx.recyclerview.widget.f2 adapter = i0Var.a().getAdapter();
            kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
            adapter.notifyItemChanged(intValue);
        }
    }
}
