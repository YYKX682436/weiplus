package oy1;

/* loaded from: classes13.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final oy1.n0 f349909d = new oy1.n0();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.modelbase.r1 r1Var;
        try {
            if (gm0.j1.h()) {
                gm0.y n17 = gm0.j1.n();
                int n18 = (n17 == null || (r1Var = n17.f273288b) == null) ? -100 : r1Var.n();
                if (n18 != 4 && n18 != 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "checkNetWorkStatus cur network status lost");
                    qy1.g gVar = qy1.g.f367725a;
                    qy1.g.f367726b.set(false);
                } else {
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.CgiReportService");
                    com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "checkNetWorkStatus cur network status active");
                    qy1.g gVar2 = qy1.g.f367725a;
                    qy1.g.f367726b.set(true);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
