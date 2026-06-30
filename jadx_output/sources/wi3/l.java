package wi3;

/* loaded from: classes14.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final wi3.l f446226a = new wi3.l();

    /* renamed from: b, reason: collision with root package name */
    public static volatile long f446227b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.Boolean f446228c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f446229d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f446230e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Runnable f446231f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f446232g;

    static {
        com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new wi3.c());
        f446231f = wi3.k.f446225d;
        f446232g = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    public static final float[] a(wi3.l lVar, long j17, java.nio.Buffer buffer, int i17, int i18) {
        lVar.getClass();
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFGWrapper", "ptr is null");
            return new float[0];
        }
        float[] nProcess = com.tencent.mm.mmfg.MMFG.nProcess(j17, buffer, i17, i18);
        kotlin.jvm.internal.o.f(nProcess, "nProcess(...)");
        return nProcess;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0126 -> B:10:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(wi3.l r22, java.lang.String r23, float[] r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi3.l.b(wi3.l, java.lang.String, float[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "makeSureInit: mmfgPtr=" + f446227b);
        wi3.l lVar = f446226a;
        com.tencent.mm.sdk.platformtools.n3 n3Var = f446232g;
        java.lang.Runnable runnable = f446231f;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 180000L);
        if (f446227b != 0) {
            return true;
        }
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.a3 a3Var = p05.a3.f350439a;
        java.lang.String g17 = a3Var.g("MODEL_MMFG1");
        java.lang.String g18 = a3Var.g("MODEL_MMFG2");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "modelPath1:" + g17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "modelPath2:" + g18);
        if (com.tencent.mm.sdk.platformtools.t8.N0(g17, g18)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFGWrapper", "model Path null!");
            return false;
        }
        synchronized (lVar) {
            if (f446227b == 0) {
                f446227b = com.tencent.mm.mmfg.MMFG.nInit(g17, g18);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "MMFG.nInit: mmfgPtr=" + f446227b);
            }
        }
        return f446227b != 0;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFGWrapper", "delayRelease");
        com.tencent.mm.sdk.platformtools.n3 n3Var = f446232g;
        java.lang.Runnable runnable = f446231f;
        n3Var.removeCallbacks(runnable);
        n3Var.postDelayed(runnable, 3000L);
    }
}
