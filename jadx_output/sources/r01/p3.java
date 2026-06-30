package r01;

/* loaded from: classes11.dex */
public class p3 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r01.q3 f368184a;

    public p3(r01.q3 q3Var) {
        this.f368184a = q3Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "onEnterForeground");
        r01.q3 q3Var = this.f368184a;
        if (q3Var.A.booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBiz", "onEnterForeground check me tab and fetch biz status");
            ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
            gVar.getClass();
            com.tencent.wechat.mm.biz.y0.f218792a = ox.e.f349462a;
            com.tencent.wechat.mm.biz.y0.f218793b = ox.f.f349468a;
            com.tencent.wechat.iam.biz.l0.f217758c.e(gVar.fj(), gVar.mj(), new ox.b(gVar));
            ((r01.l1) i95.n0.c(r01.l1.class)).cj();
        }
        q3Var.A = java.lang.Boolean.TRUE;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        zg0.y2 y2Var = (zg0.y2) i95.n0.c(zg0.y2.class);
        if (y2Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MpScreenshotCleanupService", "onProcessExitForeground: dispatched");
            ((ku5.t0) ku5.t0.f312615d).B(new zx4.f((zx4.g) y2Var));
        }
    }
}
