package md1;

/* loaded from: classes7.dex */
public class b implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f325715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f325718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ md1.c f325719e;

    public b(md1.c cVar, long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f325719e = cVar;
        this.f325715a = j17;
        this.f325716b = str;
        this.f325717c = c0Var;
        this.f325718d = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f325715a;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "hy: exit conference result %d, %d, %s, %s, using %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, (java.lang.String) obj, java.lang.Long.valueOf(elapsedRealtime));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(elapsedRealtime);
        java.lang.String str2 = this.f325716b;
        g0Var.d(16093, str2, valueOf, valueOf2);
        md1.c cVar = this.f325719e;
        int i19 = this.f325718d;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325717c;
        if (i17 == 0 && i18 == 0) {
            g0Var.C(935L, 2L, 1L);
            c0Var.a(i19, cVar.o("ok"));
        } else {
            g0Var.C(935L, 3L, 1L);
            c0Var.a(i19, cVar.o("fail: " + str));
        }
        if (((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "close wait voip chat");
            md1.m1.a(str2);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).Ai(false);
        }
    }
}
