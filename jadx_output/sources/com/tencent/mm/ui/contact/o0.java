package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public final class o0 extends com.tencent.mm.modelbase.i {
    public o0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        r45.l04 l04Var = new r45.l04();
        l04Var.set(1, str == null ? "" : str);
        l04Var.set(3, str2 == null ? "" : str2);
        l04Var.set(4, str3 == null ? "" : str3);
        r45.rx6 rx6Var = new r45.rx6();
        rx6Var.set(0, str4 == null ? "" : str4);
        l04Var.set(2, rx6Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiInviteCoManagerForAccount", "[CgiInviteCoManagerForAccount] init request: " + pm0.b0.g(l04Var));
        r45.m04 m04Var = new r45.m04();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = l04Var;
        lVar.f70665b = m04Var;
        lVar.f70666c = "/cgi-bin/mmpay-bin/pt/mmpayalwappsvr_weixin_invitecomanagerforaccount";
        lVar.f70667d = 27113;
        p(lVar.a());
    }
}
