package p36;

/* loaded from: classes16.dex */
public final class c implements l36.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f351717a;

    public c(boolean z17) {
        this.f351717a = z17;
    }

    @Override // l36.m0
    public l36.a1 a(l36.l0 l0Var) {
        l36.a1 a17;
        p36.i iVar = (p36.i) l0Var;
        p36.d dVar = iVar.f351724c;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        iVar.f351729h.getClass();
        l36.w0 w0Var = iVar.f351727f;
        dVar.a(w0Var);
        boolean b17 = p36.h.b(w0Var.f315682b);
        o36.j jVar = iVar.f351723b;
        if (b17) {
            w0Var.getClass();
        }
        dVar.d();
        l36.z0 f17 = dVar.f(false);
        f17.f315691a = w0Var;
        f17.f315695e = jVar.b().f342763f;
        f17.f315701k = currentTimeMillis;
        f17.f315702l = java.lang.System.currentTimeMillis();
        l36.a1 a18 = f17.a();
        int i17 = a18.f315457f;
        if (i17 == 100) {
            l36.z0 f18 = dVar.f(false);
            f18.f315691a = w0Var;
            f18.f315695e = jVar.b().f342763f;
            f18.f315701k = currentTimeMillis;
            f18.f315702l = java.lang.System.currentTimeMillis();
            a18 = f18.a();
            i17 = a18.f315457f;
        }
        if (this.f351717a && i17 == 101) {
            l36.z0 z0Var = new l36.z0(a18);
            z0Var.f315697g = m36.e.f323388c;
            a17 = z0Var.a();
        } else {
            l36.z0 z0Var2 = new l36.z0(a18);
            z0Var2.f315697g = dVar.e(a18);
            a17 = z0Var2.a();
        }
        if ("close".equalsIgnoreCase(a17.f315455d.a("Connection")) || "close".equalsIgnoreCase(a17.b("Connection"))) {
            jVar.f();
        }
        if (i17 == 204 || i17 == 205) {
            l36.c1 c1Var = a17.f315461m;
            if (c1Var.a() > 0) {
                throw new java.net.ProtocolException("HTTP " + i17 + " had non-zero Content-Length: " + c1Var.a());
            }
        }
        return a17;
    }
}
