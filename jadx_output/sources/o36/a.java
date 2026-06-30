package o36;

/* loaded from: classes16.dex */
public final class a implements l36.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.q0 f342753a;

    public a(l36.q0 q0Var) {
        this.f342753a = q0Var;
    }

    @Override // l36.m0
    public l36.a1 a(l36.l0 l0Var) {
        p36.i iVar = (p36.i) l0Var;
        l36.w0 w0Var = iVar.f351727f;
        o36.j jVar = iVar.f351723b;
        boolean z17 = !w0Var.f315682b.equals("GET");
        l36.q0 q0Var = this.f342753a;
        jVar.getClass();
        p36.i iVar2 = (p36.i) l0Var;
        try {
            p36.d h17 = jVar.e(iVar2.f351730i, iVar2.f351731j, iVar2.f351732k, q0Var.H, q0Var.C, z17).h(q0Var, l0Var, jVar);
            synchronized (jVar.f342789d) {
                jVar.f342799n = h17;
            }
            return iVar.a(w0Var, jVar, h17, jVar.b());
        } catch (java.io.IOException e17) {
            throw new o36.f(e17);
        }
    }
}
