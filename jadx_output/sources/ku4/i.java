package ku4;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final ku4.i f312514a = new ku4.i();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f312515b = jz5.h.b(ku4.e.f312510d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f312516c = jz5.h.b(ku4.d.f312509d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f312517d = jz5.h.b(ku4.f.f312511d);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f312518e = true;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f312519f;

    static {
        jz5.h.b(ku4.h.f312513d);
        jz5.h.b(ku4.g.f312512d);
        f312519f = new java.util.HashSet();
    }

    public final com.tencent.mm.plugin.appbrand.appcache.n9 a(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        try {
            com.tencent.mm.plugin.appbrand.appcache.n9 q66 = ((com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class)).q6(appId, i17, 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPkgInfo appId=");
            sb6.append(appId);
            sb6.append(", pkgType=");
            sb6.append(i17);
            sb6.append(", md5=");
            sb6.append(q66 != null ? q66.field_versionMd5 : null);
            sb6.append(" download version= ");
            sb6.append(q66 != null ? java.lang.Integer.valueOf(q66.field_version) : null);
            sb6.append(" path=");
            sb6.append(q66 != null ? q66.field_pkgPath : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", sb6.toString());
            return q66;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebCanvasPackageDownManager", "getPkgInfo ex " + e17.getMessage());
            return null;
        }
    }

    public final void b(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String str = appId + '-' + i17;
        java.util.HashSet hashSet = f312519f;
        if (hashSet.contains(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "setPkgIsOccupied start");
        com.tencent.mm.plugin.appbrand.service.o6 o6Var = (com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        if (o6Var != null) {
            o6Var.Uf(appId, i17);
            hashSet.add(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "setPkgIsOccupied appId = " + appId + " version=" + i17);
        }
    }
}
