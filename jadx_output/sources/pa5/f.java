package pa5;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f353104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f353105e;

    public f(android.view.ViewPropertyAnimator viewPropertyAnimator, yz5.a aVar) {
        this.f353104d = viewPropertyAnimator;
        this.f353105e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f353104d.setUpdateListener(null);
        yz5.a aVar = this.f353105e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
