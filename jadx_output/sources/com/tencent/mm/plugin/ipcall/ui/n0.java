package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class n0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI f142944d;

    public n0(com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI) {
        this.f142944d = iPCallAddressUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI iPCallAddressUI = this.f142944d;
        if (iPCallAddressUI.f142540g == 1) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(new android.content.Intent(), iPCallAddressUI);
        } else {
            iPCallAddressUI.finish();
        }
        return true;
    }
}
