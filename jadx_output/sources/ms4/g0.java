package ms4;

/* loaded from: classes8.dex */
public final class g0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.j0 f331021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f331022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ js4.n f331023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f331024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gc5 f331027g;

    public g0(ms4.j0 j0Var, android.app.Activity activity, js4.n nVar, int i17, java.lang.String str, java.lang.String str2, r45.gc5 gc5Var) {
        this.f331021a = j0Var;
        this.f331022b = activity;
        this.f331023c = nVar;
        this.f331024d = i17;
        this.f331025e = str;
        this.f331026f = str2;
        this.f331027g = gc5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.f04 f04Var;
        java.lang.String str;
        int i17;
        java.lang.String str2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "prepareWecoinRecharge errorType: " + fVar.f70615a + ", errorCode: " + fVar.f70616b + ", errorMsg: " + fVar.f70617c);
        ms4.j0 j0Var = this.f331021a;
        j0Var.f331050d = null;
        android.app.Activity activity = this.f331022b;
        j0Var.f(activity, false);
        boolean h17 = os4.h.h(fVar);
        js4.n nVar = this.f331023c;
        if (h17) {
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            r45.hc5 hc5Var = (r45.hc5) resp;
            if (hc5Var == null || (f04Var = hc5Var.f376052h) == null) {
                ms4.a aVar = new ms4.a(fVar.f70615a, fVar.f70616b, fVar.f70617c, null, 8, null);
                js4.o oVar = nVar.f301546d;
                java.util.Objects.toString(aVar);
                os4.h.e(activity, aVar, new ms4.h0(aVar, oVar));
                this.f331021a.e(this.f331024d, this.f331025e, this.f331026f, 3, 3, fVar.f70616b, fVar.f70617c);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 22);
            } else {
                android.app.Activity activity2 = this.f331022b;
                java.lang.String str3 = this.f331026f;
                int i18 = this.f331024d;
                java.lang.String str4 = this.f331025e;
                kotlin.jvm.internal.o.f(resp, "resp");
                os4.h.k("MicroMsg.WeCoinMidasInitializer", resp);
                r45.ja7 ja7Var = new r45.ja7();
                ja7Var.f377679d = this.f331027g.f375084d;
                r45.hc5 hc5Var2 = (r45.hc5) fVar.f70618d;
                ms4.d dVar = new ms4.d(hc5Var2, ja7Var);
                js4.o oVar2 = nVar.f301546d;
                java.util.Objects.toString(dVar);
                if (hc5Var2 != null) {
                    str = str4;
                    i17 = i18;
                    str2 = str3;
                    os4.h.f(activity2, hc5Var2.f376052h, new ms4.d0(ja7Var.f377679d, j0Var, activity2, hc5Var2, nVar, str3, oVar2));
                } else {
                    str = str4;
                    i17 = i18;
                    str2 = str3;
                }
                j0Var.e(i17, str, str2, 3, 3, fVar.f70616b, f04Var.f373907d);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(fe1.l.CTRL_INDEX, 27);
                g0Var.A(fe1.l.CTRL_INDEX, 22);
            }
        } else {
            com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
            if (fVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinMidasInitializer", "cgiBack.resp is null");
                ms4.a aVar2 = new ms4.a(3, -1, "", null, 8, null);
                js4.o oVar3 = nVar.f301546d;
                java.util.Objects.toString(aVar2);
                os4.h.e(activity, aVar2, new ms4.h0(aVar2, oVar3));
                this.f331021a.e(this.f331024d, this.f331025e, this.f331026f, 3, 3, 3, "callback resp is null");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 22);
            } else {
                r45.hc5 hc5Var3 = (r45.hc5) fVar2;
                ms4.j0 j0Var2 = this.f331021a;
                int i19 = this.f331024d;
                java.lang.String str5 = this.f331025e;
                java.lang.String str6 = this.f331026f;
                android.app.Activity activity3 = this.f331022b;
                com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinMidasInitializer", "prepareWecoinRecharge, product_id: " + nVar.f301548f);
                os4.h.k("MicroMsg.WeCoinMidasInitializer", hc5Var3);
                j0Var2.e(i19, str5, str6, 3, 3, 0, "");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 21);
                j0Var2.d(activity3, hc5Var3, "release", nVar, str6);
            }
        }
        return jz5.f0.f302826a;
    }
}
