package sa5;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa5.j f405344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f405345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f405346f;

    public i(sa5.j jVar, long j17, yz5.a aVar) {
        this.f405344d = jVar;
        this.f405345e = j17;
        this.f405346f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa5.j jVar = this.f405344d;
        jVar.d();
        android.view.View view = jVar.f405351d;
        if (view != null) {
            sa5.h hVar = new sa5.h(jVar);
            android.view.ViewPropertyAnimator interpolator = view.animate().setInterpolator(jVar.f());
            kotlin.jvm.internal.o.d(interpolator);
            jVar.g(interpolator);
            interpolator.setUpdateListener(hVar);
            interpolator.withEndAction(new sa5.g(jVar, this.f405346f, interpolator));
            interpolator.setDuration(this.f405345e).start();
        }
    }
}
