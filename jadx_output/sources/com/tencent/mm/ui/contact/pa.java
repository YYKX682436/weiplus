package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class pa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactsFromRangeUI f207099d;

    public pa(com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI) {
        this.f207099d = selectContactsFromRangeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207099d.finish();
        return false;
    }
}
