package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class m2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI f142940d;

    public m2(com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI) {
        this.f142940d = iPCallMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f142940d.finish();
        return true;
    }
}
