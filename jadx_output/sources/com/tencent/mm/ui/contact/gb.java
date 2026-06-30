package com.tencent.mm.ui.contact;

/* loaded from: classes8.dex */
public class gb implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsAddressUI f206734d;

    public gb(com.tencent.mm.ui.contact.SnsAddressUI snsAddressUI) {
        this.f206734d = snsAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SnsAddressUI snsAddressUI = this.f206734d;
        snsAddressUI.finish();
        if (!snsAddressUI.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            snsAddressUI.moveTaskToBack(true);
        }
        return true;
    }
}
