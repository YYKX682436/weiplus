package r61;

/* loaded from: classes9.dex */
public class b2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter f392824d;

    public b2(com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter recoverFriendPresenter) {
        this.f392824d = recoverFriendPresenter;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.account.friend.model.RecoverFriendPresenter recoverFriendPresenter = this.f392824d;
        r61.x0 x0Var = ((r61.y1) ((fb5.n) recoverFriendPresenter.f73112i.get(i17)).f260898b).f393000a;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(x0Var.field_encryptUsername, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("AntispamTicket", x0Var.field_ticket);
        intent.putExtra("User_From_Fmessage", true);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("Contact_Nick", x0Var.field_nickname);
        intent.putExtra("Contact_Scene", 17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        if (((int) n17.E2) <= 0 || !n17.r2()) {
            intent.putExtra("Contact_User", x0Var.field_encryptUsername);
        } else {
            intent.putExtra("Contact_User", n17.d1());
            intent.putExtra("force_get_contact", true);
        }
        j45.l.j(recoverFriendPresenter.f73107d, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct import_old_account_contactsstruct = new com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct();
        import_old_account_contactsstruct.f63116d = 5;
        import_old_account_contactsstruct.f63118f = import_old_account_contactsstruct.b("newaccountusername", c01.z1.b(), true);
        import_old_account_contactsstruct.f63117e = import_old_account_contactsstruct.b("oldaccountusername", recoverFriendPresenter.f73110g, true);
        import_old_account_contactsstruct.f63119g = import_old_account_contactsstruct.b("friendusername", x0Var.field_encryptUsername, true);
        import_old_account_contactsstruct.k();
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
