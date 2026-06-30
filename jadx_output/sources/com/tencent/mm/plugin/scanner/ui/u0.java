package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class u0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159652d;

    public u0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159652d = productUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159652d;
        if (productUI.f159324v == 4) {
            productUI.setResult(0);
        }
        productUI.finish();
        return true;
    }
}
