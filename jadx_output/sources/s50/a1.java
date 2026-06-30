package s50;

/* loaded from: classes12.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f403031f;

    public a1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference, kotlin.jvm.internal.h0 h0Var) {
        this.f403029d = l1Var;
        this.f403030e = weakReference;
        this.f403031f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k23.j2 m17 = ((k23.v0) this.f403031f.f310123d).m();
        s50.l1.Ai(this.f403029d, this.f403030e, m17 != null ? m17.getFloatingButtonBottomHeight() : 0);
    }
}
