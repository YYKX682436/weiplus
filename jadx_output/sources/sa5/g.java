package sa5;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa5.j f405339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f405340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f405341f;

    public g(sa5.j jVar, yz5.a aVar, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f405339d = jVar;
        this.f405340e = aVar;
        this.f405341f = viewPropertyAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f405339d.a();
        yz5.a aVar = this.f405340e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f405341f.setUpdateListener(null);
    }
}
