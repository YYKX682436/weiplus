package rv0;

/* loaded from: classes5.dex */
public final class q implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400189e;

    public q(ex0.a0 a0Var, rv0.n1 n1Var) {
        this.f400188d = a0Var;
        this.f400189e = n1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ex0.a0 a0Var = this.f400188d;
        ax0.e r17 = a0Var.r();
        ax0.e eVar = ax0.e.f14977f;
        rv0.n1 n1Var = this.f400189e;
        if (r17 == eVar || a0Var.r() == ax0.e.f14978g) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r76 = n1Var.r7();
            gy0.q mainItemDecoration = r76.getMainItemDecoration();
            if (mainItemDecoration != null) {
                mainItemDecoration.l(r76.H);
                return;
            }
            return;
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.ClipTimelineView r77 = n1Var.r7();
        gy0.q mainItemDecoration2 = r77.getMainItemDecoration();
        if (mainItemDecoration2 != null) {
            mainItemDecoration2.l(r77.G);
        }
    }
}
