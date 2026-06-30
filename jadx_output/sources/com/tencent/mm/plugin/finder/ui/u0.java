package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAlbumUI f129892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f129893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f129894f;

    public u0(com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI, com.tencent.mm.ui.widget.dialog.y1 y1Var, com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem) {
        this.f129892d = finderAlbumUI;
        this.f129893e = y1Var;
        this.f129894f = galleryItem$VideoMediaItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderAlbumUI.L2;
        com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI = this.f129892d;
        finderAlbumUI.getClass();
        boolean z17 = java.lang.System.currentTimeMillis() - finderAlbumUI.f128506w2 < 1000;
        finderAlbumUI.f128506w2 = java.lang.System.currentTimeMillis();
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "onSendItemClick: long video btn hit double click check");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        finderAlbumUI.f128507x2 = true;
        this.f129893e.q();
        finderAlbumUI.F2.getClass();
        android.content.Intent intent = finderAlbumUI.getIntent();
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f129894f;
        com.tencent.mm.plugin.finder.ui.FinderPostRouterUI.Q.a(finderAlbumUI, intent, galleryItem$VideoMediaItem.f138430e, galleryItem$VideoMediaItem.f138448z, galleryItem$VideoMediaItem.f138447y, finderAlbumUI.f128504u2, true, 5);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
