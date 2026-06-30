package e0;

/* loaded from: classes14.dex */
public final class m0 implements androidx.compose.foundation.lazy.layout.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0.i f245647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0.j f245648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.n0 f245649c;

    public m0(e0.j jVar, e0.n0 n0Var) {
        this.f245648b = jVar;
        this.f245649c = n0Var;
        e0.i iVar = new e0.i(jVar.b(), jVar.a());
        jVar.f245614a.b(iVar);
        this.f245647a = iVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.c0
    public void a() {
        e0.j jVar = this.f245648b;
        jVar.getClass();
        e0.i interval = this.f245647a;
        kotlin.jvm.internal.o.g(interval, "interval");
        jVar.f245614a.k(interval);
        s1.r1 r1Var = this.f245649c.f245653d.f245584j;
        if (r1Var != null) {
            ((u1.w) r1Var).h();
        }
    }
}
