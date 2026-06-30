package md1;

/* loaded from: classes7.dex */
public class l implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fw1.b f325758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f325760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md1.s f325761d;

    public l(md1.s sVar, fw1.b bVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f325761d = sVar;
        this.f325758a = bVar;
        this.f325759b = c0Var;
        this.f325760c = i17;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        long j17 = this.f325761d.f325800w;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: join result result %d, %d, %s, %s, using %d ms", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, arrayList, java.lang.Long.valueOf(elapsedRealtime));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(16092, this.f325761d.f325799v, java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(elapsedRealtime));
        if (i17 != 0 || i18 != 0) {
            g0Var.C(935L, 1L, 1L);
            java.util.HashMap hashMap = new java.util.HashMap();
            md1.s sVar = this.f325761d;
            sVar.C(hashMap, sVar.D(i17, i18));
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325759b;
            int i19 = this.f325760c;
            md1.s sVar2 = this.f325761d;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
            java.lang.String format = java.lang.String.format("fail: %d, %d, %s, %d", valueOf, valueOf2, str, java.lang.Long.valueOf(p0Var.Y));
            sVar2.getClass();
            if (format == null) {
                format = "fail:internal error";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 4);
            c0Var.a(i19, sVar2.t(format, hashMap));
            this.f325761d.f325802y = false;
            ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
            p0Var.o();
            return;
        }
        this.f325761d.f325800w = android.os.SystemClock.elapsedRealtime();
        md1.j1.b().d(!this.f325758a.f267057k.f267044a);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var2 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        p0Var2.t(this.f325758a.f267057k.f267044a, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var2.s(this.f325758a.f267057k.f267045b, null);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var2.r(this.f325758a.f267057k.f267046c, null);
        g0Var.C(935L, 0L, 1L);
        java.util.Map H = this.f325761d.H(arrayList);
        md1.s sVar3 = this.f325761d;
        sVar3.C(H, sVar3.D(i17, i18));
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f325759b;
        int i27 = this.f325760c;
        md1.s sVar4 = this.f325761d;
        sVar4.getClass();
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        ((java.util.HashMap) H).put("errno", 0);
        c0Var2.a(i27, sVar4.t("ok", H));
        md1.s sVar5 = this.f325761d;
        sVar5.f325802y = true;
        if (sVar5.f325798u) {
            return;
        }
        this.f325761d.f325798u = true;
        this.f325759b.l(this.f325761d.f325797t);
    }
}
