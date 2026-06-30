package cq4;

/* loaded from: classes10.dex */
public final class r extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f221484a;

    public r(com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView) {
        this.f221484a = vLogThumbView;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (this.f221484a.D) {
            return androidx.recyclerview.widget.a1.makeMovementFlags(15, 0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(target, "target");
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221484a;
        if (!vLogThumbView.D || viewHolder.getItemViewType() != target.getItemViewType()) {
            return false;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = target.getAdapterPosition();
        ((kp4.a) vLogThumbView.C.get(adapterPosition)).f311079i = adapterPosition2;
        ((kp4.a) vLogThumbView.C.get(adapterPosition2)).f311079i = adapterPosition;
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(adapterPosition, adapterPosition2);
        }
        java.util.Collections.swap(vLogThumbView.C, adapterPosition, adapterPosition2);
        cq4.u sortCallback = vLogThumbView.getSortCallback();
        if (sortCallback != null) {
            sortCallback.onMove(adapterPosition - 1, adapterPosition2 - 1);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSelectedChanged(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f221484a;
        if (vLogThumbView.D) {
            java.util.Objects.toString(k3Var);
            if (k3Var != null) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = vLogThumbView.getRecyclerView().getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                int adapterPosition = k3Var.getAdapterPosition();
                int b17 = ((int) vLogThumbView.f176147u) - (i65.a.b(vLogThumbView.getRecyclerView().getContext(), 56) / 2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(b17));
                arrayList.add(java.lang.Integer.valueOf(adapterPosition));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$4", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView$4", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                java.util.Iterator it = vLogThumbView.C.iterator();
                while (it.hasNext()) {
                    ((kp4.a) it.next()).f311078h = true;
                }
                kp4.r rVar = vLogThumbView.f176136g;
                rVar.notifyItemRangeChanged(0, rVar.getItemCount());
            }
            if (k3Var == null && i17 == 0) {
                cq4.u sortCallback = vLogThumbView.getSortCallback();
                if (sortCallback != null) {
                    sortCallback.a();
                }
                vLogThumbView.f176140n = true;
                java.util.Iterator it6 = vLogThumbView.C.iterator();
                while (it6.hasNext()) {
                    ((kp4.a) it6.next()).f311078h = false;
                }
                vLogThumbView.post(new cq4.q(vLogThumbView));
            }
        }
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
