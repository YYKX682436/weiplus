package kz3;

/* loaded from: classes15.dex */
public final class e implements uy3.u {

    /* renamed from: d, reason: collision with root package name */
    public final kz3.l f313874d;

    /* renamed from: e, reason: collision with root package name */
    public final kz3.p f313875e;

    public e(kz3.l helper, kz3.p impl) {
        kotlin.jvm.internal.o.g(helper, "helper");
        kotlin.jvm.internal.o.g(impl, "impl");
        this.f313874d = helper;
        this.f313875e = impl;
    }

    @Override // uy3.u
    public void a(int i17, float f17, float f18) {
        this.f313875e.a(i17, f17, f18);
    }

    @Override // uy3.u
    public void b() {
        this.f313875e.b();
    }

    @Override // uy3.u
    public void c() {
        this.f313875e.c();
    }

    @Override // uy3.u
    public void d(int i17, float f17, float f18) {
        this.f313875e.d(i17, f17, f18);
    }

    @Override // uy3.u
    public void e() {
        this.f313875e.e();
        sy3.a aVar = this.f313874d.f313888f;
        if (aVar != null) {
            aVar.reset();
        }
    }

    @Override // uy3.u
    public void f() {
        this.f313875e.f();
        sy3.a aVar = this.f313874d.f313888f;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // uy3.u
    public void h() {
        this.f313875e.h();
    }
}
