package ph1;

/* loaded from: classes7.dex */
public class f implements ph1.h {
    @Override // ph1.h
    public void a(java.lang.String str, ph1.d dVar, ph1.c cVar, boolean z17) {
        if (dVar != null) {
            dVar.a(ph1.g.OK);
        }
    }

    @Override // ph1.h
    public ph1.b b() {
        return new ph1.e(this);
    }

    @Override // ph1.h
    public boolean c(java.lang.String str) {
        return false;
    }

    @Override // ph1.h
    public java.lang.String d(java.lang.String str) {
        return com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME;
    }

    @Override // ph1.h
    public boolean e() {
        return false;
    }

    @Override // ph1.h
    public com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo f(java.lang.String str) {
        return null;
    }

    @Override // ph1.h
    public void g(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar, ph1.d dVar) {
        if (dVar != null) {
            dVar.a(ph1.g.OK);
        }
    }
}
