package wm2;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f447244d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bn2.p f447245e;

    public j(android.widget.FrameLayout frameLayout, bn2.p pVar) {
        this.f447244d = frameLayout;
        this.f447245e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f447244d.removeView(this.f447245e.e());
    }
}
