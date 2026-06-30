package wm2;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f447246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f447247e;

    public k(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f447246d = frameLayout;
        this.f447247e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f447246d.removeView(this.f447247e.a());
    }
}
