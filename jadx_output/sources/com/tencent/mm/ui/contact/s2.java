package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class s2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkInfoModUI f207169d;

    public s2(com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI) {
        this.f207169d = contactRemarkInfoModUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = this.f207169d;
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI.T6(contactRemarkInfoModUI);
        contactRemarkInfoModUI.hideVKB();
        contactRemarkInfoModUI.c7(1L);
        return false;
    }
}
