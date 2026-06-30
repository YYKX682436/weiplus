package fj1;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj1.h f263111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fj1.h hVar) {
        super(0);
        this.f263111d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fj1.y yVar;
        java.util.ArrayList arrayList;
        yVar = this.f263111d.f263112d;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = yVar.e();
        java.lang.Object value = ((jz5.n) yVar.f263154n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        k91.r rVar = (k91.r) value;
        uh1.a aVar = new uh1.a();
        aVar.f427740d = com.tencent.mm.plugin.appbrand.config.a.c(e17);
        k91.e eVar = rVar.f305747q;
        int i17 = eVar.f305563a;
        if (i17 > 0) {
            aVar.f427741e = i17;
        }
        int i18 = eVar.f305564b;
        if (i18 > 0) {
            aVar.f427742f = i18;
        }
        int i19 = eVar.f305565c;
        if (i19 > 0) {
            aVar.f427743g = i19;
        }
        int i27 = eVar.f305566d;
        if (i27 > 0) {
            aVar.f427744h = i27;
        }
        aVar.f427745i = e17.F;
        aVar.f427746m = e17.I;
        aVar.f427747n = e17.G;
        aVar.f427748o = e17.H;
        aVar.f427749p = e17.P;
        aVar.f427750q = e17.Q;
        aVar.f427751r = e17.R;
        aVar.f427752s = e17.S;
        aVar.f427753t = e17.T;
        aVar.f427754u = e17.U;
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.HttpSetting httpSetting = e17.Y.f77221s;
        int i28 = httpSetting.f77251d;
        if (i28 == 1) {
            java.util.ArrayList arrayList2 = httpSetting.f77252e;
            if (arrayList2 != null) {
                aVar.f427755v = arrayList2;
            }
        } else if (i28 == 2 && (arrayList = httpSetting.f77253f) != null) {
            aVar.f427756w = arrayList;
        }
        aVar.E = i28;
        aVar.f427757x = new java.util.ArrayList();
        com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig appBrandGlobalSystemConfig = e17.Y;
        aVar.f427758y = appBrandGlobalSystemConfig.f77210h;
        aVar.f427759z = appBrandGlobalSystemConfig.f77233z1;
        aVar.A = e17.K;
        aVar.G = e17.L;
        aVar.B = k91.d3.a(com.tencent.mm.sdk.platformtools.x2.f193071a, k91.n0.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameConfigAdapter", "runtime(%s).getNetworkConfig.userAgentString = [ %s ]", yVar.c(), aVar.B);
        sd1.a aVar2 = (sd1.a) nd.f.a(sd1.a.class);
        if (aVar2 != null) {
            aVar.C = ((com.tencent.mm.plugin.appbrand.utils.p5) aVar2).a(rVar.L);
        } else {
            com.tencent.mars.xlog.Log.w("", "getNetworkConfig, referrerHelper is null");
        }
        aVar.D = com.tencent.mm.plugin.appbrand.config.a.a(e17);
        aVar.F = false;
        aVar.H = com.tencent.mm.plugin.appbrand.appcache.g0.a(e17.f305852r.f75399d);
        if (pe.a.f353588a != null) {
            java.lang.String a17 = j62.e.g().a("clicfg_appbrand_network_check_user_trust_ca", "", true, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameConfigAdapter", "exptCheckCA = %s", a17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17) || !a17.equalsIgnoreCase("false")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameConfigAdapter", "exptCheckCA has no delegate");
            } else {
                aVar.I = false;
            }
        }
        return aVar;
    }
}
