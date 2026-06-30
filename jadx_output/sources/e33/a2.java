package e33;

/* loaded from: classes10.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f247116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.c2 f247117e;

    public a2(e33.c2 c2Var, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.f247117e = c2Var;
        this.f247116d = atomicReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) this.f247116d.get();
        if (galleryItem$AlbumItem == null) {
            return;
        }
        t23.n1 n1Var = t23.p0.k().f415296e;
        if (!galleryItem$AlbumItem.f138423o || n1Var == null || ((t23.f) n1Var).f415144g) {
            return;
        }
        try {
            java.lang.System.currentTimeMillis();
            int i17 = galleryItem$AlbumItem.f138419h;
            t23.p0.n().c(new e33.z1(this, galleryItem$AlbumItem.f138417f, i17));
            java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GalleryAdapter", th6, "counting album size fail", new java.lang.Object[0]);
        }
    }
}
