package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f203113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.e2 f203114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f203115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f203116g;

    public v1(int i17, com.tencent.mm.ui.chatting.view.e2 e2Var, androidx.recyclerview.widget.RecyclerView recyclerView, int i18) {
        this.f203113d = i17;
        this.f203114e = e2Var;
        this.f203115f = recyclerView;
        this.f203116g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.view.e2 e2Var = this.f203114e;
        int i17 = e2Var.f202925v;
        int i18 = this.f203113d;
        if (i18 == i17 && !e2Var.f202916m.e(e2Var.f202911h)) {
            boolean z17 = !e2Var.f202913j.isEmpty();
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f203115f;
            if (z17) {
                e2Var.L(recyclerView);
            }
            int i19 = this.f203116g - 1;
            if (i19 <= 0) {
                return;
            }
            recyclerView.post(new com.tencent.mm.ui.chatting.view.v1(i18, e2Var, recyclerView, i19));
        }
    }
}
