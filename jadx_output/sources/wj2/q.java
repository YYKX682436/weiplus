package wj2;

/* loaded from: classes9.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f446712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f446713e;

    public q(wj2.w wVar, android.view.View view) {
        this.f446712d = wVar;
        this.f446713e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wj2.w.Q(this.f446712d, this.f446713e, 0, 2, null);
    }
}
