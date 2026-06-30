package d00;

/* loaded from: classes7.dex */
public final class c implements d00.d {

    /* renamed from: a, reason: collision with root package name */
    public final l81.b1 f225253a;

    public c(l81.b1 appBundle) {
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        this.f225253a = appBundle;
    }

    @Override // d00.d
    public java.lang.Object a(java.lang.Object obj) {
        jz5.f0 input = (jz5.f0) obj;
        kotlin.jvm.internal.o.g(input, "input");
        com.tencent.mm.plugin.appbrand.service.o6 o6Var = (com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
        l81.b1 b1Var = this.f225253a;
        com.tencent.mm.plugin.appbrand.appcache.n9 Dh = o6Var.Dh(b1Var.f317014b, b1Var.f317016c);
        kz5.q0 q0Var = kz5.q0.f314001d;
        if (Dh == null) {
            return q0Var;
        }
        try {
            com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = new com.tencent.mm.plugin.appbrand.appcache.y8(Dh.field_pkgPath);
            y8Var.a();
            java.io.InputStream c17 = y8Var.c("/ecs_ext.json");
            try {
                kotlin.jvm.internal.o.d(c17);
                java.lang.String str = new java.lang.String(vz5.a.c(c17), r26.c.f368865a);
                vz5.b.a(c17, null);
                com.tencent.mars.xlog.Log.i("GetFeatureListTask", "ecs_ext.json -> ".concat(str));
                return d00.b.f225252a.a(str);
            } finally {
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("GetFeatureListTask", "no ecs_ext.json");
            return q0Var;
        }
    }
}
