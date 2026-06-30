package cy3;

/* loaded from: classes10.dex */
public final class y extends androidx.recyclerview.widget.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cy3.a0 f224856a;

    public y(cy3.a0 a0Var) {
        this.f224856a = a0Var;
    }

    @Override // androidx.recyclerview.widget.h2
    public void b() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        cy3.a0 a0Var = this.f224856a;
        if (a0Var.f224750g != -1 || (recyclerView = a0Var.f224753j) == null) {
            return;
        }
        recyclerView.post(new cy3.w(a0Var));
    }

    @Override // androidx.recyclerview.widget.h2
    public void e(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        cy3.a0 a0Var = this.f224856a;
        if (a0Var.f224750g != -1 || (recyclerView = a0Var.f224753j) == null) {
            return;
        }
        recyclerView.post(new cy3.x(a0Var));
    }
}
