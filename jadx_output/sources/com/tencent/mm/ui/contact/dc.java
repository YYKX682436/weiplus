package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class dc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationUI f206670d;

    public dc(com.tencent.mm.ui.contact.SnsSelectConversationUI snsSelectConversationUI) {
        this.f206670d = snsSelectConversationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SnsSelectConversationUI snsSelectConversationUI = this.f206670d;
        java.util.List list = snsSelectConversationUI.I;
        if (list != null) {
            ((java.util.LinkedList) list).size();
        }
        if (snsSelectConversationUI.y7(((java.util.LinkedList) snsSelectConversationUI.I).size())) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) ((java.util.LinkedList) snsSelectConversationUI.I).toArray(new java.lang.String[0]));
        if (P1 == null || P1.size() == 0) {
            intent.putExtra("Select_Contact", "");
        } else {
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(P1, ","));
        }
        snsSelectConversationUI.setResult(-1, intent);
        snsSelectConversationUI.finish();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.contact.cc(this), 100L);
        snsSelectConversationUI.hideVKB();
        return true;
    }
}
