package q81;

/* loaded from: classes4.dex */
public final class s extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.qf7 qf7Var = (r45.qf7) obj;
        t81.j jVar = (t81.j) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.j.class);
        int i17 = qf7Var.f383957e;
        int i18 = qf7Var.f383956d.f371531f;
        int i19 = qf7Var.f383958f;
        jVar.getClass();
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            t81.i iVar = new t81.i();
            iVar.field_username = str;
            boolean z18 = jVar.get(iVar, new java.lang.String[0]);
            iVar.field_appVersion = i17;
            iVar.field_reportId = i18;
            iVar.field_launchFallbackDirectlyMinVersion = i19;
            z17 = z18 ? jVar.update(iVar, new java.lang.String[0]) : jVar.insert(iVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdUpdateVersion", "call, username %s, version %d, reportId %d, update %b", str, java.lang.Integer.valueOf(qf7Var.f383957e), java.lang.Integer.valueOf(qf7Var.f383956d.f371531f), java.lang.Boolean.valueOf(z17));
        r81.f.INSTANCE.b(qf7Var.f383956d.f371531f, z17 ? 155 : 156);
        return java.lang.Boolean.valueOf(z17);
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.qf7) obj).f383956d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdUpdateVersion";
    }
}
