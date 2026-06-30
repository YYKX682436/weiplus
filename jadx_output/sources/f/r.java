package f;

/* loaded from: classes14.dex */
public final class r extends androidx.activity.result.c {

    /* renamed from: a, reason: collision with root package name */
    public final f.a f257994a;

    public r(f.a launcher, n0.e5 contract) {
        kotlin.jvm.internal.o.g(launcher, "launcher");
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f257994a = launcher;
    }

    @Override // androidx.activity.result.c
    public void a(java.lang.Object obj, z2.m mVar) {
        jz5.f0 f0Var;
        androidx.activity.result.c cVar = this.f257994a.f257969a;
        if (cVar == null) {
            f0Var = null;
        } else {
            cVar.a(obj, mVar);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            throw new java.lang.IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    @Override // androidx.activity.result.c
    public void b() {
        throw new java.lang.UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
