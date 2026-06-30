package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public class i extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f151857f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f151858g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f151859h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f151861j;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.a f151865n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.b f151866o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.c f151867p;

    /* renamed from: i, reason: collision with root package name */
    public final float f151860i = 50.0f;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.h f151862k = new com.tencent.mm.plugin.mv.ui.view.h(this);

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.g f151863l = new com.tencent.mm.plugin.mv.ui.view.g(this);

    /* renamed from: m, reason: collision with root package name */
    public int f151864m = -1;

    @Override // androidx.recyclerview.widget.r3
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.f2 adapter2;
        super.b(recyclerView);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f151859h;
        com.tencent.mm.plugin.mv.ui.view.h hVar = this.f151862k;
        if (recyclerView2 != null) {
            recyclerView2.V0(hVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f151859h;
        com.tencent.mm.plugin.mv.ui.view.g gVar = this.f151863l;
        if (recyclerView3 != null && (adapter2 = recyclerView3.getAdapter()) != null) {
            adapter2.unregisterAdapterDataObserver(gVar);
        }
        this.f151859h = recyclerView;
        if (recyclerView != null) {
            recyclerView.i(hVar);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f151859h;
        if (recyclerView4 != null && (adapter = recyclerView4.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(gVar);
        }
        n();
    }

    @Override // androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f151859h;
        return new com.tencent.mm.plugin.mv.ui.view.d(this, layoutManager, recyclerView != null ? recyclerView.getContext() : null);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        android.view.View f17 = super.f(layoutManager);
        android.view.ViewGroup.LayoutParams layoutParams = f17 != null ? f17.getLayoutParams() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        if (this.f151864m != a17) {
            this.f151864m = a17;
            com.tencent.mm.plugin.mv.ui.view.a aVar = this.f151865n;
            if (aVar != null) {
                aVar.onPageSelected(a17);
            }
        }
        return f17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        androidx.recyclerview.widget.w1 w1Var;
        int i19;
        int i27;
        android.graphics.PointF a17;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        if (layoutManager.getF123307r()) {
            androidx.recyclerview.widget.w1 w1Var2 = this.f151857f;
            if (w1Var2 == null || w1Var2.f12259a != layoutManager) {
                this.f151857f = new androidx.recyclerview.widget.v1(layoutManager);
            }
            w1Var = this.f151857f;
            kotlin.jvm.internal.o.d(w1Var);
        } else {
            androidx.recyclerview.widget.w1 w1Var3 = this.f151858g;
            if (w1Var3 == null || w1Var3.f12259a != layoutManager) {
                this.f151858g = new androidx.recyclerview.widget.u1(layoutManager);
            }
            w1Var = this.f151858g;
            kotlin.jvm.internal.o.d(w1Var);
        }
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount != 0) {
            int k17 = layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
            int i28 = Integer.MAX_VALUE;
            for (int i29 = 0; i29 < childCount; i29++) {
                android.view.View childAt = layoutManager.getChildAt(i29);
                int abs = java.lang.Math.abs((w1Var.e(childAt) + (w1Var.c(childAt) / 2)) - k17);
                if (abs < i28) {
                    view = childAt;
                    i28 = abs;
                }
            }
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (w1Var.e(view) < w1Var.k()) {
            i27 = position + 1;
            i19 = position;
        } else {
            i19 = position - 1;
            i27 = position;
        }
        if (position == -1) {
            return -1;
        }
        boolean z17 = !layoutManager.canScrollHorizontally() ? i18 <= 0 : i17 <= 0;
        if (!((layoutManager instanceof androidx.recyclerview.widget.f3) && (a17 = ((androidx.recyclerview.widget.f3) layoutManager).a(itemCount + (-1))) != null && (a17.x < 0.0f || a17.y < 0.0f)) ? z17 : !z17) {
            i19 = i27;
        }
        int i37 = i19 >= 0 ? i19 : 0;
        if (i37 >= itemCount) {
            i37 = itemCount - 1;
        }
        if (i37 != this.f151864m) {
            this.f151864m = i37;
            com.tencent.mm.plugin.mv.ui.view.a aVar = this.f151865n;
            if (aVar != null) {
                aVar.onPageSelected(i37);
            }
        }
        return this.f151864m;
    }

    public final void n() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        android.view.View f17;
        com.tencent.mm.plugin.mv.ui.view.b bVar;
        if (this.f151866o == null || (recyclerView = this.f151859h) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (f17 = f(layoutManager)) == null) {
            return;
        }
        int[] c17 = c(layoutManager, f17);
        if ((c17[0] == 0 || c17[1] == 0) && (bVar = this.f151866o) != null) {
            bVar.a(this.f151864m);
        }
    }
}
