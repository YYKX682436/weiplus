package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI f159651d;

    public u(com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI productFurtherInfoUI) {
        this.f159651d = productFurtherInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f159651d.finish();
        return false;
    }
}
