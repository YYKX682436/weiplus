package vd2;

/* loaded from: classes3.dex */
public final class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435783e;

    public j4(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, boolean z17) {
        this.f435782d = finderLiveViewCallback;
        this.f435783e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vd2.t1 t1Var = this.f435782d.f111486h;
        if (t1Var != null) {
            ((vd2.v2) t1Var).p(this.f435783e);
        }
    }
}
