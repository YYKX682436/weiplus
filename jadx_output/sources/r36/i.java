package r36;

/* loaded from: classes16.dex */
public final class i implements p36.d {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f369416f = m36.e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f369417g = m36.e.m("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final l36.l0 f369418a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.j f369419b;

    /* renamed from: c, reason: collision with root package name */
    public final r36.z f369420c;

    /* renamed from: d, reason: collision with root package name */
    public r36.g0 f369421d;

    /* renamed from: e, reason: collision with root package name */
    public final l36.r0 f369422e;

    public i(l36.q0 q0Var, l36.l0 l0Var, o36.j jVar, r36.z zVar) {
        this.f369418a = l0Var;
        this.f369419b = jVar;
        this.f369420c = zVar;
        java.util.List list = q0Var.f315589f;
        l36.r0 r0Var = l36.r0.H2_PRIOR_KNOWLEDGE;
        this.f369422e = list.contains(r0Var) ? r0Var : l36.r0.HTTP_2;
    }

    @Override // p36.d
    public void a(l36.w0 w0Var) {
        int i17;
        r36.g0 g0Var;
        if (this.f369421d != null) {
            return;
        }
        w0Var.getClass();
        l36.i0 i0Var = w0Var.f315683c;
        java.util.ArrayList arrayList = new java.util.ArrayList((i0Var.f315515a.length / 2) + 4);
        arrayList.add(new r36.c(r36.c.f369350f, w0Var.f315682b));
        x36.o oVar = r36.c.f369351g;
        l36.k0 k0Var = w0Var.f315681a;
        arrayList.add(new r36.c(oVar, p36.k.a(k0Var)));
        java.lang.String a17 = w0Var.a("Host");
        if (a17 != null) {
            arrayList.add(new r36.c(r36.c.f369353i, a17));
        }
        arrayList.add(new r36.c(r36.c.f369352h, k0Var.f315531a));
        int length = i0Var.f315515a.length / 2;
        for (int i18 = 0; i18 < length; i18++) {
            x36.o a18 = x36.o.f451696h.a(i0Var.d(i18).toLowerCase(java.util.Locale.US));
            if (!f369416f.contains(a18.u())) {
                arrayList.add(new r36.c(a18, i0Var.f(i18)));
            }
        }
        r36.z zVar = this.f369420c;
        boolean z17 = !false;
        synchronized (zVar.A) {
            synchronized (zVar) {
                if (zVar.f369476i > 1073741823) {
                    zVar.j(r36.b.REFUSED_STREAM);
                }
                if (zVar.f369477m) {
                    throw new r36.a();
                }
                i17 = zVar.f369476i;
                zVar.f369476i = i17 + 2;
                g0Var = new r36.g0(i17, zVar, z17, false, null);
                if (g0Var.f()) {
                    zVar.f369473f.put(java.lang.Integer.valueOf(i17), g0Var);
                }
            }
            r36.h0 h0Var = zVar.A;
            synchronized (h0Var) {
                if (h0Var.f369414h) {
                    throw new java.io.IOException("closed");
                }
                h0Var.i(z17, i17, arrayList);
            }
        }
        r36.h0 h0Var2 = zVar.A;
        synchronized (h0Var2) {
            if (h0Var2.f369414h) {
                throw new java.io.IOException("closed");
            }
            h0Var2.f369410d.flush();
        }
        this.f369421d = g0Var;
        r36.f0 f0Var = g0Var.f369403i;
        long j17 = ((p36.i) this.f369418a).f351731j;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        f0Var.g(j17, timeUnit);
        this.f369421d.f369404j.g(((p36.i) this.f369418a).f351732k, timeUnit);
    }

    @Override // p36.d
    public x36.f0 b(l36.w0 w0Var, long j17) {
        r36.g0 g0Var = this.f369421d;
        synchronized (g0Var) {
            if (!g0Var.f369400f && !g0Var.e()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        return g0Var.f369402h;
    }

    @Override // p36.d
    public void c() {
        this.f369420c.flush();
    }

    @Override // p36.d
    public void cancel() {
        r36.g0 g0Var = this.f369421d;
        if (g0Var != null) {
            r36.b bVar = r36.b.CANCEL;
            if (g0Var.d(bVar)) {
                g0Var.f369398d.p(g0Var.f369397c, bVar);
            }
        }
    }

    @Override // p36.d
    public void d() {
        r36.g0 g0Var = this.f369421d;
        synchronized (g0Var) {
            if (!g0Var.f369400f && !g0Var.e()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        g0Var.f369402h.close();
    }

    @Override // p36.d
    public l36.c1 e(l36.a1 a1Var) {
        o36.j jVar = this.f369419b;
        l36.f0 f0Var = jVar.f342791f;
        l36.n nVar = jVar.f342790e;
        f0Var.getClass();
        return new p36.j(a1Var.b("Content-Type"), p36.g.a(a1Var), x36.v.b(new r36.h(this, this.f369421d.f369401g)));
    }

    @Override // p36.d
    public l36.z0 f(boolean z17) {
        l36.i0 i0Var;
        r36.g0 g0Var = this.f369421d;
        synchronized (g0Var) {
            g0Var.f369403i.i();
            while (((java.util.ArrayDeque) g0Var.f369399e).isEmpty() && g0Var.f369405k == null) {
                try {
                    g0Var.g();
                } catch (java.lang.Throwable th6) {
                    g0Var.f369403i.m();
                    throw th6;
                }
            }
            g0Var.f369403i.m();
            if (((java.util.ArrayDeque) g0Var.f369399e).isEmpty()) {
                throw new r36.n0(g0Var.f369405k);
            }
            i0Var = (l36.i0) ((java.util.ArrayDeque) g0Var.f369399e).removeFirst();
        }
        l36.r0 r0Var = this.f369422e;
        java.util.ArrayList arrayList = new java.util.ArrayList(20);
        int length = i0Var.f315515a.length / 2;
        p36.m mVar = null;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String d17 = i0Var.d(i17);
            java.lang.String f17 = i0Var.f(i17);
            if (d17.equals(":status")) {
                mVar = p36.m.a("HTTP/1.1 " + f17);
            } else if (!f369417g.contains(d17)) {
                ((l36.o0) m36.a.f323382a).getClass();
                arrayList.add(d17);
                arrayList.add(f17.trim());
            }
        }
        if (mVar == null) {
            throw new java.net.ProtocolException("Expected ':status' header not present");
        }
        l36.z0 z0Var = new l36.z0();
        z0Var.f315692b = r0Var;
        z0Var.f315693c = mVar.f351742b;
        z0Var.f315694d = mVar.f351743c;
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        l36.h0 h0Var = new l36.h0();
        java.util.Collections.addAll(h0Var.f315502a, strArr);
        z0Var.f315696f = h0Var;
        if (z17) {
            ((l36.o0) m36.a.f323382a).getClass();
            if (z0Var.f315693c == 100) {
                return null;
            }
        }
        return z0Var;
    }
}
