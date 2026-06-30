package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class w2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI f143057d;

    public w2(com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI iPCallPackageUI) {
        this.f143057d = iPCallPackageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f143057d.finish();
        return true;
    }
}
