package iq2;

/* loaded from: classes2.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293711d;

    public b(iq2.d0 d0Var) {
        this.f293711d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iq2.d0 d0Var = this.f293711d;
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = d0Var.f293726j;
        if (finderChildRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.n2 itemAnimator = finderChildRecyclerView.getItemAnimator();
        boolean z17 = false;
        if (itemAnimator != null && itemAnimator.o()) {
            z17 = true;
        }
        if (z17) {
            itemAnimator.p(new iq2.c(d0Var));
        } else {
            d0Var.d("removeItem");
        }
    }
}
