package wm2;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f447236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f447237e;

    public f(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f447236d = frameLayout;
        this.f447237e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f447236d.removeView(this.f447237e.e());
    }
}
