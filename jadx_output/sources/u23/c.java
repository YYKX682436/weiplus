package u23;

/* loaded from: classes10.dex */
public final class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final u23.c f424038d = new u23.c();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj2;
        long j17 = galleryItem$MediaItem.f138435m;
        long j18 = galleryItem$MediaItem2.f138435m;
        return j17 == j18 ? kotlin.jvm.internal.o.j(galleryItem$MediaItem2.f138434i, galleryItem$MediaItem.f138434i) : j18 < j17 ? -1 : 1;
    }
}
