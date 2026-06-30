package in2;

/* loaded from: classes10.dex */
public final class s0 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in2.v0 f292897a;

    public s0(in2.v0 v0Var) {
        this.f292897a = v0Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public void clearView(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        zl2.r4.f473950a.M2(this.f292897a.f292913J, "clearView pos:" + viewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView p07, androidx.recyclerview.widget.k3 p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        if (this.f292897a.e0()) {
            return 0;
        }
        return androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean isItemViewSwipeEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 source, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(target, "target");
        in2.v0 v0Var = this.f292897a;
        if (!v0Var.e0()) {
            int adapterPosition = source.getAdapterPosition();
            int adapterPosition2 = target.getAdapterPosition();
            zl2.r4.f473950a.M2(v0Var.f292913J, "onMove from:" + adapterPosition + " - to:" + adapterPosition2);
            in2.q0 q0Var = v0Var.S;
            java.util.ArrayList arrayList = q0Var.f292880f;
            dk2.yg ygVar = (dk2.yg) kz5.n0.a0(arrayList, adapterPosition);
            boolean z17 = false;
            if (ygVar != null && ygVar.a()) {
                dk2.yg ygVar2 = (dk2.yg) kz5.n0.a0(arrayList, adapterPosition2);
                if (ygVar2 != null && ygVar2.a()) {
                    try {
                        java.util.Collections.swap(arrayList, adapterPosition, adapterPosition2);
                    } catch (java.lang.Exception e17) {
                        hc2.c.a(e17, q0Var.f292879e + ",movesongItem:");
                    }
                    z17 = true;
                }
            }
            if (z17) {
                v0Var.S.notifyItemMoved(adapterPosition, adapterPosition2);
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
