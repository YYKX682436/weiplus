package e33;

/* loaded from: classes10.dex */
public class d4 implements al5.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.e4 f247199a;

    public d4(e33.e4 e4Var) {
        this.f247199a = e4Var;
    }

    @Override // al5.a4
    public void a() {
        e33.e4 e4Var = this.f247199a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onLongPress down %d", e4Var.f247211d.f138593o);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = e4Var.f247211d;
        e33.v2 v2Var = imagePreviewUI.f138579e;
        int intValue = imagePreviewUI.f138593o.intValue();
        y51.c j17 = v2Var.j(intValue);
        if (j17 != null) {
            y51.b bVar = (y51.b) j17;
            if (!((z51.p) bVar.a(z51.p.class)).k()) {
                bVar.c();
                v2Var.f247512w = true;
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = v2Var.k(intValue);
                if (k17 instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) {
                    v2Var.p((com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem) k17, 3);
                    return;
                }
                return;
            }
        }
        v2Var.f247512w = false;
    }

    @Override // al5.a4
    public void b() {
        e33.e4 e4Var = this.f247199a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "onLongPress up %d", e4Var.f247211d.f138593o);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = e4Var.f247211d;
        e33.v2 v2Var = imagePreviewUI.f138579e;
        y51.c j17 = v2Var.j(imagePreviewUI.f138593o.intValue());
        if (j17 == null || !v2Var.f247512w) {
            return;
        }
        ((y51.b) j17).b();
        v2Var.f247512w = false;
    }
}
