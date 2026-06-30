package vb5;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb5.l f434846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vb5.l lVar) {
        super(0);
        this.f434846d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer h17;
        e01.f o17 = c01.d9.b().o();
        vb5.l lVar = this.f434846d;
        java.lang.String c17 = o17.c(lVar.f198580d.x(), "showtype");
        int intValue = (c17 == null || (h17 = r26.h0.h(c17)) == null) ? 0 : h17.intValue();
        boolean f17 = c01.d9.b().o().f(lVar.f198580d.x());
        c00.b4 b4Var = (c00.b4) i95.n0.c(c00.b4.class);
        java.lang.String x17 = lVar.f198580d.x();
        int c18 = k41.h1.c(lVar.f198580d.x());
        ((b00.q2) b4Var).getClass();
        bw5.t10 t10Var = new bw5.t10();
        t10Var.f33212d = x17;
        boolean[] zArr = t10Var.f33216h;
        zArr[2] = true;
        t10Var.f33214f = intValue;
        zArr[4] = true;
        t10Var.f33213e = f17 ? 1 : 0;
        zArr[3] = true;
        t10Var.f33215g = c18;
        zArr[5] = true;
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = t10Var;
        lVar2.f70665b = new bw5.u10();
        lVar2.f70666c = "/cgi-bin/mmbiz-bin/mmeccommkf_customer_service_banner";
        lVar2.f70667d = 25520;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMEcsReportService", "reportBanner, bannerShowType: " + intValue + ", bannerStatus: " + (f17 ? 1 : 0) + ", bannerSource: " + c18);
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar2.a(), b00.p2.f16749a);
        return jz5.f0.f302826a;
    }
}
