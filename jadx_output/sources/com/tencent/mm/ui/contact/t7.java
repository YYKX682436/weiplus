package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class t7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207196d;

    public t7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207196d = openIMAddressUIFragment;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f207196d.finish();
        return true;
    }
}
