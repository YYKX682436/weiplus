package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes.dex */
public class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI f142994d;

    public r2(com.tencent.mm.plugin.ipcall.ui.IPCallMyGiftCardUI iPCallMyGiftCardUI) {
        this.f142994d = iPCallMyGiftCardUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f142994d.finish();
        return true;
    }
}
