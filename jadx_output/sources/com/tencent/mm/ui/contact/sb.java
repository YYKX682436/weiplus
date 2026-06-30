package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class sb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationAddressUI f207185d;

    public sb(com.tencent.mm.ui.contact.SnsSelectConversationAddressUI snsSelectConversationAddressUI) {
        this.f207185d = snsSelectConversationAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SnsSelectConversationAddressUI snsSelectConversationAddressUI = this.f207185d;
        snsSelectConversationAddressUI.finish();
        if (!snsSelectConversationAddressUI.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            snsSelectConversationAddressUI.moveTaskToBack(true);
        }
        return true;
    }
}
