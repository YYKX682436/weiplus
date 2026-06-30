package ug1;

/* loaded from: classes7.dex */
public final class g extends ug1.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f427493f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f427494g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f427495h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f427496i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.modelbase.f f427497j;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f427493f = str;
        this.f427494g = str2;
        this.f427495h = str3;
        this.f427496i = str4;
    }

    @Override // af.b
    public java.lang.Object a(int i17) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) super.a(i17);
        if (fVar != null) {
            ug1.b.a(7);
        }
        return fVar;
    }

    @Override // af.b
    public int b() {
        return 1;
    }

    @Override // af.b
    public java.lang.Object c() {
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b17;
        ug1.b.a(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preFetch: pkg download info, appId[");
        java.lang.String str = this.f427495h;
        sb6.append(str);
        sb6.append("] username[");
        java.lang.String str2 = this.f427494g;
        sb6.append(str2);
        sb6.append("] enterPath[");
        java.lang.String str3 = this.f427493f;
        sb6.append(str3);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", sb6.toString());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f4438b = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.appstorage.j jVar = (com.tencent.mm.plugin.appbrand.appstorage.j) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appstorage.j.class);
        java.lang.String z07 = jVar != null ? jVar.z0(str2) : null;
        int i17 = (com.tencent.mm.sdk.platformtools.t8.K0(z07) || (b17 = com.tencent.mm.plugin.appbrand.launching.v3.b(z07, 1)) == null) ? 0 : b17.pkgVersion;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", "preFetch: appId[" + str + "] username[" + str2 + "], localPkgVer=" + i17);
        java.lang.String str4 = str == null ? "" : str;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str5 = str2 != null ? str2 : "";
        r45.mb5 mb5Var = new r45.mb5();
        mb5Var.f380330e = str4;
        mb5Var.f380331f = i17;
        mb5Var.f380332g = str3;
        mb5Var.f380334i = true;
        mb5Var.f380329d = str5;
        mb5Var.f380333h = 0;
        this.f427497j = new ug1.f(mb5Var, this.f427496i).t();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f4439c = currentTimeMillis;
        long j17 = currentTimeMillis - this.f4438b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preFetch: appId[");
        sb7.append(str);
        sb7.append("] username[");
        sb7.append(str2);
        sb7.append("] cost[");
        sb7.append(j17);
        sb7.append(" ms] ret is?=[");
        sb7.append(this.f427497j == null);
        sb7.append("], errCode=[");
        com.tencent.mm.modelbase.f fVar = this.f427497j;
        sb7.append(fVar != null ? fVar.f70616b : -1);
        sb7.append("], errType=[");
        com.tencent.mm.modelbase.f fVar2 = this.f427497j;
        sb7.append(fVar2 != null ? fVar2.f70615a : -1);
        sb7.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreFetchGetDownloadInfoTask", sb7.toString());
        return this.f427497j;
    }

    @Override // ug1.a
    public void d(com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession) {
        kotlin.jvm.internal.o.g(qualitySession, "qualitySession");
        if (this.f427497j == null) {
            return;
        }
        long j17 = this.f4439c - this.f4438b;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct weAppQualitySystemGetDownloadCGIStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct();
        weAppQualitySystemGetDownloadCGIStruct.f62737d = weAppQualitySystemGetDownloadCGIStruct.b("InstanceId", qualitySession.f88134d, true);
        java.lang.String str = weAppQualitySystemGetDownloadCGIStruct.f62738e;
        if (str == null) {
            str = "";
        }
        weAppQualitySystemGetDownloadCGIStruct.f62738e = weAppQualitySystemGetDownloadCGIStruct.b("AppId", str, true);
        weAppQualitySystemGetDownloadCGIStruct.f62739f = qualitySession.f88139i;
        weAppQualitySystemGetDownloadCGIStruct.f62740g = cm.j0.a(qualitySession.f88136f);
        weAppQualitySystemGetDownloadCGIStruct.f62741h = qualitySession.f88137g;
        weAppQualitySystemGetDownloadCGIStruct.f62742i = j17;
        weAppQualitySystemGetDownloadCGIStruct.f62743j = qualitySession.f88138h;
        weAppQualitySystemGetDownloadCGIStruct.f62744k = weAppQualitySystemGetDownloadCGIStruct.f62744k;
        weAppQualitySystemGetDownloadCGIStruct.f62745l = weAppQualitySystemGetDownloadCGIStruct.f62745l;
        weAppQualitySystemGetDownloadCGIStruct.f62746m = th1.a.b(this.f427497j) ? cm.k0.ok : cm.k0.common_fail;
        weAppQualitySystemGetDownloadCGIStruct.f62747n = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        weAppQualitySystemGetDownloadCGIStruct.f62751r = weAppQualitySystemGetDownloadCGIStruct.b("NetworkTypeStr", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        weAppQualitySystemGetDownloadCGIStruct.f62748o = weAppQualitySystemGetDownloadCGIStruct.b(dm.i4.COL_USERNAME, this.f427494g, true);
        weAppQualitySystemGetDownloadCGIStruct.f62749p = 1L;
        weAppQualitySystemGetDownloadCGIStruct.f62750q = this.f4440d ? 1L : 0L;
        weAppQualitySystemGetDownloadCGIStruct.k();
    }
}
