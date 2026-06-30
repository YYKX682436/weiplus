package wm2;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f447238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f447239e;

    public g(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f447238d = frameLayout;
        this.f447239e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f447238d.removeView(this.f447239e.a());
    }
}
