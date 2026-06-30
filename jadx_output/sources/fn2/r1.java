package fn2;

/* loaded from: classes10.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s1 f264367d;

    public r1(fn2.s1 s1Var) {
        this.f264367d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fn2.s1 s1Var = this.f264367d;
        int length = s1Var.H.length;
        int i17 = s1Var.G.f264405c.f264425d;
        if (!(i17 >= 0 && i17 < length)) {
            i17 = 0;
        }
        s1Var.w(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveUnifiedSongPanel", "Unified song panel initialized with defaultTab: " + i17);
    }
}
