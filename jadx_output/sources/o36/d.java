package o36;

/* loaded from: classes16.dex */
public final class d extends r36.t {

    /* renamed from: b, reason: collision with root package name */
    public final l36.t f342759b;

    /* renamed from: c, reason: collision with root package name */
    public final l36.d1 f342760c;

    /* renamed from: d, reason: collision with root package name */
    public java.net.Socket f342761d;

    /* renamed from: e, reason: collision with root package name */
    public java.net.Socket f342762e;

    /* renamed from: f, reason: collision with root package name */
    public l36.g0 f342763f;

    /* renamed from: g, reason: collision with root package name */
    public l36.r0 f342764g;

    /* renamed from: h, reason: collision with root package name */
    public r36.z f342765h;

    /* renamed from: i, reason: collision with root package name */
    public x36.m f342766i;

    /* renamed from: j, reason: collision with root package name */
    public x36.l f342767j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f342768k;

    /* renamed from: l, reason: collision with root package name */
    public int f342769l;

    /* renamed from: m, reason: collision with root package name */
    public int f342770m = 1;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f342771n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public long f342772o = com.tencent.wcdb.core.Database.DictDefaultMatchValue;

    public d(l36.t tVar, l36.d1 d1Var) {
        this.f342759b = tVar;
        this.f342760c = d1Var;
    }

