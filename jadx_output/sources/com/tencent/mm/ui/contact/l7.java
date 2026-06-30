package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class l7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207008d;

    public l7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207008d = openIMAddressUIFragment;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment = this.f207008d;
        if (itemId == 1 || itemId == 2) {
            com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.l0(openIMAddressUIFragment, openIMAddressUIFragment.f206522h, true);
            return;
        }
        if (itemId != 7) {
            return;
        }
        java.lang.String str = openIMAddressUIFragment.f206522h;
        openIMAddressUIFragment.getClass();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17.r2()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", n17.d1());
            intent.putExtra("view_mode", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, openIMAddressUIFragment.getContext());
        }
    }
}
