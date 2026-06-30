package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class rb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationAddressUI f207161d;

    public rb(com.tencent.mm.ui.contact.SnsSelectConversationAddressUI snsSelectConversationAddressUI) {
        this.f207161d = snsSelectConversationAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SnsSelectConversationAddressUI snsSelectConversationAddressUI = this.f207161d;
        if (snsSelectConversationAddressUI.w7(snsSelectConversationAddressUI.C.size())) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) snsSelectConversationAddressUI.C.toArray(new java.lang.String[0]));
        if (P1 == null || P1.size() == 0) {
            intent.putExtra("Select_Conv_User", "");
        } else {
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(P1, ","));
        }
        snsSelectConversationAddressUI.setResult(-1, intent);
        snsSelectConversationAddressUI.finish();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.contact.qb(this), 100L);
        snsSelectConversationAddressUI.hideVKB();
        return true;
    }
}
