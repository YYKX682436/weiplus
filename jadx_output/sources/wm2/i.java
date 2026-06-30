package wm2;

/* loaded from: classes14.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f447242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f447243e;

    public i(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f447242d = frameLayout;
        this.f447243e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f447242d.removeView(this.f447243e.a());
    }
}
