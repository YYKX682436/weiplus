package ir0;

/* loaded from: classes5.dex */
public final class e implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f293926d;

    public e(java.lang.Runnable runnable) {
        this.f293926d = runnable;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f293926d.getClass().getName();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f293926d.run();
    }
}
