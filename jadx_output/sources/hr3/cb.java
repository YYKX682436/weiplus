package hr3;

/* loaded from: classes11.dex */
public class cb implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hr3.eb f283451c;

    public cb(hr3.eb ebVar, java.lang.String str, java.lang.String str2) {
        this.f283451c = ebVar;
        this.f283449a = str;
        this.f283450b = str2;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        int i18;
        boolean a07 = c01.e2.a0();
        hr3.eb ebVar = this.f283451c;
        if (a07 && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && (i18 = ebVar.f283520f.N) != 14 && i18 != 30) {
            uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
            com.tencent.mm.ui.MMActivity mMActivity = ebVar.f283520f.K1;
            c0Var.na(mMActivity, mMActivity.getString(com.tencent.mm.R.string.jtx));
            return true;
        }
        java.lang.String stringExtra = ebVar.f283520f.K1.getIntent().getStringExtra("room_name");
        android.content.Intent intent = new android.content.Intent(ebVar.f283520f.K1, (java.lang.Class<?>) ((com.tencent.mm.storage.z3.m4(ebVar.f283520f.L.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.class : com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class));
        intent.putExtra("Contact_User", ebVar.f283520f.L.d1());
        intent.putExtra("Contact_Nick", ebVar.f283520f.L.P0());
        intent.putExtra("Contact_RemarkName", ebVar.f283520f.L.w0());
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = ebVar.f283520f;
        int i19 = normalUserFooterPreference.N;
        if (i19 == 14 || i19 == 8) {
            intent.putExtra("Contact_RoomNickname", normalUserFooterPreference.K1.getIntent().getStringExtra("Contact_RoomNickname"));
        }
        intent.putExtra("Contact_Scene", ebVar.f283520f.N);
        intent.putExtra("room_name", stringExtra);
        intent.putExtra("source_from_user_name", this.f283449a);
        intent.putExtra("source_from_nick_name", this.f283450b);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", str3);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        ebVar.f283520f.K1.startActivityForResult(intent, 0);
        return true;
    }
}
