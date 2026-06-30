package com.tencent.mm.plugin.product.ui;

/* loaded from: classes12.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallGalleryUI f153317d;

    public n(com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI) {
        this.f153317d = mallGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        j45.l.g("favorite");
        com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI = this.f153317d;
        db5.e1.h(mallGalleryUI.getContext(), null, mallGalleryUI.getResources().getStringArray(com.tencent.mm.R.array.f478011y), null, false, new com.tencent.mm.plugin.product.ui.m(this));
        return true;
    }
}
