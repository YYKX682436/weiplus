package ea3;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.media.album.LiteAppLivePhotoTagLayout f250607d;

    public c0(com.tencent.mm.plugin.lite.media.album.LiteAppLivePhotoTagLayout liteAppLivePhotoTagLayout) {
        this.f250607d = liteAppLivePhotoTagLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppLivePhotoTagLayout$setTagClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.lite.media.album.LiteAppLivePhotoTagLayout liteAppLivePhotoTagLayout = this.f250607d;
        if (liteAppLivePhotoTagLayout.f144138i == null || liteAppLivePhotoTagLayout.f144139m == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppLivePhotoTagLayout", "onClick : " + liteAppLivePhotoTagLayout.hashCode() + ", itemData is invalid");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick : ");
        sb6.append(liteAppLivePhotoTagLayout.hashCode());
        sb6.append(", mediaId: ");
        sb6.append(liteAppLivePhotoTagLayout.f144139m);
        sb6.append(" state: ");
        com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem = liteAppLivePhotoTagLayout.f144138i;
        kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem);
        sb6.append(galleryItem$LivePhotoMediaItem.A);
        sb6.append(" currentShowState: ");
        sb6.append(liteAppLivePhotoTagLayout.f144140n);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppLivePhotoTagLayout", sb6.toString());
        int i17 = liteAppLivePhotoTagLayout.f144140n;
        if (i17 == 1) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem2 = liteAppLivePhotoTagLayout.f144138i;
            kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem2);
            galleryItem$LivePhotoMediaItem2.A = 2;
            liteAppLivePhotoTagLayout.a(2);
            ea3.d0 d0Var = liteAppLivePhotoTagLayout.f144141o;
            if (d0Var != null) {
                ((ea3.c) d0Var).a(false);
            }
        } else if (i17 == 2) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem3 = liteAppLivePhotoTagLayout.f144138i;
            kotlin.jvm.internal.o.d(galleryItem$LivePhotoMediaItem3);
            galleryItem$LivePhotoMediaItem3.A = 1;
            liteAppLivePhotoTagLayout.a(1);
            ea3.d0 d0Var2 = liteAppLivePhotoTagLayout.f144141o;
            if (d0Var2 != null) {
                ((ea3.c) d0Var2).a(true);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppLivePhotoTagLayout", liteAppLivePhotoTagLayout.hashCode() + " error state");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppLivePhotoTagLayout$setTagClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
