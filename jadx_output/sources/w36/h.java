package w36;

/* loaded from: classes16.dex */
public final class h implements l36.f1, w36.j {

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.List f442782v = java.util.Collections.singletonList(l36.r0.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    public final l36.w0 f442783a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.g1 f442784b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Random f442785c;

    /* renamed from: d, reason: collision with root package name */
    public final long f442786d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442787e;

    /* renamed from: f, reason: collision with root package name */
    public l36.n f442788f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f442789g;

    /* renamed from: h, reason: collision with root package name */
    public w36.k f442790h;

    /* renamed from: i, reason: collision with root package name */
    public w36.m f442791i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.concurrent.ScheduledExecutorService f442792j;

    /* renamed from: k, reason: collision with root package name */
    public w36.g f442793k;

    /* renamed from: n, reason: collision with root package name */
    public long f442796n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f442797o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.concurrent.ScheduledFuture f442798p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f442800r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f442801s;

    /* renamed from: t, reason: collision with root package name */
    public int f442802t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f442803u;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayDeque f442794l = new java.util.ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayDeque f442795m = new java.util.ArrayDeque();

    /* renamed from: q, reason: collision with root package name */
    public int f442799q = -1;

    public h(l36.w0 w0Var, l36.g1 g1Var, java.util.Random random, long j17) {
        if (!"GET".equals(w0Var.f315682b)) {
            throw new java.lang.IllegalArgumentException("Request must be GET: " + w0Var.f315682b);
        }
        this.f442783a = w0Var;
        this.f442784b = g1Var;
        this.f442785c = random;
        this.f442786d = j17;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f442787e = x36.o.p(bArr).h();
        this.f442789g = new w36.a(this);
    }

    public void a(l36.a1 a1Var) {
        if (a1Var.f315457f != 101) {
            throw new java.net.ProtocolException("Expected HTTP 101 response but was '" + a1Var.f315457f + " " + a1Var.f315458g + "'");
        }
        java.lang.String b17 = a1Var.b("Connection");
        if (!"Upgrade".equalsIgnoreCase(b17)) {
            throw new java.net.ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + b17 + "'");
        }
        java.lang.String b18 = a1Var.b("Upgrade");
        if (!"websocket".equalsIgnoreCase(b18)) {
            throw new java.net.ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + b18 + "'");
        }
        java.lang.String b19 = a1Var.b("Sec-WebSocket-Accept");
        java.lang.String h17 = x36.o.f451696h.a(this.f442787e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").k("SHA-1").h();
        if (h17.equals(b19)) {
            return;
        }
        throw new java.net.ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + h17 + "' but was '" + b19 + "'");
    }

    public boolean b(int i17, java.lang.String str) {
        x36.o oVar;
        synchronized (this) {
            try {
                java.lang.String a17 = w36.i.a(i17);
                if (a17 != null) {
                    throw new java.lang.IllegalArgumentException(a17);
                }
                if (str != null) {
                    oVar = x36.o.f451696h.a(str);
                    if (oVar.f451699f.length > 123) {
                        throw new java.lang.IllegalArgumentException("reason.size() > 123: ".concat(str));
                    }
                } else {
                    oVar = null;
                }
                if (!this.f442801s && !this.f442797o) {
                    this.f442797o = true;
                    this.f442795m.add(new w36.d(i17, oVar, 60000L));
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f442792j;
                    if (scheduledExecutorService != null) {
                        ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(this.f442789g);
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public void c(java.lang.Exception exc, l36.a1 a1Var) {
        synchronized (this) {
            if (this.f442801s) {
                return;
            }
            this.f442801s = true;
            w36.g gVar = this.f442793k;
            this.f442793k = null;
            java.util.concurrent.ScheduledFuture scheduledFuture = this.f442798p;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f442792j;
            if (scheduledExecutorService != null) {
                ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).shutdown();
            }
            try {
                ((ry5.b) this.f442784b).getClass();
                xy5.b.a("enricwu.SentinelConnectMgr", "[onFailure] t : " + exc + ", response : " + a1Var);
            } finally {
                m36.e.c(gVar);
            }
        }
    }

    public void d(java.lang.String str, w36.g gVar) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            try {
                this.f442793k = gVar;
                this.f442791i = new w36.m(gVar.f442779d, gVar.f442781f, this.f442785c);
                byte[] bArr = m36.e.f323386a;
                java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new m36.d(str, false));
                this.f442792j = scheduledThreadPoolExecutor;
                long j17 = this.f442786d;
                if (j17 != 0) {
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(new w36.f(this), j17, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
                }
                if (!this.f442795m.isEmpty() && (scheduledExecutorService = this.f442792j) != null) {
                    ((java.util.concurrent.ScheduledThreadPoolExecutor) scheduledExecutorService).execute(this.f442789g);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        this.f442790h = new w36.k(gVar.f442779d, gVar.f442780e, this);
    }

    public void e() {
        while (this.f442799q == -1) {
            w36.k kVar = this.f442790h;
            kVar.b();
            if (!kVar.f442811h) {
                int i17 = kVar.f442808e;
                if (i17 != 1 && i17 != 2) {
                    throw new java.net.ProtocolException("Unknown opcode: " + java.lang.Integer.toHexString(i17));
                }
                while (!kVar.f442807d) {
                    long j17 = kVar.f442809f;
                    x36.k kVar2 = kVar.f442813j;
                    if (j17 > 0) {
                        kVar.f442805b.k1(kVar2, j17);
                        if (!kVar.f442804a) {
                            x36.i iVar = kVar.f442815l;
                            kVar2.j(iVar);
                            iVar.a(kVar2.f451694e - kVar.f442809f);
                            w36.i.b(iVar, kVar.f442814k);
                            iVar.close();
                        }
                    }
                    if (kVar.f442810g) {
                        w36.j jVar = kVar.f442806c;
                        if (i17 == 1) {
                            java.lang.String q17 = kVar2.q();
                            ry5.b bVar = (ry5.b) ((w36.h) jVar).f442784b;
                            if (!bVar.f401701g) {
                                bVar.b("test");
                            }
                            ry5.c cVar = (ry5.c) bVar.f401698d;
                            cVar.getClass();
                            if (!android.text.TextUtils.isEmpty(q17)) {
                                cVar.f401705c.post(new ry5.c$$d(cVar, q17));
                            }
                        } else {
                            kVar2.l();
                            ((w36.h) jVar).f442784b.getClass();
                        }
                    } else {
                        while (!kVar.f442807d) {
                            kVar.b();
                            if (!kVar.f442811h) {
                                break;
                            } else {
                                kVar.a();
                            }
                        }
                        if (kVar.f442808e != 0) {
                            throw new java.net.ProtocolException("Expected continuation opcode. Got: " + java.lang.Integer.toHexString(kVar.f442808e));
                        }
                    }
                }
                throw new java.io.IOException("closed");
            }
            kVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    public boolean f() {
        java.lang.String str;
        int i17;
        w36.g gVar;
        java.lang.String a17;
        synchronized (this) {
            if (this.f442801s) {
                return false;
            }
            w36.m mVar = this.f442791i;
            x36.o oVar = (x36.o) this.f442794l.poll();
            w36.e eVar = 0;
            r3 = null;
            w36.g gVar2 = null;
            int i18 = -1;
            if (oVar == null) {
                java.lang.Object poll = this.f442795m.poll();
                if (poll instanceof w36.d) {
                    int i19 = this.f442799q;
                    str = this.f442800r;
                    if (i19 != -1) {
                        w36.g gVar3 = this.f442793k;
                        this.f442793k = null;
                        ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f442792j).shutdown();
                        gVar2 = gVar3;
                    } else {
                        this.f442798p = ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f442792j).schedule(new w36.c(this), ((w36.d) poll).f442775c, java.util.concurrent.TimeUnit.MILLISECONDS);
                    }
                    i18 = i19;
                } else {
                    if (poll == null) {
                        return false;
                    }
                    str = null;
                }
                int i27 = i18;
                gVar = gVar2;
                eVar = poll;
                i17 = i27;
            } else {
                str = null;
                i17 = -1;
                gVar = null;
            }
            try {
                if (oVar != null) {
                    mVar.a(10, oVar);
                } else if (eVar instanceof w36.e) {
                    x36.o oVar2 = eVar.f442777b;
                    int i28 = eVar.f442776a;
                    long l17 = oVar2.l();
                    if (mVar.f442828h) {
                        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
                    }
                    mVar.f442828h = true;
                    w36.l lVar = mVar.f442827g;
                    lVar.f442816d = i28;
                    lVar.f442817e = l17;
                    lVar.f442818f = true;
                    lVar.f442819g = false;
                    x36.l a18 = x36.v.a(lVar);
                    x36.z zVar = (x36.z) a18;
                    if (!(!zVar.f451724e)) {
                        throw new java.lang.IllegalStateException("closed".toString());
                    }
                    zVar.f451723d.x(oVar2);
                    zVar.z0();
                    ((x36.z) a18).close();
                    synchronized (this) {
                        this.f442796n -= oVar2.l();
                    }
                } else {
                    if (!(eVar instanceof w36.d)) {
                        throw new java.lang.AssertionError();
                    }
                    w36.d dVar = (w36.d) eVar;
                    int i29 = dVar.f442773a;
                    x36.o oVar3 = dVar.f442774b;
                    mVar.getClass();
                    x36.o oVar4 = x36.o.f451695g;
                    if (i29 != 0 || oVar3 != null) {
                        if (i29 != 0 && (a17 = w36.i.a(i29)) != null) {
                            throw new java.lang.IllegalArgumentException(a17);
                        }
                        x36.k kVar = new x36.k();
                        kVar.N(i29);
                        if (oVar3 != null) {
                            kVar.x(oVar3);
                        }
                        oVar4 = kVar.l();
                    }
                    try {
                        mVar.a(8, oVar4);
                        if (gVar != null) {
                            this.f442784b.a(this, i17, str);
                        }
                    } finally {
                        mVar.f442825e = true;
                    }
                }
                return true;
            } finally {
                m36.e.c(gVar);
            }
        }
    }
}
