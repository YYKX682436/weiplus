package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f202954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.n2 f202955e;

    public h2(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.n2 n2Var) {
        this.f202954d = recyclerView;
        this.f202955e = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f202954d;
        boolean E0 = recyclerView.E0();
        androidx.recyclerview.widget.n2 n2Var = this.f202955e;
        if (E0) {
            recyclerView.post(new com.tencent.mm.ui.chatting.view.h2(recyclerView, n2Var));
        } else if (recyclerView.getItemAnimator() == n2Var) {
            recyclerView.setItemAnimator(null);
        }
    }
}
