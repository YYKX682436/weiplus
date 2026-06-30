package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class r6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f207156d;

    public r6(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f207156d = onlyChatContactMgrUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct = new com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct();
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f207156d;
        onlyChatContactMgrUI.f206515t = batchSocialBlackLogStruct;
        if (i17 == 0) {
            java.util.List L0 = ((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).L0(5L);
            android.content.Intent intent = new android.content.Intent(onlyChatContactMgrUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactsFromRangeUI.class);
            intent.putExtra("list_type", 1);
            intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
            intent.putExtra("already_select_contact", (java.lang.String[]) ((java.util.ArrayList) L0).toArray(new java.lang.String[0]));
            intent.putExtra("max_limit_num", onlyChatContactMgrUI.f206512q);
            onlyChatContactMgrUI.startActivityForResult(intent, 1);
            com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct2 = onlyChatContactMgrUI.f206515t;
            batchSocialBlackLogStruct2.f55372d = 1L;
            batchSocialBlackLogStruct2.f55381m = java.lang.System.currentTimeMillis();
            return;
        }
        if (i17 == 1) {
            android.content.Intent intent2 = new android.content.Intent(onlyChatContactMgrUI, (java.lang.Class<?>) com.tencent.mm.ui.contact.SelectContactsFromRangeUI.class);
            intent2.putExtra("list_type", 1);
            intent2.putExtra("filter_type", "@all.contact.android");
            intent2.putExtra("already_select_contact", (java.lang.String[]) ((java.util.ArrayList) k35.c.b()).toArray(new java.lang.String[0]));
            intent2.putExtra("max_limit_num", onlyChatContactMgrUI.f206512q);
            onlyChatContactMgrUI.startActivityForResult(intent2, 1);
            com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct3 = onlyChatContactMgrUI.f206515t;
            batchSocialBlackLogStruct3.f55372d = 2L;
            batchSocialBlackLogStruct3.f55381m = java.lang.System.currentTimeMillis();
            return;
        }
        if (i17 == 2) {
            android.content.Intent intent3 = new android.content.Intent(onlyChatContactMgrUI, (java.lang.Class<?>) com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.class);
            intent3.putExtra("select_label", true);
            onlyChatContactMgrUI.startActivityForResult(intent3, 3);
            com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct4 = onlyChatContactMgrUI.f206515t;
            batchSocialBlackLogStruct4.f55372d = 3L;
            batchSocialBlackLogStruct4.f55381m = java.lang.System.currentTimeMillis();
            return;
        }
        android.content.Intent intent4 = new android.content.Intent();
        intent4.putExtra("titile", onlyChatContactMgrUI.getString(com.tencent.mm.R.string.f489934fx));
        intent4.putExtra("list_type", 1);
        intent4.putExtra("KBlockOpenImFav", true);
        intent4.putExtra("without_openim", true);
        intent4.putExtra("show_too_many_member", false);
        com.tencent.mm.ui.contact.i5.e();
        int g17 = com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b, com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, 64, 262144), 131072);
        intent4.putExtra("max_limit_num", onlyChatContactMgrUI.f206512q);
        intent4.putExtra("list_attr", g17);
        intent4.putExtra("always_select_contact", "");
        j45.l.v(onlyChatContactMgrUI, ".ui.contact.SelectContactUI", intent4, 1);
        com.tencent.mm.autogen.mmdata.rpt.BatchSocialBlackLogStruct batchSocialBlackLogStruct5 = onlyChatContactMgrUI.f206515t;
        batchSocialBlackLogStruct5.f55372d = 4L;
        batchSocialBlackLogStruct5.f55381m = java.lang.System.currentTimeMillis();
    }
}
