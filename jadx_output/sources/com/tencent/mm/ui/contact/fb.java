package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class fb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsAddressUI f206710d;

    public fb(com.tencent.mm.ui.contact.SnsAddressUI snsAddressUI) {
        this.f206710d = snsAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.contact.SnsAddressUI snsAddressUI = this.f206710d;
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) snsAddressUI.C.toArray(new java.lang.String[0]));
        if (P1 == null || P1.size() == 0) {
            intent.putExtra("Select_Contact", "");
        } else {
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(P1, ","));
        }
        snsAddressUI.setResult(-1, intent);
        snsAddressUI.finish();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.ui.contact.eb(this), 100L);
        snsAddressUI.hideVKB();
        return true;
    }
}
