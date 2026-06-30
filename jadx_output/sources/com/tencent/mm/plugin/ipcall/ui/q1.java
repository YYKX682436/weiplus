package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class q1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallDialUI f142985d;

    public q1(com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI) {
        this.f142985d = iPCallDialUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f142985d.finish();
        return true;
    }
}
