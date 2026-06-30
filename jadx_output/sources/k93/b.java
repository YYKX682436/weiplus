package k93;

/* loaded from: classes11.dex */
public class b extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final k93.a f305884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f305885b = false;

    public b(k93.a aVar) {
        this.f305884a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var instanceof k93.c0) {
            ((k93.c0) k3Var).a();
        }
        k93.a aVar = this.f305884a;
        if (aVar != null) {
            aVar.a();
        }
        super.clearView(recyclerView, k3Var);
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int i17 = 0;
        if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            return 0;
        }
        int H = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).H();
        int i18 = 12;
        if (H == 0) {
            i17 = 12;
            i18 = 3;
        } else if (H == 1) {
            i17 = 3;
        } else {
            i18 = 0;
        }
        return androidx.recyclerview.widget.a1.makeMovementFlags(i17, i18);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isLongPressDragEnabled() {
        return this.f305885b;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, androidx.recyclerview.widget.k3 k3Var2) {
        k93.a aVar = this.f305884a;
        if (aVar != null) {
            return aVar.onMove(k3Var.getAdapterPosition(), k3Var2.getAdapterPosition());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.a1
    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (i17 != 0) {
            if (k3Var instanceof k93.c0) {
                ((k93.c0) k3Var).g();
            }
            k93.a aVar = this.f305884a;
            if (aVar != null) {
                aVar.onItemSelected(k3Var.getAdapterPosition());
            }
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 k3Var, int i17) {
        k93.a aVar = this.f305884a;
        if (aVar != null) {
            aVar.b(k3Var.getAdapterPosition());
        }
    }
}
