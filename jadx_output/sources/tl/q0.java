package tl;

/* loaded from: classes12.dex */
public class q0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f420091t = true;

    /* renamed from: u, reason: collision with root package name */
    public static int f420092u;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f420093d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f420094e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f420095f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f420096g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Queue f420097h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f420098i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f420099m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f420100n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f420101o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f420102p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f420103q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final fp.j f420104r = new fp.j();

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f420105s = new com.tencent.mm.sdk.platformtools.b4(d().getLooper(), (com.tencent.mm.sdk.platformtools.a4) new tl.u0(this), false);

    public q0() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "SceneVoiceService %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        gm0.j1.d().a(127, this);
        gm0.j1.d().a(128, this);
    }

    public static void a(tl.q0 q0Var) {
        synchronized (q0Var) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "realStopThread");
            q0Var.f420094e = null;
            android.os.HandlerThread handlerThread = q0Var.f420093d;
            q0Var.f420093d = null;
            if (handlerThread != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "finishThread " + handlerThread);
                handlerThread.quitSafely();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(tl.q0 r32) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.q0.b(tl.q0):void");
    }

    public final void c() {
        ((java.util.HashMap) this.f420098i).clear();
        ((java.util.LinkedList) this.f420096g).clear();
        ((java.util.LinkedList) this.f420097h).clear();
        this.f420100n = false;
        this.f420099m = false;
        this.f420101o = false;
        f(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "Finish service use time(ms):" + this.f420104r.a() + "[" + toString() + "]");
    }

    public final synchronized com.tencent.mm.sdk.platformtools.n3 d() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_voicd_worker_handler_thread, true)) {
            return gm0.j1.e().d();
        }
        if (this.f420093d == null || this.f420094e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "getWorkerHandler create new handler thread");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SceneVoiceService-");
            int i17 = f420092u;
            f420092u = i17 + 1;
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            int i18 = pu5.i.f358473b;
            android.os.HandlerThread a17 = pu5.f.a(sb7, 0);
            this.f420093d = a17;
            a17.start();
            this.f420094e = new com.tencent.mm.sdk.platformtools.n3(this.f420093d.getLooper());
        }
        this.f420094e.removeCallbacksAndMessages(111);
        return this.f420094e;
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "run() %s", toString());
        d().postToWorker(new tl.t0(this));
    }

    public final synchronized void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "tryFinishThread stopNow: %b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f420094e;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(111);
            if (z17) {
                n3Var.removeMessages(0);
                n3Var.post(new java.lang.Runnable() { // from class: tl.q0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        tl.q0.a(tl.q0.this);
                    }
                });
            } else {
                n3Var.postAtTime(new java.lang.Runnable() { // from class: tl.q0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        tl.q0.a(tl.q0.this);
                    }
                }, 111, android.os.SystemClock.uptimeMillis() + 60000);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = toString();
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = m1Var != null ? m1Var.toString() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "[%s]errType:%s errCode:%s errMsg:%s scene:%s", objArr);
        d().postToWorker(new tl.s0(this, m1Var, i17, i18));
    }
}
