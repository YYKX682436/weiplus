package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI f159557d;

    public h0(com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI productPurchaseAreaUI) {
        this.f159557d = productPurchaseAreaUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f159557d.finish();
        return false;
    }
}
