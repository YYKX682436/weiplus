package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f122053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f122054e;

    public z(androidx.recyclerview.widget.RecyclerView recyclerView, gp2.l0 l0Var) {
        this.f122053d = recyclerView;
        this.f122054e = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f122053d;
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView != null ? recyclerView.getItemAnimator() : null;
        boolean z17 = false;
        if (itemAnimator != null && itemAnimator.o()) {
            z17 = true;
        }
        gp2.l0 l0Var = this.f122054e;
        if (z17) {
            itemAnimator.p(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.y(l0Var));
        } else if (l0Var != null) {
            l0Var.g();
        }
    }
}
