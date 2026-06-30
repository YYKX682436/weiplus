package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class xb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationMemberUI f207252d;

    public xb(com.tencent.mm.ui.contact.SnsSelectConversationMemberUI snsSelectConversationMemberUI) {
        this.f207252d = snsSelectConversationMemberUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SnsSelectConversationMemberUI snsSelectConversationMemberUI = this.f207252d;
        snsSelectConversationMemberUI.finish();
        if (!snsSelectConversationMemberUI.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            snsSelectConversationMemberUI.moveTaskToBack(true);
        }
        return true;
    }
}
