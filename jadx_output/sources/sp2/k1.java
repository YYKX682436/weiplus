package sp2;

/* loaded from: classes2.dex */
public final class k1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f411062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f411063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411064f;

    public k1(long j17, int i17, sp2.o2 o2Var) {
        this.f411062d = j17;
        this.f411063e = i17;
        this.f411064f = o2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recyclerView onPreDraw rendering completed cost: ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f411062d);
        sb6.append(" pullType: ");
        int i17 = this.f411063e;
        sb6.append(i17);
        sb6.append(" currentLoadingTime: ");
        sp2.o2 o2Var = this.f411064f;
        sb6.append(o2Var.O);
        sb6.append(" startAutoLoadingTime: ");
        sb6.append(o2Var.K);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        rq2.d.f398816a.h(i17, 10000);
        if (i17 == 0 || i17 == 21 || i17 == 26) {
            if (o2Var.O == 0) {
                o2Var.O = java.lang.System.currentTimeMillis() - o2Var.K;
            }
            if (o2Var.M == 0 && i17 == 0) {
                o2Var.M = android.os.SystemClock.elapsedRealtime() - o2Var.L;
            }
        }
        sp2.o2.e(o2Var);
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
        if (finderParentRecyclerView != null) {
            finderParentRecyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }
}
