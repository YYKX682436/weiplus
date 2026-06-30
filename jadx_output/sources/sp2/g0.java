package sp2;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411037d;

    public g0(sp2.o2 o2Var) {
        this.f411037d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sp2.o2 o2Var = this.f411037d;
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
        if (finderParentRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.n2 itemAnimator = finderParentRecyclerView.getItemAnimator();
        boolean z17 = false;
        if (itemAnimator != null && itemAnimator.o()) {
            z17 = true;
        }
        if (z17) {
            itemAnimator.p(new sp2.i0(o2Var));
        } else {
            kotlinx.coroutines.l.d(o2Var.f411129e, null, null, new sp2.j0(o2Var, null), 3, null);
        }
    }
}
