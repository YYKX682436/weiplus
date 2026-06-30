package nu4;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.a0 f340240d = new nu4.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        mu4.n nVar = mu4.w.f331452y;
        ku4.i iVar = ku4.i.f312514a;
        jz5.g gVar = ku4.i.f312517d;
        boolean z17 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 1;
        if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 1) {
            com.tencent.mm.plugin.appbrand.appcache.n9 a17 = iVar.a("wx97b7aebac2183fd2", 2);
            if (a17 != null) {
                str = a17.field_pkgPath;
            }
            str = null;
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0("wx97b7aebac2183fd2")) {
                com.tencent.mm.plugin.appbrand.appcache.n9 a18 = iVar.a("wx97b7aebac2183fd2", 0);
                if (a18 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "geReleasePkgPath pkgInfo is null");
                } else if (com.tencent.mm.vfs.w6.j(a18.field_pkgPath)) {
                    ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) ku4.i.f312516c).getValue()).A("LastUseVersion_".concat("wx97b7aebac2183fd2"), a18.field_version);
                    iVar.b("wx97b7aebac2183fd2", a18.field_version);
                    str = a18.field_pkgPath;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasPackageDownManager", "geReleasePkgPath pkgInfo " + a18.field_pkgPath + " not exist");
                }
            }
            str = null;
        }
        return mu4.n.b(nVar, nVar.a("prefetcher.wspkg", z17, str, "wx97b7aebac2183fd2"), nu4.z.f340293d, null, false, 12, null);
    }
}
