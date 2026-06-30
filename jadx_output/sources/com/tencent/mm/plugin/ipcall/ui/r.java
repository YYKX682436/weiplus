package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI f142991d;

    public r(com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI iPCallAcitivityUI) {
        this.f142991d = iPCallAcitivityUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f142991d.finish();
        return true;
    }
}
