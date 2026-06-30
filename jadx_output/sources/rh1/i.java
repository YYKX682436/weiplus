package rh1;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh1.j f395633d;

    public i(rh1.j jVar, rh1.f fVar) {
        this.f395633d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f395633d.f395635b == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f395633d.f395635b;
        if (o6Var.L0() || o6Var.S) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMultiTaskLogic", "initFloatBallHelper in work thread, but runtime finished");
            return;
        }
        if (o6Var.r0() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandMultiTaskLogic", "init, context is null");
            return;
        }
        if (this.f395633d.f395636c != null) {
            this.f395633d.f395636c.getClass();
        }
        rh1.c cVar = new rh1.c(new rh1.e(o6Var), o6Var);
        this.f395633d.f395636c = cVar;
        cVar.y(1, com.tencent.mm.plugin.multitask.s0.b(o6Var.f74803n, o6Var.f74805p.f77281g));
        if (o6Var.u0().B2 != null) {
            cVar.b0(o6Var.u0().B2.f74958d);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandMultiTaskLogic", "multiTaskData null! enter scene:%d", java.lang.Integer.valueOf(o6Var.g2()));
            if (o6Var.g2() == 1089 || o6Var.g2() == 1104) {
                cVar.f300121n = true;
            } else {
                cVar.f300121n = false;
            }
        }
        if (this.f395633d.f395635b != null) {
            o6Var.I1(new rh1.h(this));
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new rh1.g(this));
    }
}
