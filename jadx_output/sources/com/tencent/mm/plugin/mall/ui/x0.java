package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148512d;

    public x0(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI) {
        this.f148512d = mallIndexUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14872, 0, 0, "", "", 0);
        g0Var.d(16500, 3);
        com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI = this.f148512d;
        boolean z17 = mallIndexUI.f148285w.f7297f;
        mallIndexUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_default_show_currency", z17);
        j45.l.n(mallIndexUI, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, 6);
        return true;
    }
}
