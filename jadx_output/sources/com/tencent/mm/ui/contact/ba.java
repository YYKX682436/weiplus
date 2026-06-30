package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class ba implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206628d;

    public ba(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206628d = selectContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206628d;
        selectContactUI.hideVKB();
        selectContactUI.finish();
        if (!selectContactUI.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            com.tencent.mm.sdk.platformtools.u3.i(selectContactUI.f206540c2, 80L);
        }
        return true;
    }
}
