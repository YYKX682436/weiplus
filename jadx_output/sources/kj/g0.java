package kj;

/* loaded from: classes12.dex */
public abstract class g0 implements ei.a {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f308216d = false;

    @Override // ei.a
    public void a(boolean z17) {
    }

    public void d() {
        oj.j.c("Matrix.Tracer", "[onAlive] %s", getClass().getName());
    }

    public final synchronized void e() {
        if (this.f308216d) {
            this.f308216d = false;
            f();
        }
    }

    public void f() {
        oj.j.c("Matrix.Tracer", "[onDead] %s", getClass().getName());
    }

    public final synchronized void g() {
        if (!this.f308216d) {
            this.f308216d = true;
            d();
        }
    }
}
