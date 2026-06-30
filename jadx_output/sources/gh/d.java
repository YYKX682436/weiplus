package gh;

/* loaded from: classes7.dex */
public final class d extends gh.c implements android.view.Choreographer.FrameCallback {

    /* renamed from: i, reason: collision with root package name */
    public final gh.i f271806i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.Choreographer f271807m;

    /* renamed from: n, reason: collision with root package name */
    public int f271808n;

    /* renamed from: o, reason: collision with root package name */
    public final gh.b f271809o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler) {
        super(runtime, jsThreadHandler);
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
        this.f271806i = new gh.i();
        this.f271809o = gh.b.ChoreographerInJsThread;
    }

    @Override // gh.c
    public gh.b b() {
        return this.f271809o;
    }

    @Override // gh.c
    public void d() {
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        if (this.f271804g) {
            this.f271806i.getClass();
            android.view.Choreographer choreographer = this.f271807m;
            if (choreographer != null) {
                choreographer.postFrameCallback(this);
            }
            c(j17 / 1000000.0d);
        }
    }

    @Override // gh.c
    public void e() {
    }

    @Override // gh.c
    public void f() {
        android.view.Choreographer choreographer = this.f271807m;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this);
        }
    }

    @Override // gh.c
    public void g() {
        android.view.Choreographer j17 = j(true);
        if (j17 != null) {
            j17.removeFrameCallback(this);
        }
        if (j17 != null) {
            j17.postFrameCallback(this);
        }
    }

    public final android.view.Choreographer j(boolean z17) {
        android.view.Choreographer choreographer;
        android.view.Choreographer choreographer2 = this.f271807m;
        if (choreographer2 != null) {
            return choreographer2;
        }
        this.f271808n++;
        try {
            choreographer = android.view.Choreographer.getInstance();
        } catch (java.lang.Exception e17) {
            if (this.f271808n == 1 || this.f271808n % 100000 == 0) {
                ah.i.c("AnimationFrameHandler", e17, "get choreographer failed [" + this.f271808n + "] times. but it's ok, i will try it later if needed. " + e17, new java.lang.Object[0]);
            }
            choreographer = null;
        }
        if (choreographer == null && z17) {
            this.f271802e.k(new java.lang.Runnable() { // from class: gh.d$$a
                @Override // java.lang.Runnable
                public final void run() {
                    android.view.Choreographer j17;
                    gh.d this$0 = gh.d.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    if (this$0.f271804g && (j17 = this$0.j(true)) != null) {
                        j17.removeFrameCallback(this$0);
                        j17.postFrameCallback(this$0);
                        ah.i.b("AnimationFrameHandler", "Aha! we get a choreographer after try [" + this$0.f271808n + "] times ", new java.lang.Object[0]);
                    }
                }
            }, false);
            return null;
        }
        if (choreographer != null) {
            this.f271807m = choreographer;
        }
        return choreographer;
    }
}
