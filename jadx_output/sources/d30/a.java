package d30;

@j95.b
/* loaded from: classes15.dex */
public class a extends i95.w implements e30.e {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f226122e = lp0.b.u();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f226123f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f226124g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f226125d = new java.util.HashSet();

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.h() + "/emoji/");
        sb6.append("egg_spring/");
        java.lang.String sb7 = sb6.toString();
        f226123f = sb7;
        f226124g = sb7 + "innerLuckyBag.wxam";
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "onAccountInitialized");
        s75.d.b(new d30.b(this), "init_egg_spring_dir");
        f21.g K = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K();
        if (K == null || K.f258898d.isEmpty()) {
            return;
        }
        java.util.Iterator it = K.f258898d.iterator();
        while (it.hasNext()) {
            final f21.e eVar = (f21.e) it.next();
            if (eVar.f258881q == 5) {
                com.tencent.mm.plugin.appbrand.service.n6 n6Var = (com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class);
                if (n6Var != null) {
                    f21.h hVar = eVar.f258886v;
                    com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs success, username:%s, appId:%s", hVar.f258905e, hVar.f258904d);
                    f21.h hVar2 = eVar.f258886v;
                    n6Var.Eb(hVar2.f258905e, hVar2.f258904d, 1189);
                } else {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: d30.a$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.appbrand.service.n6 n6Var2 = (com.tencent.mm.plugin.appbrand.service.n6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.n6.class);
                            if (n6Var2 != null) {
                                f21.e eVar2 = f21.e.this;
                                f21.h hVar3 = eVar2.f258886v;
                                com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs success by last check, username:%s, appId:%s", hVar3.f258905e, hVar3.f258904d);
                                f21.h hVar4 = eVar2.f258886v;
                                n6Var2.Eb(hVar4.f258905e, hVar4.f258904d, 1189);
                            }
                        }
                    };
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    t0Var.z(runnable, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "registerPkgSpecs Failed, IWxaPkgDownloaderExportService Null");
                }
            }
        }
    }

    public void wi(java.lang.String str) {
        ((java.util.HashSet) this.f226125d).add(str);
        ((j60.a0) ((k60.f) i95.n0.c(k60.f.class))).getClass();
        if (com.tencent.mm.plugin.game.luggage.p1.c(str) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "has prefetch %s", str);
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_egg_preload_url, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.EggSpringFeatureService", "prefetch %s: config %s", str, java.lang.Integer.valueOf(Ni));
        if (Ni == 1) {
            k60.f fVar = (k60.f) i95.n0.c(k60.f.class);
            ((k60.f) i95.n0.c(k60.f.class)).getClass();
            d30.c cVar = new d30.c(this);
            ((j60.a0) fVar).getClass();
            com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, str, cVar);
        }
    }
}
