package t61;

/* loaded from: classes9.dex */
public class b implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t61.c f415984a;

    public b(t61.c cVar) {
        this.f415984a = cVar;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent();
        t61.c cVar = this.f415984a;
        intent.putExtra("Contact_User", cVar.f415985d.f415994g.f393000a.field_encryptUsername);
        intent.putExtra("Contact_Nick", cVar.f415985d.f415994g.f393000a.field_nickname);
        intent.putExtra("Contact_Scene", 17);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", cVar.f415985d.f415994g.f393000a.field_ticket);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        j45.l.j(cVar.f415986e.f415987a.getContext(), com.google.android.gms.common.Scopes.PROFILE, (com.tencent.mm.storage.z3.m4(cVar.f415985d.f415994g.f393000a.field_encryptUsername) || Ni != 1) ? (com.tencent.mm.storage.z3.m4(cVar.f415985d.f415994g.f393000a.field_encryptUsername) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, null);
        return true;
    }
}
