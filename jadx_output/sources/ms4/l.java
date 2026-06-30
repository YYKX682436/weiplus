package ms4;

/* loaded from: classes8.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.n f331058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f331061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im5.b f331062e;

    public l(ms4.n nVar, java.lang.String str, java.lang.String str2, int i17, im5.b bVar) {
        this.f331058a = nVar;
        this.f331059b = str;
        this.f331060c = str2;
        this.f331061d = i17;
        this.f331062e = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ns5 ns5Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        os4.a.a(this.f331058a.f331076p, java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashViewModel", "encashIncome errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        if (os4.h.g(fVar)) {
            this.f331058a.O6(7, 3, fVar.f70616b, fVar.f70617c);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 98);
            int i17 = fVar.f70616b;
            if (i17 == 10001) {
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                r45.ck0 ck0Var = (r45.ck0) resp;
                if (ck0Var != null && (ns5Var = ck0Var.f371617f) != null) {
                    ms4.n nVar = this.f331058a;
                    java.lang.String str = this.f331059b;
                    java.lang.String str2 = this.f331060c;
                    int i18 = this.f331061d;
                    im5.b bVar = this.f331062e;
                    kotlin.jvm.internal.o.f(resp, "resp");
                    os4.h.k("MicroMsg.WeCoinEncashViewModel", resp);
                    ((ku5.t0) ku5.t0.f312615d).k(new ms4.k(nVar, str, str2, i18, bVar), ns5Var.f381652d);
                }
            }
            this.f331058a.f331073m.postValue(new ms4.a(fVar.f70615a, i17, fVar.f70617c, (r45.js5) fVar.f70618d));
        } else {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 == null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 98);
                this.f331058a.f331073m.postValue(new ms4.a(3, -1, "", null, 8, null));
                this.f331058a.O6(7, 3, -1, "callback resp is null");
            } else {
                r45.ck0 ck0Var2 = (r45.ck0) fVar2;
                ms4.n nVar2 = this.f331058a;
                nVar2.O6(7, 3, 0, "");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 97);
                os4.h.k("MicroMsg.WeCoinEncashViewModel", ck0Var2);
                nVar2.f331074n.postValue(ck0Var2.f371615d);
            }
        }
        return jz5.f0.f302826a;
    }
}
