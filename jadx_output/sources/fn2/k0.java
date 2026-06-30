package fn2;

/* loaded from: classes10.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f264296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f264297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.i1 f264298f;

    public k0(fn2.m0 m0Var, int i17, fn2.i1 i1Var) {
        this.f264296d = m0Var;
        this.f264297e = i17;
        this.f264298f = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        fn2.t0 t0Var = this.f264296d.f264320n;
        fn2.h1 h1Var = t0Var != null ? (fn2.h1) t0Var.f264402g.get(this.f264297e) : null;
        fn2.i1 i1Var = this.f264298f;
        if (h1Var != null && (i17 = i1Var.f264286c) >= 0) {
            h1Var.f264268e.post(new fn2.g1(h1Var, i17));
        }
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabRequested", "Scroll to target position and highlight: " + i1Var.f264286c);
    }
}
