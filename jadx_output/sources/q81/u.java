package q81;

/* loaded from: classes7.dex */
public class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t81.c f360718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q81.x f360719b;

    public u(q81.x xVar, t81.c cVar) {
        this.f360719b = xVar;
        this.f360718a = cVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        final t81.c cVar = this.f360718a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "try record %s", cVar);
        ((java.util.concurrent.ConcurrentSkipListSet) this.f360719b.f360730f).add(cVar.field_appId);
        com.tencent.mm.plugin.appbrand.appcache.a6 a6Var = new com.tencent.mm.plugin.appbrand.appcache.a6(cVar.field_appId, cVar.field_packageKey, cVar.field_packageType);
        try {
            wxaPkgWrappingInfo = com.tencent.mm.plugin.appbrand.launching.v3.b(a6Var.toString(), 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", e17, "[Captured crash]", new java.lang.Object[0]);
            wxaPkgWrappingInfo = null;
        }
        if (wxaPkgWrappingInfo == null || wxaPkgWrappingInfo.pkgVersion < cVar.field_version) {
            if (!cVar.field_firstTimeTried) {
                cVar.field_firstTimeTried = true;
                cVar.field_lastRetryTime = com.tencent.mm.sdk.platformtools.t8.i1();
                ((t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class)).update(cVar, new java.lang.String[0]);
            } else if (cVar.field_retryTimes <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s) retryTimes == 0, skip", a6Var.toString());
                ((t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class)).delete(cVar, new java.lang.String[0]);
            } else if (cVar.field_lastRetryTime + cVar.field_retryInterval > com.tencent.mm.sdk.platformtools.t8.i1()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "exceed record(%s) retryInterval %d, skip", a6Var.toString(), java.lang.Long.valueOf(cVar.field_retryInterval));
            } else {
                int i17 = cVar.field_retriedCount + 1;
                if (i17 > cVar.field_retryTimes) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "exceed record(%s) retryTimes %d, skip", a6Var.toString(), java.lang.Integer.valueOf(cVar.field_retryTimes));
                    ((t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class)).delete(cVar, new java.lang.String[0]);
                } else {
                    cVar.field_retriedCount = i17;
                    cVar.field_lastRetryTime = com.tencent.mm.sdk.platformtools.t8.i1();
                    ((t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class)).update(cVar, new java.lang.String[0]);
                }
            }
            if (cVar.field_type == 0) {
                com.tencent.mm.plugin.appbrand.app.r9.Di().l(a6Var.toString(), 0, cVar.field_version, cVar.field_pkgMd5, null);
                final km5.b b17 = km5.u.b();
                b17.b();
                new p81.j(cVar, new yz5.l() { // from class: q81.u$$a
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        int i18;
                        java.lang.Boolean bool = (java.lang.Boolean) obj2;
                        q81.u uVar = q81.u.this;
                        uVar.getClass();
                        boolean a17 = gm0.j1.a();
                        t81.c cVar2 = cVar;
                        if (a17) {
                            if (bool.booleanValue() && !android.text.TextUtils.isEmpty(cVar2.field_localRequestKey)) {
                                com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a.c(cVar2);
                            } else if (!bool.booleanValue() && (((i18 = cVar2.field_retryTimes) <= 0 || cVar2.field_retriedCount + 1 > i18) && !android.text.TextUtils.isEmpty(cVar2.field_localRequestKey))) {
                                com.tencent.mm.plugin.appbrand.appcache.predownload.d0.f75753a.b(cVar2);
                            }
                            b17.resume();
                        } else {
                            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "appId[%s] packageKey[%s] packageType[%d] version[%d]", cVar2.field_appId, cVar2.field_packageKey, java.lang.Integer.valueOf(cVar2.field_packageType), java.lang.Integer.valueOf(cVar2.field_version));
                            uVar.f360719b.h();
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "predownload normal pkg onResult AccountNotReady " + format);
                        }
                        return jz5.f0.f302826a;
                    }
                }).c();
            } else {
                com.tencent.mm.plugin.appbrand.appcache.n6 n6Var = (com.tencent.mm.plugin.appbrand.appcache.n6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.n6.class);
                com.tencent.mm.plugin.appbrand.appcache.m6 D0 = n6Var.D0(cVar.field_appId, cVar.field_type, cVar.field_version);
                if (D0 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s %d %d) integrated, decryptResult %b", cVar.field_appId, java.lang.Integer.valueOf(cVar.field_type), java.lang.Integer.valueOf(cVar.field_version), java.lang.Boolean.valueOf(q81.n.h(D0, q81.m.GET_CODE)));
                } else {
                    java.lang.String str = cVar.field_appId;
                    int i18 = cVar.field_type;
                    int i19 = cVar.field_version;
                    java.lang.String str2 = cVar.field_pkgMd5;
                    com.tencent.mm.plugin.appbrand.appcache.m6 m6Var = new com.tencent.mm.plugin.appbrand.appcache.m6();
                    m6Var.field_appId = str;
                    m6Var.field_type = i18;
                    m6Var.field_version = i19;
                    boolean z17 = n6Var.get(m6Var, new java.lang.String[0]);
                    m6Var.field_pkgMd5 = str2;
                    if (z17) {
                        n6Var.update(m6Var, new java.lang.String[0]);
                    } else {
                        n6Var.insert(m6Var);
                    }
                    km5.b b18 = km5.u.b();
                    b18.b();
                    pq5.g b19 = pq5.h.b(cVar);
                    b19.H(new p81.e());
                    b19.K(new q81.v(this, b18));
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "available pkg(%s %d) >= record(%s %d), skip", a6Var.toString(), java.lang.Integer.valueOf(wxaPkgWrappingInfo.pkgVersion), a6Var.toString(), java.lang.Integer.valueOf(cVar.field_version));
            ((t81.d) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.d.class)).delete(cVar, new java.lang.String[0]);
        }
        return null;
    }
}
