package nv2;

/* loaded from: classes10.dex */
public final class f0 extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final nv2.r f340485f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f340486g;

    public f0(nv2.r action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f340485f = action;
    }

    @Override // fp0.d
    public void a() {
        this.f340485f.a(new nv2.e0(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f340485f.c();
    }
}
