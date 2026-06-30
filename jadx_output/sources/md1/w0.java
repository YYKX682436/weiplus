package md1;

/* loaded from: classes7.dex */
public class w0 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md1.x0 f325813e;

    public w0(md1.x0 x0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325813e = x0Var;
        this.f325812d = c0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(bVar.ordinal());
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "onRunningStateChanged state:%d, isIsVoIPTalking:%b", valueOf, java.lang.Boolean.valueOf(p0Var.T));
        if (bVar == u81.b.DESTROYED && this.f325813e.f325814g.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "appbrand change to destroy");
            if (this.f325812d.t3() != null && this.f325812d.t3().N != null) {
                this.f325812d.t3().N.c(this.f325813e.f325815h);
            }
            md1.m1.a(str);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
            if (!this.f325813e.f325817m || this.f325812d.t3() == null) {
                return;
            }
            this.f325812d.t3().c0(this.f325813e.f325816i);
            this.f325813e.f325817m = false;
            return;
        }
        if (bVar == u81.b.BACKGROUND && this.f325813e.f325814g.equals(str)) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            boolean z17 = p0Var.Z1;
            boolean wi6 = ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi();
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiWaitVoIPChat", "isInterrupted:%b, isWait:%b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(wi6));
            if (!wi6 || z17) {
                return;
            }
            md1.m1.c(this.f325813e.f325814g);
        }
    }
}
