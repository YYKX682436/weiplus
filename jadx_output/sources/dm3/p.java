package dm3;

/* loaded from: classes10.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm3.u f241730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f241731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241732f;

    public p(dm3.u uVar, android.widget.FrameLayout frameLayout, java.lang.String str) {
        this.f241730d = uVar;
        this.f241731e = frameLayout;
        this.f241732f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f241730d.r(this.f241731e, this.f241732f);
    }
}
