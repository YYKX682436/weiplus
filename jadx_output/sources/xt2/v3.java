package xt2;

/* loaded from: classes3.dex */
public final class v3 extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f457075a;

    public v3(xt2.z3 z3Var) {
        this.f457075a = z3Var;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView p07, androidx.recyclerview.widget.k3 p17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p17, "p1");
        tt2.e eVar = (tt2.e) kz5.n0.a0(this.f457075a.f457150q.f421934h, p17.getAdapterPosition());
        so2.j5 j5Var = eVar != null ? eVar.f421872a : null;
        return ((j5Var instanceof cm2.m0) && ((cm2.m0) j5Var).f43368v.getInteger(42) == 10) ? androidx.recyclerview.widget.a1.makeMovementFlags(0, 0) : androidx.recyclerview.widget.a1.makeMovementFlags(3, 0);
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
        int adapterPosition = source.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        xt2.z3 z3Var = this.f457075a;
        tt2.i iVar = z3Var.f457150q;
        iVar.getClass();
        try {
            java.util.Collections.swap(iVar.f421934h, adapterPosition, adapterPosition2);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveShoppingEditAdapter,moveProductItem:");
        }
        z3Var.f457150q.notifyItemMoved(adapterPosition, adapterPosition2);
        zl2.r4.f473950a.M2(z3Var.f457144h, "onMove from:" + adapterPosition + " - to:" + adapterPosition2);
        tt2.i iVar2 = z3Var.f457150q;
        iVar2.notifyItemRangeChanged(0, iVar2.getItemCount(), 1);
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
