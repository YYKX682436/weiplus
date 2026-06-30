package kl4;

/* loaded from: classes15.dex */
public final class k0 extends jm4.m4 {
    public volatile boolean A;

    /* renamed from: d, reason: collision with root package name */
    public android.media.AudioTrack f308929d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f308930e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f308931f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f308932g;

    /* renamed from: h, reason: collision with root package name */
    public int f308933h;

    /* renamed from: i, reason: collision with root package name */
    public int f308934i;

    /* renamed from: m, reason: collision with root package name */
    public int f308935m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f308936n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f308937o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f308938p;

    /* renamed from: q, reason: collision with root package name */
    public int f308939q;

    /* renamed from: r, reason: collision with root package name */
    public int f308940r;

    /* renamed from: s, reason: collision with root package name */
    public int f308941s;

    /* renamed from: t, reason: collision with root package name */
    public int f308942t;

    /* renamed from: u, reason: collision with root package name */
    public jm4.n4 f308943u;

    /* renamed from: v, reason: collision with root package name */
    public int f308944v;

    /* renamed from: w, reason: collision with root package name */
    public kl4.b0 f308945w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f308946x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f308947y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f308948z;

    public k0() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f308931f = reentrantLock;
        this.f308932g = reentrantLock.newCondition();
        kl4.b0 b0Var = kl4.b0.f308884d;
        this.f308945w = b0Var;
        kz5.p0 p0Var = kz5.p0.f313996d;
        this.f308946x = p0Var;
        this.f308947y = p0Var;
        this.f308948z = "MicroMsg.TingPlatformStreamPlayer";
        bw5.lq0 lq0Var = bw5.lq0.unknown;
        bw5.lq0 lq0Var2 = bw5.lq0.Error;
        bw5.lq0 lq0Var3 = bw5.lq0.Stop;
        this.f308946x = kz5.c0.i(kz5.c0.i(lq0Var, lq0Var, lq0Var2, lq0Var2, lq0Var2), kz5.c0.i(lq0Var3, lq0Var, bw5.lq0.PlayStart, lq0Var2, lq0Var2), kz5.c0.i(lq0Var3, lq0Var2, lq0Var, bw5.lq0.Pause, bw5.lq0.PlayEnd), kz5.c0.i(lq0Var3, lq0Var2, bw5.lq0.Resume, lq0Var, lq0Var2), kz5.c0.i(lq0Var3, lq0Var2, lq0Var, lq0Var, lq0Var));
        bw5.pq0 pq0Var = bw5.pq0.Idle;
        this.f308947y = kz5.c0.i(pq0Var, pq0Var, bw5.pq0.Playing, bw5.pq0.Paused, pq0Var);
        e(b0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlatformStreamPlayer", "TingPlatformStreamPlayer initialized");
    }

    public static final byte[] a(kl4.k0 k0Var) {
        java.util.List list;
        java.util.concurrent.locks.ReentrantLock reentrantLock = k0Var.f308931f;
        reentrantLock.lock();
        while (true) {
            list = k0Var.f308930e;
            try {
                if (!((java.util.ArrayList) list).isEmpty() || k0Var.f308936n || !k0Var.f308937o || k0Var.f308938p != null) {
                    break;
                }
                k0Var.f308932g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        byte[] bArr = k0Var.f308938p;
        if (!k0Var.f308936n && bArr == null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty()) {
                bArr = (byte[]) arrayList.remove(0);
                com.tencent.mars.xlog.Log.i(k0Var.f308948z, "dequeueBuffer " + bArr.length);
            }
        }
        return bArr;
    }

    public final void d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        ((ku5.t0) ku5.t0.f312615d).g(new kl4.f0(this));
        this.f308931f.lock();
        try {
            this.f308936n = true;
            this.f308932g.signalAll();
            this.f308931f.unlock();
            this.f308933h = 0;
            this.f308934i = 0;
            this.f308935m = 0;
            this.f308938p = null;
            this.f308939q = 0;
            this.f308940r = 0;
            this.f308937o = false;
            reentrantLock = this.f308931f;
            reentrantLock.lock();
            try {
                ((java.util.ArrayList) this.f308930e).clear();
                reentrantLock.unlock();
                e(kl4.b0.f308884d);
            } finally {
                reentrantLock.unlock();
            }
        } catch (java.lang.Throwable th6) {
            reentrantLock = this.f308931f;
            throw th6;
        }
    }

    public final void e(kl4.b0 b0Var) {
        kl4.b0 b0Var2 = this.f308945w;
        if (b0Var != b0Var2) {
            bw5.lq0 lq0Var = (bw5.lq0) ((java.util.List) this.f308946x.get(b0Var2.ordinal())).get(b0Var.ordinal());
            int i17 = ((bw5.pq0) this.f308947y.get(b0Var.ordinal())).f31808d;
            com.tencent.mars.xlog.Log.i(this.f308948z, "setPlayerState from " + this.f308945w + " to " + b0Var + ", playEvent " + lq0Var);
            this.f308945w = b0Var;
            if (this.f308943u == null || lq0Var == bw5.lq0.unknown) {
                return;
            }
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new kl4.h0(this, i17, lq0Var));
        }
    }

    public final void f() {
        ((ku5.t0) ku5.t0.f312615d).h(new kl4.j0(this), this.f308948z);
    }
}
