package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class kb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsLabelContactListUI f206999d;

    public kb(com.tencent.mm.ui.contact.SnsLabelContactListUI snsLabelContactListUI) {
        this.f206999d = snsLabelContactListUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f206999d.finish();
        return true;
    }
}
