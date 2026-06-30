package p61;

/* loaded from: classes11.dex */
public class d4 implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r61.a f352234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p61.h4 f352235b;

    public d4(p61.h4 h4Var, r61.a aVar) {
        this.f352235b = h4Var;
        this.f352234a = aVar;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent();
        r61.a aVar = this.f352234a;
        intent.putExtra("Contact_User", aVar.i());
        intent.putExtra("Contact_Nick", aVar.g());
        intent.putExtra("Contact_Scene", 13);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("AntispamTicket", str3);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        j45.l.n(this.f352235b.f212608e, com.google.android.gms.common.Scopes.PROFILE, (com.tencent.mm.storage.z3.m4(aVar.i()) || Ni != 1) ? (com.tencent.mm.storage.z3.m4(aVar.i()) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2", intent, 1);
        return true;
    }
}
