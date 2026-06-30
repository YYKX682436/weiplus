package q81;

/* loaded from: classes7.dex */
public final class q extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String username, java.lang.String appId, java.lang.Object obj) {
        r45.of7 wxaSyncPreLaunchCmd = (r45.of7) obj;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(wxaSyncPreLaunchCmd, "wxaSyncPreLaunchCmd");
        if (com.tencent.mm.sdk.platformtools.t8.K0(username) && com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "invalid username & appId");
            return java.lang.Boolean.FALSE;
        }
        try {
            g(username, appId, wxaSyncPreLaunchCmd.f382230d.f371531f);
            return java.lang.Boolean.TRUE;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdPreLaunch", e17, "", new java.lang.Object[0]);
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.of7 wxaSyncPreLaunchCmd = (r45.of7) obj;
        kotlin.jvm.internal.o.g(wxaSyncPreLaunchCmd, "wxaSyncPreLaunchCmd");
        r45.cf7 Base = wxaSyncPreLaunchCmd.f382230d;
        kotlin.jvm.internal.o.f(Base, "Base");
        return Base;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdPreLaunch";
    }

    public final boolean g(java.lang.String str, java.lang.String str2, int i17) {
        r45.u54 u54Var = new r45.u54();
        r45.ac7 ac7Var = new r45.ac7();
        ac7Var.f369926d = 0;
        ac7Var.f369927e = 0;
        ac7Var.f369928f = 0;
        ac7Var.f369930h = 1;
        ac7Var.f369929g = "";
        ac7Var.f369931i = 0;
        u54Var.f387056e = ac7Var;
        u54Var.f387057f = 3;
        u54Var.f387055d = str2;
        u54Var.f387065q = str;
        u54Var.f387066r = true;
        r45.fd7 fd7Var = new r45.fd7();
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
        fd7Var.f374246d = a17 != null ? a17.i() : -1;
        u54Var.f387059h = fd7Var;
        r45.y50 y50Var = new r45.y50();
        y50Var.f390799f = 1;
        u54Var.f387071w = y50Var;
        new ug1.e(u54Var, false).l().H(new q81.p(str, str2, i17));
        return true;
    }
}
