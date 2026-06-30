package f93;

/* loaded from: classes10.dex */
public class b3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260297d;

    public b3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260297d = contactLabelSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.label.ui.ContactLabelSelectUI.f143271p1;
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260297d;
        contactLabelSelectUI.getClass();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i18 = 0; i18 < contactLabelSelectUI.E.f305894f.size(); i18++) {
            java.util.ArrayList P1 = b93.r.wi().P1((java.lang.String) contactLabelSelectUI.E.f305894f.get(i18));
            if (P1 != null && P1.size() > 0) {
                hashSet.addAll(P1);
            }
        }
        java.lang.String r17 = c01.z1.r();
        if (hashSet.contains(r17)) {
            hashSet.remove(r17);
        }
        android.content.Intent intent = new android.content.Intent(contactLabelSelectUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("privacy_source_type", contactLabelSelectUI.C);
        intent.putExtra("privacy_menu_enter_type", 3);
        intent.putExtra("privacy_select_chatroom_or_lebal_count", contactLabelSelectUI.E.f305894f.size());
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("need_show_all_selected", true);
        intent.putExtra("titile", contactLabelSelectUI.getResources().getString(com.tencent.mm.R.string.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("already_select_contact", (java.lang.String[]) hashSet.toArray(new java.lang.String[0]));
        intent.putExtra("key_label_click_source", contactLabelSelectUI.getIntent().getIntExtra("key_label_click_source", 0));
        contactLabelSelectUI.startActivityForResult(intent, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL);
        return true;
    }
}
