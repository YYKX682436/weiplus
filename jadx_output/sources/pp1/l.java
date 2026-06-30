package pp1;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f357426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f357427f;

    public l(pp1.z zVar, boolean z17, android.animation.ValueAnimator valueAnimator) {
        this.f357425d = zVar;
        this.f357426e = z17;
        this.f357427f = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f357425d;
        boolean z17 = pp1.z.B;
        zVar.t(1.0f, false);
        ku5.u0 u0Var = ku5.t0.f312615d;
        pp1.k kVar = new pp1.k(this.f357425d, this.f357426e, this.f357427f);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 50L, false);
    }
}
