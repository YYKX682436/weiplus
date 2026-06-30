package q36;

/* loaded from: classes16.dex */
public final class h implements p36.d {

    /* renamed from: a, reason: collision with root package name */
    public final l36.q0 f359998a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.j f359999b;

    /* renamed from: c, reason: collision with root package name */
    public final x36.m f360000c;

    /* renamed from: d, reason: collision with root package name */
    public final x36.l f360001d;

    /* renamed from: e, reason: collision with root package name */
    public int f360002e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f360003f = 262144;

    public h(l36.q0 q0Var, o36.j jVar, x36.m mVar, x36.l lVar) {
        this.f359998a = q0Var;
        this.f359999b = jVar;
        this.f360000c = mVar;
        this.f360001d = lVar;
    }

    @Override // p36.d
    public void a(l36.w0 w0Var) {
        java.net.Proxy.Type type = this.f359999b.b().f342760c.f315476b.type();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(w0Var.f315682b);
        sb6.append(' ');
        l36.k0 k0Var = w0Var.f315681a;
        if (!k0Var.f315531a.equals("https") && type == java.net.Proxy.Type.HTTP) {
            sb6.append(k0Var);
        } else {
            sb6.append(p36.k.a(k0Var));
        }
        sb6.append(" HTTP/1.1");
        i(w0Var.f315683c, sb6.toString());
    }

    @Override // p36.d
    public x36.f0 b(l36.w0 w0Var, long j17) {
        if ("chunked".equalsIgnoreCase(w0Var.a("Transfer-Encoding"))) {
            if (this.f360002e == 1) {
                this.f360002e = 2;
                return new q36.c(this);
            }
            throw new java.lang.IllegalStateException("state: " + this.f360002e);
        }
        if (j17 == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f360002e == 1) {
            this.f360002e = 2;
            return new q36.e(this, j17);
        }
        throw new java.lang.IllegalStateException("state: " + this.f360002e);
    }

    @Override // p36.d
    public void c() {
        this.f360001d.flush();
    }

    @Override // p36.d
    public void cancel() {
        o36.d b17 = this.f359999b.b();
        if (b17 != null) {
            m36.e.d(b17.f342761d);
        }
    }

    @Override // p36.d
    public void d() {
        this.f360001d.flush();
    }

    @Override // p36.d
    public l36.c1 e(l36.a1 a1Var) {
        o36.j jVar = this.f359999b;
        l36.f0 f0Var = jVar.f342791f;
        l36.n nVar = jVar.f342790e;
        f0Var.getClass();
        java.lang.String b17 = a1Var.b("Content-Type");
        if (!p36.g.b(a1Var)) {
            return new p36.j(b17, 0L, x36.v.b(g(0L)));
        }
        if ("chunked".equalsIgnoreCase(a1Var.b("Transfer-Encoding"))) {
            l36.k0 k0Var = a1Var.f315455d.f315681a;
            if (this.f360002e == 4) {
                this.f360002e = 5;
                return new p36.j(b17, -1L, x36.v.b(new q36.d(this, k0Var)));
            }
            throw new java.lang.IllegalStateException("state: " + this.f360002e);
        }
        long a17 = p36.g.a(a1Var);
        if (a17 != -1) {
            return new p36.j(b17, a17, x36.v.b(g(a17)));
        }
        if (this.f360002e != 4) {
            throw new java.lang.IllegalStateException("state: " + this.f360002e);
        }
        if (jVar == null) {
            throw new java.lang.IllegalStateException("streamAllocation == null");
        }
        this.f360002e = 5;
        jVar.f();
        return new p36.j(b17, -1L, x36.v.b(new q36.g(this)));
    }

    @Override // p36.d
    public l36.z0 f(boolean z17) {
        int i17 = this.f360002e;
        if (i17 != 1 && i17 != 3) {
            throw new java.lang.IllegalStateException("state: " + this.f360002e);
        }
        try {
            java.lang.String A0 = this.f360000c.A0(this.f360003f);
            this.f360003f -= A0.length();
            p36.m a17 = p36.m.a(A0);
            int i18 = a17.f351742b;
            l36.z0 z0Var = new l36.z0();
            z0Var.f315692b = a17.f351741a;
            z0Var.f315693c = i18;
            z0Var.f315694d = a17.f351743c;
            z0Var.f315696f = h().e();
            if (z17 && i18 == 100) {
                return null;
            }
            if (i18 == 100) {
                this.f360002e = 3;
                return z0Var;
            }
            this.f360002e = 4;
            return z0Var;
        } catch (java.io.EOFException e17) {
            java.io.IOException iOException = new java.io.IOException("unexpected end of stream on " + this.f359999b);
            iOException.initCause(e17);
            throw iOException;
        }
    }

    public x36.h0 g(long j17) {
        if (this.f360002e == 4) {
            this.f360002e = 5;
            return new q36.f(this, j17);
        }
        throw new java.lang.IllegalStateException("state: " + this.f360002e);
    }

    public l36.i0 h() {
        l36.h0 h0Var = new l36.h0();
        while (true) {
            java.lang.String A0 = this.f360000c.A0(this.f360003f);
            this.f360003f -= A0.length();
            if (A0.length() == 0) {
                return new l36.i0(h0Var);
            }
            ((l36.o0) m36.a.f323382a).getClass();
            h0Var.a(A0);
        }
    }

    public void i(l36.i0 i0Var, java.lang.String str) {
        if (this.f360002e != 0) {
            throw new java.lang.IllegalStateException("state: " + this.f360002e);
        }
        x36.l lVar = this.f360001d;
        lVar.F0(str).F0(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        int length = i0Var.f315515a.length / 2;
        for (int i17 = 0; i17 < length; i17++) {
            lVar.F0(i0Var.d(i17)).F0(": ").F0(i0Var.f(i17)).F0(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        }
        lVar.F0(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        this.f360002e = 1;
    }
}
