package nv2;

/* loaded from: classes2.dex */
public final class q1 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final nv2.r f340571f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f340572g;

    public q1(nv2.r action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f340571f = action;
    }

    @Override // fp0.d
    public void a() {
        this.f340571f.a(new nv2.p1(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f340571f.c();
    }
}
