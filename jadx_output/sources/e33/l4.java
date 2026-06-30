package e33;

/* loaded from: classes10.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f247329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247330e;

    public l4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        this.f247330e = imagePreviewUI;
        this.f247329d = galleryItem$MediaItem;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f247330e.K7(this.f247329d);
    }
}
