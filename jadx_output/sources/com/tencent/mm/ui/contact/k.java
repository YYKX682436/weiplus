package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206981d;

    public k(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206981d = addressUIFragment;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f206981d;
        if (itemId == 1 || itemId == 2) {
            com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.y0(addressUIFragment, addressUIFragment.f206313u, true);
            return;
        }
        if (itemId != 7) {
            return;
        }
        java.lang.String str = addressUIFragment.f206313u;
        addressUIFragment.getClass();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        if (n17.r2()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", n17.d1());
            intent.putExtra("view_mode", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, addressUIFragment.getContext());
        }
    }
}
