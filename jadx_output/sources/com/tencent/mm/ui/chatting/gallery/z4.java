package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class z4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201608d;

    public z4(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201608d = imageGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201608d;
        imageGalleryUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) imageGalleryUI, 1, false);
        k0Var.f211872n = new com.tencent.mm.ui.chatting.gallery.g6(imageGalleryUI);
        k0Var.f211881s = imageGalleryUI.M3;
        k0Var.v();
        imageGalleryUI.C8(true);
        return true;
    }
}
