package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class hc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsTagContactListUI f206759d;

    public hc(com.tencent.mm.ui.contact.SnsTagContactListUI snsTagContactListUI) {
        this.f206759d = snsTagContactListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f206759d.finish();
        return true;
    }
}
