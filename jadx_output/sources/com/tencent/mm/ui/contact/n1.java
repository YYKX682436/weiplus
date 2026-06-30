package com.tencent.mm.ui.contact;

/* loaded from: classes12.dex */
public class n1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI f207036d;

    public n1(com.tencent.mm.ui.contact.ContactRemarkImagePreviewUI contactRemarkImagePreviewUI) {
        this.f207036d = contactRemarkImagePreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f207036d, 1, false);
        k0Var.f211872n = new com.tencent.mm.ui.contact.l1(this);
        k0Var.f211881s = new com.tencent.mm.ui.contact.m1(this);
        k0Var.v();
        return true;
    }
}
