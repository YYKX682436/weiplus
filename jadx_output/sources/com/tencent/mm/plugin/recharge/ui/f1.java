package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes3.dex */
public class f1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155159d;

    public f1(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI) {
        this.f155159d = rechargeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI = this.f155159d;
        intent.putExtra("rawUrl", rechargeUI.B);
        j45.l.j(rechargeUI, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }
}
