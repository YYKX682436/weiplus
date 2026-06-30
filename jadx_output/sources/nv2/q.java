package nv2;

/* loaded from: classes2.dex */
public final class q extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final nv2.r f340568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f340569g;

    public q(nv2.r action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f340568f = action;
    }

    @Override // fp0.d
    public void a() {
        this.f340568f.a(new nv2.p(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f340568f.c();
    }
}
