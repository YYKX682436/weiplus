package com.tencent.mm.plugin.product.ui;

/* loaded from: classes14.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallBaseUI f153279d;

    public e(com.tencent.mm.plugin.product.ui.MallBaseUI mallBaseUI) {
        this.f153279d = mallBaseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f153279d.finish();
        return true;
    }
}
