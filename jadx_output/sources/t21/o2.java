package t21;

@j95.b
/* loaded from: classes12.dex */
public class o2 extends i95.w {

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f414849m;

    /* renamed from: d, reason: collision with root package name */
    public volatile t21.w2 f414850d;

    /* renamed from: e, reason: collision with root package name */
    public volatile t21.k3 f414851e;

    /* renamed from: f, reason: collision with root package name */
    public volatile t21.p3 f414852f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelcdntran.l3 f414853g = null;

    /* renamed from: h, reason: collision with root package name */
    public t21.c2 f414854h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f414855i = new t21.m2(this);

    public static t21.o2 Bi() {
        return (t21.o2) i95.n0.c(t21.o2.class);
    }

    public static com.tencent.mm.modelcdntran.l3 Di() {
        gm0.j1.b().c();
        if (Bi().f414853g == null) {
            Bi().f414853g = new com.tencent.mm.modelcdntran.l3();
        }
        ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).getClass();
        if (com.tencent.mm.modelcdntran.s1.cj().f71058v == null) {
            sx.a0 a0Var = (sx.a0) i95.n0.c(sx.a0.class);
            com.tencent.mm.modelcdntran.l3 l3Var = Bi().f414853g;
            ((rx.a) a0Var).getClass();
            com.tencent.mm.modelcdntran.l1 cj6 = com.tencent.mm.modelcdntran.s1.cj();
            cj6.f71058v = l3Var;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(cj6.hashCode());
            objArr[1] = java.lang.Integer.valueOf(l3Var != null ? l3Var.hashCode() : 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "set cdn online video callback hash[%d] onlineVideoCallback[%d]", objArr);
        }
        return Bi().f414853g;
    }

    public static t21.c2 Ni() {
        gm0.j1.b().c();
        if (Bi().f414854h == null) {
            Bi().f414854h = new t21.c2();
        }
        return Bi().f414854h;
    }

    public static synchronized t21.w2 Ui() {
        t21.w2 w2Var;
        synchronized (t21.o2.class) {
            if (!gm0.j1.a()) {
                throw new c01.c();
            }
            if (Bi().f414850d == null) {
                Bi().f414850d = new t21.w2(gm0.j1.u().f273153f);
                Bi().f414850d.b(Zi(), android.os.Looper.getMainLooper());
            }
            w2Var = Bi().f414850d;
        }
        return w2Var;
    }

    public static t21.k3 Vi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (Bi().f414851e == null) {
            Bi().f414851e = new t21.k3(gm0.j1.u().f273153f);
        }
        return Bi().f414851e;
    }

    public static t21.p3 Zi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        if (Bi().f414852f == null) {
            Bi().f414852f = new t21.p3();
        }
        return Bi().f414852f;
    }

    public static boolean aj(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        wi();
        if (j17 > 0) {
            f414849m.postDelayed(runnable, j17);
            return true;
        }
        f414849m.post(runnable);
        return true;
    }

    public static boolean bj(java.lang.Runnable runnable) {
        if (runnable == null) {
            return true;
        }
        wi();
        com.tencent.mm.sdk.platformtools.n3 n3Var = f414849m;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreVideo", "short video decoder handler is null");
            return false;
        }
        n3Var.removeCallbacks(runnable);
        return true;
    }

    public static void wi() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = f414849m;
        if (n3Var == null || n3Var.isQuit()) {
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = new com.tencent.mm.sdk.platformtools.n3("Short-Video-Decoder-Thread-" + java.lang.System.currentTimeMillis());
            f414849m = n3Var2;
            n3Var2.setLogging(false);
        }
    }

    public java.lang.String Ai() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("video/");
        return com.tencent.mm.vfs.w6.i(sb6.toString(), true);
    }

    public java.lang.String Ri() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().d());
        sb6.append("subvideo/");
        return com.tencent.mm.vfs.w6.i(sb6.toString(), true);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideo", "%d onAccountPostReset ", java.lang.Integer.valueOf(hashCode()));
        this.f414855i.alive();
        com.tencent.mm.sdk.platformtools.n3 n3Var = f414849m;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        gm0.j1.e().j(new t21.n2(this));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVideo", "%d onAccountRelease ", java.lang.Integer.valueOf(hashCode()));
        this.f414855i.dead();
        try {
            if (Bi().f414852f != null) {
                t21.p3 p3Var = Bi().f414852f;
                p3Var.f414876s = 0;
                if (p3Var.f414878u != null) {
                    gm0.j1.d().d(p3Var.f414878u);
                }
                if (p3Var.f414879v != null) {
                    gm0.j1.d().d(p3Var.f414879v);
                }
                p3Var.f414881x.clear();
            }
            Bi().getClass();
            if (Bi().f414854h != null) {
                t21.c2 c2Var = Bi().f414854h;
                c2Var.g();
                c2Var.f414720a.clear();
            }
            if (Bi().f414853g != null) {
                com.tencent.mm.modelcdntran.l3 l3Var = Bi().f414853g;
                l3Var.getClass();
                gm0.j1.d().q(379, l3Var);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreVideo", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = f414849m;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        try {
            t21.p3 Zi = Zi();
            Zi.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoService", "quitVideoSendThread");
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = Zi.f414864d;
            if (n3Var2 != null) {
                try {
                    n3Var2.quit();
                    Zi.f414865e = false;
                    Zi.f414864d = null;
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VideoService", "quitVideoSendThread error: %s", e18.getMessage());
                }
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreVideo", "onAccountRelease, quitVideoSendThread error: %s", e19.getMessage());
        }
        ei3.x.f253187d.c();
    }
}
