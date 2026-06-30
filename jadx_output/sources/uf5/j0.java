package uf5;

/* loaded from: classes4.dex */
public class j0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.ContactMgrUIBase f427251d;

    public j0(com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase) {
        this.f427251d = contactMgrUIBase;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.ui.contact.privacy.ContactMgrUIBase contactMgrUIBase = this.f427251d;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "setOnMenuSelectedListener , MENU_ID_LABEL.");
            android.content.Intent intent = new android.content.Intent(contactMgrUIBase, (java.lang.Class<?>) com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.class);
            intent.putExtra("select_label", true);
            intent.putExtra("intent_status_from_privacy_setting", true);
            intent.putExtra("privacy_source_type", contactMgrUIBase.f207103g.v());
            intent.putExtra("group_multi_select", true);
            contactMgrUIBase.startActivityForResult(intent, 4);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                contactMgrUIBase.V6();
                return;
            } else {
                contactMgrUIBase.V6();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrUIBase", "setOnMenuSelectedListener , MENU_ID_CHATROOM.");
        android.content.Intent intent2 = new android.content.Intent(contactMgrUIBase, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.CommonSelectChatRoomUI.class);
        intent2.putExtra("group_multi_select", true);
        intent2.putExtra("group_select_need_result", true);
        intent2.putExtra("group_multi_select", true);
        intent2.putExtra("privacy_source_type", contactMgrUIBase.f207103g.v());
        intent2.putExtra("max_limit_num", contactMgrUIBase.getIntent().getIntExtra("max_limit_num", 50));
        contactMgrUIBase.startActivityForResult(intent2, 3);
    }
}
