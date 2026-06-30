package gh;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: h, reason: collision with root package name */
    public static final gh.a f271800h = new gh.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.magicbrush.MBRuntime f271801d;

    /* renamed from: e, reason: collision with root package name */
    public final ch.g f271802e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f271803f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f271804g;

    public c(com.tencent.magicbrush.MBRuntime runtime, ch.g jsThreadHandler) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(jsThreadHandler, "jsThreadHandler");
        this.f271801d = runtime;
        this.f271802e = jsThreadHandler;
        this.f271803f = new java.lang.Object();
    }

    public final void a() {
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] destroy", b().name());
        synchronized (this.f271803f) {
            if (this.f271804g) {
                ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] pause automatically", b().name());
                h();
            }
            e();
        }
    }

    public abstract gh.b b();

    public final void c(double d17) {
        com.tencent.magicbrush.MBRuntime mBRuntime = this.f271801d;
        if (mBRuntime.f48577a == 0) {
            return;
        }
        mBRuntime.nativeNotifyAnimationFrame(mBRuntime.f48577a, d17);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public final void h() {
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] pause", b().name());
        synchronized (this.f271803f) {
            if (this.f271804g) {
                f();
                this.f271804g = false;
            }
        }
    }

    public final void i() {
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[%s] resume", b().name());
        synchronized (this.f271803f) {
            if (this.f271804g) {
                return;
            }
            g();
            this.f271804g = true;
        }
    }
}
