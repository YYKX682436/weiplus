package oy1;

/* loaded from: classes13.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy1.l f349882d;

    public k(oy1.l lVar) {
        this.f349882d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.modelbase.r1 r1Var;
        try {
            if (gm0.j1.h()) {
                gm0.y n17 = gm0.j1.n();
                int n18 = (n17 == null || (r1Var = n17.f273288b) == null) ? -100 : r1Var.n();
                if (n18 != 4 && n18 != 6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseCgiReport", "checkNetWorkStatus cur network status lost");
                    this.f349882d.e(false);
                } else {
                    ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.CgiReportService");
                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseCgiReport", "checkNetWorkStatus cur network status active");
                    this.f349882d.e(true);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
