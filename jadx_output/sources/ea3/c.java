package ea3;

/* loaded from: classes10.dex */
public class c implements ea3.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f250604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f250605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ea3.n f250606c;

    public c(ea3.n nVar, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, int i17) {
        this.f250606c = nVar;
        this.f250604a = galleryItem$MediaItem;
        this.f250605b = i17;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "LivePhotoSelectCallback onClickChangeSelect:%b", java.lang.Boolean.valueOf(z17));
        ea3.n nVar = this.f250606c;
        java.util.ArrayList arrayList = nVar.f250630g;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f250604a;
        boolean contains = arrayList.contains(galleryItem$MediaItem);
        int i17 = this.f250605b;
        if (!contains) {
            com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "no select but live icon state changed! position:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        int indexOf = nVar.f250630g.indexOf(galleryItem$MediaItem);
        ea3.j jVar = nVar.f250631h;
        if (jVar != null) {
            ((ea3.p) jVar).m(nVar.B(), i17, indexOf, 0);
        }
    }
}
