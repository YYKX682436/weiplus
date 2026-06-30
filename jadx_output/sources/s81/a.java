package s81;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s81.b f404719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f404722g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f404723h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404724i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s81.b bVar, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        super(0);
        this.f404719d = bVar;
        this.f404720e = str;
        this.f404721f = str2;
        this.f404722g = i17;
        this.f404723h = i18;
        this.f404724i = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s81.b bVar = this.f404719d;
        bVar.getClass();
        java.lang.String str = this.f404721f;
        if (!(str == null || str.length() == 0)) {
            s81.c cVar = new s81.c();
            cVar.field_appId = str;
            cVar.field_version = this.f404722g;
            int i17 = this.f404723h;
            cVar.field_packageType = i17;
            if (i17 == 6) {
                cVar.field_packageKey = str;
            } else {
                if (i17 == 12 || i17 == 13) {
                    cVar.field_packageKey = "";
                } else {
                    java.lang.String str2 = this.f404724i;
                    cVar.field_packageKey = str2 != null ? str2 : "";
                }
            }
            cVar.field_hitCount = 0;
            cVar.field_source = 0;
            cVar.field_reportId = 0;
            if (bVar.get(cVar, new java.lang.String[0])) {
                if (cVar.field_source == 1) {
                    boolean z17 = cVar.field_hitCount <= 0;
                    r81.f.INSTANCE.b(cVar.field_reportId, !z17 ? 57 : 56);
                    com.tencent.mm.autogen.mmdata.rpt.WAPrefetchHitPkgStruct wAPrefetchHitPkgStruct = new com.tencent.mm.autogen.mmdata.rpt.WAPrefetchHitPkgStruct();
                    wAPrefetchHitPkgStruct.f62021d = wAPrefetchHitPkgStruct.b("Username", ((com.tencent.mm.plugin.appbrand.appstorage.j) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appstorage.j.class)).D0(cVar.field_appId), true);
                    wAPrefetchHitPkgStruct.f62022e = wAPrefetchHitPkgStruct.b("Appid", cVar.field_appId, true);
                    wAPrefetchHitPkgStruct.f62023f = cVar.field_version;
                    wAPrefetchHitPkgStruct.f62024g = z17 ? 1L : 0L;
                    wAPrefetchHitPkgStruct.f62025h = cVar.field_reportId;
                    wAPrefetchHitPkgStruct.f62026i = cVar.field_packageType;
                    wAPrefetchHitPkgStruct.f62027j = wAPrefetchHitPkgStruct.b("ModuleName", cVar.field_packageKey, true);
                    wAPrefetchHitPkgStruct.f62028k = wAPrefetchHitPkgStruct.b("InstanceId", this.f404720e, true);
                    wAPrefetchHitPkgStruct.k();
                }
                cVar.field_hitCount++;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "checkReportOnLocalPkg(" + bVar.y0(cVar) + "), update hitCount=" + cVar.field_hitCount + ", updated:" + bVar.update(cVar, new java.lang.String[0]));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "checkReportOnLocalPkg(" + bVar.y0(cVar) + "), not pre-downloaded before");
            }
        }
        return jz5.f0.f302826a;
    }
}
