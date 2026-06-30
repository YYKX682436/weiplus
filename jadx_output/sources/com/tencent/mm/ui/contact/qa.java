package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class qa implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactsFromRangeUI f207144d;

    public qa(com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI) {
        this.f207144d = selectContactsFromRangeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.SelectContactsFromRangeUI selectContactsFromRangeUI = this.f207144d;
        intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(selectContactsFromRangeUI.C.f207182r, ","));
        selectContactsFromRangeUI.setResult(-1, intent);
        selectContactsFromRangeUI.finish();
        return true;
    }
}
