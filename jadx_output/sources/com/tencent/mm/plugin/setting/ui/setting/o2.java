package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class o2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161374d;

    public o2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161374d = selfQRCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI.C;
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161374d;
        selfQRCodeUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) selfQRCodeUI, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.setting.ui.setting.f2(selfQRCodeUI);
        k0Var.f211881s = new com.tencent.mm.plugin.setting.ui.setting.g2(selfQRCodeUI);
        k0Var.v();
        return true;
    }
}
