package p81;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t81.c f352723a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f352724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352725c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f352726d;

    public j(t81.c record, yz5.l onComplete) {
        kotlin.jvm.internal.o.g(record, "record");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        this.f352723a = record;
        this.f352724b = onComplete;
        this.f352725c = record.field_reportId;
        this.f352726d = record.field_retriedCount > 0;
    }

    public static final void b(p81.j jVar, boolean z17) {
        java.lang.String str;
        boolean z18 = jVar.f352726d;
        r81.f.INSTANCE.b(jVar.f352725c, z17 ? z18 ? 52 : 47 : z18 ? 53 : 48);
        com.tencent.mm.autogen.mmdata.rpt.WAPrefetchGetCodeResultStruct wAPrefetchGetCodeResultStruct = new com.tencent.mm.autogen.mmdata.rpt.WAPrefetchGetCodeResultStruct();
        com.tencent.mm.plugin.appbrand.appstorage.j jVar2 = (com.tencent.mm.plugin.appbrand.appstorage.j) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appstorage.j.class);
        t81.c cVar = jVar.f352723a;
        if (jVar2 == null || (str = jVar2.D0(cVar.field_appId)) == null) {
            str = "";
        }
        wAPrefetchGetCodeResultStruct.f62010d = wAPrefetchGetCodeResultStruct.b("Username", str, true);
        wAPrefetchGetCodeResultStruct.f62011e = wAPrefetchGetCodeResultStruct.b("Appid", cVar.field_appId, true);
        wAPrefetchGetCodeResultStruct.f62012f = cVar.field_version;
        wAPrefetchGetCodeResultStruct.f62013g = 0L;
        wAPrefetchGetCodeResultStruct.f62014h = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        wAPrefetchGetCodeResultStruct.f62015i = z17 ? 1L : 0L;
        wAPrefetchGetCodeResultStruct.f62016j = cVar.field_retriedCount;
        wAPrefetchGetCodeResultStruct.f62017k = cVar.field_cmdSequence;
        wAPrefetchGetCodeResultStruct.f62018l = cVar.field_reportId;
        wAPrefetchGetCodeResultStruct.f62019m = cVar.field_packageType;
        wAPrefetchGetCodeResultStruct.f62020n = wAPrefetchGetCodeResultStruct.b("PackageKey", cVar.field_packageKey, true);
        wAPrefetchGetCodeResultStruct.k();
    }

    public final void a(int i17, java.lang.String str) {
        com.tencent.stubs.logger.Log.printFormat(i17, "MicroMsg.AppBrand.PreDownload.ActionGetNormalPkg", "appId:" + this.f352723a.field_appId + ", packageKey:" + this.f352723a.field_packageKey + ", packageType:" + this.f352723a.field_packageType + ", version:" + this.f352723a.field_version + ", " + str, new java.lang.Object[0]);
        if (14 == this.f352723a.field_scene) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z65.c.a()) {
                ((ku5.t0) ku5.t0.f312615d).B(new p81.f(str));
            }
        }
    }

    public final void c() {
        k91.v5 k17;
        k91.j5 u07;
        r81.f.INSTANCE.b(this.f352725c, this.f352726d ? 51 : 46);
        int i17 = com.tencent.mm.plugin.appbrand.launching.s5.f85140a;
        com.tencent.mm.plugin.appbrand.launching.r5 r5Var = com.tencent.mm.plugin.appbrand.launching.r5.f85103b;
        k91.m4 ij6 = com.tencent.mm.plugin.appbrand.app.r9.ij();
        boolean z17 = false;
        t81.c cVar = this.f352723a;
        if (ij6 != null && (k17 = ij6.k1(cVar.field_appId, "appInfo")) != null && (u07 = k17.u0()) != null && u07.b()) {
            z17 = true;
        }
        boolean z18 = !r5Var.a(z17);
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        if (a3Var != null) {
            java.lang.String field_appId = cVar.field_appId;
            kotlin.jvm.internal.o.f(field_appId, "field_appId");
            java.lang.String field_packageKey = cVar.field_packageKey;
            kotlin.jvm.internal.o.f(field_packageKey, "field_packageKey");
            k91.u0 u0Var = (k91.u0) a3Var;
            k91.r0 Bi = u0Var.Bi(field_appId);
            java.util.Map map = Bi.f305757a;
            java.lang.Object obj = map.get(field_packageKey);
            if (obj == null) {
                obj = new k91.m0(false, 0.0f, null, 7, null);
                map.put(field_packageKey, obj);
            }
            k91.x0[] x0VarArr = k91.x0.f305815d;
            java.util.Map map2 = ((k91.m0) obj).f305674c;
            if (map2.get(1) == null) {
                map2.put(1, new k91.q0(false, 0L, 3, null));
            }
            u0Var.Ri(field_appId, Bi);
        }
        com.tencent.mm.plugin.appbrand.launching.j6 j6Var = com.tencent.mm.plugin.appbrand.launching.x6.f85412a;
        java.lang.String field_appId2 = cVar.field_appId;
        kotlin.jvm.internal.o.f(field_appId2, "field_appId");
        com.tencent.mm.plugin.appbrand.launching.o6 o6Var = new com.tencent.mm.plugin.appbrand.launching.o6(field_appId2, cVar.field_packageKey, cVar.field_packageType, 0, new com.tencent.mm.plugin.appbrand.launching.v6(cVar.field_version, 0L, 2, null), z18);
        com.tencent.mm.plugin.appbrand.launching.l6 l6Var = new com.tencent.mm.plugin.appbrand.launching.l6(cVar.field_scene, cVar.field_localRequestUsername, cVar.field_localRequestAppId);
        r45.y50 y50Var = new r45.y50();
        y50Var.f390799f = 1;
        com.tencent.mm.plugin.appbrand.launching.j6.a(j6Var, o6Var, new p81.h(this), new p81.i(this), null, null, y50Var, l6Var, new p81.g(a3Var, this), null, null, gd1.w.CTRL_INDEX, null);
    }
}
