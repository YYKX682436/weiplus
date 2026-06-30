package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class t5 implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.u5 f143014a;

    public t5(com.tencent.mm.plugin.ipcall.ui.u5 u5Var) {
        this.f143014a = u5Var;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.ipcall.ui.u5 u5Var = this.f143014a;
        intent.putExtra("Contact_User", u5Var.f143026d.f142733s);
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("AntispamTicket", str3);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        j45.l.j(u5Var.f143026d, com.google.android.gms.common.Scopes.PROFILE, (com.tencent.mm.storage.z3.m4(u5Var.f143026d.f142733s) || Ni != 1) ? (com.tencent.mm.storage.z3.m4(u5Var.f143026d.f142733s) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, null);
        return true;
    }
}
