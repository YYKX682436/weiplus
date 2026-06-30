package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class r0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI f142992d;

    public r0(com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI iPCallAllRecordUI) {
        this.f142992d = iPCallAllRecordUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f142992d.finish();
        return true;
    }
}
