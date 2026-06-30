package q81;

/* loaded from: classes4.dex */
public final class k extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        long e17;
        r45.cf7 cf7Var;
        r45.jf7 jf7Var = (r45.jf7) obj;
        t81.s sVar = (t81.s) com.tencent.mm.plugin.appbrand.app.r9.fj(t81.s.class);
        boolean z17 = false;
        int i17 = (jf7Var == null || (cf7Var = jf7Var.f377789d) == null) ? 0 : cf7Var.f371531f;
        sVar.getClass();
        if (!(str == null || str.length() == 0)) {
            long j17 = -1;
            if (t81.s.f416372e != null) {
                if (com.tencent.mm.sdk.platformtools.x2.n()) {
                    try {
                        e17 = c01.id.e();
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    e17 = c01.id.b() / 1000;
                }
                j17 = e17;
            }
            if (j17 <= 0) {
                j17 = com.tencent.mm.sdk.platformtools.t8.i1();
            }
            t81.h hVar = new t81.h();
            hVar.field_username = str;
            hVar.field_timestamp = j17;
            hVar.field_reportId = i17;
            z17 = sVar.f416376c.replace(hVar);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CmdInvalidContact", "call username:" + str + ", ret:" + valueOf.booleanValue());
        return valueOf;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.jf7 jf7Var = (r45.jf7) obj;
        if (jf7Var != null) {
            return jf7Var.f377789d;
        }
        return null;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdInvalidContact";
    }
}
