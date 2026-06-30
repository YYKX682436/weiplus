package wm2;

/* loaded from: classes14.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f447240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f447241e;

    public h(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f447240d = frameLayout;
        this.f447241e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f447240d.removeView(this.f447241e.e());
    }
}
