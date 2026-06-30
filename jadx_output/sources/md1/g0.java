package md1;

/* loaded from: classes7.dex */
public class g0 implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fw1.b f325732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f325735d;

    public g0(md1.n0 n0Var, fw1.b bVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f325735d = n0Var;
        this.f325732a = bVar;
        this.f325733b = c0Var;
        this.f325734c = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        long j17 = this.f325735d.f325800w;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: join result result %d, %d, %s, %s, using %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, arrayList, java.lang.Long.valueOf(elapsedRealtime));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(16092, this.f325735d.f325799v, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(elapsedRealtime));
        if (i17 != 0 || i18 != 0) {
            g0Var.C(935L, 1L, 1L);
            java.util.HashMap hashMap = new java.util.HashMap();
            md1.n0 n0Var = this.f325735d;
            n0Var.C(hashMap, n0Var.D(i17, i18));
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325733b;
            int i19 = this.f325734c;
            md1.n0 n0Var2 = this.f325735d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            c0Var.a(i19, n0Var2.p(java.lang.String.format("fail: %d, %d, %s, %d", valueOf, valueOf2, str, java.lang.Long.valueOf(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.Y)), hashMap));
            this.f325735d.f325802y = false;
            return;
        }
        this.f325735d.f325800w = android.os.SystemClock.elapsedRealtime();
        md1.j1.b().d(!this.f325732a.f267057k.f267044a);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        p0Var.s(this.f325732a.f267057k.f267045b, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var.t(this.f325732a.f267057k.f267044a, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var.r(this.f325732a.f267057k.f267046c, null);
        g0Var.C(935L, 0L, 1L);
        java.util.Map H = this.f325735d.H(arrayList);
        md1.n0 n0Var3 = this.f325735d;
        n0Var3.C(H, n0Var3.D(i17, i18));
        this.f325733b.a(this.f325734c, this.f325735d.p("ok", H));
        if (!this.f325735d.f325798u) {
            this.f325735d.f325798u = true;
            this.f325733b.l(this.f325735d.f325797t);
        }
        this.f325735d.f325802y = true;
    }
}