    @Override // r36.t
    public void a(r36.z zVar) {
        int i17;
        synchronized (this.f342759b) {
            try {
                synchronized (zVar) {
                    r36.m0 m0Var = zVar.f369489y;
                    i17 = (m0Var.f369440a & 16) != 0 ? m0Var.f369441b[4] : Integer.MAX_VALUE;
                }
                this.f342770m = i17;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // r36.t
    public void b(r36.g0 g0Var) {
        g0Var.c(r36.b.REFUSED_STREAM);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0100 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0176 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r16, int r17, int r18, int r19, boolean r20, l36.n r21, l36.f0 r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o36.d.c(int, int, int, int, boolean, l36.n, l36.f0):void");
    }

    public final void d(int i17, int i18, l36.n nVar, l36.f0 f0Var) {
        l36.d1 d1Var = this.f342760c;
        java.net.Proxy proxy = d1Var.f315476b;
        this.f342761d = (proxy.type() == java.net.Proxy.Type.DIRECT || proxy.type() == java.net.Proxy.Type.HTTP) ? d1Var.f315475a.f315446c.createSocket() : new java.net.Socket(proxy);
        java.net.InetSocketAddress inetSocketAddress = d1Var.f315477c;
        f0Var.getClass();
        this.f342761d.setSoTimeout(i18);
        try {
            t36.k.f415461a.g(this.f342761d, d1Var.f315477c, i17);
            try {
                this.f342766i = x36.v.b(x36.v.g(this.f342761d));
                this.f342767j = x36.v.a(x36.v.d(this.f342761d));
            } catch (java.lang.NullPointerException e17) {
                if ("throw with null exception".equals(e17.getMessage())) {
                    throw new java.io.IOException(e17);
                }
            }
        } catch (java.net.ConnectException e18) {
            java.net.ConnectException connectException = new java.net.ConnectException("Failed to connect to " + d1Var.f315477c);
            connectException.initCause(e18);
            throw connectException;
        }
    }

    public final void e(int i17, int i18, int i19, l36.n nVar, l36.f0 f0Var) {
        l36.v0 v0Var = new l36.v0();
        l36.d1 d1Var = this.f342760c;
        v0Var.f(d1Var.f315475a.f315444a);
        v0Var.c("CONNECT", null);
        l36.a aVar = d1Var.f315475a;
        v0Var.f315666c.e("Host", m36.e.k(aVar.f315444a, true));
        v0Var.f315666c.e("Proxy-Connection", "Keep-Alive");
        v0Var.f315666c.e("User-Agent", "okhttp/3.12.13");
        l36.w0 a17 = v0Var.a();
        l36.z0 z0Var = new l36.z0();
        z0Var.f315691a = a17;
        z0Var.f315692b = l36.r0.HTTP_1_1;
        z0Var.f315693c = 407;
        z0Var.f315694d = "Preemptive Authenticate";
        z0Var.f315697g = m36.e.f323388c;
        z0Var.f315701k = -1L;
        z0Var.f315702l = -1L;
        z0Var.f315696f.e("Proxy-Authenticate", "OkHttp-Preemptive");
        z0Var.a();
        aVar.f315447d.getClass();
        d(i17, i18, nVar, f0Var);
        java.lang.String str = "CONNECT " + m36.e.k(a17.f315681a, true) + " HTTP/1.1";
        x36.m mVar = this.f342766i;
        q36.h hVar = new q36.h(null, null, mVar, this.f342767j);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        mVar.h().g(i18, timeUnit);
        this.f342767j.h().g(i19, timeUnit);
        hVar.i(a17.f315683c, str);
        hVar.d();
        l36.z0 f17 = hVar.f(false);
        f17.f315691a = a17;
        l36.a1 a18 = f17.a();
        long a19 = p36.g.a(a18);
        if (a19 == -1) {
            a19 = 0;
        }
        x36.h0 g17 = hVar.g(a19);
        m36.e.q(g17, Integer.MAX_VALUE, timeUnit);
        ((q36.f) g17).close();
        int i27 = a18.f315457f;
        if (i27 == 200) {
            if (!this.f342766i.m().o1() || !this.f342767j.m().o1()) {
                throw new java.io.IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i27 == 407) {
                d1Var.f315475a.f315447d.getClass();
                throw new java.io.IOException("Failed to authenticate with proxy");
            }
            throw new java.io.IOException("Unexpected response code for CONNECT: " + i27);
        }
    }

    public final void f(o36.b bVar, int i17, l36.n nVar, l36.f0 f0Var) {
        javax.net.ssl.SSLSocket sSLSocket;
        l36.d1 d1Var = this.f342760c;
        l36.a aVar = d1Var.f315475a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = aVar.f315452i;
        l36.r0 r0Var = l36.r0.HTTP_1_1;
        if (sSLSocketFactory == null) {
            java.util.List list = aVar.f315448e;
            l36.r0 r0Var2 = l36.r0.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(r0Var2)) {
                this.f342762e = this.f342761d;
                this.f342764g = r0Var;
                return;
            } else {
                this.f342762e = this.f342761d;
                this.f342764g = r0Var2;
                i(i17);
                return;
            }
        }
        f0Var.getClass();
        l36.a aVar2 = d1Var.f315475a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = aVar2.f315452i;
        l36.k0 k0Var = aVar2.f315444a;
        try {
            try {
                sSLSocket = (javax.net.ssl.SSLSocket) sSLSocketFactory2.createSocket(this.f342761d, k0Var.f315534d, k0Var.f315535e, true);
            } catch (java.lang.Throwable th6) {
                th = th6;
                sSLSocket = null;
            }
        } catch (java.lang.AssertionError e17) {
            e = e17;
        }
        try {
            l36.v a17 = bVar.a(sSLSocket);
            java.lang.String str = k0Var.f315534d;
            boolean z17 = a17.f315661b;
            if (z17) {
                t36.k.f415461a.f(sSLSocket, str, aVar2.f315448e);
            }
            sSLSocket.startHandshake();
            javax.net.ssl.SSLSession session = sSLSocket.getSession();
            l36.g0 a18 = l36.g0.a(session);
            boolean verify = aVar2.f315453j.verify(str, session);
            java.util.List list2 = a18.f315496c;
            if (verify) {
                aVar2.f315454k.a(str, list2);
                java.lang.String i18 = z17 ? t36.k.f415461a.i(sSLSocket) : null;
                this.f342762e = sSLSocket;
                this.f342766i = x36.v.b(x36.v.g(sSLSocket));
                this.f342767j = x36.v.a(x36.v.d(this.f342762e));
                this.f342763f = a18;
                if (i18 != null) {
                    r0Var = l36.r0.a(i18);
                }
                this.f342764g = r0Var;
                t36.k.f415461a.a(sSLSocket);
                if (this.f342764g == l36.r0.HTTP_2) {
                    i(i17);
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
            }
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) list2.get(0);
            throw new javax.net.ssl.SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + l36.p.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + v36.d.a(x509Certificate));
        } catch (java.lang.AssertionError e18) {
            e = e18;
            if (!m36.e.o(e)) {
                throw e;
            }
            throw new java.io.IOException(e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (sSLSocket != null) {
                t36.k.f415461a.a(sSLSocket);
            }
            m36.e.d(sSLSocket);
            throw th;
        }
    }

    public boolean g(l36.a aVar, l36.d1 d1Var) {
        if (((java.util.ArrayList) this.f342771n).size() < this.f342770m && !this.f342768k) {
            m36.a aVar2 = m36.a.f323382a;
            l36.d1 d1Var2 = this.f342760c;
            l36.a aVar3 = d1Var2.f315475a;
            ((l36.o0) aVar2).getClass();
            if (!aVar3.a(aVar)) {
                return false;
            }
            l36.k0 k0Var = aVar.f315444a;
            if (k0Var.f315534d.equals(d1Var2.f315475a.f315444a.f315534d)) {
                return true;
            }
            if (this.f342765h == null || d1Var == null || d1Var.f315476b.type() != java.net.Proxy.Type.DIRECT || d1Var2.f315476b.type() != java.net.Proxy.Type.DIRECT || !d1Var2.f315477c.equals(d1Var.f315477c) || d1Var.f315475a.f315453j != v36.d.f433175a || !j(k0Var)) {
                return false;
            }
            try {
                aVar.f315454k.a(k0Var.f315534d, this.f342763f.f315496c);
                return true;
            } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public p36.d h(l36.q0 q0Var, l36.l0 l0Var, o36.j jVar) {
        if (this.f342765h != null) {
            return new r36.i(q0Var, l0Var, jVar, this.f342765h);
        }
        this.f342762e.setSoTimeout(((p36.i) l0Var).f351731j);
        x36.j0 h17 = this.f342766i.h();
        long j17 = ((p36.i) l0Var).f351731j;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        h17.g(j17, timeUnit);
        this.f342767j.h().g(r6.f351732k, timeUnit);
        return new q36.h(q0Var, jVar, this.f342766i, this.f342767j);
    }

    public final void i(int i17) {
        this.f342762e.setSoTimeout(0);
        r36.q qVar = new r36.q(true);
        java.net.Socket socket = this.f342762e;
        java.lang.String str = this.f342760c.f315475a.f315444a.f315534d;
        x36.m mVar = this.f342766i;
        x36.l lVar = this.f342767j;
        qVar.f369451a = socket;
        qVar.f369452b = str;
        qVar.f369453c = mVar;
        qVar.f369454d = lVar;
        qVar.f369455e = this;
        qVar.f369456f = i17;
        r36.z zVar = new r36.z(qVar);
        this.f342765h = zVar;
        r36.h0 h0Var = zVar.A;
        synchronized (h0Var) {
            if (h0Var.f369414h) {
                throw new java.io.IOException("closed");
            }
            if (h0Var.f369411e) {
                java.util.logging.Logger logger = r36.h0.f369409m;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine(m36.e.j(">> CONNECTION %s", r36.g.f369391a.m()));
                }
                x36.l lVar2 = h0Var.f369410d;
                byte[] bArr = r36.g.f369391a.f451699f;
                byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.o.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                lVar2.write(copyOf);
                h0Var.f369410d.flush();
            }
        }
        r36.h0 h0Var2 = zVar.A;
        r36.m0 m0Var = zVar.f369488x;
        synchronized (h0Var2) {
            if (h0Var2.f369414h) {
                throw new java.io.IOException("closed");
            }
            h0Var2.c(0, java.lang.Integer.bitCount(m0Var.f369440a) * 6, (byte) 4, (byte) 0);
            int i18 = 0;
            while (i18 < 10) {
                if (((1 << i18) & m0Var.f369440a) != 0) {
                    h0Var2.f369410d.i1(i18 == 4 ? 3 : i18 == 7 ? 4 : i18);
                    h0Var2.f369410d.o(m0Var.f369441b[i18]);
                }
                i18++;
            }
            h0Var2.f369410d.flush();
        }
        if (zVar.f369488x.a() != 65535) {
            zVar.A.l(0, r0 - 65535);
        }
        new java.lang.Thread(zVar.B).start();
    }

    public boolean j(l36.k0 k0Var) {
        int i17 = k0Var.f315535e;
        l36.k0 k0Var2 = this.f342760c.f315475a.f315444a;
        if (i17 != k0Var2.f315535e) {
            return false;
        }
        java.lang.String str = k0Var2.f315534d;
        java.lang.String str2 = k0Var.f315534d;
        if (str2.equals(str)) {
            return true;
        }
        l36.g0 g0Var = this.f342763f;
        return g0Var != null && v36.d.f433175a.c(str2, (java.security.cert.X509Certificate) g0Var.f315496c.get(0));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Connection{");
        l36.d1 d1Var = this.f342760c;
        sb6.append(d1Var.f315475a.f315444a.f315534d);
        sb6.append(":");
        sb6.append(d1Var.f315475a.f315444a.f315535e);
        sb6.append(", proxy=");
        sb6.append(d1Var.f315476b);
        sb6.append(" hostAddress=");
        sb6.append(d1Var.f315477c);
        sb6.append(" cipherSuite=");
        l36.g0 g0Var = this.f342763f;
        sb6.append(g0Var != null ? g0Var.f315495b : com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        sb6.append(" protocol=");
        sb6.append(this.f342764g);
        sb6.append('}');
        return sb6.toString();
    }
}
