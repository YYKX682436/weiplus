package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f203102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n2 f203103e;

    public u(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.n2 n2Var) {
        this.f203102d = recyclerView;
        this.f203103e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f203102d;
        boolean E0 = recyclerView.E0();
        androidx.recyclerview.widget.n2 n2Var = this.f203103e;
        if (E0) {
            recyclerView.post(new com.tencent.mm.ui.chatting.view.u(recyclerView, n2Var));
        } else if (recyclerView.getItemAnimator() == n2Var) {
            recyclerView.setItemAnimator(null);
        }
    }
}
