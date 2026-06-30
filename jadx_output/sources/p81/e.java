package p81;

/* loaded from: classes7.dex */
public class e implements gm5.a {
    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        t81.c cVar = (t81.c) obj;
        java.lang.String str = cVar.field_appId;
        int i17 = cVar.field_version;
        java.lang.String str2 = cVar.field_pkgMd5;
        com.tencent.mm.plugin.appbrand.appcache.a6.a("");
        boolean z17 = cVar.field_retriedCount > 0;
        int i18 = cVar.field_reportId;
        km5.b b17 = km5.u.b();
        b17.b();
        r45.os3 os3Var = new r45.os3();
        os3Var.f382481e = str;
        os3Var.f382482f = i17;
        os3Var.f382484h = 0;
        os3Var.f382483g = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0("")) {
            os3Var.f382484h = 0;
        } else {
            os3Var.f382486m = "";
            os3Var.f382484h = 4;
        }
        r45.q35 q35Var = new r45.q35();
        os3Var.f382487n = q35Var;
        q35Var.f383631d = 0;
        q35Var.f383632e = 1;
        r81.f.INSTANCE.b(i18, z17 ? 51 : 46);
        pq5.g l17 = new com.tencent.mm.plugin.appbrand.appcache.u(os3Var).l();
        l17.H(new p81.b(this, b17, z17, i18));
        l17.K(new p81.d());
        l17.K(new p81.a(this, z17, i18, b17));
        return java.lang.Boolean.TRUE;
    }
}
