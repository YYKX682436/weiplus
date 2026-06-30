package fa1;

/* loaded from: classes7.dex */
public final class j extends ud.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fa1.a f260689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fa1.a aVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, boolean z17) {
        super(context, tVar, z17);
        this.f260689g = aVar;
    }

    @Override // ud.g
    public void c(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        boolean z17;
        super.c(appBrandRuntime);
        fa1.a aVar = this.f260689g;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(((com.tencent.mm.plugin.appbrand.service.c0) aVar.F()).getAppId(), true);
        if (b17 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.quality.t tVar = b17.f88154z;
        synchronized (tVar) {
            z17 = tVar.f88308h != null;
        }
        if (z17) {
            yg.h hVar = aVar.w().f48585i;
            synchronized (hVar.f462064a) {
                if (hVar.f462064a.f48577a != 0) {
                    com.tencent.magicbrush.MBRuntime mBRuntime = hVar.f462064a;
                    mBRuntime.nativeSetEnableInspectFpsVariance(mBRuntime.f48577a, true);
                }
            }
        }
    }

    @Override // ud.b, ud.g
    public void d(com.tencent.magicbrush.a aVar) {
        super.d(aVar);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_magicbrush_allow_antialias, false);
        f06.v[] vVarArr = com.tencent.magicbrush.c0.I;
        aVar.f48609k.b(aVar, vVarArr[4], java.lang.Boolean.valueOf(fj6));
        ha1.i iVar = ha1.i.f279769c;
        fa1.a aVar2 = this.f260689g;
        aVar.f48611m.b(aVar, vVarArr[6], java.lang.Float.valueOf(iVar.i(((com.tencent.mm.plugin.appbrand.service.c0) aVar2.F()).getF147807d())));
        boolean booleanValue = ((java.lang.Boolean) ha1.r.f279785c.e()).booleanValue();
        if (aVar2.R0() && ((java.lang.Boolean) ha1.s.f279786c.e()).booleanValue()) {
            aVar.e(gh.b.NativeLocker);
        } else if (!booleanValue) {
            aVar.e(gh.b.EglSurfaceSwapLocker);
        } else if (aVar2.R0()) {
            aVar.e(gh.b.ChoreographerInMainThread);
        } else {
            aVar.e(gh.b.ChoreographerInJsThread);
        }
        if (((java.lang.Boolean) ha1.o.f279782c.e()).booleanValue()) {
            aVar.f48607i = new sa1.e(aVar2);
        } else {
            aVar.f48607i = new sa1.i(aVar2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: use animation handler: %s", aVar.a().toString());
        aVar.f48616r.b(aVar, vVarArr[9], java.lang.Boolean.valueOf(((java.lang.Boolean) ha1.n.f279781c.e()).booleanValue()));
        aVar.f48617s.b(aVar, vVarArr[10], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.c.f279763c.e()).intValue() != 0));
        aVar.f(aVar2.O().f47398a.getNativeHandle());
        aVar.f48620v.b(aVar, vVarArr[13], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.a.f279761c.e()).intValue() != 0));
        aVar.f48622x.b(aVar, vVarArr[15], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.d.f279764c.e()).intValue() != 0));
        aVar.C.b(aVar, vVarArr[20], java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_parallel_shader_compile_android, 0)));
        aVar.E.b(aVar, vVarArr[22], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.b.f279762c.e()).intValue() != 0));
        aVar.F.b(aVar, vVarArr[23], java.lang.Boolean.FALSE);
        aVar.G.b(aVar, vVarArr[24], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.e.f279765c.e()).intValue() != 0));
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.l1.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            a17 = com.tencent.mm.vfs.w6.i(a17, true);
        }
        aVar.g(a17);
        aVar.f48605g = new fa1.i(this, new java.lang.ref.WeakReference((com.tencent.mm.plugin.appbrand.service.c0) aVar2.F()));
        int i17 = com.tencent.magicbrush.MBRuntime.f48576j;
    }

    @Override // ud.g
    public void e(com.tencent.magicbrush.MagicBrush magicBrush, long j17) {
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        fa1.a aVar = this.f260689g;
        jVar.i(((com.tencent.mm.plugin.appbrand.service.c0) aVar.F()).H0(), ((com.tencent.mm.plugin.appbrand.service.c0) aVar.F()).getAppId(), j17);
    }
}
