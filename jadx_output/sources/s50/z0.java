package s50;

/* loaded from: classes12.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f403150f;

    public z0(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, k23.v0 v0Var) {
        this.f403148d = l1Var;
        this.f403149e = weakReference;
        this.f403150f = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.j2 m17 = this.f403150f.m();
        s50.l1.Ai(this.f403148d, this.f403149e, m17 != null ? m17.getFloatingButtonBottomHeight() : 0);
    }
}
