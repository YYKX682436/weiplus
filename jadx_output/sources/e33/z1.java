package e33;

/* loaded from: classes10.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f247559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f247560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e33.a2 f247561f;

    public z1(e33.a2 a2Var, int i17, int i18) {
        this.f247561f = a2Var;
        this.f247559d = i17;
        this.f247560e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        t23.n1 n1Var;
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) this.f247561f.f247116d.get();
        if (galleryItem$AlbumItem == null || (n1Var = t23.p0.k().f415296e) == null || ((t23.f) n1Var).f415144g || !galleryItem$AlbumItem.f138423o) {
            return;
        }
        galleryItem$AlbumItem.f138417f = this.f247559d;
        galleryItem$AlbumItem.f138419h = this.f247560e;
        galleryItem$AlbumItem.f138423o = false;
        this.f247561f.f247117e.notifyDataSetChanged();
    }
}
