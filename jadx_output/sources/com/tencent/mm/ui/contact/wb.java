package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class wb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationMemberUI f207240d;

    public wb(com.tencent.mm.ui.contact.SnsSelectConversationMemberUI snsSelectConversationMemberUI) {
        this.f207240d = snsSelectConversationMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SnsSelectConversationMemberUI snsSelectConversationMemberUI = this.f207240d;
        if (snsSelectConversationMemberUI.w7(snsSelectConversationMemberUI.F.size())) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.sdk.platformtools.t8.L0(snsSelectConversationMemberUI.F)) {
            intent.putExtra("Select_Conv_User", "");
        } else {
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(snsSelectConversationMemberUI.F, ","));
        }
        snsSelectConversationMemberUI.getClass();
        snsSelectConversationMemberUI.setResult(-1, intent);
        snsSelectConversationMemberUI.finish();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.contact.vb(this), 100L);
        snsSelectConversationMemberUI.hideVKB();
        return true;
    }
}
