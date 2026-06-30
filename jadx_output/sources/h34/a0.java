package h34;

/* loaded from: classes15.dex */
public class a0 extends c34.z {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f278477h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f278478i;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f278479e;

    /* renamed from: f, reason: collision with root package name */
    public final h34.f f278480f;

    /* renamed from: g, reason: collision with root package name */
    public long f278481g;

    public a0(android.content.Context context, c34.x xVar) {
        super(xVar);
        this.f278480f = new h34.f();
        this.f278479e = context;
        f278478i = false;
    }

    @Override // c34.z
    public void a() {
        this.f38247d = null;
        this.f278480f.c();
        if (f278478i) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f278481g;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(10987, 1, "", 2, java.lang.Integer.valueOf((int) currentTimeMillis));
            g0Var.C(835L, 1L, 1L);
            f278478i = false;
        }
    }

    @Override // c34.z
    public void b() {
        boolean z17;
        if (f278477h) {
            return;
        }
        h34.f fVar = this.f278480f;
        synchronized (fVar.f278512n) {
            if (!fVar.f278519u) {
                int QAFPInit = com.tencent.qafpapi.QAFPNative.QAFPInit();
                if (QAFPInit >= 0) {
                    fVar.f278519u = true;
                }
                z17 = QAFPInit >= 0;
            }
        }
        if (z17) {
            f278477h = true;
        } else {
            com.tencent.mars.xlog.Log.e("Micromsg.ShakeTVService", "init MusicFingerPrintRecorder false");
        }
    }

    @Override // c34.z
    public void c() {
    }

    @Override // c34.z
    public void d() {
    }

    @Override // c34.z
    public void e() {
        if (this.f38247d == null) {
            com.tencent.mars.xlog.Log.w("Micromsg.ShakeTVService", "shakeGetListener == null");
            return;
        }
        if (!(this.f278479e instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("Micromsg.ShakeTVService", "context not an Activity");
            ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) this.f38247d).a7(new java.util.ArrayList(), 0L);
            return;
        }
        f278478i = true;
        this.f278481g = java.lang.System.currentTimeMillis();
        h34.f fVar = this.f278480f;
        h34.s sVar = new h34.s() { // from class: h34.a0$$a
            /* JADX WARN: Failed to find 'out' block for switch in B:41:0x0167. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:121:0x033e  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x04a0  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0519  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x05ab  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x05d8  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0189  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x0228  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x02be  */
            @Override // h34.s
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(r45.js5 r27, long r28, boolean r30) {
                /*
                    Method dump skipped, instructions count: 1650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: h34.a0$$a.a(r45.js5, long, boolean):void");
            }
        };
        fVar.c();
        synchronized (fVar.f278512n) {
            fVar.f278518t = com.tencent.qafpapi.QAFPNative.QAFPGetVersion();
        }
        synchronized (fVar.f278512n) {
            if (!fVar.f278519u) {
                if (com.tencent.qafpapi.QAFPNative.QAFPInit() >= 0) {
                    fVar.f278519u = true;
                }
            }
        }
        fVar.f278509h = 408;
        fVar.f278513o = sVar;
        fVar.f278516r = false;
        fVar.f278515q = false;
        fVar.f278510i = false;
        fVar.f278522x = false;
        c01.d9.e().a(367, fVar);
        c01.d9.e().a(408, fVar);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fVar.f278517s = (int) java.lang.System.currentTimeMillis();
        tl.w wVar = new tl.w(8000, 1, 4);
        fVar.f278514p = wVar;
        wVar.f420160m = -19;
        wVar.f420172y = fVar.f278523y;
        if (wVar.k()) {
            synchronized (fVar.f278512n) {
                int QAFPReset = com.tencent.qafpapi.QAFPNative.QAFPReset();
                if (QAFPReset < 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MusicFingerPrintRecorder", "init failed QAFPReset:%d clientid:%d", java.lang.Integer.valueOf(QAFPReset), java.lang.Integer.valueOf(fVar.f278517s));
                    fVar.b();
                } else {
                    fVar.f278508g = java.lang.System.currentTimeMillis();
                    fVar.f278520v = java.lang.System.currentTimeMillis();
                    fVar.f278521w = 0;
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicFingerPrintRecorder", "start record failed");
            fVar.b();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(835L, 5L, 1L);
    }

    public final void f(java.util.List list, long j17) {
        c34.x xVar = this.f38247d;
        if (xVar != null) {
            ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar).a7(list, j17);
        }
    }
}
