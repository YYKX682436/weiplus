package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ua implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectLabelContactUI f207211d;

    public ua(com.tencent.mm.ui.contact.SelectLabelContactUI selectLabelContactUI) {
        this.f207211d = selectLabelContactUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.contact.SelectLabelContactUI selectLabelContactUI = this.f207211d;
        java.util.ArrayList arrayList = new java.util.ArrayList(selectLabelContactUI.F);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelContactUI", "SelectUser: %s", arrayList.toString());
        selectLabelContactUI.w7(com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
        return true;
    }
}
