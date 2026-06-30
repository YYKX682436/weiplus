package gh;

/* loaded from: classes7.dex */
public final class h extends gh.c implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public final gh.b f271824i;

    /* renamed from: m, reason: collision with root package name */
    public double f271825m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
        this.f271824i = gh.b.EglSurfaceSwapLocker;
    }

    @Override // gh.c
    public gh.b b() {
        return this.f271824i;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        this.f271825m = 0.0d;
    }

    @Override // gh.c
    public void g() {
        this.f271802e.k(this, false);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f271804g) {
            this.f271802e.k(this, false);
            if (this.f271825m == 0.0d) {
                this.f271825m = android.os.SystemClock.elapsedRealtime();
            }
            c(this.f271825m);
            this.f271825m = android.os.SystemClock.elapsedRealtime();
        }
    }
}
