package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class n2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI f201210d;

    public n2(com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI imageGalleryGridUI) {
        this.f201210d = imageGalleryGridUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f201210d.onBackPressed();
        return true;
    }
}
