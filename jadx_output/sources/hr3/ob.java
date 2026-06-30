package hr3;

/* loaded from: classes11.dex */
public class ob implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.rb f283860d;

    public ob(hr3.rb rbVar) {
        this.f283860d = rbVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean a07 = c01.e2.a0();
        hr3.rb rbVar = this.f283860d;
        if (a07 && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && (i17 = rbVar.f283948h.N) != 14 && i17 != 30) {
            uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
            com.tencent.mm.ui.MMActivity mMActivity = rbVar.f283948h.K1;
            c0Var.na(mMActivity, mMActivity.getString(com.tencent.mm.R.string.jtx));
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        rbVar.f283948h.K1.getIntent().removeExtra("Accept_NewFriend_FromOutside");
        android.content.Intent intent = new android.content.Intent(rbVar.f283948h.K1, (java.lang.Class<?>) ((com.tencent.mm.storage.z3.m4(rbVar.f283948h.L.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.class : com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class));
        intent.putExtra("Contact_User", rbVar.f283948h.L.d1());
        intent.putExtra("room_name", rbVar.f283948h.K1.getIntent().getStringExtra("room_name"));
        intent.putExtra("Contact_Nick", rbVar.f283948h.L.P0());
        intent.putExtra("Contact_RemarkName", rbVar.f283948h.L.w0());
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = rbVar.f283948h;
        int i18 = normalUserFooterPreference.N;
        if (i18 == 14 || i18 == 8) {
            intent.putExtra("Contact_RoomNickname", normalUserFooterPreference.K1.getIntent().getStringExtra("Contact_RoomNickname"));
        }
        intent.putExtra("Contact_Scene", rbVar.f283948h.N);
        intent.putExtra("Verify_ticket", rbVar.f283948h.U);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        rbVar.f283948h.K1.startActivityForResult(intent, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyCardHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
