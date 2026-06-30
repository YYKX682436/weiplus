package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class u1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f203107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f203108g;

    public u1(int i17, com.tencent.mm.ui.chatting.view.e2 e2Var, androidx.recyclerview.widget.RecyclerView recyclerView, int i18) {
        this.f203105d = i17;
        this.f203106e = e2Var;
        this.f203107f = recyclerView;
        this.f203108g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f203106e;
        int i17 = e2Var.f202926w;
        int i18 = this.f203105d;
        if (i18 == i17 && !e2Var.f202916m.e(e2Var.f202911h)) {
            boolean z17 = !e2Var.f202914k.isEmpty();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f203107f;
            if (z17 || (!e2Var.f202915l.isEmpty())) {
                e2Var.K(recyclerView);
            }
            int i19 = this.f203108g - 1;
            if (i19 <= 0) {
                return;
            }
            recyclerView.post(new com.tencent.mm.ui.chatting.view.u1(i18, e2Var, recyclerView, i19));
        }
    }
}
