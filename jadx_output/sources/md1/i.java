package md1;

/* loaded from: classes7.dex */
public class i implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md1.s f325743e;

    public i(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325743e = sVar;
        this.f325742d = c0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(p0Var.U);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: is1V1:%b, isIsVoIPTalking:%b", valueOf, java.lang.Boolean.valueOf(p0Var.T));
        if (bVar == u81.b.DESTROYED && this.f325743e.f325799v.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: appbrand change to destroy");
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.j(new md1.h(this), dz.k.ReasonWeappEnterBackground);
            if (this.f325742d.t3() != null && this.f325742d.t3().N != null) {
                this.f325742d.t3().N.c(this.f325743e.f325796s);
            }
            md1.m1.a(str);
            return;
        }
        if (bVar == u81.b.BACKGROUND && this.f325743e.f325799v.equals(str)) {
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            boolean z17 = p0Var.Z1;
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: isInterrupted:%b", java.lang.Boolean.valueOf(z17));
            md1.s sVar = this.f325743e;
            if (sVar.f325802y && !z17) {
                md1.m1.c(sVar.f325799v);
            }
            this.f325743e.f325802y = false;
        }
    }
}
