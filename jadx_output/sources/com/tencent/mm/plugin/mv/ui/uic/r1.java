package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.s1 f151399d;

    public r1(com.tencent.mm.plugin.mv.ui.uic.s1 s1Var) {
        this.f151399d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = this.f151399d;
        com.tencent.mars.xlog.Log.i(s1Var.f151413d, "3s timeout");
        s1Var.A = true;
        if (s1Var.B) {
            if (s1Var.f151431y || (recyclerView = s1Var.f151417h) == null) {
                return;
            }
            recyclerView.setVisibility(0);
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = s1Var.f151417h;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setVisibility(0);
    }
}
