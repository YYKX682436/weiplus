package ue0;

/* loaded from: classes4.dex */
public class n implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("StaticTeenagerModeBecomeGuardianNewXmlReceived", "onNewXmlReceived");
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.guardianusername");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.wardusername");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.ticket");
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.teenagermodebecomeguardian.becomeguardiantime"), c01.id.e());
        uh4.h0 h0Var = new uh4.h0();
        h0Var.field_guardianUserName = str2;
        h0Var.field_wardUserName = str3;
        h0Var.field_ticket = str4;
        h0Var.field_time = V * 1000;
        wh4.j jVar = wh4.j.f446012a;
        ((wh4.d) ((jz5.n) wh4.j.f446015d).getValue()).replace(h0Var);
        if (c01.z1.r().equalsIgnoreCase(str3)) {
            com.tencent.mm.storage.z3 l17 = c01.e2.l(str2);
            int type = l17.getType();
            l75.e0 e0Var = com.tencent.mm.contact.s.G2;
            l17.setType(type | 1073741824);
            c01.e2.h0(l17);
            if (c01.e2.a0()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.j1(0);
                f9Var.r1(3);
                f9Var.u1(str2);
                f9Var.e1(c01.w9.m(str2, c01.id.a() / 1000));
                f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jr9, l17.g2()));
                f9Var.setType(10000);
                f9Var.f1(f9Var.w0() | 8);
                c01.w9.x(f9Var);
                ((uh4.c0) i95.n0.c(uh4.c0.class)).K4();
            }
        } else if (c01.z1.r().equalsIgnoreCase(str2)) {
            com.tencent.mm.storage.z3 l18 = c01.e2.l(str3);
            int type2 = l18.getType();
            l75.e0 e0Var2 = com.tencent.mm.contact.s.G2;
            l18.setType(type2 | com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            c01.e2.h0(l18);
        }
        ((ku5.t0) ku5.t0.f312615d).g(new ue0.m(this));
    }
}
