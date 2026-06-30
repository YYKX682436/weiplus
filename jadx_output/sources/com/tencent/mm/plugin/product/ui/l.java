package com.tencent.mm.plugin.product.ui;

/* loaded from: classes12.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallGalleryUI f153311d;

    public l(com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI) {
        this.f153311d = mallGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f153311d.finish();
        return false;
    }
}
