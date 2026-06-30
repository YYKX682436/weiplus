package md1;

/* loaded from: classes7.dex */
public class v0 implements gp1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f325809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.x0 f325811c;

    public v0(md1.x0 x0Var, boolean z17, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325811c = x0Var;
        this.f325809a = z17;
        this.f325810b = c0Var;
    }

    @Override // gp1.d0
    public void a(java.util.List list) {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        boolean z17 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.T;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "hasVoIPChat:%b, now is voip talking", java.lang.Boolean.valueOf(z17));
            return;
        }
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "ballInfoList is empty, hasVoIPChat false!");
            if (!this.f325809a) {
                ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "show the float ball window");
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(true);
            md1.x0 x0Var = this.f325811c;
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325810b;
            if (x0Var.f325815h == null) {
                x0Var.f325815h = new md1.w0(x0Var, c0Var);
            }
            if (c0Var.t3() != null && c0Var.t3().N != null) {
                c0Var.t3().N.a(x0Var.f325815h);
            }
            if (this.f325811c.f325817m) {
                return;
            }
            this.f325811c.f325817m = true;
            this.f325810b.l(this.f325811c.f325816i);
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int i17 = ((com.tencent.mm.plugin.ball.model.BallInfo) it.next()).f93046d;
            if (i17 == 17 || i17 == 19) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "has appbrand doing voip");
                z17 = true;
                break;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "hasVoIPChat:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "hide the float ball window");
            if (this.f325809a || !((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "close wait voip chat");
            md1.m1.a(this.f325811c.f325814g);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
        }
    }
}
