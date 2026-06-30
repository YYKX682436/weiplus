package ij4;

/* loaded from: classes10.dex */
public final class i extends mr.i {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f291731q;

    public i(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this.f291731q = (i17 & 1) != 0 ? true : z17;
    }

    @Override // mr.i
    public android.view.View o(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.getF123307r()) {
            return j(layoutManager, m(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return j(layoutManager, l(layoutManager));
        }
        return null;
    }

    @Override // mr.i
    public boolean p(android.view.View view, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 helper) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(helper, "helper");
        if (!this.f291731q) {
            return false;
        }
        androidx.recyclerview.widget.k3 k3Var = null;
        if (view != null && (recyclerView = this.f330820h) != null) {
            k3Var = recyclerView.w0(view);
        }
        if (k3Var != null && k3Var.getAdapterPosition() == layoutManager.getItemCount() - 1) {
            if ((helper.k() + helper.l()) - helper.e(view) > helper.c(view) / 2) {
                return true;
            }
        }
        super.p(view, layoutManager, helper);
        return false;
    }
}
