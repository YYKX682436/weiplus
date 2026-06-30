package uf5;

/* loaded from: classes10.dex */
public class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI f427330d;

    public z(com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI commonSelectChatRoomUI) {
        this.f427330d = commonSelectChatRoomUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI.E;
        com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI commonSelectChatRoomUI = this.f427330d;
        java.util.ArrayList x76 = commonSelectChatRoomUI.x7(false);
        commonSelectChatRoomUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonSelectChatRoomUI", "sns post who can see scene,users=%s", x76.toString());
        java.util.ArrayList x77 = commonSelectChatRoomUI.x7(false);
        java.util.HashSet hashSet = new java.util.HashSet();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(x77)) {
            for (int i18 = 0; i18 < x77.size(); i18++) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) x77.get(i18))) {
                    qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
                    java.lang.String str = (java.lang.String) x77.get(i18);
                    ((py.a) iVar).getClass();
                    java.util.List m17 = c01.v1.m(str);
                    if (m17 != null) {
                        hashSet.addAll(m17);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonSelectChatRoomUI", "handleSelect, tagList=%s.", hashSet.toString());
        java.lang.String r17 = c01.z1.r();
        if (hashSet.contains(r17)) {
            hashSet.remove(r17);
        }
        android.content.Intent intent = new android.content.Intent(commonSelectChatRoomUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("list_type", 1);
        intent.putExtra("privacy_source_type", commonSelectChatRoomUI.D);
        intent.putExtra("privacy_menu_enter_type", 2);
        intent.putExtra("privacy_select_chatroom_or_lebal_count", x77.size());
        intent.putExtra("without_openim", true);
        intent.putExtra("need_show_all_selected", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("titile", commonSelectChatRoomUI.getResources().getString(com.tencent.mm.R.string.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
        commonSelectChatRoomUI.startActivityForResult(intent, 0);
        return true;
    }
}
