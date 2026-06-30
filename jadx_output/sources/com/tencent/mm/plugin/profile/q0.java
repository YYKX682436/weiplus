package com.tencent.mm.plugin.profile;

/* loaded from: classes9.dex */
public class q0 implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f153584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r35.a f153588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f153589g;

    public q0(com.tencent.mm.plugin.profile.e0 e0Var, int i17, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.storage.z3 z3Var, java.lang.String str, java.lang.String str2, r35.a aVar, long j17) {
        this.f153583a = i17;
        this.f153584b = mMActivity;
        this.f153585c = z3Var;
        this.f153586d = str;
        this.f153587e = str2;
        this.f153588f = aVar;
        this.f153589g = j17;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        boolean a07 = c01.e2.a0();
        int i18 = this.f153583a;
        com.tencent.mm.ui.MMActivity mMActivity = this.f153584b;
        if (a07 && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && i18 != 14 && i18 != 30) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).na(mMActivity, mMActivity.getString(com.tencent.mm.R.string.jtx));
            return true;
        }
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("room_name");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000);
        com.tencent.mm.storage.z3 z3Var = this.f153585c;
        android.content.Intent intent = new android.content.Intent(mMActivity, (java.lang.Class<?>) ((com.tencent.mm.storage.z3.m4(z3Var.d1()) || c01.e2.k() < Ni) ? com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.class : com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class));
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        if (i18 == 14 || i18 == 8) {
            intent.putExtra("Contact_RoomNickname", mMActivity.getIntent().getStringExtra("Contact_RoomNickname"));
        } else if (i18 == 17) {
            intent.putExtra("key_msg_id", mMActivity.getIntent().getLongExtra("key_msg_id", 0L));
        }
        intent.putExtra("Contact_Scene", i18);
        intent.putExtra("room_name", stringExtra);
        intent.putExtra("source_from_user_name", this.f153586d);
        intent.putExtra("source_from_nick_name", this.f153587e);
        intent.putExtra("sayhi_with_sns_perm_send_verify", true);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", false);
        intent.putExtra("AntispamTicket", str3);
        intent.putExtra("sayhi_verify_add_errcode", i17);
        intent.putExtra("k_add_friend_verify_record_client_msg_id", this.f153588f.M);
        intent.putExtra("key_msg_id", this.f153589g);
        intent.putExtra("key_msg_talker", mMActivity.getIntent().getStringExtra("key_msg_talker"));
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f153584b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity2, arrayList.toArray(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal$19", "onNeedSentVerify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity2, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$19", "onNeedSentVerify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
