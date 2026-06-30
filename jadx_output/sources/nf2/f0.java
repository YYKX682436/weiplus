package nf2;

/* loaded from: classes10.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.g0 f336716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f336717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f336718f;

    public f0(nf2.g0 g0Var, android.view.ViewGroup viewGroup, yz5.a aVar) {
        this.f336716d = g0Var;
        this.f336717e = viewGroup;
        this.f336718f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f336717e;
        int width = viewGroup.getWidth();
        nf2.g0 g0Var = this.f336716d;
        g0Var.f336742d = width;
        g0Var.f336743e = viewGroup.getHeight();
        g0Var.d();
        g0Var.f336744f = true;
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsPositionManager", "setup: containerSize=(" + g0Var.f336742d + " x " + g0Var.f336743e + "), safeRect=" + g0Var.f336741c);
        yz5.a aVar = this.f336718f;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
