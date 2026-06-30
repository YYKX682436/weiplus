package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f202951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n2 f202952e;

    public g2(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.n2 n2Var) {
        this.f202951d = recyclerView;
        this.f202952e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f202951d;
        boolean E0 = recyclerView.E0();
        androidx.recyclerview.widget.n2 n2Var = this.f202952e;
        if (E0) {
            recyclerView.post(new com.tencent.mm.ui.chatting.view.h2(recyclerView, n2Var));
        } else if (recyclerView.getItemAnimator() == n2Var) {
            recyclerView.setItemAnimator(null);
        }
    }
}
