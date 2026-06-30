package qg1;

/* loaded from: classes7.dex */
public class h implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f362767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg1.d f362768b;

    public h(qg1.d dVar, boolean z17) {
        this.f362768b = dVar;
        this.f362767a = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        qg1.d dVar = this.f362768b;
        if (1248 == ((r45.u54) dVar.f362749o.f70710a.f70684a).f387056e.f369928f) {
            java.lang.String sourceAppId = (java.lang.String) qg1.d.f362748z.remove(dVar.D());
            if (!android.text.TextUtils.isEmpty(sourceAppId)) {
                java.lang.String f17 = k91.k4.f(sourceAppId);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiLaunchWxaApp|func:1122", "onCgiBack cgiHash[%d] sessionId[%s], remove usage (%s, %s) for migrate", java.lang.Integer.valueOf(dVar.hashCode()), dVar.f362750p, sourceAppId, f17);
                com.tencent.mm.plugin.appbrand.app.r9.hj().W0(f17, 0, 4);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.v.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((com.tencent.mm.plugin.appbrand.appusage.v) c17).requireAccountInitialized();
                com.tencent.mm.plugin.appbrand.appusage.v vVar = com.tencent.mm.plugin.appbrand.appusage.v.f76583e;
                if (vVar != null) {
                    java.lang.String targetAppId = dVar.D();
                    kotlin.jvm.internal.o.g(sourceAppId, "sourceAppId");
                    kotlin.jvm.internal.o.g(targetAppId, "targetAppId");
                    java.lang.String f18 = k91.k4.f(sourceAppId);
                    java.lang.String f19 = k91.k4.f(targetAppId);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "replaceForMigrate, source(" + f18 + ' ' + sourceAppId + ") -> target(" + f19 + ' ' + targetAppId + ')');
                    if (!(f18 == null || f18.length() == 0)) {
                        if (!(f19 == null || f19.length() == 0)) {
                            com.tencent.mm.plugin.appbrand.widget.recent.s1 s1Var = com.tencent.mm.plugin.appbrand.widget.recent.q0.f92037a;
                            java.util.List xi6 = vVar.xi(s1Var.f92053b, s1Var.f92054c);
                            if (xi6 != null) {
                                int i17 = -1;
                                int i18 = 0;
                                int i19 = -1;
                                for (java.lang.Object obj2 : xi6) {
                                    int i27 = i18 + 1;
                                    if (i18 < 0) {
                                        kz5.c0.p();
                                        throw null;
                                    }
                                    com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = (com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo) obj2;
                                    boolean b17 = kotlin.jvm.internal.o.b(f18, localUsageInfo.f76361d);
                                    int i28 = localUsageInfo.f76363f;
                                    if (b17 && com.tencent.mm.plugin.appbrand.appcache.g0.b(i28)) {
                                        i17 = i18;
                                    } else if (kotlin.jvm.internal.o.b(f19, localUsageInfo.f76361d) && com.tencent.mm.plugin.appbrand.appcache.g0.b(i28)) {
                                        i19 = i18;
                                    }
                                    if (i17 >= 0 && i19 >= 0) {
                                        break;
                                    }
                                    i18 = i27;
                                }
                                int i29 = i17;
                                if (i29 >= 0) {
                                    if (i19 >= 0) {
                                        xi6.remove(i29);
                                        z17 = false;
                                    } else {
                                        kotlin.jvm.internal.m0.b(xi6).set(i29, new com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo(f19, targetAppId, 0, 0, "", "", "", true, 0L, 0L));
                                        z17 = true;
                                    }
                                    vVar.Ai(xi6, null, z17);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.app.r9.hj().m0(k91.k4.f(dVar.D()), dVar.G(), dVar.H(), ((r45.u54) dVar.f362749o.f70710a.f70684a).f387056e.f369928f, 1, dVar.f362750p, this.f362767a);
        return null;
    }
}
