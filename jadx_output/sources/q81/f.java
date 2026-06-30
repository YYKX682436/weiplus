package q81;

/* loaded from: classes7.dex */
public class f extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.gf7 gf7Var = (r45.gf7) obj;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdGetContact", "invalid username & appId");
            return java.lang.Boolean.FALSE;
        }
        km5.b b17 = km5.u.b();
        b17.b();
        int i17 = gf7Var.f375204d.f371531f;
        r81.f.INSTANCE.b(i17, 24);
        com.tencent.mm.plugin.appbrand.config.q.j(str, true, new q81.d(this, str, b17, i17), new q81.e(this));
        return java.lang.Boolean.TRUE;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.gf7) obj).f375204d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdGetContact";
    }
}
