package zk3;

/* loaded from: classes8.dex */
public final class n extends androidx.recyclerview.widget.z {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f473481t;

    public n(zk3.g0 g0Var) {
        this.f473481t = g0Var;
    }

    @Override // androidx.recyclerview.widget.o3
    public void A(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout multiTaskCoordinatorLayout;
        if ((k3Var != null ? k3Var.getAdapterPosition() : 0) > 1 || (multiTaskCoordinatorLayout = this.f473481t.f473455m) == null) {
            return;
        }
        int i17 = com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout.I;
        multiTaskCoordinatorLayout.setMode(-1);
    }

    @Override // androidx.recyclerview.widget.n2
    public void q(androidx.recyclerview.widget.k3 viewHolder) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        zk3.x xVar = this.f473481t.f473467y;
        xVar.getClass();
        zk3.g0 g0Var = xVar.f473522a;
        g0Var.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = g0Var.f473454i;
        int i17 = 0;
        if (((wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount()) <= 3) {
            android.view.View findViewById = viewHolder.itemView.findViewById(com.tencent.mm.R.id.jvf);
            android.view.View findViewById2 = viewHolder.itemView.findViewById(com.tencent.mm.R.id.jva);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            findViewById.setTranslationY(0.0f);
            if ((findViewById2 instanceof com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout ? (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) findViewById2 : null) != null) {
                com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout minusScreenRoundFrameLayout = (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) findViewById2;
                minusScreenRoundFrameLayout.topOffset = 0;
                minusScreenRoundFrameLayout.invalidate();
                return;
            }
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = g0Var.f473454i;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
        com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager minusScreenGridLayoutManager = layoutManager instanceof com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager ? (com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutManager) layoutManager : null;
        if (minusScreenGridLayoutManager != null) {
            int w17 = minusScreenGridLayoutManager.w();
            android.view.View findViewById3 = viewHolder.itemView.findViewById(com.tencent.mm.R.id.jvf);
            android.view.View findViewById4 = viewHolder.itemView.findViewById(com.tencent.mm.R.id.jvd);
            if (findViewById3 == null || findViewById4 == null) {
                return;
            }
            android.graphics.Rect rect = g0Var.f473453h;
            findViewById4.getLocalVisibleRect(rect);
            int height = com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q - rect.height();
            if (height <= com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.Q * 0.8f && viewHolder.getAdapterPosition() <= w17 + 1) {
                i17 = height;
            }
            findViewById3.setTranslationY(i17);
            android.view.View findViewById5 = viewHolder.itemView.findViewById(com.tencent.mm.R.id.jva);
            if ((findViewById5 instanceof com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout ? (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) findViewById5 : null) != null) {
                com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout minusScreenRoundFrameLayout2 = (com.tencent.mm.plugin.multitask.ui.minusscreen.view.MinusScreenRoundFrameLayout) findViewById5;
                minusScreenRoundFrameLayout2.topOffset = i17;
                minusScreenRoundFrameLayout2.invalidate();
            }
        }
    }

    @Override // androidx.recyclerview.widget.o3
    public void z(androidx.recyclerview.widget.k3 k3Var) {
        zk3.g0 g0Var = this.f473481t;
        if (g0Var.f473452g.size() == 1) {
            g0Var.d7(((uk3.a) g0Var.f473452g.get(0)).f428524d, false, false);
        } else {
            g0Var.d7(null, true, false);
        }
    }
}
