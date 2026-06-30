package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class ya implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI f201586d;

    public ya(com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI) {
        this.f201586d = mediaHistoryGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = this.f201586d;
        nc5.o oVar = mediaHistoryGalleryUI.f200756t;
        if (oVar != null) {
            oVar.b();
        }
        mediaHistoryGalleryUI.finish();
        return true;
    }
}
