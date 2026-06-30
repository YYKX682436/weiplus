package fm3;

/* loaded from: classes10.dex */
public final class m implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f264093a;

    public m(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem mediaItem) {
        kotlin.jvm.internal.o.g(mediaItem, "mediaItem");
        this.f264093a = mediaItem;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f264093a;
        int type = galleryItem$MediaItem.getType();
        java.lang.String o17 = galleryItem$MediaItem.o();
        kotlin.jvm.internal.o.f(o17, "getThumbPath(...)");
        java.lang.String str = galleryItem$MediaItem.f138430e;
        kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
        ((o23.i) b1Var).wi(thumbView, type, o17, str, galleryItem$MediaItem.f138434i, -1, aVar, galleryItem$MediaItem.f138435m);
    }
}
