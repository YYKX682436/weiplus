package r36;

/* loaded from: classes16.dex */
public final class z implements java.io.Closeable {
    public static final java.util.concurrent.ExecutorService D;
    public final r36.h0 A;
    public final r36.y B;
    public final java.util.Set C;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f369471d;

    /* renamed from: e, reason: collision with root package name */
    public final r36.t f369472e;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f369474g;

    /* renamed from: h, reason: collision with root package name */
    public int f369475h;

    /* renamed from: i, reason: collision with root package name */
    public int f369476i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f369477m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f369478n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f369479o;

    /* renamed from: p, reason: collision with root package name */
    public final r36.l0 f369480p;

    /* renamed from: w, reason: collision with root package name */
    public long f369487w;

    /* renamed from: x, reason: collision with root package name */
    public final r36.m0 f369488x;

    /* renamed from: y, reason: collision with root package name */
    public final r36.m0 f369489y;

    /* renamed from: z, reason: collision with root package name */
    public final java.net.Socket f369490z;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f369473f = new java.util.LinkedHashMap();

    /* renamed from: q, reason: collision with root package name */
    public long f369481q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f369482r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f369483s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f369484t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f369485u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f369486v = 0;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.SynchronousQueue synchronousQueue = new java.util.concurrent.SynchronousQueue();
        byte[] bArr = m36.e.f323386a;
        D = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new m36.d("OkHttp Http2Connection", true));
    }

    public z(r36.q qVar) {
        r36.m0 m0Var = new r36.m0();
        this.f369488x = m0Var;
        r36.m0 m0Var2 = new r36.m0();
        this.f369489y = m0Var2;
        this.C = new java.util.LinkedHashSet();
        qVar.getClass();
        this.f369480p = r36.l0.f369437a;
        this.f369471d = true;
        this.f369472e = qVar.f369455e;
        this.f369476i = 3;
        m0Var.b(7, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        java.lang.String str = qVar.f369452b;
        this.f369474g = str;
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new m36.d(m36.e.j("OkHttp %s Writer", str), false));
        this.f369478n = scheduledThreadPoolExecutor;
        if (qVar.f369456f != 0) {
            r36.r rVar = new r36.r(this);
            long j17 = qVar.f369456f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(rVar, j17, j17, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        this.f369479o = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new m36.d(m36.e.j("OkHttp %s Push Observer", str), true));
        m0Var2.b(7, 65535);
        m0Var2.b(5, 16384);
        this.f369487w = m0Var2.a();
        this.f369490z = qVar.f369451a;
        this.A = new r36.h0(qVar.f369454d, true);
        this.B = new r36.y(this, new r36.c0(qVar.f369453c, true));
    }

    public void a(r36.b bVar, r36.b bVar2) {
        r36.g0[] g0VarArr = null;
        try {
            j(bVar);
            e = null;
        } catch (java.io.IOException e17) {
            e = e17;
        }
        synchronized (this) {
            if (!this.f369473f.isEmpty()) {
                g0VarArr = (r36.g0[]) ((java.util.LinkedHashMap) this.f369473f).values().toArray(new r36.g0[this.f369473f.size()]);
                ((java.util.LinkedHashMap) this.f369473f).clear();
            }
        }
        if (g0VarArr != null) {
            for (r36.g0 g0Var : g0VarArr) {
                try {
                    g0Var.c(bVar2);
                } catch (java.io.IOException e18) {
                    if (e != null) {
                        e = e18;
                    }
                }
            }
        }
        try {
            this.A.close();
        } catch (java.io.IOException e19) {
            if (e == null) {
                e = e19;
            }
        }
        try {
            this.f369490z.close();
        } catch (java.io.IOException e27) {
            e = e27;
        }
        ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f369478n).shutdown();
        ((java.util.concurrent.ThreadPoolExecutor) this.f369479o).shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void b() {
        try {
            r36.b bVar = r36.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (java.io.IOException unused) {
        }
    }

    public synchronized r36.g0 c(int i17) {
        return (r36.g0) ((java.util.LinkedHashMap) this.f369473f).get(java.lang.Integer.valueOf(i17));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(r36.b.NO_ERROR, r36.b.CANCEL);
    }

    public final synchronized void f(m36.b bVar) {
        if (!this.f369477m) {
            ((java.util.concurrent.ThreadPoolExecutor) this.f369479o).execute(bVar);
        }
    }

    public void flush() {
        r36.h0 h0Var = this.A;
        synchronized (h0Var) {
            if (h0Var.f369414h) {
                throw new java.io.IOException("closed");
            }
            h0Var.f369410d.flush();
        }
    }

    public synchronized r36.g0 i(int i17) {
        r36.g0 g0Var;
        g0Var = (r36.g0) this.f369473f.remove(java.lang.Integer.valueOf(i17));
        notifyAll();
        return g0Var;
    }

    public void j(r36.b bVar) {
        synchronized (this.A) {
            synchronized (this) {
                if (this.f369477m) {
                    return;
                }
                this.f369477m = true;
                this.A.f(this.f369475h, bVar, m36.e.f323386a);
            }
        }
    }

    public synchronized void k(long j17) {
        long j18 = this.f369486v + j17;
        this.f369486v = j18;
        if (j18 >= this.f369488x.a() / 2) {
            q(0, this.f369486v);
            this.f369486v = 0L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.A.f369413g);
        r6 = r2;
        r8.f369487w -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r9, boolean r10, x36.k r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            r36.h0 r12 = r8.A
            r12.b(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.f369487w     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map r2 = r8.f369473f     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L54
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L54
            r36.h0 r4 = r8.A     // Catch: java.lang.Throwable -> L54
            int r4 = r4.f369413g     // Catch: java.lang.Throwable -> L54
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.f369487w     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.f369487w = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            r36.h0 r4 = r8.A
            if (r10 == 0) goto L4f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = r3
        L50:
            r4.b(r5, r9, r11, r2)
            goto Ld
        L54:
            r9 = move-exception
            goto L63
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L54
            r9.interrupt()     // Catch: java.lang.Throwable -> L54
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r36.z.l(int, boolean, x36.k, long):void");
    }

    public void p(int i17, r36.b bVar) {
        try {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f369478n).execute(new r36.j(this, "OkHttp %s stream %d", new java.lang.Object[]{this.f369474g, java.lang.Integer.valueOf(i17)}, i17, bVar));
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }

    public void q(int i17, long j17) {
        try {
            ((java.util.concurrent.ScheduledThreadPoolExecutor) this.f369478n).execute(new r36.k(this, "OkHttp Window Update %s stream %d", new java.lang.Object[]{this.f369474g, java.lang.Integer.valueOf(i17)}, i17, j17));
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }
}
