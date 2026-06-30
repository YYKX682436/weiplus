package ue0;

/* loaded from: classes.dex */
public class j implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.guardianusername");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.wardusername");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.businesskey");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.businesstype"), 0);
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.agreenauthorizationtime"), c01.id.e());
        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.teenagermodeagreenauthorization.requestauthorizationmsgid"), 0L);
        uh4.g0 g0Var = new uh4.g0();
        g0Var.field_businessKey = str4;
        g0Var.field_businessType = P;
        g0Var.field_guardianUserName = str2;
        g0Var.field_wardUserName = str3;
        g0Var.field_time = V * 1000;
        g0Var.field_msgSvrId = V2;
        wh4.j.f446012a.a().replace(g0Var);
        com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent agreeAuthorizationChangeEvent = new com.tencent.mm.autogen.events.AgreeAuthorizationChangeEvent();
        agreeAuthorizationChangeEvent.f53973g.getClass();
        agreeAuthorizationChangeEvent.f53973g.f7285a = P;
        agreeAuthorizationChangeEvent.e();
        ((ku5.t0) ku5.t0.f312615d).g(new ue0.i(this, str3, str2, P, V2));
    }
}
