package l36;

/* loaded from: classes16.dex */
public final class u0 implements l36.n {

    /* renamed from: d, reason: collision with root package name */
    public final l36.q0 f315651d;

    /* renamed from: e, reason: collision with root package name */
    public final p36.l f315652e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.g f315653f;

    /* renamed from: g, reason: collision with root package name */
    public l36.f0 f315654g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.w0 f315655h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f315656i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f315657m;

    public u0(l36.q0 q0Var, l36.w0 w0Var, boolean z17) {
        this.f315651d = q0Var;
        this.f315655h = w0Var;
        this.f315656i = z17;
        this.f315652e = new p36.l(q0Var, z17);
        l36.s0 s0Var = new l36.s0(this);
        this.f315653f = s0Var;
        s0Var.g(q0Var.D, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    public void a() {
        p36.d dVar;
        o36.d dVar2;
        p36.l lVar = this.f315652e;
        lVar.f351740d = true;
        o36.j jVar = lVar.f351738b;
        if (jVar != null) {
            synchronized (jVar.f342789d) {
                jVar.f342798m = true;
                dVar = jVar.f342799n;
                dVar2 = jVar.f342795j;
            }
            if (dVar != null) {
                dVar.cancel();
            } else if (dVar2 != null) {
                m36.e.d(dVar2.f342761d);
            }
        }
    }

    public void b(l36.o oVar) {
        synchronized (this) {
            if (this.f315657m) {
                throw new java.lang.IllegalStateException("Already Executed");
            }
            this.f315657m = true;
        }
        this.f315652e.f351739c = t36.k.f415461a.j("response.body().close()");
        this.f315654g.getClass();
        l36.z zVar = this.f315651d.f315587d;
        l36.t0 t0Var = new l36.t0(this, oVar);
        synchronized (zVar) {
            ((java.util.ArrayDeque) zVar.f315688b).add(t0Var);
        }
        zVar.b();
    }

    public l36.a1 c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f315651d.f315591h);
        arrayList.add(this.f315652e);
        arrayList.add(new p36.a(this.f315651d.f315595o));
        l36.q0 q0Var = this.f315651d;
        l36.j jVar = q0Var.f315596p;
        arrayList.add(new n36.b(jVar != null ? jVar.f315516d : q0Var.f315597q));
        arrayList.add(new o36.a(this.f315651d));
        if (!this.f315656i) {
            arrayList.addAll(this.f315651d.f315592i);
        }
        arrayList.add(new p36.c(this.f315656i));
        l36.w0 w0Var = this.f315655h;
        l36.f0 f0Var = this.f315654g;
        l36.q0 q0Var2 = this.f315651d;
        l36.a1 a17 = new p36.i(arrayList, null, null, null, 0, w0Var, this, f0Var, q0Var2.E, q0Var2.F, q0Var2.G).a(w0Var, null, null, null);
        if (!this.f315652e.f351740d) {
            return a17;
        }
        m36.e.c(a17);
        throw new java.io.IOException("Canceled");
    }

    public java.lang.Object clone() {
        l36.q0 q0Var = this.f315651d;
        l36.u0 u0Var = new l36.u0(q0Var, this.f315655h, this.f315656i);
        u0Var.f315654g = ((l36.d0) q0Var.f315593m).f315474a;
        return u0Var;
    }

    public java.io.IOException d(java.io.IOException iOException) {
        if (!this.f315653f.j()) {
            return iOException;
        }
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public java.lang.String e() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f315652e.f351740d ? "canceled " : "");
        sb6.append(this.f315656i ? "web socket" : "call");
        sb6.append(" to ");
        sb6.append(this.f315655h.f315681a.n());
        return sb6.toString();
    }
}
