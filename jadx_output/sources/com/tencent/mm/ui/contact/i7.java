package com.tencent.mm.ui.contact;

/* loaded from: classes3.dex */
public class i7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OnlyChatContactMgrUI f206806d;

    public i7(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI) {
        this.f206806d = onlyChatContactMgrUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI = this.f206806d;
        onlyChatContactMgrUI.hideVKB();
        onlyChatContactMgrUI.finish();
        return false;
    }
}
