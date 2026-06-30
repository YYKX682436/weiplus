package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f121621e;

    public c5(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, gp2.l0 l0Var) {
        this.f121620d = t5Var;
        this.f121621e = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f121620d.f121960p;
        androidx.recyclerview.widget.n2 itemAnimator = wxRecyclerView != null ? wxRecyclerView.getItemAnimator() : null;
        boolean z17 = false;
        if (itemAnimator != null && itemAnimator.o()) {
            z17 = true;
        }
        gp2.l0 l0Var = this.f121621e;
        if (z17) {
            itemAnimator.p(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.b5(l0Var));
        } else if (l0Var != null) {
            l0Var.g();
        }
    }
}
