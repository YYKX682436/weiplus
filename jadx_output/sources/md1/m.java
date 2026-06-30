package md1;

/* loaded from: classes7.dex */
public class m implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fw1.b f325765b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.s f325766c;

    public m(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, fw1.b bVar) {
        this.f325766c = sVar;
        this.f325764a = c0Var;
        this.f325765b = bVar;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        dz.k kVar = (dz.k) obj;
        long j17 = this.f325766c.f325800w;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on call interrupted! %d, %d, %s, %s, in room for %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, kVar, java.lang.Long.valueOf(elapsedRealtime));
        this.f325766c.f325802y = false;
        if (this.f325764a.t3() != null && this.f325764a.t3().N != null) {
            this.f325764a.t3().N.c(this.f325766c.f325796s);
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(16094, this.f325766c.f325799v, java.lang.Integer.valueOf(kVar.f244764d), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(this.f325766c.f325801x));
        md1.m1.a(this.f325765b.f267048b);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.o();
        md1.j1.b().c();
        if (kVar == dz.k.ReasonManual) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: manually exit, ignore");
            return;
        }
        if (kVar == dz.k.ReasonDevice) {
            g0Var.C(935L, 4L, 1L);
        }
        if (kVar == dz.k.ReasonSessionUpdateFailed) {
            g0Var.C(935L, 5L, 1L);
        }
        if (kVar == dz.k.ReasonUnknown) {
            g0Var.C(935L, 6L, 1L);
        }
        if (kVar == dz.k.ReasonInterrupted) {
            g0Var.C(935L, 7L, 1L);
        }
        md1.c1 c1Var = this.f325766c.f325789i;
        c1Var.u(this.f325764a);
        c1Var.x(kVar);
    }
}
