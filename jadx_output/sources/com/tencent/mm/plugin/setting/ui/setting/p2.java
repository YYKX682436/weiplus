package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class p2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161418d;

    public p2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161418d = selfQRCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161418d;
        selfQRCodeUI.hideVKB();
        selfQRCodeUI.finish();
        return true;
    }
}
